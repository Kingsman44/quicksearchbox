package android.support.p033v7.app;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import p3186j$.util.Objects;

/* renamed from: android.support.v7.app.ah */
/* compiled from: PG */
final class C0347ah {
    /* renamed from: a */
    static OnBackInvokedCallback m1064a(Object obj, C0356aq aqVar) {
        Objects.requireNonNull(aqVar);
        C0346ag agVar = new C0346ag(aqVar);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, agVar);
        return agVar;
    }

    /* renamed from: b */
    static OnBackInvokedDispatcher m1065b(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    /* renamed from: c */
    static void m1066c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
