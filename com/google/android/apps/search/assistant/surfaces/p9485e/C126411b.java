package com.google.android.apps.search.assistant.surfaces.p9485e;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71684dt;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.VoiceSearchGrpcImpl$Connection$1", mo61344c = "VoiceSearchGrpcImpl.kt", mo61345d = "invokeSuspend", mo61346e = {122})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.b */
/* compiled from: PG */
final class C126411b extends C69572j implements C69630p {

    /* renamed from: a */
    int f348165a;

    /* renamed from: b */
    final /* synthetic */ C126621v f348166b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126411b(C126621v vVar, C69577g gVar) {
        super(2, gVar);
        this.f348166b = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126411b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f348165a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C126621v vVar = this.f348166b;
            this.f348165a = 1;
            Object a = C71684dt.m104778a(new C126615p(vVar, (C69577g) null), this);
            if (a != C69554a.COROUTINE_SUSPENDED) {
                a = C69788q.f186170a;
            }
            if (a == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126411b(this.f348166b, gVar);
    }
}
