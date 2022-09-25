package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121126d;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2862s.C37149e;
import com.google.android.libraries.search.udcdataservice.C41385a;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41409h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3897e.p3917i.p3918a.C51609oa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.aj */
/* compiled from: PG */
public final class C124399aj implements C32597b {

    /* renamed from: a */
    public static final C59071e f343333a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.aj");

    /* renamed from: b */
    public static final C33476a f343334b = new C33476a("assistant.api.params.TopContactParams", C51609oa.f134502b);

    /* renamed from: d */
    private static final C32836cd f343335d;

    /* renamed from: c */
    public final C37149e f343336c;

    /* renamed from: e */
    private final C41409h f343337e;

    /* renamed from: f */
    private final Executor f343338f;

    /* renamed from: g */
    private final C121126d f343339g;

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
        arVar.f87976b = "asst.communication.top_contact";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343335d = (C32836cd) ccVar.build();
    }

    public C124399aj(C37149e eVar, C41409h hVar, C121126d dVar, Executor executor) {
        this.f343336c = eVar;
        this.f343337e = hVar;
        this.f343339g = dVar;
        this.f343338f = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343335d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343333a.mo56224b()).mo56372aa(37046)).mo56386p("Starting fetching top contacts");
        C60870cx b = this.f343337e.mo43949b(new C41387c[]{C41387c.DEVICE_CONTACTS}, C41385a.ASSISTANT);
        C60870cx d = this.f343339g.f336571a.mo46042d();
        C60870cx a = C47638k.m84753d(b, d).mo51520a(new C124398ai(b, d), this.f343338f);
        C124397ah ahVar = new C124397ah(this);
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(ahVar), this.f343338f);
        C124396ag agVar = C124396ag.f343329a;
        return C60922j.m93044g(h, C47810es.m84963c(agVar), this.f343338f);
    }
}
