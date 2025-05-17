# University Course Management Android App

A simple Android application built using Java and Android Studio to help Comilla University students manage and explore their academic curriculum. The app allows students to view syllabus details semester-wise using a clean UI.

## Features
- 🔐 Sign-in Interface – Enter your username, password and ID to access the app. 
- 🎓 Department selection (e.g., CSE, Mathematics, Physics, etc.)
- 🎓 Batch selection (e.g., CSE-12 to CSE-16)
- 🗂 Year/Semester selection (1st-4th year, 1st-2nd semester)
- 📑 Detailed course information display including:
  - ✅ Course code and title
  - ✅ Credit hours
  - ✅ Course objectives
  - ✅ Detailed syllabus
  - ✅ Recommended textbooks
- 💡 Offline Access – All syllabus files are stored in the assets folder and require no internet.


  ## App Screenshots

| Login Screen | Department Selection | Batch Selection |
|--------------|----------------------|-----------------|
| <img src="screenshots/login.jpg" width="200"> | <img src="screenshots/departments.jpg" width="200"> | <img src="screenshots/batches.jpg" width="200"> |

| Semester Selection | Course Details |
|--------------------|----------------|
| <img src="screenshots/semesters.jpg" width="200"> | <img src="screenshots/courses.jpg" width="200"> |

## Technical Implementation

- **Frontend**: XML layouts with responsive design
- **Backend**: Java-based activity navigation
- **Web Integration**: WebView for displaying formatted course content
- **Authentication**: Simple credential check (for demo purposes)

### Key Components

1. **Login Activity** (`MainActivity.java`)
   - Student ID, username, and password fields
   - Basic credential validation

2. **Department Selection** (`Layout1Activity.java`)
   - Grid layout of all university departments
   - Color-coded buttons for better UX

3. **Batch Selection** (`Layout2Activity.java`)
   - Shows available batches for selected department
   - Only CSE-14 is functional in current implementation

4. **Semester Selection** (`Layout3Activity.java`)
   - 4 years with 2 semesters each
   - Currently only 2nd Year 2nd Semester is functional

5. **Course Display** (`Layout4Activity.java`)
   - WebView that loads local HTML content
   - Formatted display of course details

## Code Structure
