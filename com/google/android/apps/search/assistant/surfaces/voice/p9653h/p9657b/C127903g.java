package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b;

import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.PixelUiModeChecker$evaluateInternal$2", mo61344c = "PixelUiModeChecker.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.g */
/* compiled from: PG */
final class C127903g extends C69572j implements C69630p {

    /* renamed from: a */
    int f352064a;

    /* renamed from: b */
    final /* synthetic */ C127904h f352065b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127903g(C127904h hVar, C69577g gVar) {
        super(2, gVar);
        this.f352065b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127903g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f352064a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f352065b.f352068c.mo108271a();
            this.f352064a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127903g(this.f352065b, gVar);
    }
}
