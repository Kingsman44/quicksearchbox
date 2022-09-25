package com.google.android.apps.search.assistant.platform.appintegration.p8992d.p8993a;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119640v;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119642x;
import com.google.android.apps.search.assistant.platform.appintegration.p8992d.C119522a;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32788aj;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32835cc;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51232ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.d.a.a */
/* compiled from: PG */
public final class C119523a implements C119522a {

    /* renamed from: a */
    private static final C59071e f333139a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.d.a.a");

    /* renamed from: b */
    private static final C32836cd f333140b;

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
        arVar.f87976b = "asst.integration.context.params";
        ccVar.copyOnWrite();
        C32836cd cdVar2 = (C32836cd) ccVar.instance;
        C32796ar arVar2 = (C32796ar) ajVar.build();
        arVar2.getClass();
        cdVar2.f88043b = arVar2;
        cdVar2.f88042a |= 1;
        f333140b = (C32836cd) ccVar.build();
    }

    /* renamed from: a */
    public final C32836cd mo104416a() {
        C32836cd cdVar = f333140b;
        ((C59052c) ((C59052c) f333139a.mo56224b()).mo56372aa(34434)).mo56389s("get context key=%s", cdVar);
        return cdVar;
    }

    /* renamed from: b */
    public final C60870cx mo104417b(C119640v vVar) {
        ((C59052c) ((C59052c) f333139a.mo56224b()).mo56372aa(34435)).mo56389s("fetchContext context key=%s", f333140b);
        C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        C119642x xVar = vVar.f333412c;
        if (xVar == null) {
            xVar = C119642x.f333419e;
        }
        String str = xVar.f333423c;
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        str.getClass();
        evVar.f132943a |= 1;
        evVar.f132944b = str;
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        C51058ev evVar2 = (C51058ev) esVar.build();
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        zVar.copyOnWrite();
        C51231aa aaVar = (C51231aa) zVar.instance;
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        aaVar.f133385b = ghVar2;
        aaVar.f133384a |= 1;
        C62971cq cqVar = vVar.f333416g;
        zVar.copyOnWrite();
        C51231aa aaVar2 = (C51231aa) zVar.instance;
        aaVar2.mo53556a();
        C62947c.addAll((Iterable) cqVar, (List) aaVar2.f133387d);
        C51232ab abVar = (C51232ab) C51233ac.f133389b.createBuilder();
        abVar.mo53558b((C51231aa) zVar.build());
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.AppContextParams";
        C63088z byteString = ((C51233ac) abVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        kaVar3.getClass();
        baVar.f87991b = kaVar3;
        baVar.f87990a |= 1;
        auVar.copyOnWrite();
        C32801aw awVar = (C32801aw) auVar.instance;
        C32806ba baVar2 = (C32806ba) azVar.build();
        baVar2.getClass();
        awVar.f87981b = baVar2;
        awVar.f87980a = 1;
        return C60856cj.m92900i((C32801aw) auVar.build());
    }
}
