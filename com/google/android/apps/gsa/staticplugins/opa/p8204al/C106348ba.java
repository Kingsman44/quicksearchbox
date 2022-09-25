package com.google.android.apps.gsa.staticplugins.opa.p8204al;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119052h;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.al.ba */
/* compiled from: PG */
public final class C106348ba extends C68247h {

    /* renamed from: a */
    private final C68283d f296689a;

    /* renamed from: c */
    private final C68283d f296690c;

    /* renamed from: d */
    private final C68283d f296691d;

    /* renamed from: e */
    private final C68283d f296692e;

    public C106348ba(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C106348ba.class), aVar);
        this.f296689a = C68236af.m98549d(dVar);
        this.f296690c = C68236af.m98549d(dVar2);
        this.f296691d = C68236af.m98549d(dVar3);
        this.f296692e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(1);
        long longValue = ((Long) list.get(3)).longValue();
        C58976aa aaVar = C58975e.f156826a;
        ((C119052h) list.get(0)).mo104101m();
        C89856f fVar = new C89856f();
        fVar.f246201a = C89849ae.VOICE_SEARCH_NETWORK_DONE;
        fVar.mo83701c("rId", Long.toString(longValue));
        ((C89859i) list.get(2)).mo74236a(fVar.mo83699a());
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f296689a.mo60297gq(), this.f296690c.mo60297gq(), this.f296691d.mo60297gq(), this.f296692e.mo60297gq());
    }
}
