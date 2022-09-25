package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import com.google.assistant.p4016z.C53715bm;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.SettingEnabledObserver$onContextChange$1", mo61344c = "SettingEnabledObserver.kt", mo61345d = "invokeSuspend", mo61346e = {58})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.i */
/* compiled from: PG */
final class C131627i extends C69572j implements C69630p {

    /* renamed from: a */
    int f359656a;

    /* renamed from: b */
    final /* synthetic */ C53715bm f359657b;

    /* renamed from: c */
    final /* synthetic */ C131629k f359658c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131627i(C53715bm bmVar, C131629k kVar, C69577g gVar) {
        super(2, gVar);
        this.f359657b = bmVar;
        this.f359658c = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131627i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359656a != 0) {
            C69714l.m101134b(obj);
            return null;
        }
        C69714l.m101134b(obj);
        if (this.f359657b.f141023a != 15) {
            return null;
        }
        C131629k kVar = this.f359658c;
        this.f359656a = 1;
        if (kVar.mo110228b(this) == aVar) {
            return aVar;
        }
        return null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131627i(this.f359657b, this.f359658c, gVar);
    }
}
