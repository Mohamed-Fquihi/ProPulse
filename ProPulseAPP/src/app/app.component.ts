import { Component, effect, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ApiService} from './services/api.service';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ProPulseAPP';message = signal('Chargement...');

  constructor(private apiService: ApiService) {
    effect(() => {
      this.apiService.getTest().subscribe({
        next: (data) => this.message.set(data),
        error: (err) => console.error('Erreur lors de l’appel API :', err)
      });
    });
  }
}
