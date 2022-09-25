package com.google.android.apps.gsa.search.core.p6502ae.p6503a;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89203h;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89204i;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89205j;
import com.google.android.libraries.searchbox.shared.p3200a.C41641b;

/* renamed from: com.google.android.apps.gsa.search.core.ae.a.ah */
/* compiled from: PG */
public final class C84426ah extends C41641b implements C89203h, C89204i {

    /* renamed from: a */
    private C89205j f229724a;

    /* renamed from: a */
    public final synchronized void mo78002a() {
        C89205j jVar = this.f229724a;
        if (jVar != null) {
            jVar.mo83169i("ICING_CONNECTION_FAILURE_COUNT");
        }
    }

    /* renamed from: c */
    public final synchronized void mo78003c(int i) {
        C89205j jVar = this.f229724a;
        if (jVar != null) {
            jVar.mo83171k("ICING_CONNECTION_INITIALIZATION_TIME_MSEC", i);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b8, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo44231f(com.google.common.p4552o.amt r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.apps.gsa.shared.an.a.j r0 = r5.f229724a     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            java.lang.String r1 = "ICING_CONNECTION_INITIALIZATION_TIME_MSEC"
            boolean r0 = r0.mo83177q(r1)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x0034
            com.google.android.apps.gsa.shared.an.a.j r0 = r5.f229724a     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "ICING_CONNECTION_INITIALIZATION_TIME_MSEC"
            int r0 = r0.mo83161a(r1)     // Catch:{ all -> 0x00b9 }
            r1 = -1
            if (r0 == r1) goto L_0x0034
            com.google.android.apps.gsa.shared.an.a.j r0 = r5.f229724a     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "ICING_CONNECTION_INITIALIZATION_TIME_MSEC"
            int r0 = r0.mo83161a(r1)     // Catch:{ all -> 0x00b9 }
            r6.copyOnWrite()     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r1 = r6.instance     // Catch:{ all -> 0x00b9 }
            com.google.common.o.apd r1 = (com.google.common.p4552o.apd) r1     // Catch:{ all -> 0x00b9 }
            com.google.common.o.apd r2 = com.google.common.p4552o.apd.f159555aA     // Catch:{ all -> 0x00b9 }
            int r2 = r1.f159610b     // Catch:{ all -> 0x00b9 }
            r3 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 | r3
            r1.f159610b = r2     // Catch:{ all -> 0x00b9 }
            r1.f159586ac = r0     // Catch:{ all -> 0x00b9 }
        L_0x0034:
            com.google.android.apps.gsa.shared.an.a.j r0 = r5.f229724a     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "ICING_CONNECTION_FAILURE_COUNT"
            boolean r0 = r0.mo83177q(r1)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b7
            com.google.android.apps.gsa.shared.an.a.j r0 = r5.f229724a     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "ICING_CONNECTION_FAILURE_COUNT"
            int r0 = r0.mo83161a(r1)     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b7
            com.google.common.o.amz r0 = com.google.common.p4552o.amz.f159258c     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bn r0 = r0.createBuilder()     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amw r0 = (com.google.common.p4552o.amw) r0     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r1 = r6.instance     // Catch:{ all -> 0x00b9 }
            com.google.common.o.apd r1 = (com.google.common.p4552o.apd) r1     // Catch:{ all -> 0x00b9 }
            int r2 = r1.f159611c     // Catch:{ all -> 0x00b9 }
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x0066
            com.google.common.o.amz r0 = r1.f159595al     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x0060
            com.google.common.o.amz r0 = com.google.common.p4552o.amz.f159258c     // Catch:{ all -> 0x00b9 }
        L_0x0060:
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amw r0 = (com.google.common.p4552o.amw) r0     // Catch:{ all -> 0x00b9 }
        L_0x0066:
            com.google.common.o.amy r1 = com.google.common.p4552o.amy.f159254c     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bn r1 = r1.createBuilder()     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amx r1 = (com.google.common.p4552o.amx) r1     // Catch:{ all -> 0x00b9 }
            com.google.android.apps.gsa.shared.an.a.j r2 = r5.f229724a     // Catch:{ all -> 0x00b9 }
            java.lang.String r3 = "ICING_CONNECTION_FAILURE_COUNT"
            int r2 = r2.mo83161a(r3)     // Catch:{ all -> 0x00b9 }
            r1.copyOnWrite()     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r3 = r1.instance     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amy r3 = (com.google.common.p4552o.amy) r3     // Catch:{ all -> 0x00b9 }
            int r4 = r3.f159256a     // Catch:{ all -> 0x00b9 }
            r4 = r4 | 1
            r3.f159256a = r4     // Catch:{ all -> 0x00b9 }
            r3.f159257b = r2     // Catch:{ all -> 0x00b9 }
            r0.copyOnWrite()     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amz r2 = (com.google.common.p4552o.amz) r2     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amy r1 = (com.google.common.p4552o.amy) r1     // Catch:{ all -> 0x00b9 }
            r1.getClass()     // Catch:{ all -> 0x00b9 }
            r2.f159261b = r1     // Catch:{ all -> 0x00b9 }
            int r1 = r2.f159260a     // Catch:{ all -> 0x00b9 }
            r1 = r1 | 2
            r2.f159260a = r1     // Catch:{ all -> 0x00b9 }
            r6.copyOnWrite()     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r6 = r6.instance     // Catch:{ all -> 0x00b9 }
            com.google.common.o.apd r6 = (com.google.common.p4552o.apd) r6     // Catch:{ all -> 0x00b9 }
            com.google.protobuf.bv r0 = r0.build()     // Catch:{ all -> 0x00b9 }
            com.google.common.o.amz r0 = (com.google.common.p4552o.amz) r0     // Catch:{ all -> 0x00b9 }
            r0.getClass()     // Catch:{ all -> 0x00b9 }
            r6.f159595al = r0     // Catch:{ all -> 0x00b9 }
            int r0 = r6.f159611c     // Catch:{ all -> 0x00b9 }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r6.f159611c = r0     // Catch:{ all -> 0x00b9 }
            monitor-exit(r5)
            return
        L_0x00b7:
            monitor-exit(r5)
            return
        L_0x00b9:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84426ah.mo44231f(com.google.common.o.amt):void");
    }

    /* renamed from: hC */
    public final void mo78005hC(C89205j jVar) {
        this.f229724a = jVar;
    }

    /* renamed from: hE */
    public final synchronized void mo78006hE() {
        C89205j jVar = this.f229724a;
        if (jVar != null) {
            jVar.mo83171k("ICING_CONNECTION_INITIALIZATION_TIME_MSEC", -1);
            this.f229724a.mo83171k("ICING_CONNECTION_FAILURE_COUNT", 0);
        }
    }
}
