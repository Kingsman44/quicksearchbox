package com.google.android.apps.search.podcasts.widgets.p10624f;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.view.menu.C0480t;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.navigation.fragment.C3884h;
import com.google.android.material.bottomnavigation.C44548d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.f.c */
/* compiled from: PG */
final class C141242c implements C44548d {

    /* renamed from: a */
    final /* synthetic */ C141243d f383452a;

    public C141242c(C141243d dVar) {
        this.f383452a = dVar;
    }

    /* renamed from: a */
    public final boolean mo48238a(MenuItem menuItem) {
        Fragment c;
        int i = ((C0480t) menuItem).f1682a;
        if (this.f383452a.f383457e.mo461ab()) {
            return false;
        }
        C141243d dVar = this.f383452a;
        if (dVar.f383455c.f116865b.f116936e == i) {
            return false;
        }
        Fragment c2 = this.f383452a.f383457e.f634a.mo671c((String) dVar.f383459g.get(i));
        C69664n.m101059e(c2, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        C3884h hVar = (C3884h) c2;
        C0154a aVar = new C0154a(this.f383452a.f383457e);
        aVar.mo687t(hVar);
        C141243d dVar2 = this.f383452a;
        SparseArray sparseArray = dVar2.f383459g;
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            String str = (String) sparseArray.valueAt(i2);
            if (!(keyAt == i || (c = dVar2.f383457e.f634a.mo671c(str)) == null)) {
                aVar.mo514k(c);
            }
        }
        aVar.f824t = true;
        aVar.mo509f();
        this.f383452a.f383458f.set(hVar.mo8129a());
        return true;
    }
}
