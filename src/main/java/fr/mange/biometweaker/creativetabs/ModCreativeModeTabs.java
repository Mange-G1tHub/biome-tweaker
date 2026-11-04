package fr.mange.biometweaker.creativetabs;

import fr.mange.biometweaker.BiomeTweaker;
import fr.mange.biometweaker.block.ModBlocks;
import fr.mange.biometweaker.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BiomeTweaker.MODID);

    public static final Supplier<CreativeModeTab> BIOMETWEAKER_TAB = CREATIVE_MODE_TAB.register("biometweaker_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IMPURE_PLATINUM_INGOT.get()))
                    .title(Component.translatable("creativetab.biometweaker.biometweaker"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BIOMEPICKER);
                        output.accept(ModItems.IMPURE_PLATINUM_INGOT);
                        output.accept(ModItems.IMPURE_RAW_PLATINUM);
                        output.accept(ModItems.CRUSHED_IMPURE_RAW_PLATINUM);
                        output.accept(ModItems.IMPURE_PLATINUM_NUGGET);

                        output.accept(ModBlocks.IMPURE_PLATINUM_BLOCK);
                        output.accept(ModBlocks.IMPURE_PLATINUM_ORE);
                    })


                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
