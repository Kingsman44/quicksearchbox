package android.support.p033v7.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0678gm;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.C1929b;
import androidx.core.p087b.p088a.C1841b;
import androidx.core.p098j.C2089d;

/* renamed from: android.support.v7.view.menu.t */
/* compiled from: PG */
public final class C0480t implements C1841b {

    /* renamed from: A */
    private int f1679A = 16;

    /* renamed from: B */
    private View f1680B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1681C;

    /* renamed from: a */
    public final int f1682a;

    /* renamed from: b */
    public final int f1683b;

    /* renamed from: c */
    public final int f1684c;

    /* renamed from: d */
    public CharSequence f1685d;

    /* renamed from: e */
    public char f1686e;

    /* renamed from: f */
    public int f1687f = 4096;

    /* renamed from: g */
    public char f1688g;

    /* renamed from: h */
    public int f1689h = 4096;

    /* renamed from: i */
    final C0477q f1690i;

    /* renamed from: j */
    public C0460an f1691j;

    /* renamed from: k */
    public CharSequence f1692k;

    /* renamed from: l */
    public CharSequence f1693l;

    /* renamed from: m */
    public int f1694m;

    /* renamed from: n */
    public C2089d f1695n;

    /* renamed from: o */
    public boolean f1696o = false;

    /* renamed from: p */
    private final int f1697p;

    /* renamed from: q */
    private CharSequence f1698q;

    /* renamed from: r */
    private Intent f1699r;

    /* renamed from: s */
    private Drawable f1700s;

    /* renamed from: t */
    private int f1701t = 0;

    /* renamed from: u */
    private MenuItem.OnMenuItemClickListener f1702u;

    /* renamed from: v */
    private ColorStateList f1703v = null;

    /* renamed from: w */
    private PorterDuff.Mode f1704w = null;

    /* renamed from: x */
    private boolean f1705x = false;

    /* renamed from: y */
    private boolean f1706y = false;

    /* renamed from: z */
    private boolean f1707z = false;

    public C0480t(C0477q qVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1690i = qVar;
        this.f1682a = i2;
        this.f1683b = i;
        this.f1697p = i3;
        this.f1684c = i4;
        this.f1685d = charSequence;
        this.f1694m = i5;
    }

