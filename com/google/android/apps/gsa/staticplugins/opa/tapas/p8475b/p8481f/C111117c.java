package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.c */
/* compiled from: PG */
public final /* synthetic */ class C111117c implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C111118d f309366a;

    public /* synthetic */ C111117c(C111118d dVar) {
        this.f309366a = dVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d8, code lost:
        if (r3 != null) goto L_0x00da;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.d r0 = r10.f309366a
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.c r1 = r0.f309368b
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r3 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r3 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r3
            boolean r4 = r3.mo100113f()
            if (r4 != 0) goto L_0x0028
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313806a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "contactInfoFetcher"
            r1.mo56378ag(r3, r4)
            java.lang.String r3 = "No READ_CONTACTS permission granted."
            r4 = 27856(0x6cd0, float:3.9035E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r3)
            goto L_0x00dd
        L_0x0028:
            dagger.a r3 = r3.f313820h
            java.lang.Object r3 = r3.mo27525b()
            r4 = r3
            android.content.ContentResolver r4 = (android.content.ContentResolver) r4
            android.net.Uri r5 = android.provider.ContactsContract.Data.CONTENT_URI
            java.lang.String[] r6 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313809d
            java.lang.String r7 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313812g
            r3 = 1
            java.lang.String[] r8 = new java.lang.String[r3]
            r3 = 0
            java.lang.String r9 = "%"
            r8[r3] = r9
            java.lang.String r9 = "last_time_contacted DESC, sort_key ASC"
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x00d8
            int r4 = r3.getCount()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00d8
        L_0x004d:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00da
            com.google.common.b.hd r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = "mimetype"
            java.lang.String r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113317n.m187469b(r5, r3, r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = "account_type"
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113317n.m187469b(r6, r3, r4)     // Catch:{ all -> 0x00d3 }
            java.lang.String r6 = "vnd.android.cursor.item/phone_v2"
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x00d3 }
            if (r6 == 0) goto L_0x0098
            java.lang.String r6 = "com.google"
            boolean r4 = android.text.TextUtils.equals(r6, r4)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0098
            com.google.common.b.hd r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.TEXT     // Catch:{ all -> 0x00d3 }
            r6 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r6 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r6     // Catch:{ all -> 0x00d3 }
            j$.util.Optional r4 = r6.mo100110b(r3, r4, r5)     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.i r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.i     // Catch:{ all -> 0x00d3 }
            r5.<init>(r2)     // Catch:{ all -> 0x00d3 }
            r4.ifPresent(r5)     // Catch:{ all -> 0x00d3 }
            com.google.common.b.hd r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.CALL     // Catch:{ all -> 0x00d3 }
            r6 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r6 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r6     // Catch:{ all -> 0x00d3 }
            j$.util.Optional r4 = r6.mo100110b(r3, r4, r5)     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.j r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.j     // Catch:{ all -> 0x00d3 }
            r5.<init>(r2)     // Catch:{ all -> 0x00d3 }
            r4.ifPresent(r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x004d
        L_0x0098:
            r4 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r4     // Catch:{ all -> 0x00d3 }
            boolean r4 = r4.mo100111d(r5)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00b5
            com.google.common.b.hd r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.CALL     // Catch:{ all -> 0x00d3 }
            r6 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r6 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r6     // Catch:{ all -> 0x00d3 }
            j$.util.Optional r4 = r6.mo100110b(r3, r4, r5)     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.k r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.k     // Catch:{ all -> 0x00d3 }
            r5.<init>(r2)     // Catch:{ all -> 0x00d3 }
            r4.ifPresent(r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x004d
        L_0x00b5:
            r4 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r4 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r4     // Catch:{ all -> 0x00d3 }
            boolean r4 = r4.mo100112e(r5)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x004d
            com.google.common.b.hd r4 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o.f313810e     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.q r5 = com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113320q.TEXT     // Catch:{ all -> 0x00d3 }
            r6 = r1
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.o r6 = (com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113318o) r6     // Catch:{ all -> 0x00d3 }
            j$.util.Optional r4 = r6.mo100110b(r3, r4, r5)     // Catch:{ all -> 0x00d3 }
            com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.l r5 = new com.google.android.apps.gsa.staticplugins.opa.tapas.shared.c.l     // Catch:{ all -> 0x00d3 }
            r5.<init>(r2)     // Catch:{ all -> 0x00d3 }
            r4.ifPresent(r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x004d
        L_0x00d3:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x00d8:
            if (r3 == 0) goto L_0x00dd
        L_0x00da:
            r3.close()
        L_0x00dd:
            java.util.Collection r1 = r2.values()
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.a r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f.C111115a.f309364a
            j$.util.stream.Stream r1 = r1.filter(r2)
            com.google.android.apps.gsa.staticplugins.opa.tapas.b.f.b r2 = com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f.C111116b.f309365a
            j$.util.stream.Stream r1 = r1.map(r2)
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r1 = r1.collect(r2)
            com.google.common.b.gu r1 = (com.google.common.p4522b.C58485gu) r1
            com.google.assistant.ad.d.b.a.bx r2 = com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx.f125704d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.ad.d.b.a.bv r2 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48633bv) r2
            com.google.assistant.ad.d.b.a.d r3 = com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48643d.f125723b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.ad.d.b.a.a r3 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48584a) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.assistant.ad.d.b.a.d r4 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48643d) r4
            com.google.protobuf.cq r5 = r4.f125725a
            boolean r6 = r5.mo58948c()
            if (r6 != 0) goto L_0x011e
            com.google.protobuf.cq r5 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r5)
            r4.f125725a = r5
        L_0x011e:
            com.google.protobuf.cq r4 = r4.f125725a
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r4)
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.assistant.ad.d.b.a.bx r1 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx) r1
            com.google.protobuf.bv r3 = r3.build()
            com.google.assistant.ad.d.b.a.d r3 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48643d) r3
            r3.getClass()
            r1.f125707b = r3
            r3 = 10
            r1.f125706a = r3
            com.google.android.libraries.f.a r0 = r0.f309367a
            long r0 = r0.mo26870b()
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.assistant.ad.d.b.a.bx r3 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx) r3
            r3.f125708c = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.assistant.ad.d.b.a.bx r0 = (com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48635bx) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8481f.C111117c.mo17947a():java.lang.Object");
    }
}
