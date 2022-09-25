package com.google.android.apps.search.assistant.libraries.p8972f.p8974b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9342a.C124181k;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124200p;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124202r;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3741aa.p3742a.p3743a.C48156d;
import com.google.assistant.p3897e.p3917i.p3918a.C51525ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.libraries.f.b.c */
/* compiled from: PG */
public final class C119384c implements C32597b {

    /* renamed from: a */
    public static final C59071e f332851a = C59071e.m91332i("com.google.android.apps.search.assistant.libraries.f.b.c");

    /* renamed from: b */
    public static final C33476a f332852b = new C33476a("assistant.api.params.ReachableDeviceStateParams", C51525ky.f134269b);

    /* renamed from: c */
    private static final C32836cd f332853c;

    /* renamed from: d */
    private final Executor f332854d;

    /* renamed from: e */
    private final C124181k f332855e;

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
        arVar.f87976b = "reachable_device_state_params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f332853c = (C32836cd) ccVar.build();
    }

    public C119384c(C124181k kVar, Executor executor) {
        this.f332855e = kVar;
        this.f332854d = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f332853c;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f332851a.mo56224b()).mo56372aa(34410)).mo56386p("Start fetching reachable device states params");
        C124200p pVar = this.f332855e.f342937a;
        return C47633f.m84733g(C70876o.m103760a(pVar.f189039a.mo39510a(C124202r.m203651b(), pVar.f189040b), C48156d.f124605a)).mo51515h(C119382a.f332849a, this.f332854d).mo51513e(RuntimeException.class, C119383b.f332850a, this.f332854d);
    }
}
