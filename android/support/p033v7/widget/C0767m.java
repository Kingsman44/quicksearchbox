package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0456aj;
import android.view.View;

/* renamed from: android.support.v7.widget.m */
/* compiled from: PG */
final class C0767m extends C0587dc {

    /* renamed from: a */
    final /* synthetic */ C0768n f2657a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0767m(C0768n nVar, View view) {
        super(view);
        this.f2657a = nVar;
    }

    /* renamed from: a */
    public final C0456aj mo1611a() {
        C0769o oVar = this.f2657a.f2658a.f1772k;
        if (oVar == null) {
            return null;
        }
        return oVar.mo1534a();
    }

    /* renamed from: b */
    public final boolean mo1612b() {
        this.f2657a.f2658a.mo1889o();
        return true;
    }

    /* renamed from: c */
    public final boolean mo2723c() {
        ActionMenuPresenter actionMenuPresenter = this.f2657a.f2658a;
        if (actionMenuPresenter.f1774m != null) {
            return false;
        }
        actionMenuPresenter.mo1887l();
        return true;
    }
}
