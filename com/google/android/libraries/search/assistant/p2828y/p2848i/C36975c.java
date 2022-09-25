package com.google.android.libraries.search.assistant.p2828y.p2848i;

import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.requestcontext.devicecapabilities.DeviceCapabilitiesFetcher$buildDeviceCapabilities$2$clientInstanceIdDeferred$1", mo61344c = "DeviceCapabilitiesFetcher.kt", mo61345d = "invokeSuspend", mo61346e = {63})
/* renamed from: com.google.android.libraries.search.assistant.y.i.c */
/* compiled from: PG */
final class C36975c extends C69572j implements C69630p {

    /* renamed from: a */
    int f96261a;

    /* renamed from: b */
    final /* synthetic */ C36979g f96262b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36975c(C36979g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f96262b = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36975c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f96261a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C36979g gVar = this.f96262b;
            this.f96261a = 1;
            obj = gVar.mo40507b(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36975c(this.f96262b, gVar);
    }
}
