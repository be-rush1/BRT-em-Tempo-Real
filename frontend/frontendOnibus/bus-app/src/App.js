import './App.css';
import api from './api.js'
function App() {
  return (
    <div className="main">
      <h1>React Search</h1>
      <div className="search">
        <TextField
          id="outlined-basic"
          variant="outlined"
          fullWidth
          label="Search"
        />
      </div>
      <List />
    </div>
  );
}

export default App;
