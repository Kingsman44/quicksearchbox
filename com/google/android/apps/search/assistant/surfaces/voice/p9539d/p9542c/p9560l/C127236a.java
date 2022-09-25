package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9560l;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.devicecapabilities.DeviceCapabilitiesSupplier$fetchContext$1", mo61344c = "DeviceCapabilitiesSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {81})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.l.a */
/* compiled from: PG */
final class C127236a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350333a;

    /* renamed from: b */
    Object f350334b;

    /* renamed from: c */
    Object f350335c;

    /* renamed from: d */
    Object f350336d;

    /* renamed from: e */
    Object f350337e;

    /* renamed from: f */
    int f350338f;

    /* renamed from: g */
    final /* synthetic */ C127238c f350339g;

    /* renamed from: h */
    final /* synthetic */ C127289i f350340h;

    /* renamed from: i */
    final /* synthetic */ boolean f350341i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127236a(C127238c cVar, C127289i iVar, boolean z, C69577g gVar) {
        super(2, gVar);
        this.f350339g = cVar;
        this.f350340h = iVar;
        this.f350341i = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127236a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350338f != 0) {
            obj6 = this.f350337e;
            obj5 = this.f350336d;
            obj4 = this.f350335c;
            obj3 = this.f350334b;
            obj2 = this.f350333a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127238c cVar = this.f350339g;
            C127289i iVar = this.f350340h;
            boolean z = this.f350341i;
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            C32803ay a = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            C32808bc a2 = C69664n.m101061g(azVar, "builder");
            C33476a aVar2 = C127238c.f350351a;
            String str = iVar.f350564b;
            C69664n.m101060f(str, "queryContext.requestId");
            this.f350333a = a;
            this.f350334b = a2;
            this.f350335c = a;
            this.f350336d = aVar2;
            this.f350337e = a2;
            this.f350338f = 1;
            obj = cVar.mo108002b(str, z, this);
            if (obj == aVar) {
                return aVar;
            }
            obj4 = a;
            obj6 = a2;
            obj5 = aVar2;
            obj3 = obj6;
            obj2 = obj4;
        }
        C52230ka a3 = ((C33476a) obj5).mo38879a((MessageLite) obj);
        C69664n.m101060f(a3, "PARAMS_KEY.pack(\n       …ramsFields)\n            )");
        ((C32808bc) obj6).mo38306b(a3);
        ((C32803ay) obj4).mo38303b(((C32808bc) obj3).mo38305a());
        return ((C32803ay) obj2).mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127236a(this.f350339g, this.f350340h, this.f350341i, gVar);
    }
}
