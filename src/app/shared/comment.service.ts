import { Injectable } from '@angular/core';
import { Comment } from '../models/comment';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class CommentService {
  private static BASE_URL = 'http://localhost:8080/comments';

  constructor(private http: HttpClient) { }


  getAll(): Observable<Comment[]> {
    return this.http.get<Comment[]>(CommentService.BASE_URL);
  }

  getById(id: number) {
    return this.http.get<Comment>(CommentService.BASE_URL + '/' + id);
  }


  create(comment: Comment) {
    return this.http.post(CommentService.BASE_URL, comment);
  }

  delete(id: number) {
    return this.http.delete(CommentService.BASE_URL + '/' + id);
  }
}
