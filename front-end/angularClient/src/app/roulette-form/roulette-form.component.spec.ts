import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RouletteFormComponent } from './roulette-form.component';

describe('RouletteFormComponent', () => {
  let component: RouletteFormComponent;
  let fixture: ComponentFixture<RouletteFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RouletteFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RouletteFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
