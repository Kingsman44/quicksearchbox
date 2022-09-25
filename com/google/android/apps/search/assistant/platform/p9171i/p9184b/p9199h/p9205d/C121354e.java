package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9199h.p9205d;

import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121283c;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.h.d.e */
/* compiled from: PG */
public final class C121354e extends C68247h {

    /* renamed from: a */
    private final C68283d f336974a;

    /* renamed from: c */
    private final C69464a f336975c;

    /* renamed from: d */
    private final C69464a f336976d;

    /* renamed from: e */
    private final C68283d f336977e;

    public C121354e(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C69464a aVar4, C68283d dVar2) {
        super(aVar2, new C68277d(C121354e.class), aVar);
        this.f336974a = C68236af.m98549d(dVar);
        this.f336975c = aVar3;
        this.f336976d = aVar4;
        this.f336977e = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C121481e eVar = (C121481e) list.get(0);
        return C60922j.m93044g(C60856cj.m92906o((C58485gu) Collection.EL.stream(C58485gu.m89847o((C121283c) this.f336975c.mo17428b(), (C121283c) this.f336976d.mo17428b())).map(new C121350a(eVar.mo105172d().f53694b, eVar)).collect(C58370cn.f155946a)), C47810es.m84963c(C121351b.f336971a), (Executor) list.get(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f336974a.mo60297gq(), this.f336977e.mo60297gq());
    }
}
