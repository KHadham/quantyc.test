# User List App

A simple Android application that fetches a list of users from a public API and displays them on the screen. This project demonstrates modern Android development practices using Kotlin, Jetpack Compose, and the MVVM architecture.

## ✨ Features

* Fetches user data from the [JSONPlaceholder](https://jsonplaceholder.typicode.com/users) API.
* Displays a list of users with their names and emails.
* Shows a loading indicator while data is being fetched.
* Displays an error message if the network request fails.
* Follows the MVVM (Model-View-ViewModel) architectural pattern.

## 🛠️ Technologies Used

* **Kotlin:** The primary programming language.
* **Jetpack Compose:** For building the user interface declaratively.
* **Retrofit:** A type-safe HTTP client for making network requests.
* **Kotlin Coroutines:** For managing asynchronous operations.
* **Android ViewModel:** To store and manage UI-related data in a lifecycle-conscious way.
* **Gradle:** For dependency management.

## 🚀 How to Run

To get a local copy up and running, follow these simple steps.

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/YourUsername/Your-Repo-Name.git](https://github.com/YourUsername/Your-Repo-Name.git)
    ```
2.  **Open in Android Studio:**
    Open the cloned project in Android Studio.
3.  **Build and Run:**
    Let Gradle sync the dependencies, then build and run the app on an emulator or a physical device.

## 🔮 Future Improvements

-   [ ] Implement an offline cache using a local database like Room.
-   [ ] Add a detail screen to show more information about a selected user.
-   [ ] Write unit and UI tests.