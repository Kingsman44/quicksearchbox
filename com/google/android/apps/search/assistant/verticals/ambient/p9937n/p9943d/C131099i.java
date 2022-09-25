package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9943d;

import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.ondeviceapps.headphonelogs.HeadphoneContextGeneratorImpl$getHeadphoneContextsFuture$1", mo61344c = "HeadphoneContextGeneratorImpl.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.d.i */
/* compiled from: PG */
final class C131099i extends C69572j implements C69630p {

    /* renamed from: a */
    int f358571a;

    /* renamed from: b */
    final /* synthetic */ C131100j f358572b;

    /* renamed from: c */
    final /* synthetic */ List f358573c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131099i(C131100j jVar, List list, C69577g gVar) {
        super(2, gVar);
        this.f358572b = jVar;
        this.f358573c = list;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131099i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f358571a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C131100j jVar = this.f358572b;
            List list = this.f358573c;
            this.f358571a = 1;
            obj = jVar.mo110072b(list, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C131099i(this.f358572b, this.f358573c, gVar);
    }
}
