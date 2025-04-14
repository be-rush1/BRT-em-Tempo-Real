import { useState } from 'react';
import TextField from '@mui/material/TextField';
import Button from '@mui/material/Button';
import List from './list.js';

function App() {
  const [termoBusca, setTermoBusca] = useState('');
  const [linhaSelecionada, setLinhaSelecionada] = useState(null);

  const handleBuscar = () => {
    setLinhaSelecionada(termoBusca);
  };

  return (
    <div className="main">
      <h1>Buscar Ônibus BRT</h1>
      <div className="search">
        <TextField
          id="outlined-basic"
          variant="outlined"
          fullWidth
          label="Digite o número da linha"
          value={termoBusca}
          onChange={(e) => setTermoBusca(e.target.value)}
        />
        <Button onClick={handleBuscar} variant="contained" style={{ marginTop: '10px' }}>
          Buscar
        </Button>
      </div>

      {/* Passa o número da linha selecionada para o componente List */}
      {linhaSelecionada && <List busca={linhaSelecionada} />}
    </div>
  );
}

export default App;
