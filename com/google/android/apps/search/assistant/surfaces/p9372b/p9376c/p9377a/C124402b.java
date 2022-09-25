package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2834d.C36861a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51261bd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.b */
/* compiled from: PG */
public final class C124402b implements C32597b {

    /* renamed from: a */
    public static final C59071e f343342a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.b");

    /* renamed from: b */
    public static final C33476a f343343b = new C33476a("assistant.api.params.CallStateParams", C51261bd.f133446d);

    /* renamed from: d */
    private static final C32836cd f343344d;

    /* renamed from: c */
    final C36861a f343345c;

    /* renamed from: e */
    private final Executor f343346e;

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
        arVar.f87976b = "call";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343344d = (C32836cd) ccVar.build();
    }

    public C124402b(C36861a aVar, Executor executor) {
        this.f343345c = aVar;
        this.f343346e = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343344d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343342a.mo56224b()).mo56372aa(37025)).mo56386p("Starting fetching call state");
        C60870cx i = C60856cj.m92900i(this.f343345c.mo40421a());
        C124388a aVar = C124388a.f343310a;
        return C60922j.m93044g(i, C47810es.m84963c(aVar), this.f343346e);
    }
}
