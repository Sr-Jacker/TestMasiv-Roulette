import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { RouletteListComponent } from './roulette-list/roulette-list.component';
import { RouletteFormComponent } from './roulette-form/roulette-form.component';
import { RouletteService } from './classes/roulette.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    RouletteListComponent,
    RouletteFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [RouletteService],
  bootstrap: [AppComponent]
})
export class AppModule { }
