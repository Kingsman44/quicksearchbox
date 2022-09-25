package com.google.android.apps.gsa.staticplugins.bubble.p7591i;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88473w;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60567ur;
import com.google.common.p4552o.C60570uu;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.i.e */
/* compiled from: PG */
public final class C97042e {
    /* renamed from: a */
    public static void m160625a(int i, C60570uu uuVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        uuVar.getClass();
        ufVar2.f164172bZ = uuVar;
        ufVar2.f164254i |= 524288;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: b */
    public static int m160626b(C88473w wVar) {
        C88473w wVar2 = C88473w.UNKNOWN;
        int ordinal = wVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: c */
    public static void m160627c(C59743a aVar, int i, int i2) {
        int i3 = aVar.f161421ts;
        C60567ur urVar = (C60567ur) C60570uu.f164299i.createBuilder();
        urVar.copyOnWrite();
        C60570uu uuVar = (C60570uu) urVar.instance;
        uuVar.f164304d = i - 1;
        uuVar.f164301a |= 8;
        urVar.copyOnWrite();
        C60570uu uuVar2 = (C60570uu) urVar.instance;
        uuVar2.f164301a |= 128;
        uuVar2.f164308h = i2;
        m160625a(i3, (C60570uu) urVar.build());
    }

    /* renamed from: d */
    public static void m160628d(int i, int i2, int i3) {
        C60567ur urVar = (C60567ur) C60570uu.f164299i.createBuilder();
        urVar.copyOnWrite();
        C60570uu uuVar = (C60570uu) urVar.instance;
        uuVar.f164303c = i - 1;
        uuVar.f164301a |= 4;
        urVar.copyOnWrite();
        C60570uu uuVar2 = (C60570uu) urVar.instance;
        uuVar2.f164304d = i2 - 1;
        uuVar2.f164301a |= 8;
        urVar.copyOnWrite();
        C60570uu uuVar3 = (C60570uu) urVar.instance;
        uuVar3.f164301a |= 128;
        uuVar3.f164308h = i3;
        m160625a(1235, (C60570uu) urVar.build());
    }
}
