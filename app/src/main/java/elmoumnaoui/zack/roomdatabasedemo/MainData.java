package elmoumnaoui.zack.roomdatabasedemo;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName ="table_name")

public class MainData implements Serializable {

    //Create id column
    @PrimaryKey(autoGenerate = true)
    private int ID;

    // Create text column
    @ColumnInfo(name="text")
    private String text;

    @ColumnInfo(name="capital")
    private String capital;

    @ColumnInfo(name = "habitants")
    private Float habitants;
    //Generate getters and setters

    public int getID() {
        return ID;
    }

    public String getText() {
        return text;
    }

    public Float getHabitants() {
        return habitants;
    }

    public String getCapital() {
        return capital;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setHabitants(Float habitants) {
        this.habitants = habitants;
    }

    public void setText(String text) {
        this.text = text;
    }
}
