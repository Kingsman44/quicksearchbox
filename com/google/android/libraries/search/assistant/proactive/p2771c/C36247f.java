package com.google.android.libraries.search.assistant.proactive.p2771c;

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
import com.google.assistant.p3897e.p3921j.C52264lh;
import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.assistant.p3897e.p3921j.ame;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.proactive.c.f */
/* compiled from: PG */
public final class C36247f implements C32597b {

    /* renamed from: a */
    public static final C59071e f94681a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.c.f");

    /* renamed from: b */
    public static final C33476a f94682b = new C33476a("assistant.api.DeviceCapabilities", C51715bm.f135662t);

    /* renamed from: c */
    private static final C32836cd f94683c;

    /* renamed from: d */
    private static final amf f94684d;

    /* renamed from: e */
    private static final C52265li f94685e;

    /* renamed from: f */
    private final C36979g f94686f;

    /* renamed from: g */
    private final Executor f94687g;

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
        f94683c = (C32836cd) ccVar.build();
        ame ame = (ame) amf.f135365e.createBuilder();
        ame.copyOnWrite();
        amf amf = (amf) ame.instance;
        amf.f135367a |= 2;
        amf.f135369c = "OPA_AGSA";
        f94684d = (amf) ame.build();
        C52264lh lhVar = (C52264lh) C52265li.f137167I.createBuilder();
        lhVar.copyOnWrite();
        C52265li liVar = (C52265li) lhVar.instance;
        liVar.f137178b |= 16777216;
        liVar.f137175G = true;
        f94685e = (C52265li) lhVar.build();
    }

    public C36247f(C36979g gVar, Executor executor) {
        this.f94686f = gVar;
        this.f94687g = executor;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return f94683c;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        ((C59052c) ((C59052c) f94681a.mo56224b()).mo56372aa(52273)).mo56386p("Start fetching device capabilities");
        C36979g gVar = this.f94686f;
        C36973a aVar = new C36973a();
        aVar.mo40502d(f94684d);
        aVar.mo40501c(f94685e);
        aVar.mo40500b();
        C60870cx a = gVar.mo40506a(aVar.mo40499a());
        C36246e eVar = C36246e.f94680a;
        return C60922j.m93044g(a, C47810es.m84963c(eVar), this.f94687g);
    }
}
