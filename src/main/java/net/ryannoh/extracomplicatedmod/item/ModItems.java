package net.ryannoh.extracomplicatedmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ryannoh.extracomplicatedmod.ExtraComplicatedMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExtraComplicatedMod.MOD_ID);

    public static final RegistryObject<Item> DIRT_PILE = ITEMS.register("dirt_pile",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLAX = ITEMS.register("flax",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
