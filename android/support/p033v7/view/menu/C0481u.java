package android.support.p033v7.view.menu;

import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p098j.C2089d;

/* renamed from: android.support.v7.view.menu.u */
/* compiled from: PG */
class C0481u extends C2089d {

    /* renamed from: a */
    final ActionProvider f1708a;

    /* renamed from: b */
    final /* synthetic */ C0486z f1709b;

    public C0481u(C0486z zVar, ActionProvider actionProvider) {
        this.f1709b = zVar;
        this.f1708a = actionProvider;
    }

    /* renamed from: a */
    public final View mo1736a() {
        return this.f1708a.onCreateActionView();
    }

    /* renamed from: b */
    public final void mo1737b(SubMenu subMenu) {
        this.f1708a.onPrepareSubMenu(this.f1709b.mo1615b(subMenu));
    }

    /* renamed from: c */
    public final boolean mo1738c() {
        return this.f1708a.hasSubMenu();
    }

    /* renamed from: d */
    public final boolean mo1739d() {
        return this.f1708a.onPerformDefaultAction();
    }
}
