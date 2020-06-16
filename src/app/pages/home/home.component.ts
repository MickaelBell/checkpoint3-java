import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'chk-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private snackBar: MatSnackBar) { }

  ngOnInit(): void {

  }

  openRefuseMessage(){

    const messages = ['Lol', 'Arrête de perdre ton temps, la question est vite répondu', 'Pas le choix', ];

    const randIndex = parseInt((Math.random() * 3 + 1) + '', 10) - 1;

    this.snackBar.open(messages[randIndex]);
  }


}
