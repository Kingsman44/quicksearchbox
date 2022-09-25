package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9548ae;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51610ob;
import com.google.assistant.p3897e.p3917i.p3918a.C51611oc;
import com.google.assistant.p3897e.p3917i.p3918a.C51613oe;
import com.google.assistant.p3897e.p3917i.p3918a.C51614of;
import com.google.assistant.p3897e.p3917i.p3918a.C51615og;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.protobuf.C62942bv;
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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.transactions.TransactionsParamsSupplier$fetchContext$1", mo61344c = "TransactionsParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.ae.a */
/* compiled from: PG */
final class C127203a extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350222a;

    /* renamed from: b */
    Object f350223b;

    /* renamed from: c */
    Object f350224c;

    /* renamed from: d */
    Object f350225d;

    /* renamed from: e */
    Object f350226e;

    /* renamed from: f */
    int f350227f;

    /* renamed from: g */
    final /* synthetic */ C127204b f350228g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127203a(C127204b bVar, C69577g gVar) {
        super(2, gVar);
        this.f350228g = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127203a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350227f != 0) {
            obj6 = this.f350226e;
            obj5 = this.f350225d;
            obj4 = this.f350224c;
            obj3 = this.f350223b;
            obj2 = this.f350222a;
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
            C69664n.m101060f(auVar, "newBuilder()");
            obj4 = C69664n.m101061g(auVar, "builder");
            C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
            C69664n.m101060f(azVar, "newBuilder()");
            C32808bc a = C69664n.m101061g(azVar, "builder");
            C33476a aVar2 = C127204b.f350229a;
            this.f350222a = obj4;
            this.f350223b = a;
            this.f350224c = obj4;
            this.f350225d = aVar2;
            this.f350226e = a;
            this.f350227f = 1;
            C51610ob obVar = (C51610ob) C51611oc.f134505d.createBuilder();
            C69664n.m101060f(obVar, "newBuilder()");
            C69664n.m101061g(obVar, "builder");
            C51614of ofVar = (C51614of) C51615og.f134516c.createBuilder();
            C69664n.m101060f(ofVar, "newBuilder()");
            C69664n.m101061g(ofVar, "builder");
            C51613oe oeVar = C51613oe.PASSWORD;
            C69664n.m101061g(oeVar, "value");
            ofVar.copyOnWrite();
            C51615og ogVar = (C51615og) ofVar.instance;
            ogVar.f134519b = oeVar.f134515d;
            ogVar.f134518a |= 2;
            C62942bv build = ofVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C51615og ogVar2 = (C51615og) build;
            C69664n.m101061g(ogVar2, "value");
            obVar.copyOnWrite();
            C51611oc ocVar = (C51611oc) obVar.instance;
            ogVar2.getClass();
            ocVar.f134508b = ogVar2;
            ocVar.f134507a |= 1;
            C62942bv build2 = obVar.build();
            C69664n.m101060f(build2, "_builder.build()");
            C51611oc ocVar2 = (C51611oc) build2;
            if (ocVar2 == aVar) {
                return aVar;
            }
            obj6 = a;
            obj2 = obj4;
            obj = ocVar2;
            obj5 = aVar2;
            obj3 = obj6;
        }
        C52230ka a2 = ((C33476a) obj5).mo38879a((MessageLite) obj);
        C69664n.m101060f(a2, "PARAMS_KEY.pack(getTransactionsParams())");
        ((C32808bc) obj6).mo38306b(a2);
        ((C32803ay) obj4).mo38303b(((C32808bc) obj3).mo38305a());
        return ((C32803ay) obj2).mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127203a(this.f350228g, gVar);
    }
}
