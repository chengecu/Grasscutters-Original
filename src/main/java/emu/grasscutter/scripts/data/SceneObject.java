package emu.grasscutter.scripts.data;

import emu.grasscutter.utils.Position;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public abstract class SceneObject {
    public int level;
    public int config_id;
    public int area_id;
    public int vision_level = 0;

    public Position pos;
    public Position rot;
    /** not set by lua */
    public transient SceneGroup group;
}
