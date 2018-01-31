package com.enrol

class BootStrap {

    def init = { servletContext ->
	
	def Computing=new Course(
	department:'Computing',
	code: 'CS123',
	title: 'BSc Hon Computing',
	leader:'Dr Michelle Murphy',
	startDate: new Date('09/09/2018'),
	endDate: new Date('07/07/2022'),
	numberOfStudents: 55,
	studyMode: 'Fulltime',
	tuitionFees: 9000.60,
	description: 'This is a decription for the course'
	).save()

	
	def Art=new Course(
	department:'Art',
	code: 'A123',
	title: 'BSc Hon Art',
	leader:'Dr George Michael',
	startDate: new Date('09/09/2018'),
	endDate: new Date('07/07/2022'),
	numberOfStudents: 60,
	studyMode: 'Fulltime',
	tuitionFees: 9000.60,
	description: 'This is a decription for the course'
	).save()


	def Maths=new Course(
	department:'Maths',
	code: 'M123',
	title: 'BSc Hon Maths',
	leader:'Dr Phil Mitchell',
	startDate: new Date('09/09/2018'),
	endDate: new Date('07/07/2022'),
	numberOfStudents: 43,
	studyMode: 'Fulltime',
	tuitionFees: 9000.60,
	description: 'This is a decription for the course'
	).save()
    }
    def destroy = {
    }
}
