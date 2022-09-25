package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.chip;

import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ah */
/* compiled from: PG */
public final class C81682ah {

    /* renamed from: a */
    public static final C59071e f223400a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.chip.ah");

    /* renamed from: b */
    public final C81681ag f223401b;

    /* renamed from: c */
    private final ChipsCarousel f223402c;

    /* renamed from: d */
    private boolean f223403d;

    public C81682ah(ChipsCarousel chipsCarousel, Supplier supplier, int i, C81572o oVar) {
        this.f223402c = chipsCarousel;
        C81681ag agVar = new C81681ag(i, oVar, new C81678ad(chipsCarousel), chipsCarousel.f223374d, supplier);
        this.f223401b = agVar;
        chipsCarousel.f223377g = agVar;
        C81714t tVar = chipsCarousel.f223373c;
        if (tVar != null) {
            tVar.f223465d = agVar;
        }
    }

    /* renamed from: a */
    public final void mo75236a(String str) {
        if (!this.f223403d) {
            this.f223403d = true;
            RecyclerView recyclerView = this.f223402c.f223374d;
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new C81679ae(this, str, recyclerView));
        }
    }

    /* renamed from: b */
    public final void mo75237b() {
        this.f223403d = false;
        C81681ag agVar = this.f223401b;
        agVar.f223397e = false;
        agVar.f223398f = null;
    }
}
