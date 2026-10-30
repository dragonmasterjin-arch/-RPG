# 인생RPG 안드로이드 APK 프로젝트

기존 인생RPG 2.9 HTML 게임을 포함하는 Android WebView 프로젝트입니다.

## GitHub에서 APK 자동 생성 (PC 없이도 가능)
1. GitHub에서 새 빈 저장소를 만듭니다.
2. 압축 해제한 **프로젝트 안쪽 파일 전체**(숨김 폴더 `.github` 포함)를 저장소에 업로드합니다.
3. 저장소의 **Actions**에서 **Build 인생RPG APK** → **Run workflow**를 누릅니다. `main` 또는 `master`로 push하면 자동 실행될 수도 있습니다.
4. 빌드가 성공하면 해당 실행 화면의 **Artifacts**에 있는 **InsaengRPG-APK**를 받아 압축을 풉니다.
5. 안에 있는 `app-debug.apk`를 안드로이드 스마트폰에 설치합니다.

GitHub Actions 실행 권한과 외부 다운로드가 필요합니다. 이 환경에서는 Android SDK가 없어 APK 빌드를 직접 검증하지 못했습니다.

## PC 빌드
Android Studio에서 프로젝트 폴더를 열어 Build APK(s)를 실행합니다.

## 데이터
기존 HTML 파일의 브라우저 기록은 APK의 WebView 저장소로 자동 이전되지 않습니다.
