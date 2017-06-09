package griffits.fvi.at.ua.workout;

/**
 * Created by Vika on 10.06.2017.
 */

public class Workout {
    public String name;
    public String description;


    public static final Workout[] workouts = {
            new Workout("The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("The Wimp Special", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Strength and Length","5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups")

    };
    public Workout(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

      public String toString(){
          return this.name;
      }


}
