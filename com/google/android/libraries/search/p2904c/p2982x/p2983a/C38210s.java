package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.p2907ab.C37335b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.GrpcListeningSessionResponseHandler$complete$2", mo61344c = "GrpcListeningSessionResponseHandler.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.x.a.s */
/* compiled from: PG */
final class C38210s extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C38212u f101274a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38210s(C38212u uVar, C69577g gVar) {
        super(2, gVar);
        this.f101274a = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38210s) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C37335b bVar = (C37335b) this.f101274a.f101280d.get();
        if (bVar == null) {
            return null;
        }
        bVar.mo40891i();
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C38210s(this.f101274a, gVar);
    }
}
