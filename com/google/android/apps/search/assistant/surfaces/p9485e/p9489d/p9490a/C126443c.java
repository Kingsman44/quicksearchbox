package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.C126454af;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71552db;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70868g;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.connector.Connector$connect$1$1", mo61344c = "Connector.kt", mo61345d = "invokeSuspend", mo61346e = {99})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.a.c */
/* compiled from: PG */
final class C126443c extends C69572j implements C69630p {

    /* renamed from: a */
    int f348225a;

    /* renamed from: b */
    final /* synthetic */ C126448h f348226b;

    /* renamed from: c */
    final /* synthetic */ C126441a f348227c;

    /* renamed from: d */
    final /* synthetic */ C70868g f348228d;

    /* renamed from: e */
    final /* synthetic */ C126454af f348229e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126443c(C126448h hVar, C126441a aVar, C126454af afVar, C70868g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f348226b = hVar;
        this.f348227c = aVar;
        this.f348229e = afVar;
        this.f348228d = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126443c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348225a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71552db dbVar = new C71552db(new C126447g(this.f348227c, this.f348229e, (C69577g) null));
            C126442b bVar = new C126442b(this.f348228d);
            this.f348225a = 1;
            if (dbVar.mo38165mp(bVar, this) == aVar) {
                return aVar;
            }
        }
        this.f348228d.mo20121a();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126443c(this.f348226b, this.f348227c, this.f348229e, this.f348228d, gVar);
    }
}
