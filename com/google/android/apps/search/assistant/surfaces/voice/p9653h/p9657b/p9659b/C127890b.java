package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9659b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.ondevice.LocaleIndependentOnDeviceAsrChecker$evaluate$1", mo61344c = "LocaleIndependentOnDeviceAsrChecker.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.b.b */
/* compiled from: PG */
final class C127890b extends C69572j implements C69630p {

    /* renamed from: a */
    int f352012a;

    /* renamed from: b */
    final /* synthetic */ C127892d f352013b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127890b(C127892d dVar, C69577g gVar) {
        super(2, gVar);
        this.f352013b = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127890b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f352012a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127892d dVar = this.f352013b;
            this.f352012a = 1;
            obj = dVar.mo108266c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C127892d dVar2 = this.f352013b;
        dVar2.f352019a.mo108274a(dVar2.f352020b, (C127930i) obj);
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127890b(this.f352013b, gVar);
    }
}
