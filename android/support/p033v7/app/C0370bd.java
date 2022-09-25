package android.support.p033v7.app;

import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.widget.C0750jd;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.app.bd */
/* compiled from: PG */
final class C0370bd implements C0475o {

    /* renamed from: a */
    final /* synthetic */ C0372bf f1244a;

    public C0370bd(C0372bf bfVar) {
        this.f1244a = bfVar;
    }

    /* renamed from: Q */
    public final void mo1164Q(C0477q qVar) {
        if (((C0750jd) this.f1244a.f1246a).f2614a.mo2385C()) {
            this.f1244a.f1247b.onPanelClosed(108, qVar);
        } else if (this.f1244a.f1247b.onPreparePanel(0, (View) null, qVar)) {
            this.f1244a.f1247b.onMenuOpened(108, qVar);
        }
    }

    /* renamed from: U */
    public final boolean mo1168U(C0477q qVar, MenuItem menuItem) {
        return false;
    }
}
