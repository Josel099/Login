import React from 'react';
import { BrowserRouter , Route, Routes } from 'react-router-dom';
import Register from "./compontents/Register";
import Login from "./compontents/Login";
import Home from "./compontents/Home";
function App() {
  return (
    <div>
<BrowserRouter>
            <Routes>
            <Route exact path="/home" element= { <Home/>} />
            <Route exact path="/register" element= { <Register/>} />
            <Route exact path="/" element= { <Login/>} />
            </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;