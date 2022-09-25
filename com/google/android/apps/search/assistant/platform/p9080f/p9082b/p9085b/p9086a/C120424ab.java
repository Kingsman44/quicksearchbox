package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyActor$acquireNewSession$2$1$1", mo61344c = "PolicyActor.kt", mo61345d = "invokeSuspend", mo61346e = {93})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ab */
/* compiled from: PG */
final class C120424ab extends C69572j implements C69626l {

    /* renamed from: a */
    int f334947a;

    /* renamed from: b */
    final /* synthetic */ C71604be f334948b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120424ab(C71604be beVar, C69577g gVar) {
        super(1, gVar);
        this.f334948b = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C120424ab(this.f334948b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334947a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f334948b;
            this.f334947a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "sessionAsync.await()");
        return obj;
    }
}
