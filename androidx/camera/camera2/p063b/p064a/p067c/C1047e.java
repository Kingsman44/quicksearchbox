package androidx.camera.camera2.p063b.p064a.p067c;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.core.C1477bw;
import java.nio.BufferUnderflowException;

/* renamed from: androidx.camera.camera2.b.a.c.e */
/* compiled from: PG */
public final class C1047e {
    /* renamed from: a */
    public static boolean m3033a(C1068k kVar) {
        Boolean bool = (Boolean) kVar.mo3785a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        if (bool == null) {
            C1477bw.m3983f("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3034b(C1068k kVar) {
        try {
            return m3033a(kVar);
        } catch (BufferUnderflowException unused) {
            return false;
        }
    }
}
