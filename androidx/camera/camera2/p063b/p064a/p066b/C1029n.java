package androidx.camera.camera2.p063b.p064a.p066b;

import android.os.Build;
import android.util.Size;
import androidx.camera.core.p069a.C1346cf;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.b.a.b.n */
/* compiled from: PG */
public final class C1029n implements C1346cf {

    /* renamed from: a */
    private static final List f3157a = Arrays.asList(new String[]{"SM-T580", "SM-J710MN", "SM-A320FL", "SM-G570M", "SM-G610F", "SM-G610M"});

    /* renamed from: a */
    public static boolean m3026a() {
        return "samsung".equalsIgnoreCase(Build.BRAND) && f3157a.contains(Build.MODEL.toUpperCase(Locale.US));
    }

    /* renamed from: b */
    public static final Size m3027b(int i) {
        if (!m3026a()) {
            return null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            return new Size(1920, 1080);
        }
        if (i2 == 1) {
            return new Size(1280, 720);
        }
        if (i2 != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
