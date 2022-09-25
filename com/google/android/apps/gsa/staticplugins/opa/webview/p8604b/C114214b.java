package com.google.android.apps.gsa.staticplugins.opa.webview.p8604b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4522b.C58528ij;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.b.b */
/* compiled from: PG */
public final class C114214b {

    /* renamed from: a */
    public static final C58528ij f316708a = C58528ij.m90011K("wf", "tch");

    /* renamed from: b */
    public final C68214a f316709b;

    /* renamed from: c */
    public final Query f316710c;

    /* renamed from: d */
    private final C91097g f316711d;

    /* renamed from: e */
    private final Context f316712e;

    /* renamed from: f */
    private final C68214a f316713f;

    public C114214b(C91097g gVar, Context context, C68214a aVar, Query query, C68214a aVar2) {
        this.f316712e = context;
        this.f316711d = gVar;
        this.f316709b = aVar;
        this.f316710c = query;
        this.f316713f = aVar2;
    }

    /* renamed from: b */
    private final void m189480b(Query query, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.opa.gwsrequestparams.IS_WEBVIEW_REFINEMENT", true);
        bundle.putString("com.google.opa.webview.CLICKED_SEARCH_URL", str);
        bundle.putInt("android.opa.extra.TRIGGERED_BY", 76);
        if (str2 != null) {
            query = query.mo84344bc(str2);
        }
        this.f316711d.mo65089a(new Intent("android.intent.action.MAIN").putExtra("com.google.opa.webview.REFINEMENT_QUERY", query.mo84307as(bundle)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        r0 = (com.google.android.apps.gsa.search.core.google.C85932cz) r0.mo56107c();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo101264a(com.google.android.apps.gsa.shared.search.Query r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r6.mo84403cj()
            r1 = 1
            if (r0 == 0) goto L_0x0066
            dagger.a r0 = r5.f316709b
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.google.cw r0 = (com.google.android.apps.gsa.search.core.google.C85929cw) r0
            com.google.common.base.ax r0 = r0.mo79575p(r7)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r0 = r0.mo56107c()
            com.google.android.apps.gsa.search.core.google.cz r0 = (com.google.android.apps.gsa.search.core.google.C85932cz) r0
            com.google.android.apps.gsa.shared.search.l r2 = r0.mo79585b()
            if (r2 == 0) goto L_0x0066
            java.util.Map r3 = r2.mo84517h()
            java.lang.String r4 = "gsas"
            boolean r3 = r3.containsKey(r4)
            if (r3 == 0) goto L_0x0032
            goto L_0x0066
        L_0x0032:
            java.lang.String r3 = r2.mo84512d()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0066
            java.lang.String r3 = r2.mo84510b()
            java.lang.String r4 = "web"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0066
            int r0 = r0.mo79584a()
            if (r0 == r1) goto L_0x005e
            r3 = 2
            if (r0 == r3) goto L_0x0052
            goto L_0x0066
        L_0x0052:
            java.util.Map r0 = r2.mo84517h()
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84267aD(r0)
            r5.m189480b(r6, r7, r8)
            return r1
        L_0x005e:
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84266aC(r7, r2)
            r5.m189480b(r6, r7, r8)
            return r1
        L_0x0066:
            dagger.a r6 = r5.f316709b
            java.lang.Object r6 = r6.mo27525b()
            com.google.android.apps.gsa.search.core.google.cw r6 = (com.google.android.apps.gsa.search.core.google.C85929cw) r6
            com.google.android.apps.gsa.shared.search.Query r8 = r5.f316710c
            com.google.android.apps.gsa.shared.search.Query r8 = r8.mo84493u()
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo79574o(r8, r7)
            if (r6 == 0) goto L_0x00aa
            dagger.a r7 = r5.f316713f
            java.lang.Object r7 = r7.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r7 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r7
            com.google.android.apps.gsa.shared.logger.b.f r8 = new com.google.android.apps.gsa.shared.logger.b.f
            r8.<init>()
            com.google.android.apps.gsa.shared.logger.b.ae r0 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.OPA_SRP_RESULT_CLICK
            r8.f246201a = r0
            com.google.android.apps.gsa.shared.logger.b.g r8 = r8.mo83699a()
            r7.mo74236a(r8)
            android.content.Context r7 = r5.f316712e
            com.google.android.apps.gsa.shared.search.Query r6 = r6.mo84277aN()
            android.content.Intent r6 = com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145446d(r7, r6)
            com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a.m145452j(r6)
            java.lang.String r7 = "opa_open_search_url_from_valyrian_srp"
            r6.putExtra(r7, r1)
            com.google.android.apps.gsa.shared.util.t.g r7 = r5.f316711d
            r7.mo65089a(r6)
            return r1
        L_0x00aa:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.webview.p8604b.C114214b.mo101264a(com.google.android.apps.gsa.shared.search.Query, java.lang.String, java.lang.String):boolean");
    }
}
