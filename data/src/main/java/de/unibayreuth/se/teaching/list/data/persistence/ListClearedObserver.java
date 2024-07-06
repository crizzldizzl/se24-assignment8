package de.unibayreuth.se.teaching.list.data.persistence;

import de.unibayreuth.se.teaching.list.data.pattern.Observer;
import de.unibayreuth.se.teaching.list.data.pattern.Subject;

public class ListClearedObserver implements Observer
{
    public void update(Subject subject)
    {
        System.out.println("List cleared!");
    }
}
