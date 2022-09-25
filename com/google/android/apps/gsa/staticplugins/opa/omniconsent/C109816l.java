package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.gcoreclient.p1788q.p1791b.C21627a;
import com.google.assistant.p3861at.ael;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.l */
/* compiled from: PG */
public final class C109816l {

    /* renamed from: a */
    private static final C59071e f306031a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.omniconsent.l");

    /* renamed from: b */
    private final C83893b f306032b;

    /* renamed from: c */
    private final C109815k f306033c;

    /* renamed from: d */
    private final C21627a f306034d;

    /* renamed from: e */
    private final C86124t f306035e;

    public C109816l(C83893b bVar, C109815k kVar, C21627a aVar, C86124t tVar) {
        this.f306032b = bVar;
        this.f306033c = kVar;
        this.f306034d = aVar;
        this.f306035e = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = com.google.assistant.p3861at.aek.m85736a(r1.f129108a);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m182898b(com.google.assistant.p3861at.ael r1) {
        /*
            if (r1 == 0) goto L_0x0010
            int r1 = r1.f129108a
            int r1 = com.google.assistant.p3861at.aek.m85736a(r1)
            if (r1 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            r0 = 3
            if (r1 != r0) goto L_0x0010
            r1 = 1
            return r1
        L_0x0010:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109816l.m182898b(com.google.assistant.at.ael):boolean");
    }

    /* renamed from: c */
    private static boolean m182899c(ael... aelArr) {
        for (ael b : aelArr) {
            if (m182898b(b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (r1 == 15) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00bd, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0101, code lost:
        if (r9 == 15) goto L_0x00bb;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo98171a(com.google.assistant.p3861at.aem r9) {
        /*
            r8 = this;
            com.google.android.apps.gsa.shared.util.p7158b.C90748e.m148224b()
            r0 = 4
            com.google.assistant.at.ael[] r0 = new com.google.assistant.p3861at.ael[r0]
            com.google.assistant.at.ael r1 = r9.f129115d
            if (r1 != 0) goto L_0x000c
            com.google.assistant.at.ael r1 = com.google.assistant.p3861at.ael.f129106b
        L_0x000c:
            r2 = 0
            r0[r2] = r1
            com.google.assistant.at.ael r1 = r9.f129114c
            if (r1 != 0) goto L_0x0015
            com.google.assistant.at.ael r1 = com.google.assistant.p3861at.ael.f129106b
        L_0x0015:
            r3 = 1
            r0[r3] = r1
            com.google.assistant.at.ael r1 = r9.f129112a
            if (r1 != 0) goto L_0x001e
            com.google.assistant.at.ael r1 = com.google.assistant.p3861at.ael.f129106b
        L_0x001e:
            r4 = 2
            r0[r4] = r1
            com.google.assistant.at.ael r1 = r9.f129113b
            if (r1 != 0) goto L_0x0027
            com.google.assistant.at.ael r1 = com.google.assistant.p3861at.ael.f129106b
        L_0x0027:
            r5 = 3
            r0[r5] = r1
            boolean r0 = m182899c(r0)
            if (r0 != 0) goto L_0x003e
            com.google.common.f.e r9 = f306031a
            com.google.common.f.x r9 = r9.mo56224b()
            java.lang.String r0 = "update: nothing to update"
            r1 = 25249(0x62a1, float:3.5381E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r1)).mo56386p(r0)
            return r2
        L_0x003e:
            com.google.android.apps.gsa.staticplugins.opa.omniconsent.k r0 = r8.f306033c
            com.google.android.libraries.gcoreclient.h.a.a.b r0 = r0.mo98170a()
            com.google.android.libraries.gcoreclient.h.a.b.c r1 = r0.mo26987a()
            com.google.android.gms.common.ConnectionResult r6 = r1.f59933a
            boolean r6 = r6.mo119068b()
            if (r6 == 0) goto L_0x010a
            com.google.android.apps.gsa.opaonboarding.b r1 = r8.f306032b
            com.google.common.base.ax r1 = r1.mo77278a()
            java.lang.Object r1 = r1.mo56107c()
            android.accounts.Account r1 = (android.accounts.Account) r1
            com.google.assistant.at.ael[] r5 = new com.google.assistant.p3861at.ael[r4]
            com.google.assistant.at.ael r6 = r9.f129112a
            if (r6 != 0) goto L_0x0064
            com.google.assistant.at.ael r6 = com.google.assistant.p3861at.ael.f129106b
        L_0x0064:
            r5[r2] = r6
            com.google.assistant.at.ael r6 = r9.f129113b
            if (r6 != 0) goto L_0x006c
            com.google.assistant.at.ael r6 = com.google.assistant.p3861at.ael.f129106b
        L_0x006c:
            r5[r3] = r6
            boolean r5 = m182899c(r5)
            if (r5 != 0) goto L_0x0076
            r1 = 0
            goto L_0x00b5
        L_0x0076:
            com.google.android.gms.lockbox.e r5 = new com.google.android.gms.lockbox.e
            r5.<init>()
            com.google.assistant.at.ael r6 = r9.f129112a
            if (r6 != 0) goto L_0x0081
            com.google.assistant.at.ael r6 = com.google.assistant.p3861at.ael.f129106b
        L_0x0081:
            boolean r6 = m182898b(r6)
            if (r6 == 0) goto L_0x008a
            r5.mo120483a(r3)
        L_0x008a:
            com.google.assistant.at.ael r6 = r9.f129113b
            if (r6 != 0) goto L_0x0090
            com.google.assistant.at.ael r6 = com.google.assistant.p3861at.ael.f129106b
        L_0x0090:
            boolean r6 = m182898b(r6)
            if (r6 == 0) goto L_0x0099
            r5.mo120484b(r3)
        L_0x0099:
            com.google.android.apps.gsa.search.core.i.t r6 = r8.f306035e
            com.google.android.apps.gsa.shared.m.f r7 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247513ia
            long r6 = r6.mo79743a(r7)
            com.google.android.libraries.gcoreclient.r.a.d r5 = com.google.android.libraries.gcoreclient.p1792r.p1793a.C21631c.m40753a(r5)
            com.google.android.libraries.gcoreclient.h.a.b.g r1 = com.google.android.libraries.gcoreclient.p1792r.p1793a.C21630b.m40752b(r0, r1, r5)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gcoreclient.h.a.g r1 = r1.mo26995b(r6, r5)
            com.google.android.libraries.gcoreclient.h.a.h r1 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h) r1
            int r1 = r1.mo26998a()
        L_0x00b5:
            r5 = 15
            if (r1 == 0) goto L_0x00bf
            if (r1 != r5) goto L_0x00bd
        L_0x00bb:
            r2 = 2
            goto L_0x0104
        L_0x00bd:
            r2 = 1
            goto L_0x0104
        L_0x00bf:
            com.google.android.apps.gsa.opaonboarding.b r1 = r8.f306032b
            com.google.common.base.ax r1 = r1.mo77278a()
            java.lang.Object r1 = r1.mo56107c()
            android.accounts.Account r1 = (android.accounts.Account) r1
            com.google.assistant.at.ael[] r6 = new com.google.assistant.p3861at.ael[r4]
            com.google.assistant.at.ael r7 = r9.f129114c
            if (r7 != 0) goto L_0x00d3
            com.google.assistant.at.ael r7 = com.google.assistant.p3861at.ael.f129106b
        L_0x00d3:
            r6[r2] = r7
            com.google.assistant.at.ael r9 = r9.f129115d
            if (r9 != 0) goto L_0x00db
            com.google.assistant.at.ael r9 = com.google.assistant.p3861at.ael.f129106b
        L_0x00db:
            r6[r3] = r9
            boolean r9 = m182899c(r6)
            if (r9 != 0) goto L_0x00e5
            r9 = 0
            goto L_0x00ff
        L_0x00e5:
            com.google.android.apps.gsa.search.core.i.t r9 = r8.f306035e
            com.google.android.apps.gsa.shared.m.f r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247513ia
            long r6 = r9.mo79743a(r6)
            com.google.android.libraries.gcoreclient.q.b.a r9 = r8.f306034d
            com.google.android.libraries.gcoreclient.h.a.b.g r9 = r9.mo27022a(r0, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.gcoreclient.h.a.g r9 = r9.mo26995b(r6, r1)
            com.google.android.libraries.gcoreclient.h.a.h r9 = (com.google.android.libraries.gcoreclient.p1763h.p1764a.C21551h) r9
            int r9 = r9.mo26998a()
        L_0x00ff:
            if (r9 == 0) goto L_0x0104
            if (r9 != r5) goto L_0x00bd
            goto L_0x00bb
        L_0x0104:
            com.google.android.gms.common.api.w r9 = r0.f59932a
            r9.mo119132g()
            return r2
        L_0x010a:
            com.google.common.f.e r9 = f306031a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            r0 = 25248(0x62a0, float:3.538E-41)
            com.google.common.f.x r9 = r9.mo56372aa(r0)
            com.google.common.f.c r9 = (com.google.common.p4526f.C59052c) r9
            com.google.android.gms.common.ConnectionResult r0 = r1.f59933a
            int r0 = r0.f389574c
            java.lang.String r1 = "connectAndFetch: connection error = %d"
            r9.mo56387q(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109816l.mo98171a(com.google.assistant.at.aem):int");
    }
}
