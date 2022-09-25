package com.google.android.libraries.search.p2904c.p2967t.p2969b;

import com.google.android.libraries.search.p2904c.p2982x.p2983a.C38212u;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;

@C69567e(mo61343b = "com.google.android.libraries.search.audio.microphone.impl.GrpcAudioRequestReadOnlySessionsProviderImpl$getReadOnlyListeningSession$2", mo61344c = "GrpcAudioRequestReadOnlySessionsProviderImpl.kt", mo61345d = "invokeSuspend", mo61346e = {54})
/* renamed from: com.google.android.libraries.search.c.t.b.v */
/* compiled from: PG */
final class C38051v extends C69572j implements C69631q {

    /* renamed from: a */
    int f100821a;

    /* renamed from: b */
    final /* synthetic */ C38212u f100822b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C38051v(C38212u uVar, C69577g gVar) {
        super(3, gVar);
        this.f100822b = uVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        Throwable th = (Throwable) obj2;
        return new C38051v(this.f100822b, (C69577g) obj3).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f100821a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C38212u uVar = this.f100822b;
            this.f100821a = 1;
            if (uVar.mo41337a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }
}
