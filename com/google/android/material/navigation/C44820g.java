package com.google.android.material.navigation;

import android.content.Context;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: com.google.android.material.navigation.g */
/* compiled from: PG */
public final class C44820g extends C0477q {

    /* renamed from: m */
    private final Class f116924m;

    /* renamed from: n */
    private final int f116925n;

    public C44820g(Context context, Class cls, int i) {
        super(context);
        this.f116924m = cls;
        this.f116925n = i;
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(String.valueOf(this.f116924m.getSimpleName()).concat(" does not support submenus"));
    }

    /* renamed from: c */
    public final MenuItem mo1650c(int i, int i2, int i3, CharSequence charSequence) {
        if (this.f1652c.size() + 1 <= this.f116925n) {
            mo1675s();
            MenuItem c = super.mo1650c(i, i2, i3, charSequence);
            if (c instanceof C0480t) {
                ((C0480t) c).mo1705j(true);
            }
            mo1672r();
            return c;
        }
        String simpleName = this.f116924m.getSimpleName();
        int i4 = this.f116925n;
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + i4 + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
