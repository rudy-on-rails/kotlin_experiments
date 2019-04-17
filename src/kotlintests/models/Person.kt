package kotlintests.models

class Person(val name: String) {	
	var children = ArrayList<Person>();
	var parent: Person? = null;
	
	constructor(name: String, parent: Person) : this(name){
		parent.children.add(this);
		this.parent = parent;		
	}
	
	override fun toString(): String {
		return String.format("$name - Children: $children");
	}
}