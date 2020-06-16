import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { UsersComponent } from './pages/users/users.component';
import { UserDetailsComponent } from './pages/user-details/user-details.component';
import { EditUserComponent } from './pages/edit-user/edit-user.component';


const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path: 'home', component: HomeComponent},
  {path: 'users', component: UsersComponent},
  {path: 'details/:id', component: UserDetailsComponent},
  {path: 'edit-user/:id', component: EditUserComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
