# Android-Study-Jams

Study Notes Application - A notes taking app built on Native Android Using Kotlin.

<b> Problem Statement: </b>

Many of our students have faced problems maintaining their notes in one place over the years. Managing their daily notes and referring to them faster in the future is one of the challenges they face every day.
Mobile Application is one of the major developments in the field of technology, which plays a large role in everyday life activities. As they are widely used and are easy to access, mobile applications can be used effectively for this job.

<b> Proposed Solution : </b>

This project proposes a “Study Notes App” to keep track of the all the notes a student has made earlier. Its features include inserting a note and labelling it with colors as Incomplete(Red) , To-Be-Completed(Yellow) and Complete(Green). A student can insert multiple notes and also delete them in the app. All the note-items is present in local database and the date of the notes taken is also displayed. The project's scope is to extend it for other individuals to manage their notes properly.

<b> How the App looks : </b>

<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697167-cdc6658c-a2f1-4241-b199-a61c4efe44cb.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697293-f17fa16b-6ff4-4717-9212-9d31a4364f0e.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697311-22b0f3c7-02a2-4c9c-a1b0-63929870413e.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697318-e43e2df7-57b9-4fae-baeb-c622a828b38f.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697322-56759bd6-e520-4a63-b5f7-bf110746e2ad.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697317-aa6a2d40-2ee8-4033-b010-6b56b396cde1.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697322-56759bd6-e520-4a63-b5f7-bf110746e2ad.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<img width="250" height="500" alt="sampleimages" src="https://user-images.githubusercontent.com/73780844/148697328-31aea1c3-20f9-472f-af68-71b0c1e06b77.jpg">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<b> Functionality & Concepts used : </b>

- The App has a very simple and interactive interface which helps the students maintain their notes and keep it at one place for future references. Following are few android concepts used to achieve the functionalities in app : 
- **Constraint Layout :** Most of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.
- **Simple & Easy Views Design :** Use of familiar audience EditText with hints and interactive buttons made it easier for students to interact without providing any detailed instructions pages. Apps also uses App Navigation to switch between different screens.
- **RecyclerView :** To present the list of the notes taken by the user.
- **LiveData & Room Database :** We are also using LiveData to update & observe any changes made to the list of note items and finally update it to local database using Room.

<b> Application Link & Future Scope : </b>

The app is currently experimented with a limited no. of users, You can access the app : [STUDY NOTES](https://github.com/PuranjoyPatra/Android_Study_Jams_Project).

As soon as the app is fully tested and functional, we plan to launch it on Playstore and add new features in the future. Within the next year, we hope everyone using the app will be able to use a proper note-taking app to organize, write, and manage their notes on the go. We plan to add the ability to share notes with other apps and to add a voice or video note.
