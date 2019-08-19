import { Component, OnInit } from '@angular/core';
import {TrumpCardService} from '../../services/trump-card.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  cards$: Observable<any>;

  constructor(private trumpCardService: TrumpCardService) { }

  ngOnInit() {
    this.cards$ = this.trumpCardService.getAllCards();
  }

}
