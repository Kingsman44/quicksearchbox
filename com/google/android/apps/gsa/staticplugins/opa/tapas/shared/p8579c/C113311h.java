package com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c;

import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.h */
/* compiled from: PG */
public final /* synthetic */ class C113311h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C113318o f313801a;

    public /* synthetic */ C113311h(C113318o oVar) {
        this.f313801a = oVar;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0100 A[Catch:{ all -> 0x0187 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0158 A[Catch:{ all -> 0x0187 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17879a(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r1 = r13.f313801a
            java.util.List r14 = (java.util.List) r14
            com.google.common.b.gp r2 = com.google.common.p4522b.C58485gu.m89837e()
            java.util.Iterator r14 = r14.iterator()
        L_0x000e:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0196
            java.lang.Object r3 = r14.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x000e
            java.lang.String r4 = "unknown"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x000e
            boolean r4 = r1.mo100113f()
            if (r4 != 0) goto L_0x0045
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313806a
            com.google.common.f.x r3 = r3.mo56226d()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "contactInfoFetcher"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "No READ_CONTACTS permission granted."
            r5 = 27854(0x6cce, float:3.9032E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            goto L_0x0191
        L_0x0045:
            dagger.a r4 = r1.f313820h
            java.lang.Object r4 = r4.mo27525b()
            r5 = r4
            android.content.ContentResolver r5 = (android.content.ContentResolver) r5
            android.net.Uri r6 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313809d
            java.lang.String r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313811f
            r4 = 1
            java.lang.String[] r9 = new java.lang.String[r4]
            r4 = 0
            r9[r4] = r3
            r10 = 0
            android.database.Cursor r3 = r5.query(r6, r7, r8, r9, r10)
            if (r3 == 0) goto L_0x018c
            int r4 = r3.getCount()
            if (r4 != 0) goto L_0x0069
            goto L_0x018c
        L_0x0069:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x006e:
            boolean r5 = r3.moveToNext()     // Catch:{ all -> 0x0187 }
            if (r5 == 0) goto L_0x0182
            com.google.common.b.hd r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x0187 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0187 }
            r6.<init>()     // Catch:{ all -> 0x0187 }
            com.google.common.b.hd r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x0187 }
            java.lang.String r8 = "mimetype"
            java.lang.String r8 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113317n.m187469b(r8, r3, r7)     // Catch:{ all -> 0x0187 }
            java.lang.String r9 = "account_type"
            java.lang.String r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113317n.m187469b(r9, r3, r7)     // Catch:{ all -> 0x0187 }
            boolean r9 = r0.equals(r8)     // Catch:{ all -> 0x0187 }
            java.lang.String r10 = "com.google"
            if (r9 == 0) goto L_0x00ba
            boolean r7 = android.text.TextUtils.equals(r10, r7)     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00ba
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.TEXT     // Catch:{ all -> 0x0187 }
            j$.util.Optional r7 = r1.mo100110b(r3, r5, r7)     // Catch:{ all -> 0x0187 }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d r8 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d     // Catch:{ all -> 0x0187 }
            r8.<init>(r6)     // Catch:{ all -> 0x0187 }
            r7.ifPresent(r8)     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.CALL     // Catch:{ all -> 0x0187 }
            j$.util.Optional r5 = r1.mo100110b(r3, r5, r7)     // Catch:{ all -> 0x0187 }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d     // Catch:{ all -> 0x0187 }
            r7.<init>(r6)     // Catch:{ all -> 0x0187 }
            r5.ifPresent(r7)     // Catch:{ all -> 0x0187 }
            goto L_0x00e9
        L_0x00ba:
            boolean r7 = r1.mo100111d(r8)     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00d2
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.CALL     // Catch:{ all -> 0x0187 }
            j$.util.Optional r5 = r1.mo100110b(r3, r5, r7)     // Catch:{ all -> 0x0187 }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d     // Catch:{ all -> 0x0187 }
            r7.<init>(r6)     // Catch:{ all -> 0x0187 }
            r5.ifPresent(r7)     // Catch:{ all -> 0x0187 }
            goto L_0x00e9
        L_0x00d2:
            boolean r7 = r1.mo100112e(r8)     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x00e9
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.TEXT     // Catch:{ all -> 0x0187 }
            j$.util.Optional r5 = r1.mo100110b(r3, r5, r7)     // Catch:{ all -> 0x0187 }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d r7 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.d     // Catch:{ all -> 0x0187 }
            r7.<init>(r6)     // Catch:{ all -> 0x0187 }
            r5.ifPresent(r7)     // Catch:{ all -> 0x0187 }
        L_0x00e9:
            r4.addAll(r6)     // Catch:{ all -> 0x0187 }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x0187 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x0187 }
            r7.<init>()     // Catch:{ all -> 0x0187 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0187 }
            r8.<init>()     // Catch:{ all -> 0x0187 }
        L_0x00fa:
            boolean r9 = r5.hasNext()     // Catch:{ all -> 0x0187 }
            if (r9 == 0) goto L_0x014e
            java.lang.Object r9 = r5.next()     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r r9 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r) r9     // Catch:{ all -> 0x0187 }
            java.lang.String r11 = r9.f313839f     // Catch:{ all -> 0x0187 }
            boolean r11 = r0.equals(r11)     // Catch:{ all -> 0x0187 }
            if (r11 == 0) goto L_0x00fa
            java.lang.String r11 = r9.f313835b     // Catch:{ all -> 0x0187 }
            boolean r11 = r11.isEmpty()     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x00fa
            int r11 = r9.f313837d     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r11 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.m187477a(r11)     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x0120
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r11 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.UNRECOGNIZED     // Catch:{ all -> 0x0187 }
        L_0x0120:
            java.lang.Object r11 = r7.get(r11)     // Catch:{ all -> 0x0187 }
            java.util.Set r11 = (java.util.Set) r11     // Catch:{ all -> 0x0187 }
            if (r11 != 0) goto L_0x013a
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x0187 }
            r11.<init>()     // Catch:{ all -> 0x0187 }
            int r12 = r9.f313837d     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r12 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.m187477a(r12)     // Catch:{ all -> 0x0187 }
            if (r12 != 0) goto L_0x0137
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r12 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.UNRECOGNIZED     // Catch:{ all -> 0x0187 }
        L_0x0137:
            r7.put(r12, r11)     // Catch:{ all -> 0x0187 }
        L_0x013a:
            java.lang.String r12 = r9.f313835b     // Catch:{ all -> 0x0187 }
            boolean r12 = r11.contains(r12)     // Catch:{ all -> 0x0187 }
            if (r12 != 0) goto L_0x0148
            java.lang.String r9 = r9.f313835b     // Catch:{ all -> 0x0187 }
            r11.add(r9)     // Catch:{ all -> 0x0187 }
            goto L_0x00fa
        L_0x0148:
            java.lang.String r9 = r9.f313835b     // Catch:{ all -> 0x0187 }
            r8.add(r9)     // Catch:{ all -> 0x0187 }
            goto L_0x00fa
        L_0x014e:
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x0187 }
        L_0x0152:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0187 }
            if (r6 == 0) goto L_0x006e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0187 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.r r6 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r) r6     // Catch:{ all -> 0x0187 }
            java.lang.String r7 = r6.f313839f     // Catch:{ all -> 0x0187 }
            boolean r7 = r0.equals(r7)     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0152
            java.lang.String r7 = r6.f313835b     // Catch:{ all -> 0x0187 }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x0187 }
            if (r7 != 0) goto L_0x0152
            java.lang.String r7 = r6.f313835b     // Catch:{ all -> 0x0187 }
            boolean r7 = r8.contains(r7)     // Catch:{ all -> 0x0187 }
            if (r7 == 0) goto L_0x0152
            java.lang.String r6 = r6.f313840g     // Catch:{ all -> 0x0187 }
            boolean r6 = r10.equals(r6)     // Catch:{ all -> 0x0187 }
            if (r6 != 0) goto L_0x0152
            r5.remove()     // Catch:{ all -> 0x0187 }
            goto L_0x0152
        L_0x0182:
            r3.close()
            r3 = r4
            goto L_0x0191
        L_0x0187:
            r14 = move-exception
            r3.close()
            throw r14
        L_0x018c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0191:
            r2.mo55395g(r3)
            goto L_0x000e
        L_0x0196:
            com.google.common.b.gu r14 = r2.mo55394f()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113311h.mo17879a(java.lang.Object):java.lang.Object");
    }
}
