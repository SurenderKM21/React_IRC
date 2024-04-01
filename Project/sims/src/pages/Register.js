import React from 'react'

import { useNavigate } from 'react-router-dom'

import 'C:/Users/SURENDER K M/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/register.css'

    const Register = () => {
        const navigate = useNavigate();
        const Hom=()=>
        {
            navigate("/")
        }
        return (
        <>
        <div id="entire" >
       
        <form onSubmit={Hom}>
        <div id="wrap">
            <h1>REGISTER</h1>
        <input type="text" placeholder="Name" id="uname" required/>
        <input type="email" placeholder="Email-Id" id="email" required/>
        <input type="password" placeholder="Password" id="pass" required/>
        <input type="password" placeholder="Confirm Password" id="cpass" required/>
        <input type="number" placeholder="Number" id="num" required/>
        <input type="date" placeholder="Date of Birth" id="dob" required/>
        <button type="submit" >Register</button>
        </div>
        </form>
        </div> 
        </>
    )
}

export default Register