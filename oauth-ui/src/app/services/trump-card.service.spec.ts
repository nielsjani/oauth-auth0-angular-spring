import { TestBed } from '@angular/core/testing';

import { TrumpCardService } from './trump-card.service';

describe('TrumpCardService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TrumpCardService = TestBed.get(TrumpCardService);
    expect(service).toBeTruthy();
  });
});
