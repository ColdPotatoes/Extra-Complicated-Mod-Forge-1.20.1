package net.ryannoh.extracomplicatedmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.ryannoh.extracomplicatedmod.ExtraComplicatedMod;
import net.ryannoh.extracomplicatedmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExtraComplicatedMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EXTRA_COMPLICATED_TAB = CREATIVE_MODE_TAB.register("extra_complicated_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIRT_PILE.get()))
                    .title(Component.translatable("creativetab.extra_complicated_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(new ItemStack(ModItems.DIRT_PILE.get()));
                        pOutput.accept(new ItemStack(ModItems.FLAX.get()));
                        pOutput.accept(new ItemStack(ModItems.FLAX_FIBER.get()));
                        pOutput.accept(new ItemStack(ModItems.BRANCH.get()));
                        pOutput.accept(new ItemStack(ModItems.TWIG.get()));

                        pOutput.accept(ModBlocks.DUMMY_BLOCK.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
