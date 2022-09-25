package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2714o.C34919e;
import com.google.android.libraries.search.assistant.p2828y.p2851l.C36993a;
import com.google.android.libraries.search.assistant.p2828y.p2851l.C36999g;
import com.google.android.libraries.search.assistant.p2828y.p2851l.C37000h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.w */
/* compiled from: PG */
public final class C124423w implements C32597b {

    /* renamed from: a */
    public static final C33476a f343398a = new C33476a("assistant.api.params.DisplayContextParams", C51379fn.f133814i);

    /* renamed from: d */
    private static final C59071e f343399d = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.w");

    /* renamed from: e */
    private static final C32836cd f343400e;

    /* renamed from: b */
    public final C37000h f343401b;

    /* renamed from: c */
    public C36999g f343402c;

    /* renamed from: f */
    private final C34919e f343403f;

    /* renamed from: g */
    private final Executor f343404g;

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
        arVar.f87976b = "asst.display.context.params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343400e = (C32836cd) ccVar.build();
    }

    public C124423w(C37000h hVar, C34919e eVar, Executor executor) {
        this.f343401b = hVar;
        this.f343403f = eVar;
        this.f343404g = new C60904dr(executor);
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343400e;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343399d.mo56224b()).mo56372aa(37038)).mo56386p("Starting fetching Display Params");
        C60870cx h = C60922j.m93045h(this.f343403f.mo39623a(), C47810es.m84966f(new C124421u(this, new C36993a())), this.f343404g);
        C124422v vVar = C124422v.f343397a;
        return C60922j.m93044g(h, C47810es.m84963c(vVar), this.f343404g);
    }
}
