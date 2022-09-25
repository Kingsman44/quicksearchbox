package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.support.p033v7.p040e.C0430l;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.libraries.logging.C28257a;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.common.p4552o.C60321oe;
import java.util.ArrayList;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ag */
/* compiled from: PG */
final class C81681ag implements C0430l, C81688an {

    /* renamed from: a */
    public final int f223393a;

    /* renamed from: b */
    public final Supplier f223394b;

    /* renamed from: c */
    public final RecyclerView f223395c;

    /* renamed from: d */
    public final Supplier f223396d;

    /* renamed from: e */
    public boolean f223397e;

    /* renamed from: f */
    public C28293k f223398f;

    /* renamed from: g */
    private final C81572o f223399g;

    public C81681ag(int i, C81572o oVar, Supplier supplier, RecyclerView recyclerView, Supplier supplier2) {
        this.f223393a = i;
        this.f223399g = oVar;
        this.f223394b = supplier;
        this.f223395c = recyclerView;
        this.f223396d = supplier2;
    }

    /* renamed from: a */
    public final void mo1392a(int i, int i2, Object obj) {
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        C28293k kVar;
        C28292j jVar;
        if (this.f223397e && (kVar = this.f223398f) != null) {
            C28257a aVar = (C28257a) kVar;
            ArrayList arrayList = new ArrayList(aVar.f76909b);
            C81714t tVar = ((C81678ad) this.f223394b).f223389a.f223373c;
            if (tVar != null) {
                for (int i3 = 0; i3 < i2; i3++) {
                    int i4 = i + i3;
                    C28293k a = tVar.mo75233a(i4);
                    if (!(a == null || (jVar = aVar.f76908a) == null)) {
                        mo75234e(C28285c.m52877d(a, jVar));
                    }
                    arrayList.add(i4, a);
                }
                this.f223398f = C28293k.m52907d(aVar.f76908a, arrayList);
            }
        }
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
    }

    /* renamed from: e */
    public final void mo75234e(C60321oe oeVar) {
        if (oeVar != null) {
            this.f223399g.mo74227b(oeVar);
        }
    }

    /* renamed from: gU */
    public final void mo75235gU(View view) {
        throw null;
    }
}
