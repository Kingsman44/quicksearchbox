package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.p2906aa.C37330e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.GrpcAudioRequestReadOnlySessionsProviderImpl$getReadOnlyListeningSession$3", mo61344c = "GrpcAudioRequestReadOnlySessionsProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.c.t.b.w */
/* compiled from: PG */
final class C38052w extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f100823a;

    /* renamed from: b */
    final /* synthetic */ C37454cc f100824b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38052w(C37454cc ccVar, C69577g gVar) {
        super(3, gVar);
        this.f100824b = ccVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C38052w wVar = new C38052w(this.f100824b, (C69577g) obj3);
        wVar.f100823a = (Throwable) obj2;
        return wVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C59052c cVar = (C59052c) ((C59052c) C38055z.f100827a.mo56226d()).mo56382g((Throwable) this.f100823a);
        int a = C37330e.m66336a(this.f100824b);
        cVar.mo56379ah(new C59094n(52925));
        cVar.mo56387q("#audio# Remote listening session channel failed, sessionAccessToken(%s)", a);
        return C69788q.f186170a;
    }
}
