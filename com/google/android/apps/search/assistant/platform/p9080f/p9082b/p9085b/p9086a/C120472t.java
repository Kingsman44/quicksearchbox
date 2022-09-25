package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5583i.C71780f;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.AudioFocusPolicyImpl$acquireMicFocus$1$1$sessionLost$1", mo61344c = "AudioFocusPolicyImpl.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.t */
/* compiled from: PG */
final class C120472t extends C69572j implements C69630p {

    /* renamed from: a */
    int f335049a;

    /* renamed from: b */
    final /* synthetic */ C71604be f335050b;

    /* renamed from: c */
    final /* synthetic */ C71816z f335051c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120472t(C71604be beVar, C71816z zVar, C69577g gVar) {
        super(2, gVar);
        this.f335050b = beVar;
        this.f335051c = zVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120472t) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [kotlinx.coroutines.i.g, kotlinx.coroutines.be] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f335049a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r6 = this.f335050b;
            C71816z zVar = this.f335051c;
            this.f335049a = 1;
            C71780f fVar = new C71780f(this);
            try {
                fVar.mo63014a(r6, new C120470r((C69577g) null));
                fVar.mo63014a(zVar, new C120471s((C69577g) null));
            } catch (Throwable th) {
                fVar.mo63021x(th);
            }
            if (fVar.mo63016f() == obj2) {
                return obj2;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120472t(this.f335050b, this.f335051c, gVar);
    }
}
