package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p3186j$.util.Objects;

/* renamed from: androidx.activity.q */
/* compiled from: PG */
final class C0804q {
    /* renamed from: a */
    static OnBackInvokedCallback m2645a(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0803p(runnable);
    }

    /* renamed from: b */
    static void m2646b(Object obj, int i, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: c */
    static void m2647c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
