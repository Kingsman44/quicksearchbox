package androidx.camera.camera2.p063b.p064a.p066b;

import android.os.Build;
import androidx.camera.core.p069a.C1346cf;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.camera.camera2.b.a.b.z */
/* compiled from: PG */
public final class C1041z implements C1346cf {

    /* renamed from: a */
    private static final List f3170a = Arrays.asList(new String[]{"sunfish", "bramble", "redfin", "barbet"});

    /* renamed from: a */
    static boolean m3031a() {
        return "Google".equals(Build.MANUFACTURER) && f3170a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
