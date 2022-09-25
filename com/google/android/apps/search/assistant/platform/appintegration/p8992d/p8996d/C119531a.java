package com.google.android.apps.search.assistant.platform.appintegration.p8992d.p8996d;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.p8992d.C119522a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32795aq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32856cx;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32857cy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.d.d.a */
/* compiled from: PG */
public final class C119531a implements C119522a {

    /* renamed from: a */
    private static final C59071e f333155a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.d.d.a");

    /* renamed from: b */
    private static final C32836cd f333156b;

    static {
        C32835cc ccVar = (C32835cc) C32836cd.f88040e.createBuilder();
        ccVar.copyOnWrite();
        C32836cd cdVar = (C32836cd) ccVar.instance;
        cdVar.f88042a |= 2;
        cdVar.f88044c = true;
        C32788aj ajVar = (C32788aj) C32796ar.f87973c.createBuilder();
        C32795aq aqVar = C32795aq.f87971a;
        ajVar.copyOnWrite();
        C32796ar arVar = (C32796ar) ajVar.instance;
        aqVar.getClass();
        arVar.f87976b = aqVar;
        arVar.f87975a = 4;
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f333156b = (C32836cd) ccVar.build();
    }

    /* renamed from: a */
    public final C32836cd mo104416a() {
        C32836cd cdVar = f333156b;
        ((C59052c) ((C59052c) f333155a.mo56224b()).mo56372aa(34440)).mo56389s("get context key=%s", cdVar);
        return cdVar;
    }

    /* renamed from: b */
    public final C60870cx mo104417b(C119640v vVar) {
        ((C59052c) ((C59052c) f333155a.mo56224b()).mo56372aa(34441)).mo56389s("fetchContext context key=%s", f333156b);
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32856cx cxVar = (C32856cx) C32857cy.f88077c.createBuilder();
        cxVar.copyOnWrite();
        C32857cy cyVar = (C32857cy) cxVar.instance;
        cyVar.f88079a |= 1;
        cyVar.f88080b = "Mozilla/5.0 (Linux; Android 6.0.99; Build/NYC; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/52.0.2743.99 Mobile Safari/537.36 GSA/11.35.7.23.arm64 OpaScreenful/0";
        C32857cy cyVar2 = (C32857cy) cxVar.build();
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        cyVar2.getClass();
        awVar.f87981b = cyVar2;
        awVar.f87980a = 2;
        return C60856cj.m92900i((C32801aw) auVar.build());
    }
}
