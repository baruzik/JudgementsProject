package Judgments.Objects;

import java.util.List;

public class Judge {
    public String name;
    public String function;
    public List<SpecialRole> specialRoles;
    public Integer amount;

    public boolean equals(Object other){
        if (this == other)
            return true;
        if (!(other instanceof Judge))
            return false;
        Judge that = (Judge) other;
        if(this.name.equals(that.name))
            return true;
        return false;
    }
}