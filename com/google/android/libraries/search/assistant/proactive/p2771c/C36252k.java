package com.google.android.libraries.search.assistant.proactive.p2771c;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.k */
/* compiled from: PG */
public final class C36252k implements C32597b {

    /* renamed from: a */
    public static final /* synthetic */ int f94697a = 0;

    /* renamed from: b */
    private static final C59071e f94698b = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.c.k");

    /* renamed from: c */
    private static final C32836cd f94699c;

    /* renamed from: d */
    private final C36245d f94700d;

    /* renamed from: e */
    private final Executor f94701e;

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
        arVar.f87976b = "asst.dialog.state.params";
        C32796ar arVar2 = (C32796ar) ajVar.build();
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f94699c = (C32836cd) ccVar.build();
    }

    public C36252k(C36245d dVar, Executor executor) {
        this.f94700d = dVar;
        this.f94701e = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f94699c;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f94698b.mo56224b()).mo56372aa(52277)).mo56386p("Fetch DialogStateParams from ConversationParamStore.");
        C36245d dVar = this.f94700d;
        C36244c cVar = new C36244c(dVar);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(cVar), dVar.f94678b);
        C36251j jVar = C36251j.f94696a;
        return C60922j.m93044g(m, C47810es.m84963c(jVar), this.f94701e);
    }
}
