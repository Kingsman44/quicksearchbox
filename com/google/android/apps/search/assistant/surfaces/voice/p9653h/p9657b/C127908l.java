package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9655a.C127877e;
import java.util.Set;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.TngMaStatusChecker$evaluateInternal$2$isValidLocaleDef$1", mo61344c = "TngMaStatusChecker.kt", mo61345d = "invokeSuspend", mo61346e = {69})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.l */
/* compiled from: PG */
final class C127908l extends C69572j implements C69630p {

    /* renamed from: a */
    int f352081a;

    /* renamed from: b */
    final /* synthetic */ C127913q f352082b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127908l(C127913q qVar, C69577g gVar) {
        super(2, gVar);
        this.f352082b = qVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127908l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f352081a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127877e eVar = this.f352082b.f352098d;
            Set set = C127913q.f352096b;
            this.f352081a = 1;
            obj = eVar.mo108258a(set, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127908l(this.f352082b, gVar);
    }
}
