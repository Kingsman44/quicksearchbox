package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.view.View;

/* renamed from: android.support.v7.widget.l */
/* compiled from: PG */
final class C0766l implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f2655a;

    /* renamed from: b */
    private final C0769o f2656b;

    public C0766l(ActionMenuPresenter actionMenuPresenter, C0769o oVar) {
        this.f2655a = actionMenuPresenter;
        this.f2656b = oVar;
    }

    public final void run() {
        C0475o oVar;
        C0477q qVar = this.f2655a.f1592c;
        if (!(qVar == null || (oVar = qVar.f1651b) == null)) {
            oVar.mo1164Q(qVar);
        }
        View view = (View) this.f2655a.f1595f;
        if (!(view == null || view.getWindowToken() == null || !this.f2656b.mo1542i())) {
            this.f2655a.f1772k = this.f2656b;
        }
        this.f2655a.f1774m = null;
    }
}
