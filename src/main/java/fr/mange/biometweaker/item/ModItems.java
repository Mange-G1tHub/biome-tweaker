package fr.mange.biometweaker.item;

import fr.mange.biometweaker.BiomeTweaker;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BiomeTweaker.MODID);

    public static final DeferredItem<Item> BIOMEPICKER = ITEMS.register("biome_picker",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PLATINUM_BLAZE_CAKE = ITEMS.register("platinum_blaze_cake",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_BLAZE_CAKE_BASE = ITEMS.register("platinum_blaze_cake_base",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FREEZING_CAKE = ITEMS.register("freezing_cake",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLATINUM_FREEZING_CAKE = ITEMS.register("platinum_freezing_cake",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> IMPURE_PLATINUM_INGOT = ITEMS.register("impure_platinum_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IMPURE_PLATINUM_NUGGET = ITEMS.register("impure_platinum_nugget",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IMPURE_RAW_PLATINUM = ITEMS.register("impure_raw_platinum",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CRUSHED_IMPURE_RAW_PLATINUM = ITEMS.register("crushed_impure_raw_platinum",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
