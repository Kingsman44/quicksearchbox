package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import com.google.assistant.p3897e.p3908d.p3909a.C51178i;
import com.google.assistant.p3897e.p3908d.p3909a.C51180k;
import com.google.assistant.p3897e.p3908d.p3909a.C51181l;
import com.google.assistant.p3897e.p3908d.p3909a.C51182m;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.i */
/* compiled from: PG */
public final class C33121i {

    /* renamed from: a */
    public static final C59071e f88639a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.i");

    /* renamed from: a */
    public static void m61472a(C51182m mVar, List list) {
        C51178i iVar = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar = C51180k.START_BBS;
        iVar.copyOnWrite();
        C51181l lVar = (C51181l) iVar.instance;
        lVar.f133224b = kVar.f133220f;
        lVar.f133223a |= 1;
        iVar.mo53542a(list);
        mVar.mo53550e(iVar);
        C51178i iVar2 = (C51178i) C51181l.f133221d.createBuilder();
        C51180k kVar2 = C51180k.JOIN_BBS;
        iVar2.copyOnWrite();
        C51181l lVar2 = (C51181l) iVar2.instance;
        lVar2.f133224b = kVar2.f133220f;
        lVar2.f133223a |= 1;
        iVar2.mo53542a(list);
        mVar.mo53550e(iVar2);
    }

    /* renamed from: b */
    public static boolean m61473b(C52083ep epVar, String str) {
        C52076ei eiVar;
        C52076ei eiVar2;
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        if ((eiVar.f136666a & 32) == 0) {
            return false;
        }
        if (epVar.f136692b == 4) {
            eiVar2 = (C52076ei) epVar.f136693c;
        } else {
            eiVar2 = C52076ei.f136664f;
        }
        C51809dy dyVar = eiVar2.f136668c;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        return str.equals(dyVar.f135936b);
    }
}
