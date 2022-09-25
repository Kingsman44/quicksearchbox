package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9550b;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.apamedia.ApaMediaParamsSupplier$fetchContext$1", mo61344c = "ApaMediaParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {34})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.b.a */
/* compiled from: PG */
final class C127206a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350234a;

    /* renamed from: b */
    Object f350235b;

    /* renamed from: c */
    Object f350236c;

    /* renamed from: d */
    Object f350237d;

    /* renamed from: e */
    Object f350238e;

    /* renamed from: f */
    int f350239f;

    /* renamed from: g */
    final /* synthetic */ C127208c f350240g;

    /* renamed from: h */
    final /* synthetic */ C127289i f350241h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127206a(C127208c cVar, C127289i iVar, C69577g gVar) {
        super(2, gVar);
        this.f350240g = cVar;
        this.f350241h = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127206a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350239f != 0) {
            obj6 = this.f350238e;
            obj5 = this.f350237d;
            obj4 = this.f350236c;
            obj3 = this.f350235b;
            obj2 = this.f350234a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C127208c cVar = this.f350240g;
            C127289i iVar = this.f350241h;
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            obj4 = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            obj3 = C69664n.m101061g(azVar, "builder");
            C33476a aVar2 = C127208c.f350246a;
            this.f350234a = obj4;
            this.f350235b = obj3;
            this.f350236c = obj4;
            this.f350237d = aVar2;
            this.f350238e = obj3;
            this.f350239f = 1;
            obj = cVar.mo107995b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
            obj6 = obj3;
            obj5 = aVar2;
            obj2 = obj4;
        }
        C52230ka a = ((C33476a) obj5).mo38879a((MessageLite) obj);
        C69664n.m101060f(a, "PARAMS_KEY.pack(getMediaParams(queryContext))");
        ((C32808bc) obj6).mo38306b(a);
        ((C32803ay) obj4).mo38303b(((C32808bc) obj3).mo38305a());
        return ((C32803ay) obj2).mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127206a(this.f350240g, this.f350241h, gVar);
    }
}
