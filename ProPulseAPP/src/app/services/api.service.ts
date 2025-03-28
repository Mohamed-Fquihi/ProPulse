import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {
  private baseUrl = 'http://localhost:8080/api'; // Adresse du backend

  constructor(private http: HttpClient) { }

  getTest(): Observable<string> {
    return this.http.get(`${this.baseUrl}/test`, { responseType: 'text' });
  }

  getTestApi(): Observable<string> {
    return this.http.get(`${this.baseUrl}/test1`, { responseType: 'text' });
  }
}
