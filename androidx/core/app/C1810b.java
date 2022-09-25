package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: androidx.core.app.b */
/* compiled from: PG */
final class C1810b {
    /* renamed from: a */
    static void m4977a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    /* renamed from: b */
    static void m4978b(Activity activity, String[] strArr, int i) {
        activity.requestPermissions(strArr, i);
    }

    /* renamed from: c */
    static boolean m4979c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
