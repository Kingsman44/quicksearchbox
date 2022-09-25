package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9654a.p9656b.C127883b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.BasicPixel4PlusChecker$evaluateInternal$2$hasSystemFeature$1", mo61344c = "BasicPixel4PlusChecker.kt", mo61345d = "invokeSuspend", mo61346e = {43})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.b */
/* compiled from: PG */
final class C127888b extends C69572j implements C69630p {

    /* renamed from: a */
    int f352007a;

    /* renamed from: b */
    final /* synthetic */ C127901e f352008b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127888b(C127901e eVar, C69577g gVar) {
        super(2, gVar);
        this.f352008b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127888b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f352007a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127883b bVar = this.f352008b.f352060f;
            this.f352007a = 1;
            obj = bVar.mo108262a("com.google.android.feature.NEXT_GENERATION_ASSISTANT");
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127888b(this.f352008b, gVar);
    }
}
