package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9545ab;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.stopwatch.StopwatchParamsSupplier$fetchContext$1", mo61344c = "StopwatchParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {35})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ab.a */
/* compiled from: PG */
final class C127191a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350167a;

    /* renamed from: b */
    Object f350168b;

    /* renamed from: c */
    Object f350169c;

    /* renamed from: d */
    Object f350170d;

    /* renamed from: e */
    Object f350171e;

    /* renamed from: f */
    int f350172f;

    /* renamed from: g */
    final /* synthetic */ C127193c f350173g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127191a(C127193c cVar, C69577g gVar) {
        super(2, gVar);
        this.f350173g = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127191a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350172f != 0) {
            obj6 = this.f350171e;
            obj5 = this.f350170d;
            obj4 = this.f350169c;
            obj3 = this.f350168b;
            obj2 = this.f350167a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127193c cVar = this.f350173g;
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            C32803ay a = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            C32808bc a2 = C69664n.m101061g(azVar, "builder");
            C33476a aVar2 = C127193c.f350177a;
            this.f350167a = a;
            this.f350168b = a2;
            this.f350169c = a;
            this.f350170d = aVar2;
            this.f350171e = a2;
            this.f350172f = 1;
            obj = cVar.mo107991b(this);
            if (obj == aVar) {
                return aVar;
            }
            obj2 = a;
            obj6 = a2;
            obj5 = aVar2;
            obj4 = obj2;
            obj3 = obj6;
        }
        C52230ka a3 = ((C33476a) obj5).mo38879a((MessageLite) obj);
        C69664n.m101060f(a3, "PARAMS_KEY.pack(getStopwatchParams())");
        ((C32808bc) obj6).mo38306b(a3);
        ((C32803ay) obj4).mo38303b(((C32808bc) obj3).mo38305a());
        return ((C32803ay) obj2).mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127191a(this.f350173g, gVar);
    }
}
