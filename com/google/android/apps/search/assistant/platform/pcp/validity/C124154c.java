package com.google.android.apps.search.assistant.platform.pcp.validity;

import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42844bc;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.validity.c */
/* compiled from: PG */
public final /* synthetic */ class C124154c implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C124166o f342863a;

    /* renamed from: b */
    public final /* synthetic */ C42840az f342864b;

    /* renamed from: c */
    public final /* synthetic */ Optional f342865c;

    public /* synthetic */ C124154c(C124166o oVar, C42840az azVar, Optional optional) {
        this.f342863a = oVar;
        this.f342864b = azVar;
        this.f342865c = optional;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x007d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo45922a(com.google.android.libraries.storage.p3315b.C42847bf r10) {
        /*
            r9 = this;
            com.google.android.apps.search.assistant.platform.pcp.validity.o r0 = r9.f342863a
            com.google.android.libraries.storage.b.az r1 = r9.f342864b
            j$.util.Optional r2 = r9.f342865c
            com.google.android.libraries.storage.b.ay r1 = r1.mo45920a()
            com.google.common.b.gp r3 = com.google.common.p4522b.C58485gu.m89837e()
            android.database.Cursor r10 = r10.mo45932d(r1)     // Catch:{ SQLiteException -> 0x007e }
        L_0x0012:
            boolean r1 = r10.moveToNext()     // Catch:{ all -> 0x005e }
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "data_id"
            int r1 = r10.getColumnIndex(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r10.getString(r1)     // Catch:{ all -> 0x005e }
            java.lang.String r4 = "data_type"
            int r4 = r10.getColumnIndex(r4)     // Catch:{ all -> 0x005e }
            int r4 = r10.getInt(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r5 = "client_type"
            int r5 = r10.getColumnIndex(r5)     // Catch:{ all -> 0x005e }
            int r5 = r10.getInt(r5)     // Catch:{ all -> 0x005e }
            java.lang.String r6 = "contextual_triggering_condition"
            int r6 = r10.getColumnIndex(r6)     // Catch:{ all -> 0x005e }
            byte[] r6 = r10.getBlob(r6)     // Catch:{ all -> 0x005e }
            com.google.protobuf.ba r7 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x005e }
            com.google.assistant.ag.c.az r8 = com.google.assistant.p3803ag.p3809c.C48952az.f126657c     // Catch:{ all -> 0x005e }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r8, (byte[]) r6, (com.google.protobuf.C62921ba) r7)     // Catch:{ all -> 0x005e }
            com.google.assistant.ag.c.az r6 = (com.google.assistant.p3803ag.p3809c.C48952az) r6     // Catch:{ all -> 0x005e }
            com.google.android.apps.search.assistant.platform.pcp.validity.r r1 = com.google.android.apps.search.assistant.platform.pcp.validity.C124169r.m203613h(r2, r1, r4, r5, r6)     // Catch:{ all -> 0x005e }
            r3.mo55395g(r1)     // Catch:{ all -> 0x005e }
            goto L_0x0012
        L_0x0054:
            com.google.common.b.gu r1 = r3.mo55394f()     // Catch:{ all -> 0x005e }
            if (r10 == 0) goto L_0x00ab
            r10.close()     // Catch:{ SQLiteException -> 0x007e }
            goto L_0x00ab
        L_0x005e:
            r1 = move-exception
            if (r10 == 0) goto L_0x007d
            r10.close()     // Catch:{ all -> 0x0065 }
            goto L_0x007d
        L_0x0065:
            r10 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x007d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x007d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x007d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x007d }
            r2[r5] = r10     // Catch:{ Exception -> 0x007d }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x007d }
        L_0x007d:
            throw r1     // Catch:{ SQLiteException -> 0x007e }
        L_0x007e:
            r10 = move-exception
            com.google.common.f.a.d r0 = r0.f342909o
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            com.google.common.f.aa r1 = com.google.android.libraries.search.integrations.p3018c.C38505d.f101863a
            r2 = 2687002(0x29001a, float:3.765292E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.mo56378ag(r1, r2)
            com.google.common.f.x r10 = r0.mo56382g(r10)
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            r0 = 35440(0x8a70, float:4.9662E-41)
            com.google.common.f.x r10 = r10.mo56372aa(r0)
            com.google.common.f.a.a r10 = (com.google.common.p4526f.p4527a.C58970a) r10
            java.lang.String r0 = "Failed to build ProactiveDataMap"
            r10.mo56386p(r0)
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x00ab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.pcp.validity.C124154c.mo45922a(com.google.android.libraries.storage.b.bf):java.lang.Object");
    }
}
