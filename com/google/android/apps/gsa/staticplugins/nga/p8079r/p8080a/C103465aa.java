package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a.p8083c.C103551m;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66587bm;
import com.google.speech.p5208h.C66588bn;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.aa */
/* compiled from: PG */
public final class C103465aa extends C68247h {

    /* renamed from: a */
    private final C68283d f288337a;

    /* renamed from: c */
    private final C69464a f288338c;

    public C103465aa(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3) {
        super(aVar2, new C68277d(C103465aa.class), aVar);
        this.f288337a = C68236af.m98549d(dVar);
        this.f288338c = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C69464a aVar = this.f288338c;
        boolean equals = ((C103551m) obj).equals(C103551m.TEXT);
        boolean z = false;
        if (equals && ((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f251088cH)) {
            z = true;
        }
        C66587bm bmVar = (C66587bm) C66588bn.f181127d.createBuilder();
        bmVar.copyOnWrite();
        C66588bn bnVar = (C66588bn) bmVar.instance;
        bnVar.f181130a = 1 | bnVar.f181130a;
        bnVar.f181131b = equals;
        bmVar.copyOnWrite();
        C66588bn bnVar2 = (C66588bn) bmVar.instance;
        bnVar2.f181130a |= 2;
        bnVar2.f181132c = z;
        return C60856cj.m92900i(new C118928k(C58833ax.m90834k((C66588bn) bmVar.build()), C66588bn.f181128e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f288337a.mo60297gq();
    }
}
