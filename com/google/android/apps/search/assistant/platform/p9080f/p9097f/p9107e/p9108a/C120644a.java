package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9107e.p9108a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119828bw;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119829bx;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120581e;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62963cj;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.e.a.a */
/* compiled from: PG */
public final class C120644a extends C68247h {

    /* renamed from: a */
    private final C68283d f335582a;

    /* renamed from: c */
    private final C68283d f335583c;

    /* renamed from: d */
    private final C68283d f335584d;

    public C120644a(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C120644a.class), aVar);
        this.f335582a = C68236af.m98549d(dVar);
        this.f335583c = C68236af.m98549d(dVar2);
        this.f335584d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List<C119828bw> list;
        List list2 = (List) obj;
        C119829bx bxVar = (C119829bx) list2.get(0);
        Map map = (Map) list2.get(1);
        C120581e eVar = (C120581e) list2.get(2);
        if (bxVar.f333760b.size() > 0) {
            list = new C62963cj(bxVar.f333760b, C119829bx.f333756c);
        } else {
            list = C58485gu.m89846n(C119828bw.DEFAULT_ENGINE);
        }
        for (C119828bw bwVar : list) {
            C68283d dVar = (C68283d) map.get(bwVar);
            if (dVar != null) {
                C69664n.m101061g(bwVar, "initialFulfillmentEngine");
                eVar.mo104852a("Initial Fulfillment Engine: ".concat(String.valueOf(bwVar.name())));
                return dVar.mo60297gq();
            }
        }
        return C60856cj.m92899h(new UnsupportedOperationException("Fulfillment engine matching client requirements not found"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335582a.mo60297gq(), this.f335583c.mo60297gq(), this.f335584d.mo60297gq());
    }
}
