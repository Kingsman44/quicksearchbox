package androidx.drawerlayout.widget;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p3186j$.util.Objects;

/* renamed from: androidx.drawerlayout.widget.f */
/* compiled from: PG */
final class C2177f {
    /* renamed from: a */
    static OnBackInvokedCallback m6053a(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C2176e(runnable);
    }

    /* renamed from: b */
    static OnBackInvokedDispatcher m6054b(DrawerLayout drawerLayout) {
        return drawerLayout.findOnBackInvokedDispatcher();
    }

    /* renamed from: c */
    static void m6055c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    static void m6056d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
