package android.support.p033v7.view.menu;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v7.view.menu.v */
/* compiled from: PG */
final class C0482v extends C0481u implements ActionProvider.VisibilityListener {

    /* renamed from: d */
    private C0479s f1710d;

    public C0482v(C0486z zVar, ActionProvider actionProvider) {
        super(zVar, actionProvider);
    }

    /* renamed from: e */
    public final View mo1740e(MenuItem menuItem) {
        return this.f1708a.onCreateActionView(menuItem);
    }

    /* renamed from: f */
    public final boolean mo1741f() {
        return this.f1708a.isVisible();
    }

    /* renamed from: g */
    public final boolean mo1742g() {
        return this.f1708a.overridesItemVisibility();
    }

    /* renamed from: h */
    public final void mo1743h(C0479s sVar) {
        this.f1710d = sVar;
        this.f1708a.setVisibilityListener(this);
    }

    public final void onActionProviderVisibilityChanged(boolean z) {
        C0479s sVar = this.f1710d;
        if (sVar != null) {
            sVar.f1678a.f1690i.mo1639B();
        }
    }
}
