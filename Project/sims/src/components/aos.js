
import React, { Component } from 'react'
// importing aos
import AOS from 'aos';
import 'aos/dist/aos.css';
export default class MyClassComponent extends Component {
    componentDidMount() {
        AOS.init();
    }

  render() {
    return (
      <div
        data-aos="fade-up"  data-aos-duration="3000"  //Here you can use any of the AOS animations
      >
        <div class="container">
        <div class="fitem">
          Unlocking Academic Excellence: Where Every Mark is a Milestone!</div>
        <div class="fitem">Transforming punctuality into progress, one attendance record at a time.</div>
        <div class="fitem">Beyond the classroom, where passion meets accomplishment — celebrating the symphony of students' extraordinary talents and achievements!</div>
        <div class="fitem">Empowering Connectivity: Instant Messaging, Timely Notifications</div>
      </div>
      
      </div>
    )
  }
}