package com.google.android.apps.gsa.search.core.google.gaia;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60463qz;
import com.google.common.p4552o.C60470rb;
import com.google.common.p4552o.C60471rc;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.b */
/* compiled from: PG */
public final class C86016b {
    /* renamed from: a */
    public static final void m138319a(C60470rb rbVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 122;
        C60463qz qzVar = (C60463qz) C60471rc.f163658c.createBuilder();
        qzVar.copyOnWrite();
        C60471rc rcVar = (C60471rc) qzVar.instance;
        rcVar.f163661b = rbVar.f163657h;
        rcVar.f163660a |= 1;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C60471rc rcVar2 = (C60471rc) qzVar.build();
        rcVar2.getClass();
        ufVar2.f164068B = rcVar2;
        ufVar2.f164093a |= LinearLayoutManager.INVALID_OFFSET;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
