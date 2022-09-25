package android.support.p033v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.x */
/* compiled from: PG */
final class C0484x implements MenuItem.OnActionExpandListener {

    /* renamed from: a */
    final /* synthetic */ C0486z f1712a;

    /* renamed from: b */
    private final MenuItem.OnActionExpandListener f1713b;

    public C0484x(C0486z zVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1712a = zVar;
        this.f1713b = onActionExpandListener;
    }

    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f1713b.onMenuItemActionCollapse(this.f1712a.mo1614a(menuItem));
    }

    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f1713b.onMenuItemActionExpand(this.f1712a.mo1614a(menuItem));
    }
}
