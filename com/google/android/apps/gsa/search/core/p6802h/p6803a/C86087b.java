package com.google.android.apps.gsa.search.core.p6802h.p6803a;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.libraries.gcoreclient.p1809y.C21743b;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.search.core.h.a.b */
/* compiled from: PG */
final class C86087b implements C21743b {

    /* renamed from: a */
    final /* synthetic */ C86089d f232686a;

    public C86087b(C86089d dVar) {
        this.f232686a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo27013a(Object obj) {
        C86089d dVar = this.f232686a;
        int intValue = ((Integer) obj).intValue();
        C86337q b = dVar.f232688a.mo80076b();
        b.mo80070e("boot_count", intValue);
        b.apply();
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1137;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
