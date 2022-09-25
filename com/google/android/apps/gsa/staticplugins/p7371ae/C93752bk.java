package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.location.C74631a;
import com.google.android.apps.gsa.location.C74635ab;
import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.location.ad;
import com.google.android.apps.gsa.search.core.p6519al.p6522aa.C84609a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6823b.C86360a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8588o;
import com.google.p4449cd.C57954d;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.bk */
/* compiled from: PG */
public final class C93752bk extends C68247h {

    /* renamed from: a */
    private final C68283d f261641a;

    /* renamed from: c */
    private final C68283d f261642c;

    /* renamed from: d */
    private final C68283d f261643d;

    /* renamed from: e */
    private final C68283d f261644e;

    public C93752bk(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C93752bk.class), aVar);
        this.f261641a = C68236af.m98549d(dVar);
        this.f261642c = C68236af.m98549d(dVar2);
        this.f261643d = C68236af.m98549d(dVar3);
        this.f261644e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        C57954d dVar;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        C84609a aVar = (C84609a) list.get(2);
        C86360a aVar2 = (C86360a) list.get(3);
        if (axVar.mo56113h()) {
            C74635ab e = ImproveLocationRequest.m120650e();
            e.mo71008d((C8588o) axVar.mo56107c());
            ((C74631a) e).f208820b = 4;
            ad a = e.mo71005a();
            a.g(C39191a.m68623b(query.f252749G));
            a.h(Long.valueOf(query.f252747E));
            dVar = new C57954d(aVar.mo78373e(query.f252749G, e.mo71015f(), aVar2));
        } else {
            dVar = new C57954d(C60856cj.m92900i(false));
        }
        return C60856cj.m92900i(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f261641a.mo60297gq(), this.f261642c.mo60297gq(), this.f261643d.mo60297gq(), this.f261644e.mo60297gq());
    }
}
