package com.google.android.apps.gsa.shared.logger;

import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60500se;
import com.google.common.p4552o.C60506sk;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.shared.logger.b */
/* compiled from: PG */
public final class C89839b {
    /* renamed from: a */
    public static void m146269a(boolean z, int i, int i2) {
        C60500se seVar = (C60500se) C60506sk.f163796h.createBuilder();
        seVar.copyOnWrite();
        C60506sk skVar = (C60506sk) seVar.instance;
        skVar.f163798a |= 1;
        skVar.f163799b = i;
        seVar.copyOnWrite();
        C60506sk skVar2 = (C60506sk) seVar.instance;
        skVar2.f163802e = 2;
        skVar2.f163798a |= 4;
        if (!z && i2 != 0) {
            seVar.copyOnWrite();
            C60506sk skVar3 = (C60506sk) seVar.instance;
            skVar3.f163800c = i2 - 1;
            skVar3.f163798a |= 2;
        }
        seVar.copyOnWrite();
        C60506sk skVar4 = (C60506sk) seVar.instance;
        skVar4.f163804g = 1;
        skVar4.f163798a |= 16;
        int i3 = true != z ? 940 : 939;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a = 2 | ufVar.f164093a;
        ufVar.f164258m = i3;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60506sk skVar5 = (C60506sk) seVar.build();
        skVar5.getClass();
        ufVar2.f164198bz = skVar5;
        ufVar2.f164253h |= 16;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
