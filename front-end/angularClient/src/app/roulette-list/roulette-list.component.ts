import { Component, OnInit } from '@angular/core';
import { Roulette } from '../classes/roulette';
import { RouletteService } from '../classes/roulette.service';

@Component({
  selector: 'app-roulette-list',
  templateUrl: './roulette-list.component.html',
  styleUrls: ['./roulette-list.component.css']
})
export class RouletteListComponent implements OnInit {
  roulettes:Roulette[];
   constructor(private rouletteService: RouletteService) {
  }
  ngOnInit() {
    this.rouletteService.findAll().subscribe(data => {
      this.roulettes = data;
    });
  }
}
