package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p954a.p956b;

import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51015df;
import com.google.assistant.p3897e.p3902c.p3907c.C51016dg;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52641zg;
import com.google.assistant.p3897e.p3921j.C52642zh;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.a.b.c */
/* compiled from: PG */
public final class C13374c {
    /* renamed from: a */
    public static final C51941eu m29632a(String str, boolean z, String str2, aco aco, boolean z2) {
        C51805du duVar;
        C51937eq eqVar = (C51937eq) C51941eu.f136271l.createBuilder();
        eqVar.copyOnWrite();
        C51941eu euVar = (C51941eu) eqVar.instance;
        euVar.f136273a |= 8;
        euVar.f136279g = str;
        eqVar.copyOnWrite();
        C51941eu euVar2 = (C51941eu) eqVar.instance;
        euVar2.f136273a |= 32;
        euVar2.f136281i = z;
        eqVar.copyOnWrite();
        C51941eu euVar3 = (C51941eu) eqVar.instance;
        euVar3.f136274b |= 16;
        euVar3.f136283k = 109966;
        C50929aa aaVar = (C50929aa) C50936ah.f132593m.createBuilder();
        aaVar.copyOnWrite();
        C50936ah ahVar = (C50936ah) aaVar.instance;
        str2.getClass();
        ahVar.f132596b = 1;
        ahVar.f132597c = str2;
        aaVar.copyOnWrite();
        C50936ah ahVar2 = (C50936ah) aaVar.instance;
        ahVar2.f132595a |= 4;
        ahVar2.f132600f = true;
        C51015df dfVar = (C51015df) C51016dg.f132827g.createBuilder();
        if (z2) {
            duVar = C13372a.m29629a(aco, true);
        } else {
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar2 = (C51805du) dsVar.instance;
            duVar2.f135926a |= 1;
            duVar2.f135927b = "message_notification.TAP";
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.MessageNotificationTapParam";
            C52641zg zgVar = (C52641zg) C52642zh.f138218e.createBuilder();
            zgVar.copyOnWrite();
            C52642zh zhVar = (C52642zh) zgVar.instance;
            zhVar.f138220a |= 1;
            zhVar.f138221b = 0;
            zgVar.copyOnWrite();
            C52642zh zhVar2 = (C52642zh) zgVar.instance;
            zhVar2.f138222c = 1;
            zhVar2.f138220a |= 2;
            C63088z byteString = ((C52642zh) zgVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            dsVar.mo53729a("message_notification_input", (C52230ka) jzVar.build());
            C62942bv build = dsVar.build();
            C69664n.m101060f(build, "newBuilder()\n      .setC…()\n      )\n      .build()");
            duVar = (C51805du) build;
        }
        dfVar.copyOnWrite();
        C51016dg dgVar = (C51016dg) dfVar.instance;
        duVar.getClass();
        dgVar.f132833e = duVar;
        dgVar.f132829a |= 8;
        C51016dg dgVar2 = (C51016dg) dfVar.build();
        aaVar.copyOnWrite();
        C50936ah ahVar3 = (C50936ah) aaVar.instance;
        dgVar2.getClass();
        ahVar3.f132599e = dgVar2;
        ahVar3.f132598d = 3;
        C50936ah ahVar4 = (C50936ah) aaVar.build();
        eqVar.copyOnWrite();
        C51941eu euVar4 = (C51941eu) eqVar.instance;
        ahVar4.getClass();
        euVar4.f136278f = ahVar4;
        euVar4.f136277e = 17;
        C62942bv build2 = eqVar.build();
        C69664n.m101060f(build2, "newBuilder()\n      .setI…()\n      )\n      .build()");
        return (C51941eu) build2;
    }
}
