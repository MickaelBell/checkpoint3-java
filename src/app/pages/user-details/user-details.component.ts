import { MatSnackBar } from '@angular/material/snack-bar';
import { Component, OnInit } from '@angular/core';
import { UserService } from '../../shared/user.service';
import { ActivatedRoute } from '@angular/router';
import { User } from '../../models/user';

@Component({
  selector: 'chk-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.scss']
})
export class UserDetailsComponent implements OnInit {

  user: User;

  constructor(public userService: UserService, private route: ActivatedRoute, private snackBar: MatSnackBar) { }

  ngOnInit(): void {

    this.route.paramMap.subscribe((data) => {
      const numId = +data.get('id');

      if (isNaN(numId)){
        this.snackBar.open('L\id n\'est pas valide: ' + numId);
        return;
      }

      this.userService.getById(numId).subscribe((user: User) => {
        this.user = user;
      }, (error) => {
        this.snackBar.open('Il y a eu une erreur, pendant la récupération des données de l\'utilisateur via son id: ' + numId);
      });

    });

  }

}
