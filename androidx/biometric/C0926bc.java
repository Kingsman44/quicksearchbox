package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: androidx.biometric.bc */
/* compiled from: PG */
public final class C0926bc {
    /* renamed from: a */
    public static boolean m2847a(Context context) {
        KeyguardManager a = C0925bb.m2845a(context);
        if (a == null) {
            return false;
        }
        return C0925bb.m2846b(a);
    }
}
