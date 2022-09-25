package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9085b.p9086a;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.audio.focus.impl.PolicyActor$acquireNewSession$2", mo61344c = "PolicyActor.kt", mo61345d = "invokeSuspend", mo61346e = {91})
/* renamed from: com.google.android.apps.search.assistant.platform.f.b.b.a.ad */
/* compiled from: PG */
final class C120426ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f334954a;

    /* renamed from: b */
    final /* synthetic */ C120432aj f334955b;

    /* renamed from: c */
    final /* synthetic */ C71816z f334956c;

    /* renamed from: d */
    final /* synthetic */ C71816z f334957d;

    /* renamed from: e */
    private /* synthetic */ Object f334958e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120426ad(C71816z zVar, C120432aj ajVar, C71816z zVar2, C69577g gVar) {
        super(2, gVar);
        this.f334956c = zVar;
        this.f334955b = ajVar;
        this.f334957d = zVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120426ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f334954a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f334956c;
            C120425ac acVar = new C120425ac(this.f334955b, (C71422aw) this.f334958e, this.f334957d, (C69577g) null);
            this.f334954a = 1;
            if (C120434al.m199474a(zVar, acVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C120426ad adVar = new C120426ad(this.f334956c, this.f334955b, this.f334957d, gVar);
        adVar.f334958e = obj;
        return adVar;
    }
}
