package com.google.android.apps.search.assistant.surfaces.p9372b.p9376c.p9377a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2585i.C33476a;
import com.google.android.libraries.search.assistant.p2828y.p2848i.C36973a;
import com.google.android.libraries.search.assistant.p2828y.p2848i.C36979g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.assistant.p3897e.p3921j.ame;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.c.a.l */
/* compiled from: PG */
public final class C124412l implements C32597b {

    /* renamed from: a */
    public static final C59071e f343364a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.b.c.a.l");

    /* renamed from: b */
    public static final C33476a f343365b = new C33476a("assistant.api.DeviceCapabilities", C51715bm.f135662t);

    /* renamed from: d */
    private static final C32836cd f343366d;

    /* renamed from: e */
    private static final amf f343367e;

    /* renamed from: c */
    public final C68214a f343368c;

    /* renamed from: f */
    private final C36979g f343369f;

    /* renamed from: g */
    private final Executor f343370g;

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
        arVar.f87976b = "asst.device.capabilities";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f343366d = (C32836cd) ccVar.build();
        ame ame = (ame) amf.f135365e.createBuilder();
        ame.copyOnWrite();
        amf amf = (amf) ame.instance;
        amf.f135367a |= 2;
        amf.f135369c = "OPA_AGSA";
        f343367e = (amf) ame.build();
    }

    public C124412l(C36979g gVar, C68214a aVar, Executor executor) {
        this.f343369f = gVar;
        this.f343368c = aVar;
        this.f343370g = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f343366d;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f343364a.mo56224b()).mo56372aa(37031)).mo56386p("Start fetching device capabilities");
        C36979g gVar = this.f343369f;
        C36973a aVar = new C36973a();
        aVar.mo40502d(f343367e);
        aVar.mo40501c(C52265li.f137167I);
        aVar.mo40500b();
        C60870cx a = gVar.mo40506a(aVar.mo40499a());
        C124411k kVar = new C124411k(this);
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(kVar), this.f343370g);
        C124410j jVar = C124410j.f343362a;
        return C60922j.m93044g(g, C47810es.m84963c(jVar), this.f343370g);
    }
}
