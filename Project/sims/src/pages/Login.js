import React,{ useState } from 'react'
import Loginimg from 'C:/Users/SURENDER K M/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/images/Login.jpg';
import { useNavigate } from 'react-router-dom'
import 'C:/Users/SURENDER K M/OneDrive/Documents/GitHub/React_IRC/Project/sims/src/assets/css/login.css'
import Login1 from '../assets/images/Login2.jpg';

const   Login = () =>{
  
		const inputs = document.querySelectorAll(".input-field");
	const toggle_btn = document.querySelectorAll(".toggle");
	const main = document.querySelector("main");
	const bullets = document.querySelectorAll(".bullets span");
	const images = document.querySelectorAll(".image");
	
	inputs.forEach((inp) => {
	  inp.addEventListener("focus", () => {
		inp.classList.add("active");
	  });
	  inp.addEventListener("blur", () => {
		if (inp.value != "") return;
		inp.classList.remove("active");
	  });
	});
	
	toggle_btn.forEach((btn) => {
	  btn.addEventListener("click", () => {
		main.classList.toggle("sign-up-mode");
	  });
	});
	

    const navigate = useNavigate();
    const Hom=()=>
    {
        navigate("/")
    }
return(
  <>
<main>
      <div class="box">
        <div class="inner-box">
          <div class="forms-wrap">
            <form action="index.html" autocomplete="off" class="sign-in-form">
              <div class="logo">
                <img src="./img/logo.png" alt="easyclass" />
                <h4>Campusmate</h4>
              </div>

              <div class="heading">
                <h2>Welcome Back</h2>
                <h6>Not registered yet?</h6>
                <a href="#" class="toggle">Sign up</a>
              </div>

              <div class="actual-form">
                <div class="input-wrap">
                  <input
                    type="text"
                    minlength="4"
                    class="input-field"
                    autocomplete="off"
                    required
                  />
                  <label>Name</label>
                </div>

                <div class="input-wrap">
                  <input
                    type="password"
                    minlength="4"
                    class="input-field"
                    autocomplete="off"
                    required
                  />
                  <label>Password</label>
                </div>

                <input type="submit" value="Sign In" class="sign-btn" />

                <p class="text">
                  Forgotten your password or you login datails?
                  <a href="#">Get help</a> signing in
                </p>
              </div>
            </form>

            {/* <form action="index.html" autocomplete="off" class="sign-up-form">
              <div class="logo">
                <img src="./img/logo.png" alt="easyclass" />
                <h4>easyclass</h4>
              </div>

              <div class="heading">
                <h2>Get Started</h2>
                <h6>Already have an account?</h6>
                <a href="#" class="toggle">Sign in</a>
              </div>

              <div class="actual-form">
                <div class="input-wrap">
                  <input
                    type="text"
                    minlength="4"
                    class="input-field"
                    autocomplete="off"
                    required
                  />
                  <label>Name</label>
                </div>

                <div class="input-wrap">
                  <input
                    type="email"
                    class="input-field"
                    autocomplete="off"
                    required
                  />
                  <label>Email</label>
                </div>

                <div class="input-wrap">
                  <input
                    type="password"
                    minlength="4"
                    class="input-field"
                    autocomplete="off"
                    required
                  />
                  <label>Password</label>
                </div>

                <input type="submit" value="Sign Up" class="sign-btn" />

                <p class="text">
                  By signing up, I agree to the
                  <a href="#">Terms of Services</a> and
                  <a href="#">Privacy Policy</a>
                </p>
              </div>
            </form> */}
          </div>

          <div class="carousel">
            <div class="images-wrapper">
              <img src={Login1} class="image img-1 show" alt="abcd" />
              {/* <img src={Login2} class="image img-2" alt="imagenot found" />
              <img src={Login3} class="image img-3" alt="hello" /> */}
            </div>

            <div class="text-slider">
              <div class="text-wrap">
                <div class="text-group">
                  <h2>Create your own courses</h2>
                  {/* <h2>Customize as you like</h2>
                  <h2>Invite students to your class</h2> */}
                </div>
              </div>

              <div class="bullets">
                <span class="active" data-value="1"></span>
                {/* <span data-value="2"></span>
                <span data-value="3"></span> */}
              </div>
            </div>
          </div>
        </div>
      </div>
    </main>

</>
    )
    
  }
  export default Login;















  
    /* <div id="entire" >
<img src={Loginimg} alt="Logo"></img>
  <form onSubmit={Hom}>
<div id="wrap">

  <h1>LOGIN</h1>
<div class="entryarea">
  <input type="text"  placeholder="Username" required/>
  </div>
<div class="entryarea">
  <input type="password" placeholder='Password' id="pass" required/>
 

</div>

  <button type="submit" >Login</button>
  
</div>
</form>        
</div>  */