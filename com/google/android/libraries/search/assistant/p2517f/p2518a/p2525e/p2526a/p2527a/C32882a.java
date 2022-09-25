package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2526a.p2527a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2849j.C36981a;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.providers.device.device_oem_params.DeviceOemParamsProvider$fetchContext$1", mo61344c = "DeviceOemParamsProvider.kt", mo61345d = "invokeSuspend", mo61346e = {42})
/* renamed from: com.google.android.libraries.search.assistant.f.a.e.a.a.a */
/* compiled from: PG */
final class C32882a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f88120a;

    /* renamed from: b */
    Object f88121b;

    /* renamed from: c */
    Object f88122c;

    /* renamed from: d */
    Object f88123d;

    /* renamed from: e */
    Object f88124e;

    /* renamed from: f */
    int f88125f;

    /* renamed from: g */
    final /* synthetic */ C32883b f88126g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32882a(C32883b bVar, C69577g gVar) {
        super(2, gVar);
        this.f88126g = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32882a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f88125f != 0) {
            obj6 = this.f88124e;
            obj5 = this.f88123d;
            obj4 = this.f88122c;
            obj3 = this.f88121b;
            obj2 = this.f88120a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            obj4 = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            C32808bc a = C69664n.m101061g(azVar, "builder");
            obj5 = C32883b.f88127a;
            C60870cx i = C60856cj.m92900i(C36981a.f96293a);
            this.f88120a = obj4;
            this.f88121b = a;
            this.f88122c = obj4;
            this.f88123d = obj5;
            this.f88124e = a;
            this.f88125f = 1;
            Object c = C71663i.m104690c(i, this);
            if (c == aVar) {
                return aVar;
            }
            obj6 = a;
            obj2 = obj4;
            obj = c;
            obj3 = obj6;
        }
        C52230ka a2 = ((C33476a) obj5).mo38879a((MessageLite) obj);
        C69664n.m101060f(a2, "PARAMS_KEY.pack(deviceOe….deviceOemParams.await())");
        ((C32808bc) obj6).mo38306b(a2);
        ((C32803ay) obj4).mo38303b(((C32808bc) obj3).mo38305a());
        return ((C32803ay) obj2).mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32882a(this.f88126g, gVar);
    }
}
