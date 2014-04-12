package gov.polisen.ainappen;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * The meaning of this class is to bypass a constraint in ORMLite.
 * It's not a pretty solution, but ORMLite does not support composite 
 * primary keys, and neither can a field be autogenerated without being
 * the primary key. This class helps bypassing that constraint for the "Case" class.
 * @author Joakim
 *
 */
@DatabaseTable(tableName = "obstacleids")
public class LocalObstacleID {
	@DatabaseField(generatedId = true)
	private int localObstacleID;

	public LocalObstacleID(int localObstacleID){
		this.localObstacleID = localObstacleID;
	}
	public LocalObstacleID(){
		//needed for ORMLite
	}
	public int getLocalObstacleID(){
		return this.localObstacleID;
	}
	public void setLocalObstacleID(int localObstacleID){
		this.localObstacleID = localObstacleID;
	}
}