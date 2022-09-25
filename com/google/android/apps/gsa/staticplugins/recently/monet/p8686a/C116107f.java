package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.p6881w.C87252a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.p7611bv.C97278ah;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.f */
/* compiled from: PG */
public final class C116107f extends C116103b {

    /* renamed from: e */
    public static final C59071e f321981e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.recently.monet.a.f");

    public C116107f(C85089a aVar, String str, C22871g gVar, C116099a aVar2) {
        super(aVar, str, gVar, aVar2);
    }

    /* renamed from: a */
    public final void mo80854a(long j) {
        C87252a aVar = (C87252a) this.f321976d.get(j);
        C58838bb.m90883r(aVar instanceof C97278ah);
        new C90873ag(this.f321973a.mo78710n(this.f321974b, (C97278ah) aVar), this.f321975c, "Recently storage data changed", new C116104c(this)).mo85223a(C116106e.f321980a);
        this.f321976d.remove(j);
    }

    /* renamed from: c */
    public final void mo80856c(long j) {
        LongSparseArray longSparseArray = new LongSparseArray();
        for (int i = 0; i < this.f321976d.size(); i++) {
            long keyAt = this.f321976d.keyAt(i);
            C87252a aVar = (C87252a) this.f321976d.get(keyAt);
            if (aVar instanceof C97278ah) {
                longSparseArray.append(keyAt, (C97278ah) aVar);
            }
        }
        new C90873ag(this.f321973a.mo78701e(this.f321974b, longSparseArray, j), this.f321975c, "Recently storage data changed", new C116104c(this)).mo85223a(C116105d.f321979a);
    }
}
