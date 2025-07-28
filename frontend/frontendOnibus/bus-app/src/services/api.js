import axios from "axios"

const api = axios.create({
  baseURL: "https://brt-em-tempo-real-back.onrender.com/"
})

export default api;