    /* renamed from: g */
    public static void m1634g(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: v */
    private final Drawable m1635v(Drawable drawable) {
        if (drawable != null && this.f1707z && (this.f1705x || this.f1706y)) {
            drawable = drawable.mutate();
            if (this.f1705x) {
                C1929b.m5226g(drawable, this.f1703v);
            }
            if (this.f1706y) {
                C1929b.m5227h(drawable, this.f1704w);
            }
            this.f1707z = false;
        }
        return drawable;
    }

    /* renamed from: a */
    public final C2089d mo1461a() {
        return this.f1695n;
    }

    /* renamed from: b */
    public final void mo1462b(CharSequence charSequence) {
        this.f1692k = charSequence;
        this.f1690i.mo1665l(false);
    }

    /* renamed from: c */
    public final void mo1463c(C2089d dVar) {
        C2089d dVar2 = this.f1695n;
        if (dVar2 != null) {
            dVar2.f5999c = null;
        }
        this.f1680B = null;
        this.f1695n = dVar;
        this.f1690i.mo1665l(true);
        C2089d dVar3 = this.f1695n;
        if (dVar3 != null) {
            dVar3.mo1743h(new C0479s(this));
        }
    }

    public final boolean collapseActionView() {
        if ((this.f1694m & 8) == 0) {
            return false;
        }
        if (this.f1680B == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1681C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1690i.mo1596t(this);
        }
        return false;
    }

    /* renamed from: d */
    public final void mo1465d(CharSequence charSequence) {
        this.f1693l = charSequence;
        this.f1690i.mo1665l(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final char mo1684e() {
        return this.f1690i.mo1600x() ? this.f1688g : this.f1686e;
    }

    public final boolean expandActionView() {
        if (!mo1708m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1681C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1690i.mo1598v(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final CharSequence mo1685f(C0453ag agVar) {
        return (agVar == null || !agVar.mo1445e()) ? this.f1685d : getTitleCondensed();
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f1680B;
        if (view != null) {
            return view;
        }
        C2089d dVar = this.f1695n;
        if (dVar == null) {
            return null;
        }
        View e = dVar.mo1740e(this);
        this.f1680B = e;
        return e;
    }

    public final int getAlphabeticModifiers() {
        return this.f1689h;
    }

    public final char getAlphabeticShortcut() {
        return this.f1688g;
    }

    public final CharSequence getContentDescription() {
        return this.f1692k;
    }

    public final int getGroupId() {
        return this.f1683b;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f1700s;
        if (drawable != null) {
            return m1635v(drawable);
        }
        int i = this.f1701t;
        if (i == 0) {
            return null;
        }
        Drawable c = C0678gm.m2375e().mo3100c(this.f1690i.f1650a, i);
        this.f1701t = 0;
        this.f1700s = c;
        return m1635v(c);
    }

    public final ColorStateList getIconTintList() {
        return this.f1703v;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f1704w;
    }

    public final Intent getIntent() {
        return this.f1699r;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.f1682a;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f1687f;
    }

    public final char getNumericShortcut() {
        return this.f1686e;
    }

    public final int getOrder() {
        return this.f1697p;
    }

    public final SubMenu getSubMenu() {
        return this.f1691j;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.f1685d;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1698q;
        return charSequence != null ? charSequence : this.f1685d;
    }

    public final CharSequence getTooltipText() {
        return this.f1693l;
    }

    /* renamed from: h */
    public final void mo1698h(boolean z) {
        this.f1696o = z;
        this.f1690i.mo1665l(false);
    }

    public final boolean hasSubMenu() {
        return this.f1691j != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo1700i(boolean z) {
        int i = this.f1679A;
        int i2 = (true != z ? 0 : 2) | (i & -3);
        this.f1679A = i2;
        if (i != i2) {
            this.f1690i.mo1665l(false);
        }
    }

    public final boolean isActionViewExpanded() {
        return this.f1696o;
    }

    public final boolean isCheckable() {
        return (this.f1679A & 1) == 1;
    }

    public final boolean isChecked() {
        return (this.f1679A & 2) == 2;
    }

    public final boolean isEnabled() {
        return (this.f1679A & 16) != 0;
    }

    public final boolean isVisible() {
        C2089d dVar = this.f1695n;
        return (dVar == null || !dVar.mo1742g()) ? (this.f1679A & 8) == 0 : (this.f1679A & 8) == 0 && this.f1695n.mo1741f();
    }

    /* renamed from: j */
    public final void mo1705j(boolean z) {
        this.f1679A = (true != z ? 0 : 4) | (this.f1679A & -5);
    }

    /* renamed from: k */
    public final void mo1706k(boolean z) {
        this.f1679A = z ? this.f1679A | 32 : this.f1679A & -33;
    }

    /* renamed from: l */
    public final void mo1707l(C0460an anVar) {
        this.f1691j = anVar;
        anVar.setHeaderTitle(this.f1685d);
    }

    /* renamed from: m */
    public final boolean mo1708m() {
        C2089d dVar;
        if ((this.f1694m & 8) != 0) {
            if (this.f1680B == null && (dVar = this.f1695n) != null) {
                this.f1680B = dVar.mo1740e(this);
            }
            if (this.f1680B != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo1709n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1702u;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0477q qVar = this.f1690i;
        if (qVar.mo1597u(qVar, this)) {
            return true;
        }
        Intent intent = this.f1699r;
        if (intent != null) {
            try {
                this.f1690i.f1650a.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C2089d dVar = this.f1695n;
        if (dVar == null || !dVar.mo1739d()) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo1710o() {
        return (this.f1679A & 32) == 32;
    }

    /* renamed from: p */
    public final boolean mo1711p() {
        return (this.f1679A & 4) != 0;
    }

    /* renamed from: q */
    public final boolean mo1712q() {
        return (this.f1694m & 1) == 1;
    }

    /* renamed from: r */
    public final boolean mo1713r() {
        return (this.f1694m & 2) == 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo1714s(boolean z) {
        int i = this.f1679A;
        int i2 = (true != z ? 8 : 0) | (i & -9);
        this.f1679A = i2;
        return i != i2;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.f1690i.f1650a;
        mo1735u(LayoutInflater.from(context).inflate(i, new LinearLayout(context), false));
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f1688g == c) {
            return this;
        }
        this.f1688g = Character.toLowerCase(c);
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f1679A;
        boolean z2 = z | (i & true);
        this.f1679A = z2 ? 1 : 0;
        if (i != z2) {
            this.f1690i.mo1665l(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        if ((this.f1679A & 4) != 0) {
            C0477q qVar = this.f1690i;
            int i = this.f1683b;
            int size = qVar.f1652c.size();
            qVar.mo1675s();
            for (int i2 = 0; i2 < size; i2++) {
                C0480t tVar = (C0480t) qVar.f1652c.get(i2);
                if (tVar.f1683b == i && tVar.mo1711p() && tVar.isCheckable()) {
                    tVar.mo1700i(tVar == this);
                }
            }
            qVar.mo1672r();
        } else {
            mo1700i(z);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        mo1462b(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f1679A = z ? this.f1679A | 16 : this.f1679A & -17;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f1700s = null;
        this.f1701t = i;
        this.f1707z = true;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1703v = colorStateList;
        this.f1705x = true;
        this.f1707z = true;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1704w = mode;
        this.f1706y = true;
        this.f1707z = true;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f1699r = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c) {
        if (this.f1686e == c) {
            return this;
        }
        this.f1686e = c;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1681C = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1702u = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c2) {
        this.f1686e = c;
        this.f1688g = Character.toLowerCase(c2);
        this.f1690i.mo1665l(false);
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f1690i.f1650a.getString(i));
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1698q = charSequence;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        mo1465d(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        if (mo1714s(z)) {
            this.f1690i.mo1639B();
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo1733t() {
        return this.f1690i.mo1601y() && mo1684e() != 0;
    }

    public final String toString() {
        CharSequence charSequence = this.f1685d;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public final void mo1735u(View view) {
        int i;
        this.f1680B = view;
        this.f1695n = null;
        if (view != null && view.getId() == -1 && (i = this.f1682a) > 0) {
            view.setId(i);
        }
        this.f1690i.mo1638A();
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f1701t = 0;
        this.f1700s = drawable;
        this.f1707z = true;
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.f1686e == c && this.f1687f == i) {
            return this;
        }
        this.f1686e = c;
        this.f1687f = KeyEvent.normalizeMetaState(i);
        this.f1690i.mo1665l(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1694m = i;
            this.f1690i.mo1638A();
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f1685d = charSequence;
        this.f1690i.mo1665l(false);
        C0460an anVar = this.f1691j;
        if (anVar != null) {
            anVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        mo1735u(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1688g == c && this.f1689h == i) {
            return this;
        }
        this.f1688g = Character.toLowerCase(c);
        this.f1689h = KeyEvent.normalizeMetaState(i);
        this.f1690i.mo1665l(false);
        return this;
    }

    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1686e = c;
        this.f1687f = KeyEvent.normalizeMetaState(i);
        this.f1688g = Character.toLowerCase(c2);
        this.f1689h = KeyEvent.normalizeMetaState(i2);
        this.f1690i.mo1665l(false);
        return this;
    }
}
