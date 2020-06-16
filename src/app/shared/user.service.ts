import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../models/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private static BASE_URL = 'http://localhost:8080/users';

  constructor(private http: HttpClient) { }


  getAll(): Observable<User[]>{
    return this.http.get<User[]>(UserService.BASE_URL);
  }

  getById(id: number){
    return this.http.get<User>(UserService.BASE_URL + '/' + id);
  }


  update(user: User){
    return this.http.put(UserService.BASE_URL + '/' + user.id, user);
  }

  delete(id: number){
    return this.http.delete(UserService.BASE_URL +'/'+ id);
  }
}
