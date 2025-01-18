package nickytea.mcinspects.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.util.InputUtil;
import nickytea.mcinspects.McInspects;
import net.minecraft.client.option.KeyBinding;
import org.lwjgl.glfw.GLFW;


public class McInspectsClient implements ClientModInitializer {



    @Override
    public void onInitializeClient() {
        McInspects.LOGGER.info("MCInspects client initializing...");

        KeyBinding inspectBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding("keys.mcinspects.inspectitem", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_R, "keys.category.mcinspects"));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (inspectBinding.wasPressed()) {
                McInspects.LOGGER.info("User pressed the inspect button");
            }

        });
    }
}
