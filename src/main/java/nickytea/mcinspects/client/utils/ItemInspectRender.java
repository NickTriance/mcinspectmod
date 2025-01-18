package nickytea.mcinspects.client.utils;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.RotationAxis;

public class ItemInspectRender {
    public static void inspectHeldItem(MatrixStack matrices) {
        matrices.translate(-0.15f, 0.16f, 0.15f);
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-18.0F));
        matrices.multiply(RotationAxis.POSITIVE_Z.rotationDegrees(82.0F));
        matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(112.0F));
    }
}
