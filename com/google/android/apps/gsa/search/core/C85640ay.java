package com.google.android.apps.gsa.search.core;

import android.accounts.Account;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.p375ai.p378b.C7880nj;
import com.google.p375ai.p378b.C7891nu;
import com.google.p375ai.p378b.p380b.C7542c;
import com.google.p375ai.p378b.p380b.C7545f;
import com.google.p375ai.p378b.p380b.C7546g;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.ay */
/* compiled from: PG */
public final class C85640ay {
    /* renamed from: a */
    public static void m137424a(Account account, C7880nj njVar, int i, C7891nu nuVar, C90931ca caVar, C85637av avVar) {
        if (account != null) {
            caVar.mo85139d(new C85639ax(account, avVar, i, njVar, nuVar));
        }
    }

    /* renamed from: b */
    public static void m137425b(int i, C7891nu nuVar, int i2, int i3) {
        C7542c cVar = (C7542c) C7546g.f26108h.createBuilder();
        cVar.copyOnWrite();
        C7546g gVar = (C7546g) cVar.instance;
        gVar.f26112c = 1;
        gVar.f26110a |= 2;
        cVar.copyOnWrite();
        C7546g gVar2 = (C7546g) cVar.instance;
        gVar2.f26111b = i;
        gVar2.f26110a |= 1;
        cVar.copyOnWrite();
        C7546g gVar3 = (C7546g) cVar.instance;
        gVar3.f26113d = nuVar.f27730O;
        gVar3.f26110a |= 4;
        if (i2 != 0) {
            int a = C7545f.m22782a(i2);
            if (!(i2 == 5 || a == 0)) {
                cVar.copyOnWrite();
                C7546g gVar4 = (C7546g) cVar.instance;
                gVar4.f26114e = a;
                gVar4.f26110a |= 8;
            }
            cVar.copyOnWrite();
            C7546g gVar5 = (C7546g) cVar.instance;
            gVar5.f26110a |= 16;
            gVar5.f26115f = 0;
            if (i3 != 1) {
                cVar.copyOnWrite();
                C7546g gVar6 = (C7546g) cVar.instance;
                if (i3 != 0) {
                    gVar6.f26116g = i3;
                    gVar6.f26110a |= 256;
                } else {
                    throw null;
                }
            }
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 163;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C7546g gVar7 = (C7546g) cVar.build();
            gVar7.getClass();
            ufVar2.f164072F = gVar7;
            ufVar2.f164146b |= 256;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            return;
        }
        throw null;
    }
}
