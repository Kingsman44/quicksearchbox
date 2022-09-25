package com.google.android.apps.gsa.staticplugins.p7554bs.p7558d;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6988al.C89193a;
import com.google.android.libraries.lens.view.p2162s.C27683a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.aar;
import com.google.common.p4552o.aas;
import com.google.common.p4552o.acc;
import com.google.common.p4552o.acf;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.d.c */
/* compiled from: PG */
public final class C96719c implements C89193a {

    /* renamed from: a */
    private final C68214a f270552a;

    public C96719c(C68214a aVar) {
        this.f270552a = aVar;
    }

    /* renamed from: a */
    public final String mo19980a(String str, String str2) {
        int c = ((C27683a) this.f270552a.mo27525b()).mo33176c(str2);
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1242;
        acc acc = (acc) acf.f158284h.createBuilder();
        int i = c - 2;
        acc.copyOnWrite();
        acf acf = (acf) acc.instance;
        acf.f158286a |= 2;
        acf.f158288c = i;
        if (str2 != null) {
            acc.copyOnWrite();
            acf acf2 = (acf) acc.instance;
            acf2.f158286a |= 1;
            acf2.f158287b = str2;
        }
        aar aar = (aar) aas.f158145p.createBuilder();
        aar.copyOnWrite();
        aas aas = (aas) aar.instance;
        acf acf3 = (acf) acc.build();
        acf3.getClass();
        aas.f158151e = acf3;
        aas.f158147a |= 256;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        aas aas2 = (aas) aar.build();
        aas2.getClass();
        ufVar2.f164197by = aas2;
        ufVar2.f164253h |= 8;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        return Integer.toString(i);
    }
}
