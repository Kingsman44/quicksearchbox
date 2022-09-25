package com.google.android.libraries.social.populous.storage;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;

/* renamed from: com.google.android.libraries.social.populous.storage.at */
/* compiled from: PG */
public final class C42619at extends C42616aq {

    /* renamed from: a */
    private final C3925ah f111814a;

    /* renamed from: b */
    private final C3966s f111815b;

    /* renamed from: c */
    private final C3933ap f111816c;

    public C42619at(C3925ah ahVar) {
        this.f111814a = ahVar;
        this.f111815b = new C42617ar(ahVar);
        this.f111816c = new C42618as(ahVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [com.google.android.libraries.social.populous.storage.d] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0048 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.base.C58833ax mo45716a() {
        /*
            r13 = this;
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT   rowid,   last_updated,   num_contacts,   affinity_response_context FROM   CacheInfo WHERE   rowid = 1 "
            r1 = 0
            androidx.p.am r0 = androidx.p182p.C3929al.m11267a(r0, r1)
            androidx.p.ah r2 = r13.f111814a
            r2.mo8175S()
            androidx.p.ah r2 = r13.f111814a
            r3 = 0
            android.database.Cursor r2 = androidx.p182p.p185c.C3940b.m11293a(r2, r0, r1, r3)
            boolean r4 = r2.moveToFirst()     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0051
            long r6 = r2.getLong(r1)     // Catch:{ all -> 0x005c }
            r1 = 1
            long r8 = r2.getLong(r1)     // Catch:{ all -> 0x005c }
            r1 = 2
            long r10 = r2.getLong(r1)     // Catch:{ all -> 0x005c }
            r1 = 3
            boolean r4 = r2.isNull(r1)     // Catch:{ all -> 0x005c }
            if (r4 == 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            byte[] r3 = r2.getBlob(r1)     // Catch:{ all -> 0x005c }
        L_0x0035:
            if (r3 != 0) goto L_0x003b
            com.google.by.c.b.a.a.f r1 = com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f.f154839d     // Catch:{ all -> 0x005c }
        L_0x0039:
            r12 = r1
            goto L_0x004b
        L_0x003b:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0048 }
            com.google.by.c.b.a.a.f r4 = com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f.f154839d     // Catch:{ ct -> 0x0048 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r3, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0048 }
            com.google.by.c.b.a.a.f r1 = (com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f) r1     // Catch:{ ct -> 0x0048 }
            goto L_0x0039
        L_0x0048:
            com.google.by.c.b.a.a.f r1 = com.google.p4420by.p4425c.p4428b.p4429a.p4430a.C57883f.f154839d     // Catch:{ all -> 0x005c }
            goto L_0x0039
        L_0x004b:
            com.google.android.libraries.social.populous.storage.d r3 = new com.google.android.libraries.social.populous.storage.d     // Catch:{ all -> 0x005c }
            r5 = r3
            r5.<init>(r6, r8, r10, r12)     // Catch:{ all -> 0x005c }
        L_0x0051:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r3)     // Catch:{ all -> 0x005c }
            r2.close()
            r0.mo8207h()
            return r1
        L_0x005c:
            r1 = move-exception
            r2.close()
            r0.mo8207h()
            goto L_0x0065
        L_0x0064:
            throw r1
        L_0x0065:
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.storage.C42619at.mo45716a():com.google.common.base.ax");
    }

    /* renamed from: b */
    public final void mo45717b() {
        this.f111814a.mo8175S();
        C4057l d = this.f111816c.mo8212d();
        this.f111814a.mo8181p();
        try {
            d.mo8256a();
            this.f111814a.mo8188w();
        } finally {
            this.f111814a.mo8183r();
            this.f111816c.mo8215g(d);
        }
    }

    /* renamed from: c */
    public final void mo45718c(C42680d dVar) {
        this.f111814a.mo8175S();
        this.f111814a.mo8181p();
        try {
            this.f111815b.mo8308c(dVar);
            this.f111814a.mo8188w();
        } finally {
            this.f111814a.mo8183r();
        }
    }
}
