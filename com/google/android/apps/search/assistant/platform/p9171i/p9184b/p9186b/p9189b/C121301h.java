package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9186b.p9189b;

import com.google.android.apps.search.assistant.platform.p9171i.p9172a.p9173a.C121185a;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.C121488c;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.C121489d;
import com.google.android.apps.search.assistant.platform.p9171i.p9227d.p9228a.C121481e;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.b.b.h */
/* compiled from: PG */
public final class C121301h extends C68247h {

    /* renamed from: a */
    private final C68283d f336880a;

    /* renamed from: c */
    private final C68283d f336881c;

    /* renamed from: d */
    private final C68283d f336882d;

    /* renamed from: e */
    private final C68283d f336883e;

    /* renamed from: f */
    private final C68283d f336884f;

    public C121301h(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C121301h.class), aVar);
        this.f336880a = C68236af.m98549d(dVar);
        this.f336881c = C68236af.m98549d(dVar2);
        this.f336882d = C68236af.m98549d(dVar3);
        this.f336883e = C68236af.m98549d(dVar4);
        this.f336884f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C121305l lVar = (C121305l) list.get(0);
        C58485gu guVar = (C58485gu) list.get(2);
        C121481e eVar = (C121481e) list.get(3);
        C121185a aVar = (C121185a) list.get(4);
        C58485gu guVar2 = (C58485gu) Map.EL.getOrDefault((java.util.Map) list.get(1), C48672ag.APPS, C58485gu.m89845m());
        if (!guVar.isEmpty()) {
            long a = eVar.mo105169a();
            ((C59052c) ((C59052c) C121300g.f336879a.mo56224b()).mo56372aa(35764)).mo56388r("#produceSuggestions: logging raw suggestions for request %d", a);
            aVar.mo105075c(a, guVar);
        }
        C121488c b = C121489d.m200744b();
        b.mo105163b((C58485gu) Collection.EL.stream(guVar).map(C121302i.f336885a).filter(C121303j.f336886a).map(C121304k.f336887a).collect(C58370cn.f155946a));
        return C60856cj.m92900i(b.mo105162a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f336880a.mo60297gq(), this.f336881c.mo60297gq(), this.f336882d.mo60297gq(), this.f336883e.mo60297gq(), this.f336884f.mo60297gq());
    }
}
