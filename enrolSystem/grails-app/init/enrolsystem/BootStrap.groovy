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

	def Emma= new Student(
		name: 'Emma Smith',
		studentID:'CS605090',
		dob:new Date('01/03/1998'),
		isFundingAvailable: true,
		email: 'b6015090@my.shu.ac.uk',
		username: 'b6015090',
		password: 'password',
		course: 'Computing'
	).save()

	def Jade= new Student(
		name: 'Jade Smith',
		studentID:'CS605091',
		dob:new Date('19/04/1998'),
		isFundingAvailable: true,
		email: 'b6015091@my.shu.ac.uk',
		username: 'b6015091',
		password: 'password',
		course: 'Maths'
	).save()

	def Alisha= new Student(
		name: 'Alisha Smith',
		studentID:'CS605092',
		dob:new Date('18/11/1996'),
		isFundingAvailable: true,
		email: 'b6015092@my.shu.ac.uk',
		username: 'b6015092',
		password: 'password',
		course: 'Music Technology'
	).save()

	def Jackie=new Lecturer(
		fullName: 'Jackie Stallard',
		post: 'Lecturer',
		subject: 'WADI',
		lecturerEmail:'JStallard@my.shu.ac.uk',
		office: 'Cantor421',
		bio: 'Indent your code'
	).save()
    }
    def destroy = {
    }
}
