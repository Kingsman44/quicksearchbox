package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2858q.C37061c;
import com.google.android.libraries.search.assistant.p2828y.p2858q.C37062d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3745ab.p3771w.C48422i;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.af */
/* compiled from: PG */
public final class C124395af implements C32597b {

    /* renamed from: a */
    public static final C33476a f343322a = new C33476a("assistant.api.params.RequestLoggingParams", C51536li.f134316k);

    /* renamed from: b */
    public static final C33476a f343323b = new C33476a("assistant.logs.OpaAndroidInfo", C48422i.f125135e);

    /* renamed from: e */
    private static final C59071e f343324e = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.af");

    /* renamed from: f */
    private static final C32836cd f343325f;

    /* renamed from: c */
    public final C37062d f343326c;

    /* renamed from: d */
    public C37061c f343327d;

    /* renamed from: g */
    private final Executor f343328g;

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
        arVar.f87976b = "asst.request.logging.params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343325f = (C32836cd) ccVar.build();
    }

    public C124395af(C37062d dVar, Executor executor) {
        this.f343326c = dVar;
        this.f343328g = new C60904dr(executor);
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343325f;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343324e.mo56224b()).mo56372aa(37044)).mo56386p("Fetching Request Logging Params");
        C124394ae aeVar = new C124394ae(this);
        return C60856cj.m92904m(C47810es.m84978r(aeVar), this.f343328g);
    }
}
