package android.support.p033v7.app;

import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0477q;
import android.view.Window;

/* renamed from: android.support.v7.app.ac */
/* compiled from: PG */
final class C0342ac implements C0451ae {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1137a;

    public C0342ac(C0356aq aqVar) {
        this.f1137a = aqVar;
    }

    /* renamed from: a */
    public final void mo1121a(C0477q qVar, boolean z) {
        this.f1137a.mo1158K(qVar);
    }

    /* renamed from: b */
    public final boolean mo1122b(C0477q qVar) {
        Window.Callback callback = this.f1137a.f1213m.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, qVar);
        return true;
    }
}
