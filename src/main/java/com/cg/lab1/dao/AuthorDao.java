package com.cg.lab1.dao;

import javax.persistence.EntityExistsException;

import com.cg.lab1.entities.Author;

public interface AuthorDao {
	public abstract Author getAuthorByAuthorId(int id);

	public abstract void addAuthor(Author author) throws EntityExistsException;

	public abstract void removeAuthor(Author author);

	public abstract void updateAuthor(Author author);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}