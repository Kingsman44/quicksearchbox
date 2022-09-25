package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.cn */
/* compiled from: PG */
final class C96137cn implements C22870f {

    /* renamed from: a */
    final /* synthetic */ C96139cp f269131a;

    public C96137cn(C96139cp cpVar) {
        this.f269131a = cpVar;
    }

    public final void run() {
        C96139cp cpVar = this.f269131a;
        cpVar.f269147p = cpVar.f269136e.mo28208h("autoScroll", 8000, cpVar.f269148q);
        C96139cp cpVar2 = this.f269131a;
        if (cpVar2.f269145n == ((C58724pq) ((C96140cq) cpVar2.f269144m).f269150c).f156474d - 1) {
            cpVar2.mo89981h();
        }
        C96139cp cpVar3 = this.f269131a;
        ViewPager viewPager = cpVar3.f269143l;
        int i = cpVar3.f269145n;
        cpVar3.f269145n = i + 1;
        viewPager.mo9148m(i, true);
    }
}
