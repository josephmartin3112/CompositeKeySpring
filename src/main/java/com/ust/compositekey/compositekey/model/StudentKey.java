package com.ust.compositekey.compositekey.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class StudentKey {
    private Long studentId;
    private int enrollmentYear;

    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(!(o instanceof StudentKey)) return false;
        StudentKey that=(StudentKey) o;
        return enrollmentYear==that.enrollmentYear&&studentId.equals(that.studentId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(studentId,enrollmentYear);
    }

}
