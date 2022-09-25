package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127881i;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.TngMaStatusChecker$evaluateInternal$2$hasCCSettingsEnabledDef$1", mo61344c = "TngMaStatusChecker.kt", mo61345d = "invokeSuspend", mo61346e = {71})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.k */
/* compiled from: PG */
final class C127907k extends C69572j implements C69630p {

    /* renamed from: a */
    int f352079a;

    /* renamed from: b */
    final /* synthetic */ C127913q f352080b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127907k(C127913q qVar, C69577g gVar) {
        super(2, gVar);
        this.f352080b = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127907k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f352079a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127881i iVar = this.f352080b.f352100f;
            this.f352079a = 1;
            obj = iVar.mo108261a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127907k(this.f352080b, gVar);
    }
}
