package android.support.p033v7.view.menu;

import android.view.MenuItem;

/* renamed from: android.support.v7.view.menu.h */
/* compiled from: PG */
public final class C0468h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0470j f1602a;

    /* renamed from: b */
    final /* synthetic */ MenuItem f1603b;

    /* renamed from: c */
    final /* synthetic */ C0477q f1604c;

    /* renamed from: d */
    final /* synthetic */ C0469i f1605d;

    public C0468h(C0469i iVar, C0470j jVar, MenuItem menuItem, C0477q qVar) {
        this.f1605d = iVar;
        this.f1602a = jVar;
        this.f1603b = menuItem;
        this.f1604c = qVar;
    }

    public final void run() {
        C0470j jVar = this.f1602a;
        if (jVar != null) {
            this.f1605d.f1606a.f1615f = true;
            jVar.f1608b.mo1657g(false);
            this.f1605d.f1606a.f1615f = false;
        }
        MenuItem menuItem = this.f1603b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f1604c.mo1680z(menuItem, (C0452af) null, 4);
        }
    }
}
