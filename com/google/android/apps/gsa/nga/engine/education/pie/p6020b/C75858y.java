package com.google.android.apps.gsa.nga.engine.education.pie.p6020b;

import com.google.android.apps.gsa.nga.engine.education.pie.C75866e;
import com.google.android.apps.gsa.nga.engine.education.pie.C75906g;
import com.google.android.apps.gsa.nga.engine.education.pie.C75909j;
import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75786o;
import com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75788q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.engine.p5913am.p5935p.C74946b;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80256k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80257l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.b.y */
/* compiled from: PG */
public final class C75858y implements C75786o, C75155d, C75909j {

    /* renamed from: a */
    private static final C58974d f210489a = C58974d.m91136j();

    /* renamed from: b */
    private final C68214a f210490b;

    /* renamed from: c */
    private final C75050a f210491c;

    /* renamed from: d */
    private final C75906g f210492d;

    /* renamed from: e */
    private final C74946b f210493e;

    /* renamed from: f */
    private final C75158f f210494f;

    /* renamed from: g */
    private final C75910k f210495g;

    /* renamed from: h */
    private boolean f210496h = false;

    /* renamed from: i */
    private boolean f210497i = false;

    public C75858y(C68214a aVar, C75050a aVar2, C75906g gVar, C74946b bVar, C75158f fVar, C75910k kVar) {
        this.f210490b = aVar;
        this.f210491c = aVar2;
        this.f210492d = gVar;
        this.f210493e = bVar;
        this.f210494f = fVar;
        this.f210495g = kVar;
    }

    /* renamed from: g */
    private final void m122284g(C80244ck ckVar) {
        m122285h(!ckVar.equals(C80244ck.f220137i));
        C80256k kVar = (C80256k) C80257l.f220192c.createBuilder();
        kVar.copyOnWrite();
        C80257l lVar = (C80257l) kVar.instance;
        ckVar.getClass();
        lVar.f220195b = ckVar;
        lVar.f220194a = 1;
        ((C75866e) this.f210490b.mo27525b()).mo71903a((C80257l) kVar.build());
    }

    /* renamed from: h */
    private final synchronized void m122285h(boolean z) {
        if (z != this.f210496h) {
            this.f210496h = z;
            if (z) {
                this.f210494f.mo71506b(this);
                this.f210495g.mo71909a(this);
                return;
            }
            this.f210494f.mo71507c(this);
            this.f210495g.mo71911c(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo71137a(C75077bo boVar, C75077bo boVar2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo71138b(com.google.android.apps.gsa.nga.engine.av.bl r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.google.android.apps.gsa.nga.engine.av.bl r0 = com.google.android.apps.gsa.nga.engine.av.bl.a     // Catch:{ all -> 0x0023 }
            if (r3 != r0) goto L_0x0021
            boolean r3 = r2.f210496h     // Catch:{ all -> 0x0023 }
            if (r3 == 0) goto L_0x0021
            boolean r3 = r2.f210497i     // Catch:{ all -> 0x0023 }
            if (r3 != 0) goto L_0x0021
            com.google.common.f.a.d r3 = f210489a     // Catch:{ all -> 0x0023 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = "Hiding Pie UI due to assistant invocation"
            r1 = 3358(0xd1e, float:4.706E-42)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56372aa(r1)).mo56386p(r0)     // Catch:{ all -> 0x0023 }
            com.google.android.apps.gsa.nga.shared.aa.d.a.ck r3 = com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck.f220137i     // Catch:{ all -> 0x0023 }
            r2.m122284g(r3)     // Catch:{ all -> 0x0023 }
            monitor-exit(r2)
            return
        L_0x0021:
            monitor-exit(r2)
            return
        L_0x0023:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75858y.mo71138b(com.google.android.apps.gsa.nga.engine.av.bl):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo71916c(com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.f220049a     // Catch:{ all -> 0x0028 }
            r1 = 1
            if (r0 != r1) goto L_0x0010
            java.lang.Object r0 = r3.f220050b     // Catch:{ all -> 0x0028 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0028 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0020
        L_0x0010:
            int r0 = r3.f220049a     // Catch:{ all -> 0x0028 }
            r1 = 9
            if (r0 != r1) goto L_0x0026
            java.lang.Object r3 = r3.f220050b     // Catch:{ all -> 0x0028 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0026
        L_0x0020:
            r3 = 0
            r2.m122285h(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)
            return
        L_0x0026:
            monitor-exit(r2)
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75858y.mo71916c(com.google.android.apps.gsa.nga.shared.aa.d.a.ax):void");
    }

    /* renamed from: d */
    public final synchronized void mo71889d(C75788q qVar, int i, C80265t tVar) {
        this.f210497i = false;
        int d = qVar.mo71888d();
        int i2 = d - 1;
        if (d == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 == 1) {
                m122284g(C80244ck.f220137i);
            }
        } else if (!((C80201av) this.f210492d.mo71922a().mo76657c()).equals(C80201av.PIE_ELIGIBLE)) {
            ((C58970a) ((C58970a) f210489a.mo56225c()).mo56372aa(3361)).mo56386p("Pie is not eligible, cannot show failure screen");
            m122284g(C80244ck.f220137i);
        } else {
            C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
            C80246cm cmVar = C80246cm.FAILURE;
            cjVar.copyOnWrite();
            C80244ck ckVar = (C80244ck) cjVar.instance;
            ckVar.f220140b = cmVar.f220162n;
            ckVar.f220139a = 1 | ckVar.f220139a;
            m122284g((C80244ck) cjVar.build());
        }
    }

    /* renamed from: e */
    public final synchronized void mo71890e(C75788q qVar, int i, C75891l lVar) {
        this.f210497i = true;
        if (i == 0) {
            this.f210493e.mo71313c();
        }
        m122284g(lVar.mo71937d());
    }

    /* renamed from: f */
    public final synchronized void mo71891f(C75788q qVar) {
        this.f210497i = false;
        if (this.f210491c.mo71417a().mo71469o()) {
            m122284g(C80244ck.f220137i);
        } else {
            m122284g(qVar.mo71873b());
        }
    }
}
