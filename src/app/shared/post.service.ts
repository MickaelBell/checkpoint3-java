import { Injectable } from '@angular/core';
import { Post } from '../models/post';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostService {
  private static BASE_URL = 'http://localhost:8080/posts';

  constructor(private http: HttpClient) { }


  getAll(): Observable<Post[]>{
    return this.http.get<Post[]>(PostService.BASE_URL);
  }

  getById(id: number){
    return this.http.get<Post>(PostService.BASE_URL + '/' + id);
  }


  update(post: Post){
    return this.http.put(PostService.BASE_URL + '/' + post.id, post);
  }

  delete(id: number){
    return this.http.delete(PostService.BASE_URL + '/' + id);
  }
}
