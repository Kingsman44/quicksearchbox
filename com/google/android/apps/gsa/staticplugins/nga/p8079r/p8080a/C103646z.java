package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.C118928k;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5224k.p5225a.C67226d;
import com.google.speech.p5224k.p5225a.C67227e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.z */
/* compiled from: PG */
public final class C103646z extends C68247h {

    /* renamed from: a */
    private final C69464a f288719a;

    /* renamed from: c */
    private final C68283d f288720c;

    /* renamed from: d */
    private final C69464a f288721d;

    public C103646z(C69464a aVar, C69464a aVar2, C69464a aVar3, C68283d dVar, C69464a aVar4) {
        super(aVar2, new C68277d(C103646z.class), aVar);
        this.f288719a = aVar3;
        this.f288720c = C68236af.m98549d(dVar);
        this.f288721d = aVar4;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C118928k kVar;
        Query query = (Query) obj;
        C69464a aVar = this.f288719a;
        C69464a aVar2 = this.f288721d;
        if (((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f250999aY) && !((C74713bn) aVar2.mo17428b()).mo71078c()) {
            kVar = new C118928k(C58836b.f156633a, C67227e.f182707d);
        } else if (!query.mo84386cS()) {
            kVar = new C118928k(C58836b.f156633a, C67227e.f182707d);
        } else if (!query.mo84324bI() || (query.mo84411cr() && ((C90021c) aVar.mo17428b()).mo79746e(C90126fx.f251716o))) {
            C67226d dVar = (C67226d) C67227e.f182706c.createBuilder();
            dVar.copyOnWrite();
            C67227e eVar = (C67227e) dVar.instance;
            eVar.f182710b = 1;
            eVar.f182709a = 1 | eVar.f182709a;
            kVar = new C118928k(C58833ax.m90834k((C67227e) dVar.build()), C67227e.f182707d);
        } else {
            kVar = new C118928k(C58836b.f156633a, C67227e.f182707d);
        }
        return C60856cj.m92900i(kVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f288720c.mo60297gq();
    }
}
