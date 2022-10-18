import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People <E extends Person> implements Iterable<E> {
    private List<E> personList = new ArrayList<E>();

    public List<E> getPersonList() {
        return personList;
    }

    public void setPersonList(List<E> personList) {
        this.personList = personList;
    }

    public void add(E people) {
        personList.add(people);
    }



    public Person findById(Long id) {
        for (Person i : personList) {
            Long x = i.getId();
            if (x.equals(id)) {
                return i;
            }
        }
        return null;
    }

    public boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);

    }

    public void removeId(long id){
        for(Person i : personList){
            if(i.getId() == id){
                personList.remove((E) i);
            }
        }
    }

    public void removeAll(){
        personList.clear();
    }

    public int ArraylistSize(){
        return personList.size();
    }


    public E[] toArray(){

        return (E[]) personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
