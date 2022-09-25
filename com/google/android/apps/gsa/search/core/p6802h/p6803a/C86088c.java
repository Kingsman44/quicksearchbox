package com.google.android.apps.gsa.search.core.p6802h.p6803a;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gcoreclient.p1809y.C21739a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.h.a.c */
/* compiled from: PG */
final class C86088c implements C21739a {

    /* renamed from: a */
    final /* synthetic */ C86089d f232687a;

    public C86088c(C86089d dVar) {
        this.f232687a = dVar;
    }

    /* renamed from: a */
    public final void mo27014a(Exception exc) {
        C86337q b = this.f232687a.f232688a.mo80076b();
        b.mo80075j("boot_count");
        b.apply();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1141;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
