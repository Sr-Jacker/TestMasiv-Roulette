import { Component } from '@angular/core';
import { Roulette } from '../classes/roulette';
import { ActivatedRoute, Router } from '@angular/router';
import { RouletteService } from '../classes/roulette.service';

@Component({
  selector: 'app-roulette-form',
  templateUrl: './roulette-form.component.html',
  styleUrls: ['./roulette-form.component.css']
})
export class RouletteFormComponent{

  roulette: Roulette;
 
  constructor(
    private route: ActivatedRoute, 
      private router: Router, 
        private rouletteService: RouletteService) {
    this.roulette = new Roulette();
  }
 
  onSubmit() {
    this.rouletteService.save(this.roulette).subscribe(result => this.gotoRouletteList());
  }
 
  gotoRouletteList() {
    this.router.navigate(['/roulette']);
  }

}
