package android.support.p033v7.app;

import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0477q;
import android.view.Window;

/* renamed from: android.support.v7.app.ap */
/* compiled from: PG */
final class C0355ap implements C0451ae {

    /* renamed from: a */
    final /* synthetic */ C0356aq f1171a;

    public C0355ap(C0356aq aqVar) {
        this.f1171a = aqVar;
    }

    /* renamed from: a */
    public final void mo1121a(C0477q qVar, boolean z) {
        C0477q a = qVar.mo1583a();
        C0354ao G = this.f1171a.mo1154G(a != qVar ? a : qVar);
        if (G == null) {
            return;
        }
        if (a != qVar) {
            this.f1171a.mo1157J(G.f1155a, G, a);
            this.f1171a.mo1159L(G, true);
            return;
        }
        this.f1171a.mo1159L(G, z);
    }

    /* renamed from: b */
    public final boolean mo1122b(C0477q qVar) {
        Window.Callback callback;
        if (qVar != qVar.mo1583a()) {
            return true;
        }
        C0356aq aqVar = this.f1171a;
        if (!aqVar.f1226z || (callback = aqVar.f1213m.getCallback()) == null || this.f1171a.f1182G) {
            return true;
        }
        callback.onMenuOpened(108, qVar);
        return true;
    }
}
