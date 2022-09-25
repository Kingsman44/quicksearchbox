package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.apps.search.assistant.libraries.p8972f.p8973a.C119364a;
import com.google.android.apps.search.assistant.libraries.p8972f.p8973a.C119369f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32790al;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32791am;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.h */
/* compiled from: PG */
public final class C124408h implements C32597b {

    /* renamed from: a */
    public static final C59071e f343357a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.h");

    /* renamed from: b */
    private static final C32836cd f343358b;

    /* renamed from: c */
    private final Executor f343359c;

    /* renamed from: d */
    private final C68214a f343360d;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C32790al alVar = (C32790al) C32791am.f87965c.createBuilder();
        alVar.copyOnWrite();
        C32791am amVar = (C32791am) alVar.instance;
        amVar.f87967a |= 1;
        amVar.f87968b = "X-Client-Opt-In-Context";
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        C32791am amVar2 = (C32791am) alVar.build();
        amVar2.getClass();
        arVar.f87976b = amVar2;
        arVar.f87975a = 2;
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343358b = (C32836cd) ccVar.build();
    }

    public C124408h(Executor executor, C68214a aVar) {
        this.f343359c = executor;
        this.f343360d = aVar;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343358b;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343357a.mo56224b()).mo56372aa(37029)).mo56386p("Fetching ClientOptIn Context");
        C119364a aVar = new C119364a();
        aVar.f332802a = 3;
        C60870cx a = ((C119369f) this.f343360d.mo27525b()).mo104311a(aVar.mo104306a());
        C124407g gVar = C124407g.f343356a;
        return C60922j.m93044g(a, C47810es.m84963c(gVar), this.f343359c);
    }
}
