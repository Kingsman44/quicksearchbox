package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9492c;

import com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d.C126558c;
import com.google.protobuf.C63088z;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voicesearch.network.pinhole.BodyParser$Proto$parse$2", mo61344c = "BodyParser.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.c.h */
/* compiled from: PG */
final class C126500h extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C63088z f348393a;

    /* renamed from: b */
    final /* synthetic */ C126501i f348394b;

    /* renamed from: c */
    private /* synthetic */ Object f348395c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126500h(C63088z zVar, C126501i iVar, C69577g gVar) {
        super(2, gVar);
        this.f348393a = zVar;
        this.f348394b = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126500h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        return C126558c.m206922d(new C126499g(this.f348393a, (C71422aw) this.f348395c, this.f348394b));
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C126500h hVar = new C126500h(this.f348393a, this.f348394b, gVar);
        hVar.f348395c = obj;
        return hVar;
    }
}
