package android.support.p033v7.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.p087b.p088a.C1841b;
import androidx.core.p087b.p088a.C1842c;
import androidx.p060c.C0984n;

/* renamed from: android.support.v7.view.menu.e */
/* compiled from: PG */
class C0465e {

    /* renamed from: a */
    final Context f1597a;

    /* renamed from: b */
    public C0984n f1598b;

    /* renamed from: c */
    public C0984n f1599c;

    public C0465e(Context context) {
        this.f1597a = context;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final MenuItem mo1614a(MenuItem menuItem) {
        if (!(menuItem instanceof C1841b)) {
            return menuItem;
        }
        C1841b bVar = (C1841b) menuItem;
        if (this.f1598b == null) {
            this.f1598b = new C0984n(0);
        }
        MenuItem menuItem2 = (MenuItem) this.f1598b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0486z zVar = new C0486z(this.f1597a, bVar);
        this.f1598b.put(bVar, zVar);
        return zVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final SubMenu mo1615b(SubMenu subMenu) {
        if (!(subMenu instanceof C1842c)) {
            return subMenu;
        }
        C1842c cVar = (C1842c) subMenu;
        if (this.f1599c == null) {
            this.f1599c = new C0984n(0);
        }
        SubMenu subMenu2 = (SubMenu) this.f1599c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C0461ao aoVar = new C0461ao(this.f1597a, cVar);
        this.f1599c.put(cVar, aoVar);
        return aoVar;
    }
}
