package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f;

import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14131be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14284dn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14286dp;
import com.google.android.libraries.assistant.p1478e.p1479a.p1480a.C17939a;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.assistant.p3745ab.C48258bo;
import com.google.assistant.p3745ab.C48260bq;
import com.google.common.p4552o.aeg;
import com.google.common.p4552o.aek;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.f.s */
/* compiled from: PG */
final class C15345s implements C14131be {

    /* renamed from: a */
    final /* synthetic */ C14286dp f46044a;

    /* renamed from: b */
    final /* synthetic */ String f46045b;

    /* renamed from: c */
    final /* synthetic */ String f46046c;

    public C15345s(C14286dp dpVar, String str, String str2) {
        this.f46044a = dpVar;
        this.f46045b = str;
        this.f46046c = str2;
    }

    /* renamed from: a */
    public final C28441k mo21443a() {
        C14284dn a = C14284dn.m30595a(this.f46044a.f43218b);
        if (a == null) {
            a = C14284dn.UNRECOGNIZED;
        }
        int i = 2;
        if (a != C14284dn.PLAY) {
            C14284dn a2 = C14284dn.m30595a(this.f46044a.f43218b);
            if (a2 == null) {
                a2 = C14284dn.UNRECOGNIZED;
            }
            if (a2 != C14284dn.PAUSE) {
                C62940bt btVar = C17939a.f51391a;
                aeg aeg = (aeg) aek.f158464e.createBuilder();
                C48258bo boVar = (C48258bo) C48260bq.f124825o.createBuilder();
                String str = this.f46045b;
                boVar.copyOnWrite();
                C48260bq bqVar = (C48260bq) boVar.instance;
                str.getClass();
                bqVar.f124827a |= 1;
                bqVar.f124828b = str;
                String str2 = this.f46046c;
                boVar.copyOnWrite();
                C48260bq bqVar2 = (C48260bq) boVar.instance;
                str2.getClass();
                bqVar2.f124827a |= 2;
                bqVar2.f124829c = str2;
                aeg.copyOnWrite();
                aek aek = (aek) aeg.instance;
                C48260bq bqVar3 = (C48260bq) boVar.build();
                bqVar3.getClass();
                aek.f158469c = bqVar3;
                aek.f158467a = 2 | aek.f158467a;
                return new C28441k(btVar, (aek) aeg.build());
            }
        }
        C62940bt btVar2 = C17939a.f51391a;
        aeg aeg2 = (aeg) aek.f158464e.createBuilder();
        C48258bo boVar2 = (C48258bo) C48260bq.f124825o.createBuilder();
        String str3 = this.f46045b;
        boVar2.copyOnWrite();
        C48260bq bqVar4 = (C48260bq) boVar2.instance;
        str3.getClass();
        bqVar4.f124827a |= 1;
        bqVar4.f124828b = str3;
        String str4 = this.f46046c;
        boVar2.copyOnWrite();
        C48260bq bqVar5 = (C48260bq) boVar2.instance;
        str4.getClass();
        bqVar5.f124827a |= 2;
        bqVar5.f124829c = str4;
        aeg2.copyOnWrite();
        aek aek2 = (aek) aeg2.instance;
        C48260bq bqVar6 = (C48260bq) boVar2.build();
        bqVar6.getClass();
        aek2.f158469c = bqVar6;
        aek2.f158467a |= 2;
        C14284dn a3 = C14284dn.m30595a(this.f46044a.f43218b);
        if (a3 == null) {
            a3 = C14284dn.UNRECOGNIZED;
        }
        if (a3 != C14284dn.PLAY) {
            i = 3;
        }
        aeg2.copyOnWrite();
        aek aek3 = (aek) aeg2.instance;
        aek3.f158470d = i - 1;
        aek3.f158467a |= 4;
        return new C28441k(btVar2, (aek) aeg2.build());
    }
}
