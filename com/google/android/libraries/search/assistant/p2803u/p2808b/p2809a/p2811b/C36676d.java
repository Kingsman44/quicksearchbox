package com.google.android.libraries.search.assistant.p2803u.p2808b.p2809a.p2811b;

import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36723aq;
import com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.C36724ar;
import com.google.assistant.p3861at.C50358uc;
import com.google.assistant.p3861at.C50359ud;
import com.google.assistant.p3861at.C50362ug;
import com.google.assistant.p3861at.ado;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63088z;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.u.b.a.b.d */
/* compiled from: PG */
public final class C36676d {
    /* renamed from: a */
    public static C36724ar m65266a(C50359ud udVar) {
        C36723aq aqVar = (C36723aq) C36724ar.f95682d.createBuilder();
        aqVar.copyOnWrite();
        C36724ar arVar = (C36724ar) aqVar.instance;
        arVar.f95685b = 1;
        arVar.f95684a = 1 | arVar.f95684a;
        C50358uc ucVar = udVar.f131083b;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        if ((ucVar.f131068a & 2) != 0) {
            C63088z zVar = ucVar.f131070c;
            aqVar.copyOnWrite();
            C36724ar arVar2 = (C36724ar) aqVar.instance;
            zVar.getClass();
            arVar2.f95684a |= 2;
            arVar2.f95686c = zVar;
        }
        return (C36724ar) aqVar.build();
    }

    /* renamed from: b */
    public static Optional m65267b(C50362ug ugVar, int i) {
        C62971cq cqVar = ugVar.f131101d;
        if (i >= cqVar.size()) {
            return Optional.empty();
        }
        C50359ud udVar = (C50359ud) cqVar.get(i);
        C50358uc ucVar = udVar.f131083b;
        if (ucVar == null) {
            ucVar = C50358uc.f131066m;
        }
        if (ucVar.f131078k.size() == 0) {
            return Optional.empty();
        }
        C50358uc ucVar2 = udVar.f131083b;
        if (ucVar2 == null) {
            ucVar2 = C50358uc.f131066m;
        }
        C56002b a = C56002b.m87880a(((ado) ucVar2.f131078k.get(0)).f129053b);
        if (a == null) {
            a = C56002b.UNKNOWN_SETTING_SET_ID;
        }
        return Optional.m71637of(a);
    }
}
