package android.support.p033v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.y */
/* compiled from: PG */
final class C0485y implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ C0486z f1714a;

    /* renamed from: b */
    private final MenuItem.OnMenuItemClickListener f1715b;

    public C0485y(C0486z zVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1714a = zVar;
        this.f1715b = onMenuItemClickListener;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f1715b.onMenuItemClick(this.f1714a.mo1614a(menuItem));
    }
}
