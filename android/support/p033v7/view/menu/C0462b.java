package android.support.p033v7.view.menu;

import android.support.p033v7.widget.C0587dc;
import android.support.p033v7.widget.C0746j;
import android.support.p033v7.widget.C0765k;

/* renamed from: android.support.v7.view.menu.b */
/* compiled from: PG */
final class C0462b extends C0587dc {

    /* renamed from: a */
    final /* synthetic */ ActionMenuItemView f1589a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0462b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f1589a = actionMenuItemView;
    }

    /* renamed from: a */
    public final C0456aj mo1611a() {
        C0746j jVar;
        C0463c cVar = this.f1589a.f1508c;
        if (cVar == null || (jVar = ((C0765k) cVar).f2654a.f1773l) == null) {
            return null;
        }
        return jVar.mo1534a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo1612b() {
        C0456aj a;
        ActionMenuItemView actionMenuItemView = this.f1589a;
        C0476p pVar = actionMenuItemView.f1507b;
        if (pVar == null || !pVar.mo1455b(actionMenuItemView.f1506a) || (a = mo1611a()) == null || !a.mo1577x()) {
            return false;
        }
        return true;
    }
}
