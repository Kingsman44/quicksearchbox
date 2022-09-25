package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60525tc;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60577va;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.at */
/* compiled from: PG */
final class C93734at extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Query f261597a;

    /* renamed from: b */
    final /* synthetic */ C58833ax f261598b;

    /* renamed from: c */
    final /* synthetic */ C58833ax f261599c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93734at(Query query, C58833ax axVar, C58833ax axVar2) {
        super("LocationLogger", 2, 0);
        this.f261597a = query;
        this.f261598b = axVar;
        this.f261599c = axVar2;
    }

    public final void run() {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 637;
        String b = C39191a.m68623b(this.f261597a.f252749G);
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        b.getClass();
        ufVar2.f164093a |= 4;
        ufVar2.f164259n = b;
        if (this.f261598b.mo56113h()) {
            C60577va vaVar = (C60577va) this.f261598b.mo56107c();
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            vaVar.getClass();
            ufVar3.f164180bh = vaVar;
            ufVar3.f164252g |= 128;
        }
        if (this.f261599c.mo56113h()) {
            C60525tc tcVar = (C60525tc) this.f261599c.mo56107c();
            tzVar.copyOnWrite();
            C60555uf ufVar4 = (C60555uf) tzVar.instance;
            tcVar.getClass();
            ufVar4.f164107aN = tcVar;
            ufVar4.f164251f |= 4;
        }
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
