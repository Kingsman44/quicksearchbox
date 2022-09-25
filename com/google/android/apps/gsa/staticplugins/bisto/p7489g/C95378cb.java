package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.p10712d.C142456g;
import com.google.android.p10712d.C142483h;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.cb */
/* compiled from: PG */
public final /* synthetic */ class C95378cb implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95379cc f266879a;

    /* renamed from: b */
    public final /* synthetic */ int f266880b;

    /* renamed from: c */
    public final /* synthetic */ boolean f266881c;

    public /* synthetic */ C95378cb(C95379cc ccVar, int i, boolean z) {
        this.f266879a = ccVar;
        this.f266880b = i;
        this.f266881c = z;
    }

    public final void run() {
        C95379cc ccVar = this.f266879a;
        int i = this.f266880b;
        boolean z = this.f266881c;
        if (i == ccVar.f266885d) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        ccVar.f266885d = i;
        C142456g gVar = (C142456g) C142483h.f386661d.createBuilder();
        gVar.copyOnWrite();
        C142483h hVar = (C142483h) gVar.instance;
        hVar.f386663a |= 1;
        hVar.f386664b = i;
        gVar.copyOnWrite();
        C142483h hVar2 = (C142483h) gVar.instance;
        hVar2.f386663a |= 2;
        hVar2.f386665c = z;
        C90875ai.m148465b(C95375bz.f266877a, ccVar.f266883b.mo89257D(8, 1, ((C142483h) gVar.build()).toByteArray()), ccVar.f266884c, "Sync").mo85223a(C95377ca.f266878a);
    }
}
