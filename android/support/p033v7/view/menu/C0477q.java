package android.support.p033v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C1877c;
import androidx.core.p087b.p088a.C1840a;
import androidx.core.p098j.C2045bk;
import androidx.core.p098j.C2089d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: android.support.v7.view.menu.q */
/* compiled from: PG */
public class C0477q implements C1840a {

    /* renamed from: m */
    private static final int[] f1649m = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    public final Context f1650a;

    /* renamed from: b */
    public C0475o f1651b;

    /* renamed from: c */
    public final ArrayList f1652c;

    /* renamed from: d */
    public final ArrayList f1653d;

    /* renamed from: e */
    public final ArrayList f1654e;

    /* renamed from: f */
    public int f1655f = 0;

    /* renamed from: g */
    CharSequence f1656g;

    /* renamed from: h */
    Drawable f1657h;

    /* renamed from: i */
    View f1658i;

    /* renamed from: j */
    public boolean f1659j = false;

    /* renamed from: k */
    public C0480t f1660k;

    /* renamed from: l */
    public boolean f1661l;

    /* renamed from: n */
    private final Resources f1662n;

    /* renamed from: o */
    private boolean f1663o;

    /* renamed from: p */
    private final boolean f1664p;

    /* renamed from: q */
    private final ArrayList f1665q;

    /* renamed from: r */
    private boolean f1666r;

    /* renamed from: s */
    private boolean f1667s;

    /* renamed from: t */
    private boolean f1668t = false;

    /* renamed from: u */
    private boolean f1669u = false;

    /* renamed from: v */
    private boolean f1670v = false;

    /* renamed from: w */
    private boolean f1671w = false;

    /* renamed from: x */
    private final ArrayList f1672x = new ArrayList();

    /* renamed from: y */
    private final CopyOnWriteArrayList f1673y = new CopyOnWriteArrayList();

    /* renamed from: z */
    private boolean f1674z = false;

