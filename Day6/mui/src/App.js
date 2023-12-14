import Navbar from "./components/navbar.js";
import Home1 from "./pages/home.js";
import about from './pages/about.js';
import contact from './pages/contact.js';
import { Route, Routes } from 'react-router-dom';

function App() {
  return (
    <>
    <Navbar />
        <Routes>
          <Route path="/" element={<Home1/>}></Route>
           <Route path="/about" element={<about />}></Route>
          <Route path="/contact" element={<contact />}></Route> 
        </Routes> 

 
    </>
  );
}

export default App;
