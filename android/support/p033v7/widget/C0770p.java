package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0451ae;
import android.support.p033v7.view.menu.C0460an;
import android.support.p033v7.view.menu.C0477q;

/* renamed from: android.support.v7.widget.p */
/* compiled from: PG */
final class C0770p implements C0451ae {

    /* renamed from: a */
    final /* synthetic */ ActionMenuPresenter f2660a;

    public C0770p(ActionMenuPresenter actionMenuPresenter) {
        this.f2660a = actionMenuPresenter;
    }

    /* renamed from: a */
    public final void mo1121a(C0477q qVar, boolean z) {
        if (qVar instanceof C0460an) {
            qVar.mo1583a().mo1657g(false);
        }
        C0451ae aeVar = this.f2660a.f1594e;
        if (aeVar != null) {
            aeVar.mo1121a(qVar, z);
        }
    }

    /* renamed from: b */
    public final boolean mo1122b(C0477q qVar) {
        ActionMenuPresenter actionMenuPresenter = this.f2660a;
        if (qVar == actionMenuPresenter.f1592c) {
            return false;
        }
        actionMenuPresenter.f1776o = ((C0460an) qVar).f1587n.f1682a;
        C0451ae aeVar = actionMenuPresenter.f1594e;
        if (aeVar != null) {
            return aeVar.mo1122b(qVar);
        }
        return false;
    }
}
