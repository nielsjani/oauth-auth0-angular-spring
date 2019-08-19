import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TrumpCardService {

  constructor(private httpClient: HttpClient) {
  }

  public getAllCards() {
    return this.httpClient.get('http://localhost:8087/api/v1/trumpcard');
  }

  public getCardsForDevice(device) {
    const token = localStorage.getItem('access_token');

    return this.httpClient.get('http://localhost:8087/api/v1/trumpcard/' + device,
      {headers: new HttpHeaders().set('Authorization', 'Bearer ' + token)});
  }
}
