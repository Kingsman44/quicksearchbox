package com.google.android.apps.gsa.nga.engine.understanding.p6239f;

import com.google.android.apps.gsa.nga.engine.am.h.bf;
import com.google.android.apps.gsa.nga.engine.p6043m.C76247b;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protos.p4850an.p4855d.p4862g.C63565b;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.f.p */
/* compiled from: PG */
final class C79129p extends C79126m {

    /* renamed from: b */
    public static final C58974d f217527b = C58974d.m91136j();

    /* renamed from: c */
    private final bf f217528c;

    public C79129p(bf bfVar, C79851ai aiVar, C22871g gVar) {
        super(aiVar, gVar);
        this.f217528c = bfVar;
    }

    /* renamed from: a */
    public final boolean mo73805a(C61748j jVar, C80515d dVar) {
        C63565b bVar;
        if (jVar.f166802a != 9) {
            return false;
        }
        if (dVar == C80515d.FUZZY_MATCHER) {
            return true;
        }
        if (jVar.f166802a == 9) {
            bVar = (C63565b) jVar.f166803b;
        } else {
            bVar = C63565b.f171933j;
        }
        return bVar.f171941g.size() == 0;
    }

    /* renamed from: b */
    public final C60870cx mo73806b(C61748j jVar) {
        C63565b bVar;
        if (jVar.f166802a == 9) {
            bVar = (C63565b) jVar.f166803b;
        } else {
            bVar = C63565b.f171933j;
        }
        String str = bVar.f171936b;
        return this.f217522a.mo28205e(this.f217522a.mo28209i(this.f217528c.e(str), "[NGA] PersonResolver.resolveValue", new C79127n(str, jVar)), "[NGA] PersonResolver.resolveValue.catch", C76247b.class, C79128o.f217526a);
    }
}
