package com.google.android.libraries.onegoogle.accountmenu.cards.p2355db;

import androidx.p182p.C3925ah;
import androidx.p182p.C3965r;
import androidx.p182p.C3966s;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.db.i */
/* compiled from: PG */
public final class C30430i implements C30427f {

    /* renamed from: a */
    private final C3925ah f82229a;

    /* renamed from: b */
    private final C3966s f82230b;

    /* renamed from: c */
    private final C3965r f82231c;

    public C30430i(C3925ah ahVar) {
        this.f82229a = ahVar;
        this.f82230b = new C30428g(ahVar);
        this.f82231c = new C30429h(ahVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo36009a() {
        /*
            r23 = this;
            r1 = r23
            java.util.TreeMap r0 = androidx.p182p.C3930am.f12576a
            java.lang.String r0 = "SELECT * FROM BackupSyncCardDecorationState"
            r2 = 0
            androidx.p.am r3 = androidx.p182p.C3929al.m11267a(r0, r2)
            androidx.p.ah r0 = r1.f82229a
            r0.mo8175S()
            androidx.p.ah r0 = r1.f82229a
            r4 = 0
            android.database.Cursor r5 = androidx.p182p.p185c.C3940b.m11293a(r0, r3, r2, r4)
            java.lang.String r0 = "accountIdentifier"
            int r0 = androidx.p182p.p185c.C3939a.m11292b(r5, r0)     // Catch:{ all -> 0x0131 }
            java.lang.String r6 = "backupSyncState"
            int r6 = androidx.p182p.p185c.C3939a.m11292b(r5, r6)     // Catch:{ all -> 0x0131 }
            java.lang.String r7 = "lastDecorationConsumedTime"
            int r7 = androidx.p182p.p185c.C3939a.m11292b(r5, r7)     // Catch:{ all -> 0x0131 }
            java.lang.String r8 = "totalTimesConsumed"
            int r8 = androidx.p182p.p185c.C3939a.m11292b(r5, r8)     // Catch:{ all -> 0x0131 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0131 }
            int r10 = r5.getCount()     // Catch:{ all -> 0x0131 }
            r9.<init>(r10)     // Catch:{ all -> 0x0131 }
        L_0x0038:
            boolean r10 = r5.moveToNext()     // Catch:{ all -> 0x0131 }
            if (r10 == 0) goto L_0x012a
            boolean r10 = r5.isNull(r0)     // Catch:{ all -> 0x0131 }
            if (r10 == 0) goto L_0x0046
            r10 = r4
            goto L_0x004a
        L_0x0046:
            java.lang.String r10 = r5.getString(r0)     // Catch:{ all -> 0x0131 }
        L_0x004a:
            java.lang.String r11 = r5.getString(r6)     // Catch:{ all -> 0x0131 }
            if (r11 != 0) goto L_0x0053
            r13 = 0
            goto L_0x00fe
        L_0x0053:
            int r12 = r11.hashCode()     // Catch:{ all -> 0x0131 }
            r13 = 7
            r14 = 10
            r15 = 6
            r16 = 8
            r17 = 4
            r18 = 2
            r19 = 1
            r20 = 5
            r21 = 3
            r22 = 9
            switch(r12) {
                case -1777468996: goto L_0x00d5;
                case -1628642524: goto L_0x00cb;
                case -604548089: goto L_0x00c1;
                case -368591510: goto L_0x00b7;
                case 78159: goto L_0x00ad;
                case 183181625: goto L_0x00a3;
                case 399612135: goto L_0x0099;
                case 436658844: goto L_0x008e;
                case 994755612: goto L_0x0084;
                case 1270392710: goto L_0x0079;
                case 1999208305: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x00e0
        L_0x006e:
            java.lang.String r12 = "CUSTOM"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 7
            goto L_0x00e1
        L_0x0079:
            java.lang.String r12 = "STORAGE_FAILURE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 10
            goto L_0x00e1
        L_0x0084:
            java.lang.String r12 = "NO_CONNECTION"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 6
            goto L_0x00e1
        L_0x008e:
            java.lang.String r12 = "CUSTOM_FAILURE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 8
            goto L_0x00e1
        L_0x0099:
            java.lang.String r12 = "PREPARE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 4
            goto L_0x00e1
        L_0x00a3:
            java.lang.String r12 = "COMPLETE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 2
            goto L_0x00e1
        L_0x00ad:
            java.lang.String r12 = "OFF"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00b7:
            java.lang.String r12 = "FAILURE"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 5
            goto L_0x00e1
        L_0x00c1:
            java.lang.String r12 = "IN_PROGRESS"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 3
            goto L_0x00e1
        L_0x00cb:
            java.lang.String r12 = "INITIAL"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 0
            goto L_0x00e1
        L_0x00d5:
            java.lang.String r12 = "CUSTOM_PAUSED"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00e0
            r12 = 9
            goto L_0x00e1
        L_0x00e0:
            r12 = -1
        L_0x00e1:
            switch(r12) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00fb;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00f7;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00f3;
                case 6: goto L_0x00fe;
                case 7: goto L_0x00f0;
                case 8: goto L_0x00ed;
                case 9: goto L_0x00ea;
                case 10: goto L_0x00e7;
                default: goto L_0x00e4;
            }
        L_0x00e4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0131 }
            goto L_0x0120
        L_0x00e7:
            r13 = 11
            goto L_0x00fe
        L_0x00ea:
            r13 = 10
            goto L_0x00fe
        L_0x00ed:
            r13 = 9
            goto L_0x00fe
        L_0x00f0:
            r13 = 8
            goto L_0x00fe
        L_0x00f3:
            r13 = 6
            goto L_0x00fe
        L_0x00f5:
            r13 = 5
            goto L_0x00fe
        L_0x00f7:
            r13 = 4
            goto L_0x00fe
        L_0x00f9:
            r13 = 3
            goto L_0x00fe
        L_0x00fb:
            r13 = 2
            goto L_0x00fe
        L_0x00fd:
            r13 = 1
        L_0x00fe:
            long r11 = r5.getLong(r7)     // Catch:{ all -> 0x0131 }
            int r14 = r5.getInt(r8)     // Catch:{ all -> 0x0131 }
            com.google.android.libraries.onegoogle.accountmenu.cards.db.a r15 = new com.google.android.libraries.onegoogle.accountmenu.cards.db.a     // Catch:{ all -> 0x0131 }
            r15.<init>()     // Catch:{ all -> 0x0131 }
            r15.mo35991b(r10)     // Catch:{ all -> 0x0131 }
            r15.mo35992c(r13)     // Catch:{ all -> 0x0131 }
            r15.mo35993d(r11)     // Catch:{ all -> 0x0131 }
            r15.mo35994e(r14)     // Catch:{ all -> 0x0131 }
            com.google.android.libraries.onegoogle.accountmenu.cards.db.e r10 = r15.mo35990a()     // Catch:{ all -> 0x0131 }
            r9.add(r10)     // Catch:{ all -> 0x0131 }
            goto L_0x0038
        L_0x0120:
            java.lang.String r2 = "Can't convert value to enum, unknown value: "
            java.lang.String r2 = r2.concat(r11)     // Catch:{ all -> 0x0131 }
            r0.<init>(r2)     // Catch:{ all -> 0x0131 }
            throw r0     // Catch:{ all -> 0x0131 }
        L_0x012a:
            r5.close()
            r3.mo8207h()
            return r9
        L_0x0131:
            r0 = move-exception
            r5.close()
            r3.mo8207h()
            goto L_0x013a
        L_0x0139:
            throw r0
        L_0x013a:
            goto L_0x0139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.accountmenu.cards.p2355db.C30430i.mo36009a():java.util.List");
    }

    /* renamed from: b */
    public final void mo36010b(C30426e eVar) {
        this.f82229a.mo8175S();
        this.f82229a.mo8181p();
        try {
            this.f82231c.mo8304b(eVar);
            this.f82229a.mo8188w();
        } finally {
            this.f82229a.mo8183r();
        }
    }

    /* renamed from: c */
    public final void mo36011c(C30426e eVar) {
        this.f82229a.mo8175S();
        this.f82229a.mo8181p();
        try {
            this.f82230b.mo8308c(eVar);
            this.f82229a.mo8188w();
        } finally {
            this.f82229a.mo8183r();
        }
    }
}
