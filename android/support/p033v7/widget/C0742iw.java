package android.support.p033v7.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p3186j$.util.Objects;

/* renamed from: android.support.v7.widget.iw */
/* compiled from: PG */
final class C0742iw {
    /* renamed from: a */
    static OnBackInvokedCallback m2480a(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new C0741iv(runnable);
    }

    /* renamed from: b */
    static OnBackInvokedDispatcher m2481b(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: c */
    static void m2482c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: d */
    static void m2483d(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
