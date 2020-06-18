import { Component, OnInit } from '@angular/core';
import { PostService } from '../../shared/post.service';
import { Post } from '../../models/post';

@Component({
  selector: 'chk-feed',
  templateUrl: './feed.component.html',
  styleUrls: ['./feed.component.scss']
})
export class FeedComponent implements OnInit {

  posts: Post[];
  isLoading = true;

  constructor(public postService: PostService) { }


  code1 =
    `
[{
    'id': 1,
    'message': 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Facere non excepturi quo in! Est cupiditate',
    'imageUrl':  'https://www.change-your-home.com/wp-content/uploads/2019/10/meuse-chasse-balle-pied-770x400.jpg',
    'author': {
      'id': 1,
      'firstname':'Joe',
      'lastname':'Start'
    }
}]
`;

  code2 =
    `
[{
    'id': 1,
    'message': 'Lorem ipsum dolor sit amet consectetur adipisicing elit. Facere non excepturi quo in! Est cupiditate',
    'imageUrl':  'https://www.change-your-home.com/wp-content/uploads/2019/10/meuse-chasse-balle-pied-770x400.jpg',
    'author': {
      'id': 1,
      'firstname':'Joe',
      'lastname':'Start'
    },
    'comments':[{
      'id':2,
      'message':'Super post',
      'author': {
        'id': 1,
        'firstname':'Joe',
        'lastname':'Start'
      },
    }]
}]
`;


  ngOnInit(): void {

    this.postService.getAll().subscribe((posts) => {
      this.posts = posts;
      this.isLoading = false;
    }, () => {

      this.isLoading = false;
    });
  }


  addComment(index: number){
    this.posts[index].commentIsVisible = true;
  }

}
