package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.AudioFocusPolicyImpl$acquireMicFocus$1$1$session$1$onSessionLost$1", mo61344c = "AudioFocusPolicyImpl.kt", mo61345d = "invokeSuspend", mo61346e = {57})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.p */
/* compiled from: PG */
final class C120468p extends C69572j implements C69630p {

    /* renamed from: a */
    int f335044a;

    /* renamed from: b */
    final /* synthetic */ C71604be f335045b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120468p(C71604be beVar, C69577g gVar) {
        super(2, gVar);
        this.f335045b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120468p) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335044a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        C71604be beVar = this.f335045b;
        this.f335044a = 1;
        if (beVar.mo62825a(this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120468p(this.f335045b, gVar);
    }
}
