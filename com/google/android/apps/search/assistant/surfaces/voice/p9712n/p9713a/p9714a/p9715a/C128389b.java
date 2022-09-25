package com.google.android.apps.search.assistant.surfaces.voice.p9712n.p9713a.p9714a.p9715a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.voicesearch.context.providers.topcontacts.VoiceSearchTopContactsSupplier$fetchContext$contextResultFuture$1", mo61344c = "VoiceSearchTopContactsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {67})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.n.a.a.a.b */
/* compiled from: PG */
final class C128389b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f353107a;

    /* renamed from: b */
    Object f353108b;

    /* renamed from: c */
    Object f353109c;

    /* renamed from: d */
    Object f353110d;

    /* renamed from: e */
    Object f353111e;

    /* renamed from: f */
    int f353112f;

    /* renamed from: g */
    final /* synthetic */ C128391d f353113g;

    /* renamed from: h */
    final /* synthetic */ C127289i f353114h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128389b(C128391d dVar, C127289i iVar, C69577g gVar) {
        super(2, gVar);
        this.f353113g = dVar;
        this.f353114h = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C128389b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f353112f != 0) {
            obj6 = this.f353111e;
            obj5 = this.f353110d;
            obj4 = this.f353109c;
            obj3 = this.f353108b;
            obj2 = this.f353107a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C128391d dVar = this.f353113g;
            C127289i iVar = this.f353114h;
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            obj4 = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            obj3 = C69664n.m101061g(azVar, "builder");
            C33476a aVar2 = C128391d.f353121a;
            this.f353107a = obj4;
            this.f353108b = obj3;
            this.f353109c = obj4;
            this.f353110d = aVar2;
            this.f353111e = obj3;
            this.f353112f = 1;
            obj = dVar.mo108407b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
            obj6 = obj3;
            obj5 = aVar2;
            obj2 = obj4;
        }
        C52230ka a = ((C33476a) obj5).mo38879a((MessageLite) obj);
        C69664n.m101060f(a, "PARAMS_KEY.pack(getTopContacts(queryContext))");
        ((C32808bc) obj6).mo38306b(a);
        ((C32803ay) obj4).mo38303b(((C32808bc) obj3).mo38305a());
        return ((C32803ay) obj2).mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C128389b(this.f353113g, this.f353114h, gVar);
    }
}
