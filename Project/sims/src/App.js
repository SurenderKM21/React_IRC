import './assets/css/style.css'
// import Navbar from "./components/navbar.js";
import Home1 from "./pages/Home1.js"
import sidepanel from './components/sidepanel.js';
import Register from './pages/Register.js';
import Login from './pages/Login.js';

// import MyClassComponent from './assets/css/aos.js';
// import logo from './assets/css/logo.png';
import { Route, Routes } from 'react-router-dom';
// import Register from './pages/Login.js';
function App() {
  return (
    <>
    <sidepanel/>
            <Routes>
          <Route path="/" element={<Home1/>}></Route>
           <Route path="/Register" element={<Register />}></Route>
          <Route path="/Login" element={<Login />}></Route> 
        </Routes> 

 
    </>
  )
}

export default App;
