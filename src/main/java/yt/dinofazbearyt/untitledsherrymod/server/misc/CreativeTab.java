package yt.dinofazbearyt.untitledsherrymod.server.misc;

import yt.dinofazbearyt.untitledsherrymod.UntitledSherryMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import yt.dinofazbearyt.untitledsherrymod.server.item.BasicItems;
import yt.dinofazbearyt.untitledsherrymod.server.item.MiscItems;
import java.util.function.Supplier;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVETAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UntitledSherryMod.MODID);

    public static final Supplier<CreativeModeTab> UNTITLEDSHERRYMOD = CREATIVETAB.register("untitledsherrymod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(MiscItems.ROOT_ICON_ITEM.get()))
                    .title(Component.translatable("creativetab.untitledsherrymod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(BasicItems.DAPPERIES);
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVETAB.register(eventBus);
    }
}
