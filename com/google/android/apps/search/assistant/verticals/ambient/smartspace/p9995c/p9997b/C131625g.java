package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.smartspace.crossdevicetimer.wholehome.SettingEnabledObserver$1", mo61344c = "SettingEnabledObserver.kt", mo61345d = "invokeSuspend", mo61346e = {49})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.g */
/* compiled from: PG */
final class C131625g extends C69572j implements C69630p {

    /* renamed from: a */
    int f359653a;

    /* renamed from: b */
    final /* synthetic */ C131629k f359654b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131625g(C131629k kVar, C69577g gVar) {
        super(2, gVar);
        this.f359654b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131625g) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f359653a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C131629k kVar = this.f359654b;
            this.f359653a = 1;
            if (kVar.mo110228b(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131625g(this.f359654b, gVar);
    }
}
