package com.google.android.apps.gsa.staticplugins.chime.p7656a;

import com.google.android.apps.gsa.sidekick.shared.util.C91992k;
import com.google.android.apps.p489g.p494d.C9140ac;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.android.apps.p489g.p494d.C9281y;
import com.google.common.base.C58817ah;
import com.google.p375ai.p378b.C7577cd;
import com.google.p375ai.p378b.C7605de;
import com.google.p375ai.p378b.C7681g;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56973i;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a.a */
/* compiled from: PG */
public final class C97644a implements C58817ah {
    /* renamed from: a */
    public static final C9141ad m161882a(C56975k kVar) {
        C7577cd cdVar;
        C7605de deVar;
        C9281y yVar = (C9281y) C9141ad.f31521K.createBuilder();
        if ((kVar.f152092a & 1) != 0) {
            C7681g a = C7681g.m22802a(kVar.f152095d);
            if (a == null) {
                a = C7681g.INVALID;
            }
            int i = a.f26835cv;
            yVar.copyOnWrite();
            C9141ad adVar = (C9141ad) yVar.instance;
            adVar.f31535a |= 2;
            adVar.f31538d = i;
        }
        C56973i iVar = C56973i.OPEN_URL_ACTION;
        int ordinal = C56973i.m88245a(kVar.f152093b).ordinal();
        if (ordinal == 0) {
            C9140ac acVar = C9140ac.OPEN_URL;
            yVar.copyOnWrite();
            C9141ad adVar2 = (C9141ad) yVar.instance;
            adVar2.f31537c = acVar.f31520am;
            adVar2.f31535a |= 1;
            if (kVar.f152093b == 2) {
                cdVar = (C7577cd) kVar.f152094c;
            } else {
                cdVar = C7577cd.f26179i;
            }
            C9195cd b = C91992k.m150974b(cdVar);
            yVar.copyOnWrite();
            C9141ad adVar3 = (C9141ad) yVar.instance;
            b.getClass();
            adVar3.f31541g = b;
            adVar3.f31535a |= 16;
            return (C9141ad) yVar.build();
        } else if (ordinal != 1) {
            return null;
        } else {
            C9140ac acVar2 = C9140ac.SEARCH;
            yVar.copyOnWrite();
            C9141ad adVar4 = (C9141ad) yVar.instance;
            adVar4.f31537c = acVar2.f31520am;
            adVar4.f31535a |= 1;
            if (kVar.f152093b == 3) {
                deVar = (C7605de) kVar.f152094c;
            } else {
                deVar = C7605de.f26269s;
            }
            C7605de e = C91992k.m150977e(deVar, true);
            yVar.copyOnWrite();
            C9141ad adVar5 = (C9141ad) yVar.instance;
            e.getClass();
            adVar5.f31543i = e;
            adVar5.f31535a |= 64;
            return (C9141ad) yVar.build();
        }
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        throw null;
    }
}
