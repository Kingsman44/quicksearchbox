package com.google.android.libraries.search.assistant.p2828y.p2850k;

import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.deviceproperties.DevicePropertiesFetcher$getDevicePropertiesParams$1", mo61344c = "DevicePropertiesFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {75})
/* renamed from: com.google.android.libraries.search.assistant.y.k.i */
/* compiled from: PG */
final class C36990i extends C69572j implements C69630p {

    /* renamed from: a */
    int f96326a;

    /* renamed from: b */
    final /* synthetic */ C36991j f96327b;

    /* renamed from: c */
    final /* synthetic */ C36983b f96328c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36990i(C36991j jVar, C36983b bVar, C69577g gVar) {
        super(2, gVar);
        this.f96327b = jVar;
        this.f96328c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36990i) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96326a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36991j jVar = this.f96327b;
            C36983b bVar = this.f96328c;
            this.f96326a = 1;
            obj = C71803m.m105040a(jVar.f96338j, new C36988g(jVar, bVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36990i(this.f96327b, this.f96328c, gVar);
    }
}
