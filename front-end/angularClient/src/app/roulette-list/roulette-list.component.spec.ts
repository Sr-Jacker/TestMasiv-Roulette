import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RouletteListComponent } from './roulette-list.component';

describe('RouletteListComponent', () => {
  let component: RouletteListComponent;
  let fixture: ComponentFixture<RouletteListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RouletteListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RouletteListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
