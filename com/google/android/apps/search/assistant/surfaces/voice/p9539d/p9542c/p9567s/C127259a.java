package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9567s;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127287g;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127292l;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32808bc;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.assistant.p3897e.p3917i.p3918a.C51437hr;
import com.google.assistant.p3897e.p3917i.p3918a.C51438hs;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.language.LanguageParamsSupplier$fetchContext$1", mo61344c = "LanguageParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.s.a */
/* compiled from: PG */
final class C127259a extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C127289i f350463a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127259a(C127289i iVar, C69577g gVar) {
        super(2, gVar);
        this.f350463a = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127259a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C127289i iVar = this.f350463a;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C69664n.m101060f(azVar, "newBuilder()");
        C32808bc a2 = C69664n.m101061g(azVar, "builder");
        C127292l lVar = iVar.f350566d;
        if (lVar == null) {
            lVar = C127292l.f350572c;
        }
        C127287g gVar = lVar.f350575b;
        if (gVar == null) {
            gVar = C127287g.f350556d;
        }
        C62971cq cqVar = gVar.f350560c;
        C69664n.m101060f(cqVar, "it");
        if (!cqVar.isEmpty()) {
            C59052c cVar = (C59052c) C127260b.f350466c.mo56224b();
            cVar.mo56379ah(new C59094n(37273));
            cVar.mo56389s("Adding following languageParams as context: %s", cqVar);
            C33476a aVar2 = C127260b.f350464a;
            C51437hr hrVar = (C51437hr) C51438hs.f133965b.createBuilder();
            hrVar.copyOnWrite();
            C51438hs hsVar = (C51438hs) hrVar.instance;
            hsVar.mo53615a();
            C62947c.addAll((Iterable) cqVar, (List) hsVar.f133967a);
            C52230ka a3 = aVar2.mo38879a(hrVar.build());
            C69664n.m101060f(a3, "PARAMS_KEY.pack(Language…AllLanguages(it).build())");
            a2.mo38306b(a3);
        }
        a.mo38303b(a2.mo38305a());
        return a.mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127259a(this.f350463a, gVar);
    }
}
