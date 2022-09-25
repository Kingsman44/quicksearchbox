package androidx.core.p098j;

import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.j.d */
/* compiled from: PG */
public abstract class C2089d {

    /* renamed from: c */
    public C0479s f5999c;

    /* renamed from: a */
    public abstract View mo1736a();

    /* renamed from: b */
    public void mo1737b(SubMenu subMenu) {
    }

    /* renamed from: c */
    public boolean mo1738c() {
        throw null;
    }

    /* renamed from: d */
    public boolean mo1739d() {
        throw null;
    }

    /* renamed from: e */
    public View mo1740e(MenuItem menuItem) {
        return mo1736a();
    }

    /* renamed from: f */
    public boolean mo1741f() {
        return true;
    }

    /* renamed from: g */
    public boolean mo1742g() {
        return false;
    }

    /* renamed from: h */
    public void mo1743h(C0479s sVar) {
        if (this.f5999c != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f5999c = sVar;
    }
}
