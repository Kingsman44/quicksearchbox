package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126454af;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70868g;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.connector.Connector$connect$1", mo61344c = "Connector.kt", mo61345d = "invokeSuspend", mo61346e = {103})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.a.f */
/* compiled from: PG */
public final class C126446f extends C69572j implements C69630p {

    /* renamed from: a */
    int f348232a;

    /* renamed from: b */
    final /* synthetic */ C126448h f348233b;

    /* renamed from: c */
    final /* synthetic */ C126441a f348234c;

    /* renamed from: d */
    final /* synthetic */ C126454af f348235d;

    /* renamed from: e */
    private /* synthetic */ Object f348236e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126446f(C126448h hVar, C126441a aVar, C126454af afVar, C69577g gVar) {
        super(2, gVar);
        this.f348233b = hVar;
        this.f348234c = aVar;
        this.f348235d = afVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126446f) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348232a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f348236e;
            C70868g gVar = (C70868g) this.f348233b.f348242a.mo59701b(new C126445e(aoVar));
            C71803m.m105043d(aoVar, (C69585o) null, (C71424ay) null, new C126443c(this.f348233b, this.f348234c, this.f348235d, gVar, (C69577g) null), 3);
            C126444d dVar = new C126444d(gVar);
            this.f348232a = 1;
            if (C71360an.m104022a(aoVar, dVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126446f fVar = new C126446f(this.f348233b, this.f348234c, this.f348235d, gVar);
        fVar.f348236e = obj;
        return fVar;
    }
}
