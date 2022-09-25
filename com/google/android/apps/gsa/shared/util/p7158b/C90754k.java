package com.google.android.apps.gsa.shared.util.p7158b;

import android.os.Build;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.p7132a.C90477a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.p7132a.C90478b;

/* renamed from: com.google.android.apps.gsa.shared.util.b.k */
/* compiled from: PG */
public final class C90754k {

    /* renamed from: a */
    public static boolean f253828a = false;

    /* renamed from: b */
    public static volatile C90476a f253829b;

    /* renamed from: c */
    private static final boolean f253830c;

    static {
        boolean z = true;
        boolean z2 = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        f253830c = z2;
        if (!"goldfish".equals(Build.HARDWARE) && !"ranchu".equals(Build.HARDWARE)) {
            z = false;
        }
        f253829b = (z2 || z) ? new C90477a() : new C90478b();
    }
}
