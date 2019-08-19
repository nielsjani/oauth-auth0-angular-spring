import { Component, OnInit } from '@angular/core';
import {Observable} from 'rxjs';
import {TrumpCardService} from '../../services/trump-card.service';

@Component({
  selector: 'app-device',
  templateUrl: './device.component.html',
  styleUrls: ['./device.component.css']
})
export class DeviceComponent implements OnInit {

  cards$: Observable<any>;

  constructor(private trumpCardService: TrumpCardService) { }

  ngOnInit() {
    this.cards$ = this.trumpCardService.getCardsForDevice('ANDROID');
  }

}
