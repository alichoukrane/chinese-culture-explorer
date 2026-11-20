# Explore China - Android Project

## Project Structure

```
explore china ALI/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/explorechina/
│   │       │   ├── SplashActivity.java
│   │       │   ├── MainActivity.java
│   │       │   ├── DetailActivity.java
│   │       │   ├── CustomAdapter.java
│   │       │   └── Attraction.java
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_splash.xml
│   │       │   │   ├── activity_main.xml
│   │       │   │   ├── activity_detail.xml
│   │       │   │   └── attraction_item.xml
│   │       │   ├── values/
│   │       │   │   ├── strings.xml (English)
│   │       │   │   ├── colors.xml
│   │       │   │   └── styles.xml
│   │       │   ├── values-zh/
│   │       │   │   └── strings.xml (Chinese)
│   │       │   ├── drawable/
│   │       │   │   └── (Shape drawables for attractions)
│   │       │   └── mipmap/
│   │       └── AndroidManifest.xml
│   └── build.gradle
├── build.gradle
├── settings.gradle
├── gradle.properties
├── local.properties
└── README.md
```

## Features Implemented

✅ **Splash Screen** - 3-second auto-advance or tap to skip with Chinese-themed design
✅ **List Page** - ListView with 9 Chinese attractions (Great Wall, Forbidden City, Summer Palace, Terracotta Army, West Lake, Temple of Heaven, The Bund, Zhangjiajie, Potala Palace)
✅ **Detail Page** - Full attraction details with RatingBar to save ratings using SharedPreferences
✅ **Language Support** - English (default) and Chinese language versions
✅ **Custom Adapter** - ListView adapter for displaying attractions
✅ **Modern UI Design** - Red and gold Chinese theme with rounded cards
✅ **Orientation Support** - Supports both portrait and landscape layouts

## How to Open in Android Studio

1. Open Android Studio
2. Click **File** → **Open**
3. Navigate to `C:\Users\PC\Desktop\explore china ALI`
4. Click **OK**
5. Android Studio will build and sync the project

## How to Run

1. Click **Run** → **Run 'app'** or press `Shift + F10`
2. Select an Android emulator or connected device
3. The app will install and launch automatically

## Replace the Splash Photo with Your Own

1. Open `app/src/main/res/drawable/`
2. Replace `splash_photo.png` with your own photo file
3. Keep the file name exactly `splash_photo.png`
4. Rebuild and run the app

This ensures the splash image changes to your picture without any resource errors.

## Key Files

- **SplashActivity.java** - Entry point, shows splash screen for 3 seconds
- **MainActivity.java** - Displays list of attractions
- **DetailActivity.java** - Shows attraction details and rating functionality
- **CustomAdapter.java** - Binds attraction data to ListView
- **Attraction.java** - Data model for attractions

## Language Support

- **English**: `res/values/strings.xml`
- **Chinese**: `res/values-zh/strings.xml`

The app automatically switches to Chinese when the device system language is set to Chinese.

## Colors Used

- Primary Red: #DC143C (Chinese red)
- Primary Gold: #FFD700 (Chinese gold accent)
- Background: #F5F5F5 (Light gray)

## Notes

- All code follows Java best practices suitable for university coursework
- Uses only Android SDK (no external libraries except AppCompat)
- Clean and simple architecture for educational purposes
- Ready to compile and submit to teachers/professors
