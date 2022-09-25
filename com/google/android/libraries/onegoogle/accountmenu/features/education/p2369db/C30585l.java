package com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3933ap;
import androidx.p182p.C3965r;
import androidx.p182p.C3966s;
import androidx.p186q.p187a.C4057l;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.db.l */
/* compiled from: PG */
public final class C30585l implements C30578e {

    /* renamed from: a */
    private final C3925ah f82611a;

    /* renamed from: b */
    private final C3966s f82612b;

    /* renamed from: c */
    private final C3966s f82613c;

    /* renamed from: d */
    private final C3965r f82614d;

    /* renamed from: e */
    private final C3965r f82615e;

    /* renamed from: f */
    private final C3965r f82616f;

    /* renamed from: g */
    private final C3933ap f82617g;

    public C30585l(C3925ah ahVar) {
        this.f82611a = ahVar;
        this.f82612b = new C30579f(ahVar);
        this.f82613c = new C30580g(ahVar);
        this.f82614d = new C30581h(ahVar);
        this.f82615e = new C30582i(ahVar);
        this.f82616f = new C30583j(ahVar);
        this.f82617g = new C30584k(ahVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x011a A[Catch:{ all -> 0x016e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011b A[Catch:{ all -> 0x016e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo36267a() {
        /*
            r21 = this;
            r1 = r21
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM educationstate LEFT JOIN highlightstate ON  name = educationName   WHERE    name = (SELECT name FROM educationstate                WHERE enabled = 1 AND               educationCompleted = 0               LIMIT 1)"
            r2 = 0
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            androidx.p.ah r0 = r1.f82611a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f82611a
            r4 = 0
            android.database.Cursor r5 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r2, r4)
            java.lang.String r0 = "name"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r5, r0)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = "enabled"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r5, r6)     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "numEducationImpressions"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r5, r7)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = "numEducationInteractions"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r5, r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r9 = "activatedTimestampMs"
            int r9 = androidx.p182p.p185c.C3939a.m11292b(r5, r9)     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = "lastImpressionTimestampMs"
            int r10 = androidx.p182p.p185c.C3939a.m11292b(r5, r10)     // Catch:{ all -> 0x0170 }
            java.lang.String r11 = "lastInteractionTimestampMs"
            int r11 = androidx.p182p.p185c.C3939a.m11292b(r5, r11)     // Catch:{ all -> 0x0170 }
            java.lang.String r12 = "educationCompleted"
            int r12 = androidx.p182p.p185c.C3939a.m11292b(r5, r12)     // Catch:{ all -> 0x0170 }
            java.lang.String r13 = "educationName"
            int r13 = androidx.p182p.p185c.C3939a.m11292b(r5, r13)     // Catch:{ all -> 0x0170 }
            java.lang.String r14 = "highlightId"
            int r14 = androidx.p182p.p185c.C3939a.m11292b(r5, r14)     // Catch:{ all -> 0x0170 }
            java.lang.String r15 = "numHighlightImpressions"
            int r15 = androidx.p182p.p185c.C3939a.m11292b(r5, r15)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = "numHighlightInteractions"
            int r2 = androidx.p182p.p185c.C3939a.m11292b(r5, r2)     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "highlightCompleted"
            int r4 = androidx.p182p.p185c.C3939a.m11292b(r5, r4)     // Catch:{ all -> 0x0170 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0170 }
            r16 = r3
            int r3 = r5.getCount()     // Catch:{ all -> 0x016e }
            r1.<init>(r3)     // Catch:{ all -> 0x016e }
        L_0x0070:
            boolean r3 = r5.moveToNext()     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x0167
            boolean r3 = r5.isNull(r0)     // Catch:{ all -> 0x016e }
            r17 = 1
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r6)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r7)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r8)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r9)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r10)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r11)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00b0
            boolean r3 = r5.isNull(r12)     // Catch:{ all -> 0x016e }
            if (r3 != 0) goto L_0x00a9
            goto L_0x00b0
        L_0x00a9:
            r18 = r0
            r3 = r6
            r19 = r7
            r0 = 0
            goto L_0x00fc
        L_0x00b0:
            boolean r3 = r5.isNull(r0)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00ba
            r18 = r0
            r3 = 0
            goto L_0x00c0
        L_0x00ba:
            java.lang.String r3 = r5.getString(r0)     // Catch:{ all -> 0x016e }
            r18 = r0
        L_0x00c0:
            com.google.android.libraries.onegoogle.accountmenu.features.education.db.c r0 = new com.google.android.libraries.onegoogle.accountmenu.features.education.db.c     // Catch:{ all -> 0x016e }
            r0.<init>(r3)     // Catch:{ all -> 0x016e }
            int r3 = r5.getInt(r6)     // Catch:{ all -> 0x016e }
            if (r3 == 0) goto L_0x00cd
            r3 = 1
            goto L_0x00ce
        L_0x00cd:
            r3 = 0
        L_0x00ce:
            r0.f82599b = r3     // Catch:{ all -> 0x016e }
            int r3 = r5.getInt(r7)     // Catch:{ all -> 0x016e }
            r0.f82600c = r3     // Catch:{ all -> 0x016e }
            int r3 = r5.getInt(r8)     // Catch:{ all -> 0x016e }
            r0.f82601d = r3     // Catch:{ all -> 0x016e }
            r3 = r6
            r19 = r7
            long r6 = r5.getLong(r9)     // Catch:{ all -> 0x016e }
            r0.f82602e = r6     // Catch:{ all -> 0x016e }
            long r6 = r5.getLong(r10)     // Catch:{ all -> 0x016e }
            r0.f82603f = r6     // Catch:{ all -> 0x016e }
            long r6 = r5.getLong(r11)     // Catch:{ all -> 0x016e }
            r0.f82604g = r6     // Catch:{ all -> 0x016e }
            int r6 = r5.getInt(r12)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x00f9
            r6 = 1
            goto L_0x00fa
        L_0x00f9:
            r6 = 0
        L_0x00fa:
            r0.f82605h = r6     // Catch:{ all -> 0x016e }
        L_0x00fc:
            boolean r6 = r5.isNull(r13)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x011f
            boolean r6 = r5.isNull(r14)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x011f
            boolean r6 = r5.isNull(r15)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x011f
            boolean r6 = r5.isNull(r2)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x011f
            boolean r6 = r5.isNull(r4)     // Catch:{ all -> 0x016e }
            if (r6 != 0) goto L_0x011b
            goto L_0x011f
        L_0x011b:
            r20 = r3
            r3 = 0
            goto L_0x0157
        L_0x011f:
            boolean r6 = r5.isNull(r13)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x0127
            r6 = 0
            goto L_0x012b
        L_0x0127:
            java.lang.String r6 = r5.getString(r13)     // Catch:{ all -> 0x016e }
        L_0x012b:
            boolean r7 = r5.isNull(r14)     // Catch:{ all -> 0x016e }
            if (r7 == 0) goto L_0x0135
            r20 = r3
            r7 = 0
            goto L_0x013b
        L_0x0135:
            java.lang.String r7 = r5.getString(r14)     // Catch:{ all -> 0x016e }
            r20 = r3
        L_0x013b:
            com.google.android.libraries.onegoogle.accountmenu.features.education.db.d r3 = new com.google.android.libraries.onegoogle.accountmenu.features.education.db.d     // Catch:{ all -> 0x016e }
            r3.<init>(r6, r7)     // Catch:{ all -> 0x016e }
            int r6 = r5.getInt(r15)     // Catch:{ all -> 0x016e }
            r3.f82608c = r6     // Catch:{ all -> 0x016e }
            int r6 = r5.getInt(r2)     // Catch:{ all -> 0x016e }
            r3.f82609d = r6     // Catch:{ all -> 0x016e }
            int r6 = r5.getInt(r4)     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x0154
            r6 = 1
            goto L_0x0155
        L_0x0154:
            r6 = 0
        L_0x0155:
            r3.f82610e = r6     // Catch:{ all -> 0x016e }
        L_0x0157:
            com.google.android.libraries.onegoogle.accountmenu.features.education.db.m r6 = new com.google.android.libraries.onegoogle.accountmenu.features.education.db.m     // Catch:{ all -> 0x016e }
            r6.<init>(r0, r3)     // Catch:{ all -> 0x016e }
            r1.add(r6)     // Catch:{ all -> 0x016e }
            r0 = r18
            r7 = r19
            r6 = r20
            goto L_0x0070
        L_0x0167:
            r5.close()
            r16.mo8207h()
            return r1
        L_0x016e:
            r0 = move-exception
            goto L_0x0173
        L_0x0170:
            r0 = move-exception
            r16 = r3
        L_0x0173:
            r5.close()
            r16.mo8207h()
            goto L_0x017b
        L_0x017a:
            throw r0
        L_0x017b:
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.features.education.p2369db.C30585l.mo36267a():java.util.List");
    }

    /* renamed from: b */
    public final void mo36268b(C30576c cVar) {
        this.f82611a.mo8175S();
        this.f82611a.mo8181p();
        try {
            this.f82614d.mo8304b(cVar);
            this.f82611a.mo8188w();
        } finally {
            this.f82611a.mo8183r();
        }
    }

    /* renamed from: c */
    public final void mo36269c(List list) {
        this.f82611a.mo8175S();
        this.f82611a.mo8181p();
        try {
            this.f82613c.mo8307b(list);
            this.f82611a.mo8188w();
        } finally {
            this.f82611a.mo8183r();
        }
    }

    /* renamed from: d */
    public final void mo36270d(List list) {
        this.f82611a.mo8175S();
        this.f82611a.mo8181p();
        try {
            this.f82612b.mo8307b(list);
            this.f82611a.mo8188w();
        } finally {
            this.f82611a.mo8183r();
        }
    }

    /* renamed from: e */
    public final void mo36271e(C30576c cVar) {
        this.f82611a.mo8175S();
        this.f82611a.mo8181p();
        try {
            this.f82616f.mo8304b(cVar);
            this.f82611a.mo8188w();
        } finally {
            this.f82611a.mo8183r();
        }
    }

    /* renamed from: f */
    public final void mo36272f(C30577d dVar) {
        this.f82611a.mo8175S();
        this.f82611a.mo8181p();
        try {
            this.f82615e.mo8304b(dVar);
            this.f82611a.mo8188w();
        } finally {
            this.f82611a.mo8183r();
        }
    }

    /* renamed from: g */
    public final void mo36273g(String str, boolean z) {
        this.f82611a.mo8175S();
        C4057l d = this.f82617g.mo8212d();
        d.mo8204e(1, z ? 1 : 0);
        d.mo8206g(2, str);
        this.f82611a.mo8181p();
        try {
            d.mo8256a();
            this.f82611a.mo8188w();
        } finally {
            this.f82611a.mo8183r();
            this.f82617g.mo8215g(d);
        }
    }
}
