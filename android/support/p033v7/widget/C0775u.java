package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0475o;
import android.support.p033v7.view.menu.C0477q;
import android.view.MenuItem;

/* renamed from: android.support.v7.widget.u */
/* compiled from: PG */
final class C0775u implements C0475o {

    /* renamed from: a */
    final /* synthetic */ ActionMenuView f2667a;

    public C0775u(ActionMenuView actionMenuView) {
        this.f2667a = actionMenuView;
    }

    /* renamed from: Q */
    public final void mo1164Q(C0477q qVar) {
        C0475o oVar = this.f2667a.f1788e;
        if (oVar != null) {
            oVar.mo1164Q(qVar);
        }
    }

    /* renamed from: U */
    public final boolean mo1168U(C0477q qVar, MenuItem menuItem) {
        C0737ir irVar = this.f2667a.f1789f;
        if (irVar == null) {
            return false;
        }
        if (irVar.f2599a.f1960t.mo5273a()) {
            return true;
        }
        C0745iz izVar = irVar.f2599a.f1961u;
        return izVar != null && izVar.mo1222a(menuItem);
    }
}
