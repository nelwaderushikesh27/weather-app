# 🌤️ Weather App

A beautiful weather application built with Android, Kotlin, and modern APIs.

## ✨ Features
- Current weather conditions
- 7-day forecast
- Hourly forecasts
- Location-based weather
- Weather alerts
- Beautiful weather animations
- Multiple locations support
- Widget support

## 🛠️ Tech Stack
- **Language:** Kotlin
- **UI:** Jetpack Compose
- **Architecture:** MVVM
- **Networking:** Retrofit + OkHttp
- **API:** OpenWeatherMap
- **DI:** Hilt
- **Image Loading:** Coil
- **Min SDK:** 26
- **Target SDK:** 34

## 📸 Screenshots
<div align="center">
<img src="screenshots/home.png" width="250">
<img src="screenshots/forecast.png" width="250">
<img src="screenshots/details.png" width="250">
</div>

## 🏗️ Architecture
```
app/
├── data/
│   ├── api/
│   │   ├── WeatherApi.kt
│   │   └── WeatherInterceptor.kt
│   ├── model/
│   │   ├── WeatherResponse.kt
│   │   └── ForecastResponse.kt
│   └── repository/
│       └── WeatherRepositoryImpl.kt
├── domain/
│   ├── model/
│   │   ├── Weather.kt
│   │   └── Forecast.kt
│   ├── repository/
│   │   └── WeatherRepository.kt
│   └── usecase/
│       ├── GetCurrentWeatherUseCase.kt
│       └── GetForecastUseCase.kt
├── ui/
│   ├── screens/
│   │   ├── home/
│   │   ├── forecast/
│   │   └── settings/
│   ├── components/
│   │   ├── WeatherCard.kt
│   │   ├── ForecastItem.kt
│   │   └── WeatherIcon.kt
│   └── theme/
├── util/
│   ├── Constants.kt
│   └── Extensions.kt
└── di/
    ├── NetworkModule.kt
    └── AppModule.kt
```

## 🚀 Getting Started

### Prerequisites
- Android Studio Hedgehog+
- OpenWeatherMap API key (free)

### Setup
1. Clone the repository
2. Get API key from [OpenWeatherMap](https://openweathermap.org/api)
3. Add API key to `local.properties`:
```
WEATHER_API_KEY=your_api_key_here
```
4. Build and run

## 📦 Key Dependencies
```kotlin
// Retrofit
implementation "com.squareup.retrofit2:retrofit:2.9.0"
implementation "com.squareup.retrofit2:converter-gson:2.9.0"

// OkHttp
implementation "com.squareup.okhttp3:okhttp:4.12.0"
implementation "com.squareup.okhttp3:logging-interceptor:4.12.0"

// Coil (Image Loading)
implementation "io.coil-kt:coil-compose:2.5.0"

// Location
implementation "com.google.android.gms:play-services-location:21.0.1"
```

## 🔑 API Configuration
This app uses OpenWeatherMap API:
- Free tier: 1,000,000 calls/month
- Current weather endpoint
- 5-day/3-hour forecast

## 🤝 Contributing
Pull requests are welcome! See [CONTRIBUTING.md](CONTRIBUTING.md).

## 📄 License
MIT License - see [LICENSE](LICENSE)

---

Made with ❤️ by [Your Name]
