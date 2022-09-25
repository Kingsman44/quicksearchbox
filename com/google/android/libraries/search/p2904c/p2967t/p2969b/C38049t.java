package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.p2982x.C38248g;
import com.google.android.libraries.search.p2904c.p2982x.C38250i;
import kotlinx.coroutines.p5573a.C71360an;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5488io.grpc.p5533i.C70876o;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.GrpcAudioRequestReadOnlySessionsProviderImpl$getAudioRequestReadOnlyListeningSessionFlow$1", mo61344c = "GrpcAudioRequestReadOnlySessionsProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.libraries.search.c.t.b.t */
/* compiled from: PG */
final class C38049t extends C69572j implements C69630p {

    /* renamed from: a */
    int f100814a;

    /* renamed from: b */
    final /* synthetic */ C38055z f100815b;

    /* renamed from: c */
    final /* synthetic */ C37454cc f100816c;

    /* renamed from: d */
    private /* synthetic */ Object f100817d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38049t(C38055z zVar, C37454cc ccVar, C69577g gVar) {
        super(2, gVar);
        this.f100815b = zVar;
        this.f100816c = ccVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C38049t) mo5194c((C71361ao) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100814a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71361ao aoVar = (C71361ao) this.f100817d;
            C38248g gVar = this.f100815b.f100828b;
            C70876o.m103763d(gVar.f189039a.mo39510a(C38250i.m67536d(), gVar.f189040b), this.f100816c, new C38047r(aoVar), true);
            C38048s sVar = C38048s.f100813a;
            this.f100814a = 1;
            if (C71360an.m104022a(aoVar, sVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C38049t tVar = new C38049t(this.f100815b, this.f100816c, gVar);
        tVar.f100817d = obj;
        return tVar;
    }
}
