import 'C:/Users/senth/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/style.css'
import { Link } from 'react-router-dom';
const Navbar = () => {
    return (
    
        <div class="topnav">
          <Link to="/">
          <li>  
            <a class="active">Home</a>
          </li>
          </Link>
          <Link to="/Login">
          <li>  
            <a >Login</a>
          </li>
          </Link>
          <Link to="/Register">
          <li>  
            <a >Register</a>
          </li>
          </Link>
          <Link to="/">
          <li>  
            <a >Contact us</a>
          </li>
          </Link>
        </div>
         
    )
};

export default Navbar
