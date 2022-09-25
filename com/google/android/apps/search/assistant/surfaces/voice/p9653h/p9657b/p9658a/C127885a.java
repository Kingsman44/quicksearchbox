package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9657b.p9658a;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.featurecheckers.handsfree.MdaMotionSignalsChecker$evaluate$1", mo61344c = "MdaMotionSignalsChecker.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.b.a.a */
/* compiled from: PG */
public final class C127885a extends C69572j implements C69630p {

    /* renamed from: a */
    int f351994a;

    /* renamed from: b */
    final /* synthetic */ C127887c f351995b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127885a(C127887c cVar, C69577g gVar) {
        super(2, gVar);
        this.f351995b = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127885a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f351994a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127887c cVar = this.f351995b;
            this.f351994a = 1;
            obj = cVar.mo108263a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C127887c cVar2 = this.f351995b;
        cVar2.f352003b.mo108274a(cVar2.f352004c, (C127930i) obj);
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127885a(this.f351995b, gVar);
    }
}
