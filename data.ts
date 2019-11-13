import { Component } from '@angular/core';
import { AuthService} from '../../auth.service'
import { Router } from '@angular/router';
// import { userInfo } from 'os';

@Component({
  selector: 'app-root',
  templateUrl: './login.component.html',
  styleUrls:['./login.component.css']
  
})

 
export class LoginComponent {
  product:any=[]
   user:any={}
   app:any={}
  constructor(private Auth:AuthService,private router:Router){}
  title = 'angularRxForm';
  login(){
 console.log("user is",this.app)
 console.log("user is",this.user)
this.product.push(this.app,this.user)
//  console.log("this user",this.Employee)
 console.log("this user",this.product)
 console.log(typeof(this.product))
 
  }
}
