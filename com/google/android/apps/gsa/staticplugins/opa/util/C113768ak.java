package com.google.android.apps.gsa.staticplugins.opa.util;

import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.ak */
/* compiled from: PG */
public final class C113768ak {

    /* renamed from: a */
    public final C113863cr f315072a;

    /* renamed from: b */
    private final SparseArray f315073b = new SparseArray();

    public C113768ak(C113863cr crVar) {
        this.f315072a = crVar;
    }

    /* renamed from: a */
    public final View.OnClickListener mo100609a(int i, Menu menu, View.OnClickListener onClickListener) {
        return new C113767aj(this, onClickListener, new C28292j(i), menu);
    }

    /* renamed from: b */
    public final C28292j mo100610b(MenuItem menuItem) {
        if (menuItem == null) {
            return null;
        }
        return (C28292j) this.f315073b.get(menuItem.getItemId());
    }

    /* renamed from: c */
    public final C28293k mo100611c(C28292j jVar, Menu menu) {
        ArrayList arrayList = new ArrayList(menu.size());
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.hasSubMenu()) {
                arrayList.add(mo100611c(mo100610b(item), item.getSubMenu()));
            } else {
                arrayList.add(C28293k.m52908e(mo100610b(item), new C28293k[0]));
            }
        }
        return C28293k.m52907d(jVar, arrayList);
    }

    /* renamed from: d */
    public final void mo100612d(int i, int i2) {
        C28292j jVar = new C28292j(i2);
        jVar.mo33795i(5);
        this.f315073b.put(i, jVar);
    }
}
