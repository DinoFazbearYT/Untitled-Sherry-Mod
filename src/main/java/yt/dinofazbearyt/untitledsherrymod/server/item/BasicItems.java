package yt.dinofazbearyt.untitledsherrymod.server.item;

import yt.dinofazbearyt.untitledsherrymod.UntitledSherryMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BasicItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UntitledSherryMod.MODID);
    public static final DeferredItem<Item> DAPPERIES = ITEMS.register("dapperies",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
