package android.support.p033v7.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.support.p033v7.view.menu.C0480t;
import android.support.p033v7.view.menu.C0486z;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.p087b.p088a.C1841b;
import androidx.core.p098j.C2089d;
import androidx.core.p098j.C2106u;
import androidx.core.p098j.C2107v;
import java.lang.reflect.Constructor;

/* renamed from: android.support.v7.view.i */
/* compiled from: PG */
final class C0441i {

    /* renamed from: A */
    C2089d f1459A;

    /* renamed from: B */
    public CharSequence f1460B;

    /* renamed from: C */
    public CharSequence f1461C;

    /* renamed from: D */
    public ColorStateList f1462D = null;

    /* renamed from: E */
    public PorterDuff.Mode f1463E = null;

    /* renamed from: F */
    final /* synthetic */ C0442j f1464F;

    /* renamed from: a */
    public final Menu f1465a;

    /* renamed from: b */
    public int f1466b;

    /* renamed from: c */
    public int f1467c;

    /* renamed from: d */
    public int f1468d;

    /* renamed from: e */
    public int f1469e;

    /* renamed from: f */
    public boolean f1470f;

    /* renamed from: g */
    public boolean f1471g;

    /* renamed from: h */
    public boolean f1472h;

    /* renamed from: i */
    public int f1473i;

    /* renamed from: j */
    public int f1474j;

    /* renamed from: k */
    public CharSequence f1475k;

    /* renamed from: l */
    public CharSequence f1476l;

    /* renamed from: m */
    public int f1477m;

    /* renamed from: n */
    public char f1478n;

    /* renamed from: o */
    public int f1479o;

    /* renamed from: p */
    public char f1480p;

    /* renamed from: q */
    public int f1481q;

    /* renamed from: r */
    public int f1482r;

    /* renamed from: s */
    public boolean f1483s;

    /* renamed from: t */
    public boolean f1484t;

    /* renamed from: u */
    public boolean f1485u;

    /* renamed from: v */
    public int f1486v;

    /* renamed from: w */
    public int f1487w;

    /* renamed from: x */
    public String f1488x;

    /* renamed from: y */
    public String f1489y;

    /* renamed from: z */
    public String f1490z;

    public C0441i(C0442j jVar, Menu menu) {
        this.f1464F = jVar;
        this.f1465a = menu;
        mo1431c();
    }

    /* renamed from: e */
    public static final char m1436e(String str) {
        if (str == null) {
            return 0;
        }
        return str.charAt(0);
    }

    /* renamed from: a */
    public final SubMenu mo1429a() {
        this.f1472h = true;
        SubMenu addSubMenu = this.f1465a.addSubMenu(this.f1466b, this.f1473i, this.f1474j, this.f1475k);
        mo1432d(addSubMenu.getItem());
        return addSubMenu;
    }

    /* renamed from: b */
    public final Object mo1430b(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f1464F.f1495e.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: ".concat(str), e);
            return null;
        }
    }

    /* renamed from: c */
    public final void mo1431c() {
        this.f1466b = 0;
        this.f1467c = 0;
        this.f1468d = 0;
        this.f1469e = 0;
        this.f1470f = true;
        this.f1471g = true;
    }

    /* renamed from: d */
    public final void mo1432d(MenuItem menuItem) {
        boolean z = false;
        menuItem.setChecked(this.f1483s).setVisible(this.f1484t).setEnabled(this.f1485u).setCheckable(this.f1482r > 0).setTitleCondensed(this.f1476l).setIcon(this.f1477m);
        int i = this.f1486v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.f1490z != null) {
            if (!this.f1464F.f1495e.isRestricted()) {
                C0442j jVar = this.f1464F;
                if (jVar.f1496f == null) {
                    jVar.f1496f = jVar.mo1433a(jVar.f1495e);
                }
                menuItem.setOnMenuItemClickListener(new C0440h(jVar.f1496f, this.f1490z));
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        if (this.f1482r >= 2) {
            if (menuItem instanceof C0480t) {
                ((C0480t) menuItem).mo1705j(true);
            } else if (menuItem instanceof C0486z) {
                C0486z zVar = (C0486z) menuItem;
                try {
                    if (zVar.f1717e == null) {
                        zVar.f1717e = zVar.f1716d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                    }
                    zVar.f1717e.invoke(zVar.f1716d, new Object[]{true});
                } catch (Exception e) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                }
            }
        }
        String str = this.f1488x;
        if (str != null) {
            menuItem.setActionView((View) mo1430b(str, C0442j.f1491a, this.f1464F.f1493c));
            z = true;
        }
        int i2 = this.f1487w;
        if (i2 > 0) {
            if (!z) {
                menuItem.setActionView(i2);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        C2089d dVar = this.f1459A;
        if (dVar != null) {
            if (menuItem instanceof C1841b) {
                ((C1841b) menuItem).mo1463c(dVar);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        C2107v.m5811a(menuItem, this.f1460B);
        CharSequence charSequence = this.f1461C;
        boolean z2 = menuItem instanceof C1841b;
        if (z2) {
            ((C1841b) menuItem).mo1465d(charSequence);
        } else {
            C2106u.m5808k(menuItem, charSequence);
        }
        char c = this.f1478n;
        int i3 = this.f1479o;
        if (z2) {
            ((C1841b) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            C2106u.m5802e(menuItem, c, i3);
        }
        char c2 = this.f1480p;
        int i4 = this.f1481q;
        if (z2) {
            ((C1841b) menuItem).setNumericShortcut(c2, i4);
        } else {
            C2106u.m5806i(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.f1463E;
        if (mode != null) {
            if (z2) {
                ((C1841b) menuItem).setIconTintMode(mode);
            } else {
                C2106u.m5805h(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f1462D;
        if (colorStateList == null) {
            return;
        }
        if (z2) {
            ((C1841b) menuItem).setIconTintList(colorStateList);
        } else {
            C2106u.m5804g(menuItem, colorStateList);
        }
    }
}
