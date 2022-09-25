package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.view.ViewGroup;
import com.google.android.apps.gsa.staticplugins.opa.util.C113798bn;
import com.google.android.libraries.p1649b.p1653d.C19623a;
import com.google.android.libraries.p1649b.p1655f.C19631e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.bb */
/* compiled from: PG */
final class C114124bb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ValyrianViewPager f316323a;

    public C114124bb(ValyrianViewPager valyrianViewPager) {
        this.f316323a = valyrianViewPager;
    }

    public final void run() {
        this.f316323a.mo101093j(0);
        ValyrianViewPager valyrianViewPager = this.f316323a;
        valyrianViewPager.mo101085f(valyrianViewPager.f316159f);
        C68214a aVar = this.f316323a.f316169p;
        if (aVar != null) {
            ViewGroup viewGroup = ((C113798bn) aVar.mo27525b()).f315168a;
            ValyrianViewPager valyrianViewPager2 = this.f316323a;
            if (valyrianViewPager2.f316170q != 0) {
                if (viewGroup != null) {
                    ((C113798bn) valyrianViewPager2.f316169p.mo27525b()).mo24921c(new C19623a(6), new C19631e(viewGroup, true, 2, 0, viewGroup.getHeight() * this.f316323a.f316170q));
                }
                this.f316323a.f316170q = 0;
            }
        }
    }
}
