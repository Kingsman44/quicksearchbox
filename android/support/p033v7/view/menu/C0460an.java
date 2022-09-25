package android.support.p033v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.an */
/* compiled from: PG */
public class C0460an extends C0477q implements SubMenu {

    /* renamed from: m */
    public final C0477q f1586m;

    /* renamed from: n */
    public final C0480t f1587n;

    public C0460an(Context context, C0477q qVar, C0480t tVar) {
        super(context);
        this.f1586m = qVar;
        this.f1587n = tVar;
    }

    /* renamed from: a */
    public final C0477q mo1583a() {
        return this.f1586m.mo1583a();
    }

    /* renamed from: d */
    public final String mo1584d() {
        C0480t tVar = this.f1587n;
        int i = tVar != null ? tVar.f1682a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    public final MenuItem getItem() {
        return this.f1587n;
    }

    /* renamed from: p */
    public final void mo1586p(C0475o oVar) {
        this.f1586m.mo1586p(oVar);
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f1586m.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(int i) {
        super.mo1671q(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        super.mo1671q(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.mo1671q(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f1587n.setIcon(i);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f1586m.setQwertyMode(z);
    }

    /* renamed from: t */
    public final boolean mo1596t(C0480t tVar) {
        return this.f1586m.mo1596t(tVar);
    }

    /* renamed from: u */
    public final boolean mo1597u(C0477q qVar, MenuItem menuItem) {
        return super.mo1597u(qVar, menuItem) || this.f1586m.mo1597u(qVar, menuItem);
    }

    /* renamed from: v */
    public final boolean mo1598v(C0480t tVar) {
        return this.f1586m.mo1598v(tVar);
    }

    /* renamed from: w */
    public final boolean mo1599w() {
        return this.f1586m.mo1599w();
    }

    /* renamed from: x */
    public final boolean mo1600x() {
        return this.f1586m.mo1600x();
    }

    /* renamed from: y */
    public final boolean mo1601y() {
        return this.f1586m.mo1601y();
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.mo1671q(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo1671q(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f1587n.setIcon(drawable);
        return this;
    }
}
