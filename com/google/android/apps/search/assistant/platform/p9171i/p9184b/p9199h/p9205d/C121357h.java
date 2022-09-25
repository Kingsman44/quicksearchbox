package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.assistant.p1594s.p1597b.C19195w;
import com.google.android.libraries.assistant.p1594s.p1597b.C19197y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.h */
/* compiled from: PG */
public final class C121357h extends C68247h {

    /* renamed from: a */
    private final C68283d f336980a;

    /* renamed from: c */
    private final C69464a f336981c;

    /* renamed from: d */
    private final C68283d f336982d;

    public C121357h(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2) {
        super(aVar2, new C68277d(C121357h.class), aVar);
        this.f336980a = C68236af.m98549d(dVar);
        this.f336981c = aVar3;
        this.f336982d = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C121481e eVar = (C121481e) list.get(0);
        C69464a aVar = this.f336981c;
        Executor executor = (Executor) list.get(1);
        String str = eVar.mo105172d().f53694b;
        C121365p pVar = (C121365p) aVar.mo17428b();
        C19167ba baVar = eVar.mo105172d().f53697e;
        if (baVar == null) {
            baVar = C19167ba.f53673s;
        }
        C19195w wVar = baVar.f53690r;
        if (wVar == null) {
            wVar = C19195w.f53744e;
        }
        C19197y yVar = wVar.f53747b;
        if (yVar == null) {
            yVar = C19197y.f53750b;
        }
        return C60922j.m93044g(pVar.mo105108b(str, yVar.f53752a), C47810es.m84963c(C121356g.f336979a), executor);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f336980a.mo60297gq(), this.f336982d.mo60297gq());
    }
}
