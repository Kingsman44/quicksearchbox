package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a.p9378a.C124389a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2853n.C37015l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.z */
/* compiled from: PG */
public final class C124426z implements C32597b {

    /* renamed from: a */
    public static final C59071e f343408a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.z");

    /* renamed from: b */
    public static final C33476a f343409b = new C33476a("assistant.api.params.MediaParams", C51450id.f133992h);

    /* renamed from: e */
    private static final C32836cd f343410e;

    /* renamed from: c */
    public final C37015l f343411c;

    /* renamed from: d */
    public final Executor f343412d;

    /* renamed from: f */
    private final C124389a f343413f;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        arVar.f87975a = 1;
        arVar.f87976b = "media";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343410e = (C32836cd) ccVar.build();
    }

    public C124426z(C124389a aVar, C37015l lVar, Executor executor) {
        this.f343413f = aVar;
        this.f343411c = lVar;
        this.f343412d = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343410e;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343408a.mo56224b()).mo56372aa(37040)).mo56386p("Start fetching media params");
        C60870cx a = this.f343413f.f343311a.mo39945a();
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52230ka a2 = f343409b.mo38879a(C51450id.f133992h);
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        a2.getClass();
        baVar.f87991b = a2;
        baVar.f87990a |= 1;
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32806ba baVar2 = (C32806ba) azVar.build();
        baVar2.getClass();
        awVar.f87981b = baVar2;
        awVar.f87980a = 1;
        return C60922j.m93045h(a, C47810es.m84966f(new C124425y(this, (C32801aw) auVar.build())), this.f343412d);
    }
}
