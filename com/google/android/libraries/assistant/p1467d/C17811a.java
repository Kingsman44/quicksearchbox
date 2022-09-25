package com.google.android.libraries.assistant.p1467d;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.d.a */
/* compiled from: PG */
public final /* synthetic */ class C17811a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ Context f51111a;

    public /* synthetic */ C17811a(Context context) {
        this.f51111a = context;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006e */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0042=Splitter:B:10:0x0042, B:24:0x006e=Splitter:B:24:0x006e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            android.content.Context r0 = r9.f51111a
            android.content.ContentResolver r1 = r0.getContentResolver()
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r2 = "content"
            android.net.Uri$Builder r0 = r0.scheme(r2)
            java.lang.String r2 = "com.google.android.googlequicksearchbox.GsaPublicContentProvider"
            android.net.Uri$Builder r0 = r0.authority(r2)
            java.lang.String r2 = "publicvalue"
            android.net.Uri$Builder r0 = r0.appendPath(r2)
            java.lang.String r7 = "opa_app_integration_data"
            android.net.Uri$Builder r0 = r0.appendPath(r7)
            android.net.Uri r2 = r0.build()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0072 }
            if (r1 == 0) goto L_0x006f
            int r2 = r1.getCount()     // Catch:{ all -> 0x0052 }
            if (r2 > 0) goto L_0x003a
            goto L_0x006f
        L_0x003a:
            java.lang.String r2 = "value"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ all -> 0x0052 }
            if (r2 >= 0) goto L_0x0046
        L_0x0042:
            r1.close()     // Catch:{ Exception -> 0x0072 }
            goto L_0x0080
        L_0x0046:
            r1.moveToFirst()     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0052 }
            r1.close()     // Catch:{ Exception -> 0x0072 }
            r8 = r2
            goto L_0x0080
        L_0x0052:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0057 }
            goto L_0x006e
        L_0x0057:
            r1 = move-exception
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x006e }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r0] = r5     // Catch:{ Exception -> 0x006e }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x006e }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x006e }
            r3[r0] = r1     // Catch:{ Exception -> 0x006e }
            r4.invoke(r2, r3)     // Catch:{ Exception -> 0x006e }
        L_0x006e:
            throw r2     // Catch:{ Exception -> 0x0072 }
        L_0x006f:
            if (r1 == 0) goto L_0x0080
            goto L_0x0042
        L_0x0072:
            com.google.common.f.e r1 = com.google.android.libraries.assistant.p1520j.p1521a.C18396a.f52225a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r2 = "Not able to read content for key: %s"
            r3 = 47073(0xb7e1, float:6.5963E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56389s(r2, r7)
        L_0x0080:
            if (r8 == 0) goto L_0x00a6
            byte[] r0 = android.util.Base64.decode(r8, r0)
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.f169869a     // Catch:{ ct -> 0x0096 }
            com.google.android.libraries.assistant.d.c.c.b r2 = com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17897b.f51274j     // Catch:{ ct -> 0x0096 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r0, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x0096 }
            com.google.android.libraries.assistant.d.c.c.b r0 = (com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17897b) r0     // Catch:{ ct -> 0x0096 }
            com.google.android.libraries.assistant.d.b r1 = new com.google.android.libraries.assistant.d.b
            r1.<init>(r0)
            return r1
        L_0x0096:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.assistant.p1467d.C17814b.f51115a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "InvalidProtocolBufferException"
            r3 = 42829(0xa74d, float:6.0016E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            throw r0
        L_0x00a6:
            com.google.common.f.e r0 = com.google.android.libraries.assistant.p1467d.C17814b.f51115a
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = "appIntegrationDataInBase64 is null"
            r2 = 42830(0xa74e, float:6.0018E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Failed to query AGSA value. This is most likely caused by a Google signature check failure. Please make sure both of the AGSA app and the client app are either release or dev builds."
            r0.<init>(r1)
            goto L_0x00bd
        L_0x00bc:
            throw r0
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1467d.C17811a.call():java.lang.Object");
    }
}
