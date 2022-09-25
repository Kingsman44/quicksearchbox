package com.google.android.libraries.search.assistant.p2828y.p2850k;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.deviceproperties.DevicePropertiesFetcher$buildDeviceProperties$2$clientInstanceIdDeferred$1", mo61344c = "DevicePropertiesFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {84})
/* renamed from: com.google.android.libraries.search.assistant.y.k.e */
/* compiled from: PG */
final class C36986e extends C69572j implements C69630p {

    /* renamed from: a */
    int f96311a;

    /* renamed from: b */
    final /* synthetic */ C36991j f96312b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36986e(C36991j jVar, C69577g gVar) {
        super(2, gVar);
        this.f96312b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36986e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96311a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36991j jVar = this.f96312b;
            this.f96311a = 1;
            obj = jVar.mo40521b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36986e(this.f96312b, gVar);
    }
}
