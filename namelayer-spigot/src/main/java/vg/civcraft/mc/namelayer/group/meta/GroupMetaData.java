package vg.civcraft.mc.namelayer.group.meta;

import com.google.gson.JsonObject;

import vg.civcraft.mc.namelayer.events.GroupCreateEvent;

public abstract class GroupMetaData {
	
	private boolean dirty;	
	
	public GroupMetaData() {
		setDirty();
	}
	
	public abstract void serialize(JsonObject json);
	
	public void setDirty() {
		this.dirty = true;
	}
	
	public boolean isDirty() {
		return dirty;
	}

}
