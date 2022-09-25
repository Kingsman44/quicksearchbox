package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37257f;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71083eb;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71084ec;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cr */
/* compiled from: PG */
public final class C126838cr {
    /* renamed from: a */
    public static void m207502a(C37215b bVar, int i, C63042fg fgVar, String str) {
        C37252a d = C37176a.f97322p.mo40811d(C62953e.m95479d(fgVar));
        C62940bt btVar = C71084ec.f189582e;
        C71083eb ebVar = (C71083eb) C71084ec.f189581d.createBuilder();
        ebVar.copyOnWrite();
        C71084ec ecVar = (C71084ec) ebVar.instance;
        ecVar.f189584a |= 2;
        ecVar.f189585b = i;
        ebVar.copyOnWrite();
        C71084ec ecVar2 = (C71084ec) ebVar.instance;
        str.getClass();
        ecVar2.f189584a |= 4;
        ecVar2.f189586c = str;
        ((C37253b) d).mo40792p(btVar, (C71084ec) ebVar.build());
        bVar.mo19974a(d);
    }

    /* renamed from: b */
    public static void m207503b(C37215b bVar, int i) {
        C37258g gVar = C37176a.f97323q;
        C62940bt btVar = C71084ec.f189582e;
        C71083eb ebVar = (C71083eb) C71084ec.f189581d.createBuilder();
        ebVar.copyOnWrite();
        C71084ec ecVar = (C71084ec) ebVar.instance;
        ecVar.f189584a |= 2;
        ecVar.f189585b = i;
        bVar.mo19974a(gVar.mo40812e(btVar, (C71084ec) ebVar.build()));
    }

    /* renamed from: c */
    public static void m207504c(C37215b bVar, C34819a aVar) {
        bVar.mo19974a(C37176a.f97331y.mo40803a(aVar.mo39520a(), aVar.mo39522e()));
    }

    /* renamed from: d */
    public static void m207505d(C37215b bVar, int i, int i2, C63042fg fgVar, String str) {
        m207502a(bVar, i, fgVar, str);
        C37252a d = C37176a.f96880ay.mo40811d(C62953e.m95479d(fgVar));
        C62940bt btVar = C71084ec.f189582e;
        C71083eb ebVar = (C71083eb) C71084ec.f189581d.createBuilder();
        ebVar.copyOnWrite();
        C71084ec ecVar = (C71084ec) ebVar.instance;
        ecVar.f189584a |= 2;
        ecVar.f189585b = i;
        ebVar.copyOnWrite();
        C71084ec ecVar2 = (C71084ec) ebVar.instance;
        str.getClass();
        ecVar2.f189584a |= 4;
        ecVar2.f189586c = str;
        ((C37253b) d).mo40792p(btVar, (C71084ec) ebVar.build());
        bVar.mo19974a(d);
        m207507f(bVar, i2);
    }

    /* renamed from: e */
    public static void m207506e(C37215b bVar, int i) {
        int i2 = i - 1;
        C37257f fVar = C37176a.f97331y;
        if (i != 0) {
            bVar.mo19974a(fVar.mo40803a(i2, "rotiCancels"));
            return;
        }
        throw null;
    }

    /* renamed from: f */
    public static void m207507f(C37215b bVar, int i) {
        bVar.mo19974a(C37176a.f97331y.mo40803a(i - 1, "rotiErrors"));
    }
}
