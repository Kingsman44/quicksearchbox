package com.google.android.apps.search.assistant.surfaces.p9485e;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$interaction$2$2", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {197})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.r */
/* compiled from: PG */
final class C126617r extends C69572j implements C69630p {

    /* renamed from: a */
    int f348679a;

    /* renamed from: b */
    final /* synthetic */ C126621v f348680b;

    /* renamed from: c */
    final /* synthetic */ C71604be f348681c;

    /* renamed from: d */
    final /* synthetic */ C71389v f348682d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126617r(C126621v vVar, C71604be beVar, C71389v vVar2, C69577g gVar) {
        super(2, gVar);
        this.f348680b = vVar;
        this.f348681c = beVar;
        this.f348682d = vVar2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126617r) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348679a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126621v vVar = this.f348680b;
            C71604be beVar = this.f348681c;
            C71389v vVar2 = this.f348682d;
            this.f348679a = 1;
            if (vVar.mo107632d(beVar, vVar2, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126617r(this.f348680b, this.f348681c, this.f348682d, gVar);
    }
}