    public C0477q(Context context) {
        boolean z = false;
        this.f1650a = context;
        Resources resources = context.getResources();
        this.f1662n = resources;
        this.f1652c = new ArrayList();
        this.f1665q = new ArrayList();
        this.f1666r = true;
        this.f1653d = new ArrayList();
        this.f1654e = new ArrayList();
        this.f1667s = true;
        if (resources.getConfiguration().keyboard != 1 && C2045bk.m5601b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.f1664p = z;
    }

    /* renamed from: C */
    private final void m1603C(int i, boolean z) {
        if (i >= 0 && i < this.f1652c.size()) {
            this.f1652c.remove(i);
            if (z) {
                mo1665l(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final void mo1638A() {
        this.f1667s = true;
        mo1665l(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo1639B() {
        this.f1666r = true;
        mo1665l(true);
    }

    /* renamed from: a */
    public C0477q mo1583a() {
        return this;
    }

    public final MenuItem add(int i) {
        return mo1650c(0, 0, 0, this.f1662n.getString(i));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1650a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = mo1650c(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f1662n.getString(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0480t mo1649b(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.f1672x;
        arrayList.clear();
        mo1663j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0480t) arrayList.get(0);
        }
        boolean x = mo1600x();
        for (int i2 = 0; i2 < size; i2++) {
            C0480t tVar = (C0480t) arrayList.get(i2);
            if (x) {
                c = tVar.f1688g;
            } else {
                c = tVar.f1686e;
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (x && c == 8 && i == 67))) {
                return tVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public MenuItem mo1650c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        char c = (f1649m[i5] << 16) | ((char) i3);
        C0480t tVar = new C0480t(this, i, i2, i3, c, charSequence, this.f1655f);
        ArrayList arrayList = this.f1652c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                if (((C0480t) arrayList.get(size)).f1684c <= c) {
                    i4 = size + 1;
                    break;
                }
            } else {
                i4 = 0;
                break;
            }
        }
        arrayList.add(i4, tVar);
        mo1665l(true);
        return tVar;
    }

    public final void clear() {
        C0480t tVar = this.f1660k;
        if (tVar != null) {
            mo1596t(tVar);
        }
        this.f1652c.clear();
        mo1665l(true);
    }

    public final void clearHeader() {
        this.f1657h = null;
        this.f1656g = null;
        this.f1658i = null;
        mo1665l(false);
    }

    public final void close() {
        mo1657g(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo1584d() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: e */
    public final ArrayList mo1654e() {
        if (!this.f1666r) {
            return this.f1665q;
        }
        this.f1665q.clear();
        int size = this.f1652c.size();
        for (int i = 0; i < size; i++) {
            C0480t tVar = (C0480t) this.f1652c.get(i);
            if (tVar.isVisible()) {
                this.f1665q.add(tVar);
            }
        }
        this.f1666r = false;
        this.f1667s = true;
        return this.f1665q;
    }

    /* renamed from: f */
    public final void mo1655f(C0452af afVar, Context context) {
        this.f1673y.add(new WeakReference(afVar));
        afVar.mo1520c(context, this);
        this.f1667s = true;
    }

    public final MenuItem findItem(int i) {
        MenuItem findItem;
        int size = this.f1652c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0480t tVar = (C0480t) this.f1652c.get(i2);
            if (tVar.f1682a == i) {
                return tVar;
            }
            if (tVar.hasSubMenu() && (findItem = tVar.f1691j.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final void mo1657g(boolean z) {
        if (!this.f1671w) {
            this.f1671w = true;
            Iterator it = this.f1673y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0452af afVar = (C0452af) weakReference.get();
                if (afVar == null) {
                    this.f1673y.remove(weakReference);
                } else {
                    afVar.mo1543d(this, z);
                }
            }
            this.f1671w = false;
        }
    }

    public final MenuItem getItem(int i) {
        return (MenuItem) this.f1652c.get(i);
    }

    /* renamed from: h */
    public final void mo1659h(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f1673y.isEmpty()) {
            Iterator it = this.f1673y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0452af afVar = (C0452af) weakReference.get();
                if (afVar == null) {
                    this.f1673y.remove(weakReference);
                } else {
                    int a = afVar.mo1519a();
                    if (a > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(a)) != null) {
                        afVar.mo1549n(parcelable);
                    }
                }
            }
        }
    }

    public final boolean hasVisibleItems() {
        if (this.f1661l) {
            return true;
        }
        int size = this.f1652c.size();
        for (int i = 0; i < size; i++) {
            if (((C0480t) this.f1652c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final void mo1661i(Bundle bundle) {
        Parcelable eI;
        if (!this.f1673y.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator it = this.f1673y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0452af afVar = (C0452af) weakReference.get();
                if (afVar == null) {
                    this.f1673y.remove(weakReference);
                } else {
                    int a = afVar.mo1519a();
                    if (a > 0 && (eI = afVar.mo1545eI()) != null) {
                        sparseArray.put(a, eI);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo1649b(i, keyEvent) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo1663j(List list, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean x = mo1600x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1652c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0480t tVar = (C0480t) this.f1652c.get(i3);
                if (tVar.hasSubMenu()) {
                    tVar.f1691j.mo1663j(list, i, keyEvent);
                }
                if (x) {
                    c = tVar.f1688g;
                } else {
                    c = tVar.f1686e;
                }
                if (x) {
                    i2 = tVar.f1689h;
                } else {
                    i2 = tVar.f1687f;
                }
                if ((modifiers & 69647) == (i2 & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (x && c == 8 && i == 67)) && tVar.isEnabled())) {
                    list.add(tVar);
                }
            }
        }
    }

    /* renamed from: k */
    public final void mo1664k() {
        ArrayList e = mo1654e();
        if (this.f1667s) {
            Iterator it = this.f1673y.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0452af afVar = (C0452af) weakReference.get();
                if (afVar == null) {
                    this.f1673y.remove(weakReference);
                } else {
                    z |= afVar.mo1547g();
                }
            }
            if (z) {
                this.f1653d.clear();
                this.f1654e.clear();
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    C0480t tVar = (C0480t) e.get(i);
                    if (tVar.mo1710o()) {
                        this.f1653d.add(tVar);
                    } else {
                        this.f1654e.add(tVar);
                    }
                }
            } else {
                this.f1653d.clear();
                this.f1654e.clear();
                this.f1654e.addAll(mo1654e());
            }
            this.f1667s = false;
        }
    }

    /* renamed from: l */
    public void mo1665l(boolean z) {
        if (!this.f1668t) {
            if (z) {
                this.f1666r = true;
                this.f1667s = true;
            }
            if (!this.f1673y.isEmpty()) {
                mo1675s();
                Iterator it = this.f1673y.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    C0452af afVar = (C0452af) weakReference.get();
                    if (afVar == null) {
                        this.f1673y.remove(weakReference);
                    } else {
                        afVar.mo1546f(z);
                    }
                }
                mo1672r();
                return;
            }
            return;
        }
        this.f1669u = true;
        if (z) {
            this.f1670v = true;
        }
    }

    /* renamed from: m */
    public final void mo1666m(C0452af afVar) {
        Iterator it = this.f1673y.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0452af afVar2 = (C0452af) weakReference.get();
            if (afVar2 == null || afVar2 == afVar) {
                this.f1673y.remove(weakReference);
            }
        }
    }

    /* renamed from: n */
    public final void mo1667n(Bundle bundle) {
        MenuItem findItem;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo1584d());
        int size = this.f1652c.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((C0460an) item.getSubMenu()).mo1667n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    /* renamed from: o */
    public final void mo1668o(Bundle bundle) {
        int size = this.f1652c.size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0460an) item.getSubMenu()).mo1668o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo1584d(), sparseArray);
        }
    }

    /* renamed from: p */
    public void mo1586p(C0475o oVar) {
        this.f1651b = oVar;
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return mo1680z(findItem(i), (C0452af) null, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0480t b = mo1649b(i, keyEvent);
        boolean z = b != null ? mo1680z(b, (C0452af) null, i2) : false;
        if ((i2 & 2) != 0) {
            mo1657g(true);
        }
        return z;
    }

    /* renamed from: r */
    public final void mo1672r() {
        this.f1668t = false;
        if (this.f1669u) {
            this.f1669u = false;
            mo1665l(this.f1670v);
        }
    }

    public final void removeGroup(int i) {
        int size = this.f1652c.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((C0480t) this.f1652c.get(i2)).f1683b == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f1652c.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((C0480t) this.f1652c.get(i2)).f1683b != i) {
                    mo1665l(true);
                } else {
                    m1603C(i2, false);
                    i3 = i4;
                }
            }
            mo1665l(true);
        }
    }

    public final void removeItem(int i) {
        int size = this.f1652c.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0480t) this.f1652c.get(i2)).f1682a == i) {
                break;
            } else {
                i2++;
            }
        }
        m1603C(i2, true);
    }

    /* renamed from: s */
    public final void mo1675s() {
        if (!this.f1668t) {
            this.f1668t = true;
            this.f1669u = false;
            this.f1670v = false;
        }
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1652c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0480t tVar = (C0480t) this.f1652c.get(i2);
            if (tVar.f1683b == i) {
                tVar.mo1705j(z2);
                tVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1674z = z;
    }

    public final void setGroupEnabled(int i, boolean z) {
        int size = this.f1652c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0480t tVar = (C0480t) this.f1652c.get(i2);
            if (tVar.f1683b == i) {
                tVar.setEnabled(z);
            }
        }
    }

    public final void setGroupVisible(int i, boolean z) {
        int size = this.f1652c.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0480t tVar = (C0480t) this.f1652c.get(i2);
            if (tVar.f1683b == i && tVar.mo1714s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo1665l(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f1663o = z;
        mo1665l(false);
    }

    public final int size() {
        return this.f1652c.size();
    }

    /* renamed from: t */
    public boolean mo1596t(C0480t tVar) {
        boolean z = false;
        if (!this.f1673y.isEmpty() && this.f1660k == tVar) {
            mo1675s();
            Iterator it = this.f1673y.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                C0452af afVar = (C0452af) weakReference.get();
                if (afVar == null) {
                    this.f1673y.remove(weakReference);
                } else {
                    z = afVar.mo1521i(tVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo1672r();
            if (z) {
                this.f1660k = null;
            }
        }
        return z;
    }

    /* renamed from: u */
    public boolean mo1597u(C0477q qVar, MenuItem menuItem) {
        C0475o oVar = this.f1651b;
        return oVar != null && oVar.mo1168U(qVar, menuItem);
    }

    /* renamed from: v */
    public boolean mo1598v(C0480t tVar) {
        boolean z = false;
        if (this.f1673y.isEmpty()) {
            return false;
        }
        mo1675s();
        Iterator it = this.f1673y.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            C0452af afVar = (C0452af) weakReference.get();
            if (afVar == null) {
                this.f1673y.remove(weakReference);
            } else {
                z = afVar.mo1522j(tVar);
                if (z) {
                    break;
                }
            }
        }
        mo1672r();
        if (z) {
            this.f1660k = tVar;
        }
        return z;
    }

    /* renamed from: w */
    public boolean mo1599w() {
        return this.f1674z;
    }

    /* renamed from: x */
    public boolean mo1600x() {
        return this.f1663o;
    }

    /* renamed from: y */
    public boolean mo1601y() {
        return this.f1664p;
    }

    /* renamed from: z */
    public final boolean mo1680z(MenuItem menuItem, C0452af afVar, int i) {
        boolean z;
        C0480t tVar = (C0480t) menuItem;
        if (tVar != null && tVar.isEnabled()) {
            boolean n = tVar.mo1709n();
            C2089d dVar = tVar.f1695n;
            boolean z2 = dVar != null && dVar.mo1738c();
            if (tVar.mo1708m()) {
                n |= tVar.expandActionView();
                if (n) {
                    mo1657g(true);
                    return true;
                }
            } else if (tVar.hasSubMenu() || z2) {
                if ((i & 4) == 0) {
                    mo1657g(false);
                }
                if (!tVar.hasSubMenu()) {
                    tVar.mo1707l(new C0460an(this.f1650a, this, tVar));
                }
                C0460an anVar = tVar.f1691j;
                if (z2) {
                    dVar.mo1737b(anVar);
                }
                if (this.f1673y.isEmpty()) {
                    z = false;
                } else {
                    z = afVar != null ? afVar.mo1548h(anVar) : false;
                    Iterator it = this.f1673y.iterator();
                    while (it.hasNext()) {
                        WeakReference weakReference = (WeakReference) it.next();
                        C0452af afVar2 = (C0452af) weakReference.get();
                        if (afVar2 == null) {
                            this.f1673y.remove(weakReference);
                        } else if (!z) {
                            z = afVar2.mo1548h(anVar);
                        }
                    }
                }
                n |= z;
                if (!n) {
                    mo1657g(true);
                }
            } else if ((i & 1) == 0) {
                mo1657g(true);
                return n;
            }
            return n;
        }
        return false;
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return mo1650c(i, i2, i3, this.f1662n.getString(i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f1662n.getString(i4));
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo1650c(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0480t tVar = (C0480t) mo1650c(i, i2, i3, charSequence);
        C0460an anVar = new C0460an(this.f1650a, this, tVar);
        tVar.mo1707l(anVar);
        return anVar;
    }

    /* renamed from: q */
    public final void mo1671q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f1662n;
        if (view != null) {
            this.f1658i = view;
            this.f1656g = null;
            this.f1657h = null;
        } else {
            if (i > 0) {
                this.f1656g = resources.getText(i);
            } else if (charSequence != null) {
                this.f1656g = charSequence;
            }
            if (i2 > 0) {
                this.f1657h = C1877c.m5125a(this.f1650a, i2);
            } else if (drawable != null) {
                this.f1657h = drawable;
            }
            this.f1658i = null;
        }
        mo1665l(false);
    }

    public final MenuItem add(CharSequence charSequence) {
        return mo1650c(0, 0, 0, charSequence);
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
