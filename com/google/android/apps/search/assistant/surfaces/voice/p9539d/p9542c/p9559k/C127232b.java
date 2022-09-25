package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9559k;

import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32803ay;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32817bl;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32818bm;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.protobuf.C62942bv;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.clientoptin.ClientOptInParamsSupplier$fetchContext$1", mo61344c = "ClientOptInParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {53})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.k.b */
/* compiled from: PG */
final class C127232b extends C69572j implements C69630p {

    /* renamed from: a */
    int f350323a;

    /* renamed from: b */
    final /* synthetic */ C127234d f350324b;

    /* renamed from: c */
    final /* synthetic */ C127289i f350325c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127232b(C127234d dVar, C127289i iVar, C69577g gVar) {
        super(2, gVar);
        this.f350324b = dVar;
        this.f350325c = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127232b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350323a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C32836cd cdVar = C127234d.f350329a;
            C127234d dVar = this.f350324b;
            C127289i iVar = this.f350325c;
            this.f350323a = 1;
            obj = dVar.mo108001b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        String str = (String) obj;
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C69664n.m101060f(auVar, "newBuilder()");
        C32803ay a = C69664n.m101061g(auVar, "builder");
        C32817bl blVar = (C32817bl) C32818bm.f88003c.createBuilder();
        C69664n.m101060f(blVar, "newBuilder()");
        C69664n.m101061g(blVar, "builder");
        C69664n.m101061g(str, "value");
        blVar.copyOnWrite();
        C32818bm bmVar = (C32818bm) blVar.instance;
        str.getClass();
        bmVar.f88005a = 1 | bmVar.f88005a;
        bmVar.f88006b = str;
        C62942bv build = blVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C32818bm bmVar2 = (C32818bm) build;
        C69664n.m101061g(bmVar2, "value");
        C32799au auVar2 = a.f87983a;
        auVar2.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar2.instance;
        bmVar2.getClass();
        awVar.f87981b = bmVar2;
        awVar.f87980a = 4;
        return a.mo38302a();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127232b(this.f350324b, this.f350325c, gVar);
    }
}
