package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32597b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32601f;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32799au;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32804az;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32806ba;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32836cd;
import com.google.assistant.p3897e.p3917i.p3918a.C51231aa;
import com.google.assistant.p3897e.p3917i.p3918a.C51232ab;
import com.google.assistant.p3897e.p3917i.p3918a.C51233ac;
import com.google.assistant.p3897e.p3917i.p3918a.C51284c;
import com.google.assistant.p3897e.p3917i.p3918a.C51311d;
import com.google.assistant.p3897e.p3917i.p3918a.C51636z;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5022m.C64952a;
import com.google.protos.p4985f.p5022m.C64953b;
import com.google.protos.p4985f.p5022m.C64954c;
import com.google.protos.p4985f.p5022m.C64955d;
import java.util.List;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ad */
/* compiled from: PG */
final class C126766ad implements C32597b {

    /* renamed from: a */
    final /* synthetic */ C126780ar f349102a;

    public C126766ad(C126780ar arVar) {
        this.f349102a = arVar;
    }

    /* renamed from: c */
    public final /* synthetic */ C32601f mo38173c() {
        return null;
    }

    /* renamed from: d */
    public final C32836cd mo38174d() {
        return C126780ar.f349124c;
    }

    /* renamed from: e */
    public final C60870cx mo38175e(C32810be beVar) {
        C59071e eVar = C126780ar.f349122a;
        C58976aa aaVar = C58975e.f156826a;
        C32796ar arVar = beVar.f87996b;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        if (arVar.f87975a == 1) {
            String str = (String) arVar.f87976b;
        }
        if (this.f349102a.f349136o == null) {
            return C60856cj.m92899h(new C70761fa(Status.f186908f, (C70334de) null, true));
        }
        C32799au auVar = (C32799au) C32801aw.f87978c.createBuilder();
        C32804az azVar = (C32804az) C32806ba.f87988c.createBuilder();
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.AppContextParams";
        C126797bh bhVar = this.f349102a.f349136o;
        bhVar.getClass();
        C51232ab abVar = (C51232ab) C51233ac.f133389b.createBuilder();
        C51636z zVar = (C51636z) C51231aa.f133382f.createBuilder();
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar2.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar2.instance;
        kaVar2.f137059a |= 1;
        kaVar2.f137060b = "assistant.api.params.AiwaAppContextParams";
        C51284c cVar = (C51284c) C51311d.f133579c.createBuilder();
        C64952a aVar = (C64952a) C64955d.f175910e.createBuilder();
        String str2 = bhVar.f349182d;
        aVar.copyOnWrite();
        C64955d dVar = (C64955d) aVar.instance;
        str2.getClass();
        dVar.f175912a |= 2;
        dVar.f175914c = str2;
        C64953b bVar = (C64953b) C64954c.f175904e.createBuilder();
        String str3 = bhVar.f349180b;
        bVar.copyOnWrite();
        C64954c cVar2 = (C64954c) bVar.instance;
        str3.getClass();
        cVar2.f175906a |= 1;
        cVar2.f175907b = str3;
        C126843d dVar2 = bhVar.f349184f;
        if (dVar2 == null) {
            dVar2 = C126843d.f349320e;
        }
        String str4 = dVar2.f349323b;
        bVar.copyOnWrite();
        C64954c cVar3 = (C64954c) bVar.instance;
        str4.getClass();
        cVar3.f175906a |= 2;
        cVar3.f175908c = str4;
        C126843d dVar3 = bhVar.f349184f;
        if (dVar3 == null) {
            dVar3 = C126843d.f349320e;
        }
        String str5 = dVar3.f349324c;
        bVar.copyOnWrite();
        C64954c cVar4 = (C64954c) bVar.instance;
        str5.getClass();
        cVar4.f175906a |= 4;
        cVar4.f175909d = str5;
        C64954c cVar5 = (C64954c) bVar.build();
        aVar.copyOnWrite();
        C64955d dVar4 = (C64955d) aVar.instance;
        cVar5.getClass();
        dVar4.f175913b = cVar5;
        dVar4.f175912a |= 1;
        C62961ch chVar = bhVar.f349183e;
        aVar.copyOnWrite();
        C64955d dVar5 = (C64955d) aVar.instance;
        C62961ch chVar2 = dVar5.f175915d;
        if (!chVar2.mo58948c()) {
            dVar5.f175915d = C62942bv.mutableCopy(chVar2);
        }
        C62947c.addAll((Iterable) chVar, (List) dVar5.f175915d);
        C64955d dVar6 = (C64955d) aVar.build();
        cVar.copyOnWrite();
        C51311d dVar7 = (C51311d) cVar.instance;
        dVar6.getClass();
        dVar7.f133582b = dVar6;
        dVar7.f133581a |= 1;
        C63088z byteString = ((C51311d) cVar.build()).toByteString();
        jzVar2.copyOnWrite();
        C52230ka kaVar3 = (C52230ka) jzVar2.instance;
        byteString.getClass();
        kaVar3.f137059a |= 2;
        kaVar3.f137061c = byteString;
        zVar.mo53669a(jzVar2);
        abVar.mo53557a(zVar);
        C63088z byteString2 = ((C51233ac) abVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar.instance;
        byteString2.getClass();
        kaVar4.f137059a |= 2;
        kaVar4.f137061c = byteString2;
        C52230ka kaVar5 = (C52230ka) jzVar.build();
        azVar.copyOnWrite();
        C32806ba baVar = (C32806ba) azVar.instance;
        kaVar5.getClass();
        baVar.f87991b = kaVar5;
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
