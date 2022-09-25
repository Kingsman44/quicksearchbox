package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.AudioFocusPolicyImpl$acquireMicFocus$1$1$focusLostAsync$1", mo61344c = "AudioFocusPolicyImpl.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.o */
/* compiled from: PG */
final class C120467o extends C69572j implements C69630p {

    /* renamed from: a */
    int f335042a;

    /* renamed from: b */
    final /* synthetic */ C120478z f335043b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120467o(C120478z zVar, C69577g gVar) {
        super(2, gVar);
        this.f335043b = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120467o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335042a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C120478z zVar = this.f335043b;
            this.f335042a = 1;
            if (zVar.mo104767a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120467o(this.f335043b, gVar);
    }
}
