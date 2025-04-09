package shocker.mod.learningmod.client;

import net.fabricmc.api.ClientModInitializer;
import shocker.mod.learningmod.Learningmod;
import shocker.mod.learningmod.client.gui.ExampleGuiDescription;

public class LearningmodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HandledScreens.<ExampleGuiDescription, ExampleBlockScreen>register(Learningmod.SCREEN_HANDLER_TYPE, (gui, inventory, title) -> new ExampleBlockScreen(gui, inventory.player, title));
    }
}
