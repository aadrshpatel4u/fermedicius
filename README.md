# fermedicius
Creates a user profile from following input-
basic demographics: Name, Age, and Gender
Options for Age: Less than 10, 10 – 15, 16 – 40, Above 40
Options for Gender: Male, Female, Other
Training Type: Maui Thai, Jujutsu, Karate, Judo
Exercise Type: Cardio, Strength, Stamina, Muscle
Sports: Swimming, Running, Football, Rugby, Dance

generates a QR Code from a string of the form.
XXXXXXX A:2 B:0 C:0 D:0 P:1 Q:0 R:0 S:0 V:1 W:0 X:0 Y:0 Z:1
where-
XXXXXXX: Unique user ID
A/B/C/D: are four different training types,
P/Q/R/S: are four different exercise types,
V/W/X/Y/Z: are five different sports types,
The numbers denote the number of hours student should access the facility

If Age is <10 or 10 – 15 or Gender is Female, Training hours will be 1
If Age is 16-40 or above 40 and Gender is Male Training hours will be 2
A/B/C/D will be 0, 1 or 2 based on selection (0 means no training, 1 means 1 hour of
training and 2 means 2 hours of training)
P/Q/R/S can only be 0 or1 based on selection
V/W/X/Y/Z can be 0 or 1 based on selection, As users can select multiple sports
options there could multiple 1’s.
