package com.google.android.apps.gsa.search.core.p6816p;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.p.az */
/* compiled from: PG */
public final class C86216az extends C68247h {

    /* renamed from: a */
    private final C68283d f232984a;

    /* renamed from: c */
    private final C68283d f232985c;

    /* renamed from: d */
    private final C68283d f232986d;

    /* renamed from: e */
    private final C68283d f232987e;

    public C86216az(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C86216az.class), aVar);
        this.f232984a = C68236af.m98549d(dVar);
        this.f232985c = C68236af.m98549d(dVar2);
        this.f232986d = C68236af.m98549d(dVar3);
        this.f232987e = C68236af.m98549d(dVar4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if (r9 != false) goto L_0x00ae;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.C60870cx mo20481a(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            com.google.android.libraries.f.a r2 = (com.google.android.libraries.p1730f.C21370a) r2
            r3 = 1
            java.lang.Object r4 = r0.get(r3)
            com.google.android.apps.gsa.shared.search.Query r4 = (com.google.android.apps.gsa.shared.search.Query) r4
            r5 = 2
            java.lang.Object r5 = r0.get(r5)
            com.google.android.apps.gsa.search.core.p.bt r5 = (com.google.android.apps.gsa.search.core.p6816p.C86237bt) r5
            r6 = 3
            java.lang.Object r0 = r0.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            r0.longValue()
            boolean r0 = r4.mo84377cJ()
            if (r0 != 0) goto L_0x00f8
            long r6 = r2.mo26871c()
            r0 = 0
            r2 = r0
        L_0x002f:
            java.util.Queue r8 = r5.f233069e
            java.lang.Object r8 = r8.poll()
            com.google.android.apps.gsa.search.core.p.bs r8 = (com.google.android.apps.gsa.search.core.p6816p.C86236bs) r8
            if (r8 == 0) goto L_0x00ea
            com.google.android.apps.gsa.search.core.p.bd r9 = r8.f233063a
            com.google.android.apps.gsa.search.core.p.bn r10 = r9.mo79890n()
            long r10 = r10.f233056e
            com.google.common.util.concurrent.cx r9 = r9.mo79870F()
            java.lang.Object r9 = com.google.android.apps.gsa.shared.util.p7159c.C90918bo.m148516c(r9, r0)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0059
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MINUTES
            int r9 = r9.intValue()
            long r13 = (long) r9
            long r12 = r12.toMillis(r13)
            goto L_0x005c
        L_0x0059:
            r12 = 60000(0xea60, double:2.9644E-319)
        L_0x005c:
            com.google.android.apps.gsa.search.core.p.bd r9 = r8.f233063a
            boolean r9 = r9.mo79886V()
            if (r9 != 0) goto L_0x0067
        L_0x0064:
            r9 = 0
            goto L_0x00db
        L_0x0067:
            long r10 = r6 - r10
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 <= 0) goto L_0x006e
            goto L_0x0064
        L_0x006e:
            com.google.android.apps.gsa.search.core.p.bd r9 = r8.f233063a
            com.google.common.util.concurrent.cx r9 = r9.mo79865A()
            com.google.android.apps.gsa.shared.search.Query r10 = com.google.android.apps.gsa.shared.search.Query.f252741b
            java.lang.Object r9 = com.google.android.apps.gsa.shared.util.p7159c.C90918bo.m148516c(r9, r10)
            com.google.android.apps.gsa.shared.search.Query r9 = (com.google.android.apps.gsa.shared.search.Query) r9
            long r10 = r4.f252780s
            long r12 = r9.f252780s
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0085
            goto L_0x00ae
        L_0x0085:
            com.google.android.apps.gsa.shared.search.QueryTriggerType r10 = r9.f252767f
            com.google.android.apps.gsa.shared.search.QueryTriggerType r11 = com.google.android.apps.gsa.shared.search.QueryTriggerType.PREFETCH
            java.lang.String r12 = r4.mo84346be()
            java.lang.String r13 = r9.mo84346be()
            boolean r12 = r12.equals(r13)
            boolean r13 = r4.mo84426dG()
            boolean r14 = r9.mo84426dG()
            java.lang.String r9 = r9.f252770i
            java.lang.String r15 = r4.f252770i
            boolean r9 = r9.equals(r15)
            if (r10 != r11) goto L_0x0064
            if (r12 == 0) goto L_0x0064
            if (r13 != r14) goto L_0x0064
            if (r9 != 0) goto L_0x00ae
            goto L_0x0064
        L_0x00ae:
            if (r2 == 0) goto L_0x00d9
            com.google.android.apps.gsa.search.core.p.bd r9 = r2.f233063a
            com.google.android.apps.gsa.search.core.p.bn r9 = r9.mo79890n()
            long r9 = r9.f233056e
            com.google.android.apps.gsa.search.core.p.bd r11 = r8.f233063a
            com.google.android.apps.gsa.search.core.p.bn r11 = r11.mo79890n()
            long r11 = r11.f233056e
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 >= 0) goto L_0x00ca
            r2.mo79903a()
            r2 = r8
            r9 = 1
            goto L_0x00cb
        L_0x00ca:
            r9 = 0
        L_0x00cb:
            com.google.common.f.e r10 = com.google.android.apps.gsa.search.core.p6816p.C86237bt.f233065a
            com.google.common.f.x r10 = r10.mo56226d()
            java.lang.String r11 = "Found another page matching the query. Using the latest one."
            r12 = 7787(0x1e6b, float:1.0912E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            goto L_0x00db
        L_0x00d9:
            r2 = r8
            r9 = 1
        L_0x00db:
            if (r9 != 0) goto L_0x002f
            com.google.android.apps.gsa.search.core.p.bd r9 = r8.f233063a
            boolean r9 = r9.mo79881Q()
            if (r9 != 0) goto L_0x002f
            r8.mo79903a()
            goto L_0x002f
        L_0x00ea:
            if (r2 == 0) goto L_0x00f3
            com.google.android.apps.gsa.search.core.p.bd r0 = r2.f233063a
            r5.mo79904a(r0)
            com.google.android.apps.gsa.search.core.p.bd r0 = r2.f233063a
        L_0x00f3:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90833j(r0)
            goto L_0x00fa
        L_0x00f8:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x00fa:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6816p.C86216az.mo20481a(java.lang.Object):com.google.common.util.concurrent.cx");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f232984a.mo60297gq(), this.f232985c.mo60297gq(), this.f232986d.mo60297gq(), this.f232987e.mo60297gq());
    }
}
