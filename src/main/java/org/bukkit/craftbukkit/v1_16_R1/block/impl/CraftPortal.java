/**
 * Automatically generated file, changes will be lost.
 */
package org.bukkit.craftbukkit.v1_16_R1.block.impl;

import org.bukkit.craftbukkit.v1_16_R1.block.data.CraftBlockData;

public final class CraftPortal extends CraftBlockData implements org.bukkit.block.data.Orientable {

    public CraftPortal() {
        super();
    }

    public CraftPortal(net.minecraft.block.BlockState state) {
        super(state);
    }

    // org.bukkit.craftbukkit.block.data.CraftOrientable

    private static final net.minecraft.state.property.EnumProperty<?> AXIS = getEnum(net.minecraft.block.NetherPortalBlock.class, "axis");

    @Override
    public org.bukkit.Axis getAxis() {
        return get(AXIS, org.bukkit.Axis.class);
    }

    @Override
    public void setAxis(org.bukkit.Axis axis) {
        set(AXIS, axis);
    }

    @Override
    public java.util.Set<org.bukkit.Axis> getAxes() {
        return getValues(AXIS, org.bukkit.Axis.class);
    }
}
