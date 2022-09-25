package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.m */
/* compiled from: PG */
public final class C1826m {
    /* renamed from: a */
    public static IBinder m5004a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* renamed from: b */
    public static void m5005b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
