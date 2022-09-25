package androidx.core.p098j;

import android.os.Build;
import android.view.Window;

/* renamed from: androidx.core.j.cc */
/* compiled from: PG */
public final class C2069cc {
    /* renamed from: a */
    public static void m5650a(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C2068cb.m5649a(window, z);
        } else {
            C2067ca.m5648a(window, z);
        }
    }
}
