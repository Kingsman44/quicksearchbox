package com.google.android.material.internal;

import android.content.Context;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.view.SubMenu;

/* renamed from: com.google.android.material.internal.x */
/* compiled from: PG */
public final class C44764x extends C0477q {
    public C44764x(Context context) {
        super(context);
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0480t tVar = (C0480t) mo1650c(i, i2, i3, charSequence);
        C44715an anVar = new C44715an(this.f1650a, this, tVar);
        tVar.mo1707l(anVar);
        return anVar;
    }
}
