import { useEffect, useState } from 'react';
import api from './services/api.js';
import Mapa from './Mapa.js';

function List({ busca }) {
  const [dados, setDados] = useState([]);

  useEffect(() => {
    const buscarDados = () => {
      api.get(`/bus?Linha=${busca}`)
        .then(response => setDados(response.data))
        .catch(error => console.error("Erro ao buscar linhas:", error));
    };

    buscarDados(); // busca inicial
    const interval = setInterval(buscarDados, 10000); // atualiza a cada 10s

    return () => clearInterval(interval);
  }, [busca]);

  return (
    <div>
      {dados.length === 0 ? (
        <p>Nenhum dado encontrado para a linha {busca}</p>
      ) : (
        <Mapa coordenadas={dados} />
      )}
    </div>
  );
}

export default List;
