import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {CallbackComponent} from './components/callback/callback.component';
import {DeviceComponent} from './components/device/device.component';


const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
  {
     path: 'device',
     component: DeviceComponent,
     // canActivate: [AuthGuard]
  },
  // {
  //   path: 'admin',
  //   component: AdminComponent,
  //   canActivate: [AuthGuard]
  // },
  {
    path: 'callback',
    component: CallbackComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
