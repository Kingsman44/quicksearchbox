package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c.p8086a.C103651a;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.p */
/* compiled from: PG */
public final class C103734p implements C103651a {

    /* renamed from: a */
    private static final C58974d f288889a = C58974d.m91136j();

    /* renamed from: b */
    private final C31012n f288890b;

    /* renamed from: c */
    private final C86054o f288891c;

    public C103734p(C86054o oVar, C31012n nVar) {
        this.f288891c = oVar;
        this.f288890b = nVar;
    }

    /* renamed from: a */
    public final C60870cx mo93582a(C80136bn bnVar) {
        if (bnVar.f219917a == 28) {
            String F = this.f288891c.mo79659F();
            if (F == null) {
                ((C58970a) ((C58970a) f288889a.mo56226d()).mo56372aa(21619)).mo56386p("Account name is null. Return empty.");
                return C60856cj.m92900i(C80275dd.f220288c);
            }
            C60870cx b = this.f288890b.mo36638b(F);
            C103733o oVar = C103733o.f288888a;
            return C60922j.m93044g(b, C47810es.m84963c(oVar), C60826bg.f164896a);
        }
        ((C58970a) ((C58970a) f288889a.mo56226d()).mo56372aa(21620)).mo56386p("Invalid request. Return empty.");
        return C60856cj.m92900i(C80275dd.f220288c);
    }
}
