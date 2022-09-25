package android.support.p033v7.app;

import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.C0750jd;

/* renamed from: android.support.v7.app.bc */
/* compiled from: PG */
final class C0369bc implements C0451ae {

    /* renamed from: a */
    final /* synthetic */ C0372bf f1242a;

    /* renamed from: b */
    private boolean f1243b;

    public C0369bc(C0372bf bfVar) {
        this.f1242a = bfVar;
    }

    /* renamed from: a */
    public final void mo1121a(C0477q qVar, boolean z) {
        if (!this.f1243b) {
            this.f1243b = true;
            ((C0750jd) this.f1242a.f1246a).f2614a.mo2399j();
            this.f1242a.f1247b.onPanelClosed(108, qVar);
            this.f1243b = false;
        }
    }

    /* renamed from: b */
    public final boolean mo1122b(C0477q qVar) {
        this.f1242a.f1247b.onMenuOpened(108, qVar);
        return true;
    }
}
