package de.danoeh.antennapod.core.syndication.namespace;

/** Defines a XML Element that is pushed on the tagstack */
public class SyndElement {
	private String name;
	private Namespace namespace;
	
	public SyndElement(String name, Namespace namespace) {
		this.name = name;
		this.namespace = namespace;
	}
	
	public Namespace getNamespace() {
		return namespace;
	}

	public String getName() {
		return name;
	}
	
	
}
