package com.google.android.apps.gsa.staticplugins.p7922eo;

import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.eo.t */
/* compiled from: PG */
public final /* synthetic */ class C100623t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ Query f281385a;

    /* renamed from: b */
    public final /* synthetic */ C85422c f281386b;

    public /* synthetic */ C100623t(Query query, C85422c cVar) {
        this.f281385a = query;
        this.f281386b = cVar;
    }

    public final void run() {
        Query query = this.f281385a;
        C85422c cVar = this.f281386b;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 5;
        String b = C39191a.m68623b(query.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        cVar.mo78935a(query);
    }
}
