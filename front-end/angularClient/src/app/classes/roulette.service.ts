import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Roulette } from './roulette';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RouletteService {
  private rouletteUrl: string;
  constructor(private http: HttpClient) {
    this.rouletteUrl = 'http://localhost:8080/roulette';
  }
  public findAll(): Observable<Roulette[]> {
    return this.http.get<Roulette[]>(this.rouletteUrl);
  }
  public save(roulette: Roulette) {
    return this.http.post<Roulette>(this.rouletteUrl, roulette);
  }
}
