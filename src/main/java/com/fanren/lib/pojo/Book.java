package com.fanren.lib.pojo;

public class Book {
	
	
    public Book(Integer idBook, String name, String code, String status, String people, String tel) {
		super();
		this.idBook = idBook;
		this.name = name;
		this.code = code;
		this.status = status;
		this.people = people;
		this.tel = tel;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.Id_book
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    private Integer idBook;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.name
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.code
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.status
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.people
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    private String people;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.tel
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.Id_book
     *
     * @return the value of book.Id_book
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public Integer getIdBook() {
        return idBook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.Id_book
     *
     * @param idBook the value for book.Id_book
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.name
     *
     * @return the value of book.name
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.name
     *
     * @param name the value for book.name
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.code
     *
     * @return the value of book.code
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.code
     *
     * @param code the value for book.code
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.status
     *
     * @return the value of book.status
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.status
     *
     * @param status the value for book.status
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.people
     *
     * @return the value of book.people
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public String getPeople() {
        return people;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.people
     *
     * @param people the value for book.people
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.tel
     *
     * @return the value of book.tel
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.tel
     *
     * @param tel the value for book.tel
     *
     * @mbg.generated Fri Sep 07 08:44:14 CST 2018
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}