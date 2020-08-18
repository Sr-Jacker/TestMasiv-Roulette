import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RouletteListComponent } from './roulette-list/roulette-list.component';
import { RouletteFormComponent } from './roulette-form/roulette-form.component';


const routes: Routes = [
  { path: 'roulettes', component: RouletteListComponent },
  { path: 'addroulette', component: RouletteFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
