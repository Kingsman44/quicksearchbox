package com.google.android.libraries.web.base.p3348b.p3351c;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5574b.C71517bu;
import kotlinx.coroutines.p5574b.C71546cw;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.web.base.internal.requirements.RequestRequirementsModel$onLoadRequestRequirements$1", mo61344c = "RequestRequirementsModel.kt", mo61345d = "invokeSuspend", mo61346e = {61})
/* renamed from: com.google.android.libraries.web.base.b.c.e */
/* compiled from: PG */
public final class C43249e extends C69572j implements C69630p {

    /* renamed from: a */
    int f113018a;

    /* renamed from: b */
    final /* synthetic */ C43250f f113019b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43249e(C43250f fVar, C69577g gVar) {
        super(2, gVar);
        this.f113019b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C43249e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f113018a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C43250f fVar = this.f113019b;
            C71587n d = C71546cw.m104402d(fVar.f113020a.mo46330b(fVar.f113022c), this.f113019b.f113023d, new C43247c((C69577g) null));
            C43248d dVar = new C43248d((C69577g) null);
            this.f113018a = 1;
            if (C71517bu.m104351b(d, dVar, this) == aVar) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C43249e(this.f113019b, gVar);
    }
}
