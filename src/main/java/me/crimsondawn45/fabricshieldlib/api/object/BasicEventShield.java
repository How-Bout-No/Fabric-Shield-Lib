package me.crimsondawn45.fabricshieldlib.api.object;

import me.crimsondawn45.fabricshieldlib.api.ShieldRegistry;
import me.crimsondawn45.fabricshieldlib.api.event.ShieldEvent;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag.Identified;

public class BasicEventShield extends BasicShield
{
    public BasicEventShield(Settings settings, int cooldownTicks, int durability, ShieldEvent event, Item repairItem)
    {
        super(settings, cooldownTicks, durability, repairItem);

        ShieldRegistry.registerItemEvent(this, event);
    }

    public BasicEventShield(Settings settings, int cooldownTicks, int durability, ShieldEvent event, Identified<Item> repairItemTag)
    {
        super(settings, cooldownTicks, durability, repairItemTag);

        ShieldRegistry.registerItemEvent(this, event);
    }

    public BasicEventShield(Settings settings, int cooldownTicks, int durability, ShieldEvent event, Item... repairItems)
    {
        super(settings, cooldownTicks, durability, repairItems);

        ShieldRegistry.registerItemEvent(this, event);
    }
}