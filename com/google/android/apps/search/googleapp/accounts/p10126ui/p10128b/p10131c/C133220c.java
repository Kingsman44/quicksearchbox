package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c;

import com.google.android.libraries.search.p3005i.C38469m;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.c.c */
/* compiled from: PG */
public final class C133220c {

    /* renamed from: a */
    private final boolean f363104a;

    /* renamed from: b */
    private final AccountId f363105b;

    /* renamed from: c */
    private final C46175b f363106c;

    /* renamed from: d */
    private final C38469m f363107d;

    /* renamed from: e */
    private final C71422aw f363108e;

    public C133220c(boolean z, AccountId accountId, C46175b bVar, C38469m mVar, C71422aw awVar) {
        C69664n.m101061g(accountId, "accountId");
        C69664n.m101061g(bVar, "accountDataService");
        C69664n.m101061g(mVar, "gellerAccessor");
        C69664n.m101061g(awVar, "backgroundScope");
        this.f363104a = z;
        this.f363105b = accountId;
        this.f363106c = bVar;
        this.f363107d = mVar;
        this.f363108e = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo111027a() {
        return C71663i.m104692e(this.f363108e, (C71424ay) null, new C133219b(this, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111028b(p5462h.p5466c.C69577g r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c.C133218a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.googleapp.accounts.ui.b.c.a r0 = (com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c.C133218a) r0
            int r1 = r0.f363101d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f363101d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.googleapp.accounts.ui.b.c.a r0 = new com.google.android.apps.search.googleapp.accounts.ui.b.c.a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f363099b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f363101d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0039
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r9)
            goto L_0x0091
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0033:
            java.lang.Object r2 = r0.f363098a
            p5462h.C69714l.m101134b(r9)
            goto L_0x005e
        L_0x0039:
            p5462h.C69714l.m101134b(r9)
            boolean r9 = r8.f363104a
            if (r9 != 0) goto L_0x0045
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0045:
            com.google.apps.tiktok.account.data.b r9 = r8.f363106c
            com.google.apps.tiktok.account.AccountId r2 = r8.f363105b
            com.google.common.util.concurrent.cx r9 = r9.mo50246c(r2)
            java.lang.String r2 = "accountDataService.getAccount(accountId)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f363098a = r8
            r0.f363101d = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r2 = r8
        L_0x005e:
            com.google.apps.tiktok.account.data.a r9 = (com.google.apps.tiktok.account.data.C46108a) r9
            com.google.apps.tiktok.account.data.j r9 = r9.mo50210b()
            java.lang.String r9 = r9.f121165j
            java.lang.String r4 = "google"
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r4)
            if (r9 != 0) goto L_0x0073
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x0073:
            com.google.android.apps.search.googleapp.accounts.ui.b.c.c r2 = (com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c.C133220c) r2
            com.google.android.libraries.search.i.m r9 = r2.f363107d
            com.google.protos.p.b.ak r2 = com.google.protos.p5129p.p5131b.C65753ak.SEARCH_CONSOLE_INSIGHTS
            com.google.protos.ap.a.a.ac r4 = com.google.protos.p4874ap.p4875a.p4876a.C63662ac.f172144a
            com.google.protos.p.b.cf r6 = com.google.protos.p5129p.p5131b.C65802cf.f178865b
            r7 = 0
            com.google.common.util.concurrent.cx r9 = r9.mo41431b(r2, r7, r4, r6)
            java.lang.String r2 = "gellerAccessor\n        .…faultInstance()\n        )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)
            r0.f363098a = r7
            r0.f363101d = r3
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x00a7
        L_0x0091:
            com.google.common.b.gu r9 = (com.google.common.p4522b.C58485gu) r9
            java.lang.String r0 = "searchConsoleInsightsElement"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r0)
            java.lang.Object r9 = p5462h.p5463a.C69540x.m100821C(r9)
            com.google.protos.p.b.cf r9 = (com.google.protos.p5129p.p5131b.C65802cf) r9
            if (r9 == 0) goto L_0x00a2
            boolean r5 = r9.f178867a
        L_0x00a2:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            return r9
        L_0x00a7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10131c.C133220c.mo111028b(h.c.g):java.lang.Object");
    }
}
