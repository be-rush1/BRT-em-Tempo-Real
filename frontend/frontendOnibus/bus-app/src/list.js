import { React, useEffect, useState } from 'react'
import api from './services/api.js'

function list() {
  const [dados, setDados] = useState([])

  useEffect(() => {
    api
      .get("localhost:3000")
      .then((response) => setDados(response)
        .catch((err) => {
          console.log("Ocorreu um erro na requisição GET: " + err)
        })
      )
  }, [])
  return (dados.map((item, index) =>
    <li key={index}>{item}</li>
  )
  );
}
export default list