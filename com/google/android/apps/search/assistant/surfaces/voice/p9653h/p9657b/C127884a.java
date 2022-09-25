package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.BasicPixel4PlusChecker$evaluate$1", mo61344c = "BasicPixel4PlusChecker.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.a */
/* compiled from: PG */
final class C127884a extends C69572j implements C69630p {

    /* renamed from: a */
    int f351992a;

    /* renamed from: b */
    final /* synthetic */ C127901e f351993b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127884a(C127901e eVar, C69577g gVar) {
        super(2, gVar);
        this.f351993b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127884a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351992a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127901e eVar = this.f351993b;
            this.f351992a = 1;
            obj = C71803m.m105040a(eVar.f352056b, new C127900d(eVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C127901e eVar2 = this.f351993b;
        eVar2.f352058d.mo108274a(eVar2.f352059e, (C127930i) obj);
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127884a(this.f351993b, gVar);
    }
}
