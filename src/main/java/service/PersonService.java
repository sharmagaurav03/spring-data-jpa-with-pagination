package service;

import model.Person;
import exception.PersonNotFoundException;

/**
 * Declares methods used to obtain and modify person information.
 */
public interface PersonService {

	/**
	 * Creates a new person.
	 * 
	 * @param created
	 *            The information of the created person.
	 * @return The created person.
	 */
	public Person create(Person created);

	/**
	 * Deletes a person.
	 * 
	 * @param personId
	 *            The id of the deleted person.
	 * @return The deleted person.
	 * @throws PersonNotFoundException
	 *             if no person is found with the given id.
	 */
	public Person delete(Long personId) throws PersonNotFoundException;

	/**
	 * Finds all persons.
	 * 
	 * @return A list of persons.
	 */
	public Iterable<Person> findAll();

	/**
	 * Finds person by id.
	 * 
	 * @param id
	 *            The id of the wanted person.
	 * @return The found person. If no person is found, this method returns
	 *         null.
	 */
	public Person findById(Long id) throws PersonNotFoundException;

	/**
	 * Updates the information of a person.
	 * 
	 * @param updated
	 *            The information of the updated person.
	 * @return The updated person.
	 * @throws PersonNotFoundException
	 *             if no person is found with given id.
	 */
	public Person update(Person updated) throws PersonNotFoundException;

	/**
	 * Retrieve the total count of the persons in the repository.
	 * 
	 * @param None
	 *            .
	 * @return The count of the person.
	 */

	public long countAll();

}
