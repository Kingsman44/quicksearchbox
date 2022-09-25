package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bd */
/* compiled from: PG */
final class C113549bd extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ C68214a f314357a;

    /* renamed from: b */
    final /* synthetic */ C113558bm f314358b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113549bd(C113558bm bmVar, Context context, C68214a aVar) {
        super(context);
        this.f314358b = bmVar;
        this.f314357a = aVar;
    }

    public final void onLayoutCompleted(C0670ge geVar) {
        super.onLayoutCompleted(geVar);
        C112694be beVar = (C112694be) this.f314357a.mo27525b();
        RecyclerView recyclerView = this.f314358b.f314416f;
        if (beVar.f312410g.compareAndSet(false, true)) {
            C28295m.m52919e(recyclerView, new C28292j(85951));
            beVar.mo99659j();
        }
        C60321oe a = C28285c.m52874a(recyclerView, 85951);
        Optional optional = (Optional) beVar.f312405b.get();
        if (optional.isPresent() && a != null) {
            aqm aqm = a.f163230e;
            if (aqm == null) {
                aqm = aqm.f159760n;
            }
            aql aql = (aql) aqm.toBuilder();
            String str = (String) optional.get();
            aql.copyOnWrite();
            aqm aqm2 = (aqm) aql.instance;
            str.getClass();
            aqm2.f159762a |= 2;
            aqm2.f159764c = str;
            aqm aqm3 = (aqm) aql.build();
            C60320od odVar = (C60320od) a.toBuilder();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            aqm3.getClass();
            oeVar.f163230e = aqm3;
            oeVar.f163226a |= 16;
            a = (C60321oe) odVar.build();
        }
        if (a != null && beVar.f312408e.get()) {
            beVar.f312406c.set(Optional.m71637of(a));
            beVar.f312412i = beVar.f312411h.mo26870b();
        }
    }
}
