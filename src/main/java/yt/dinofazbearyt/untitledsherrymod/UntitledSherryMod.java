package yt.dinofazbearyt.untitledsherrymod;

import yt.dinofazbearyt.untitledsherrymod.server.item.MiscItems;
import yt.dinofazbearyt.untitledsherrymod.server.misc.CreativeTab;
import yt.dinofazbearyt.untitledsherrymod.server.item.BasicItems;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(UntitledSherryMod.MODID)
public class UntitledSherryMod {
    public static final String MODID = "untitledsherrymod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public UntitledSherryMod(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        MiscItems.register(modEventBus);
        CreativeTab.register(modEventBus);
        BasicItems.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
