package com.google.android.libraries.search.assistant.proactive.p2771c;

import com.google.android.apps.search.assistant.platform.p9141h.p9154e.C121059e;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2850k.C36991j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.i */
/* compiled from: PG */
public final class C36250i implements C32597b {

    /* renamed from: a */
    public static final C59071e f94690a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.c.i");

    /* renamed from: b */
    public static final C33476a f94691b = new C33476a("assistant.api.params.DeviceProperties", C51334dw.f133658ab);

    /* renamed from: d */
    private static final C32836cd f94692d;

    /* renamed from: c */
    public final C36991j f94693c;

    /* renamed from: e */
    private final Executor f94694e;

    /* renamed from: f */
    private final C121059e f94695f;

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
        arVar.f87976b = "asst.device.properties";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f94692d = (C32836cd) ccVar.build();
    }

    public C36250i(C121059e eVar, C36991j jVar, Executor executor) {
        this.f94695f = eVar;
        this.f94693c = jVar;
        this.f94694e = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f94692d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f94690a.mo56224b()).mo56372aa(52276)).mo56386p("Starting fetching device properties");
        C60870cx a = this.f94695f.mo105035a();
        C36248g gVar = new C36248g(this);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(gVar), this.f94694e);
        C36249h hVar = C36249h.f94689a;
        return C60922j.m93044g(h, C47810es.m84963c(hVar), this.f94694e);
    }
}
