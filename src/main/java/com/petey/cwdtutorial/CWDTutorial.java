package com.petey.cwdtutorial;

import com.petey.cwdtutorial.registration.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CWDTutorial.MOD_ID)
public class CWDTutorial {

    public static final String MOD_ID = "cwdtutorial";

    public CWDTutorial() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(eventBus);
    }

}
