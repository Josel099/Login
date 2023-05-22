import React from 'react';
import {BrowserRouter,Route,Routes} from "react-router-dom"
import Register from "./compontents/Register";
import Login from "./compontents/Login";
import Home from "./compontents/Home"

function App() {
  return (
    <div className="App">
   
<BrowserRouter>
<Routes>
<Route path="/" element={<Home/>} /> 
<Route path="/login" element={<Login/>} /> 
<Route path="/register" element={<Register/>} /> 

</Routes>
</BrowserRouter>


    </div>
  );
}

export default App;
