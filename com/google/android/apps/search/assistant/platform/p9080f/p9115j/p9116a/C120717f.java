package com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9116a;

import com.google.android.apps.search.assistant.platform.p9005b.p9039c.C119941b;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120754f;
import com.google.android.apps.search.assistant.platform.p9080f.p9115j.p9118c.C120755g;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.ondevice.impl.OnDeviceStreamingController$processing$2$1$2", mo61344c = "OnDeviceStreamingController.kt", mo61345d = "invokeSuspend", mo61346e = {92})
/* renamed from: com.google.android.apps.search.assistant.platform.f.j.a.f */
/* compiled from: PG */
final class C120717f extends C69572j implements C69630p {

    /* renamed from: a */
    int f335746a;

    /* renamed from: b */
    final /* synthetic */ C120723l f335747b;

    /* renamed from: c */
    final /* synthetic */ C120755g f335748c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120717f(C120723l lVar, C120755g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f335747b = lVar;
        this.f335748c = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120717f) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f335746a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71604be beVar = this.f335747b.f335773h;
            this.f335746a = 1;
            obj = beVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C119941b bVar = (C119941b) obj;
        bVar.mo104581e(bVar.mo104577a(((C120754f) this.f335748c).f335861a));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120717f(this.f335747b, this.f335748c, gVar);
    }
}
