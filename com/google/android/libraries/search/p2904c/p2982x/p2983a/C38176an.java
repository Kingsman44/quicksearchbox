package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.service.impl.StreamListeningSessionResponseSender$startInternal$1$2", mo61344c = "StreamListeningSessionResponseSender.kt", mo61345d = "invokeSuspend", mo61346e = {95})
/* renamed from: com.google.android.libraries.search.c.x.a.an */
/* compiled from: PG */
final class C38176an extends C69572j implements C69630p {

    /* renamed from: a */
    int f101169a;

    /* renamed from: b */
    final /* synthetic */ C38181as f101170b;

    /* renamed from: c */
    final /* synthetic */ C37400be f101171c;

    /* renamed from: d */
    final /* synthetic */ C37360ay f101172d;

    /* renamed from: e */
    private /* synthetic */ Object f101173e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38176an(C38181as asVar, C37400be beVar, C37360ay ayVar, C69577g gVar) {
        super(2, gVar);
        this.f101170b = asVar;
        this.f101171c = beVar;
        this.f101172d = ayVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38176an) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f101169a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                obj2 = C69714l.m101133a(th);
            }
        } else {
            C69714l.m101134b(obj);
            C71422aw awVar = (C71422aw) this.f101173e;
            C38181as asVar = this.f101170b;
            C38175am amVar = new C38175am(asVar, this.f101171c, this.f101172d);
            C60870cx l = C60856cj.m92903l(C47810es.m84977q(amVar), asVar.f101189d);
            this.f101169a = 1;
            obj = C71663i.m104690c(l, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        obj2 = (Void) obj;
        Throwable a = C69702k.m101124a(obj2);
        if (a != null) {
            C59052c cVar = (C59052c) C38181as.f101186a.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, "ALT.GrpcARCRespSenderV2");
            C59052c cVar2 = (C59052c) cVar.mo56382g(a);
            cVar2.mo56379ah(new C59094n(53029));
            cVar2.mo56386p("#audio# sending audio accessor failed");
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38176an anVar = new C38176an(this.f101170b, this.f101171c, this.f101172d, gVar);
        anVar.f101173e = obj;
        return anVar;
    }
}
