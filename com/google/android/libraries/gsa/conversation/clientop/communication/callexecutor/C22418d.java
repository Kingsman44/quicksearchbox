package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.d */
/* compiled from: PG */
public final class C22418d {

    /* renamed from: a */
    private static final C59071e f61930a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.d");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r13v1 */
    /* JADX WARNING: type inference failed for: r13v2, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: type inference failed for: r13v8 */
    /* JADX WARNING: type inference failed for: r13v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0059, code lost:
        if (r10 != null) goto L_0x005b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0090  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m41851a(android.content.Context r9, android.content.ContentResolver r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            java.lang.String r0 = "_id"
            java.lang.String r1 = "content://com.android.contacts/data/"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "android.intent.action.VIEW"
            r2.setAction(r3)
            r2.setPackage(r13)
            r13 = 0
            android.net.Uri r4 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x008d }
            r3 = 3
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ all -> 0x008d }
            r3 = 0
            r5[r3] = r0     // Catch:{ all -> 0x008d }
            java.lang.String r6 = "mimetype"
            r7 = 1
            r5[r7] = r6     // Catch:{ all -> 0x008d }
            java.lang.String r6 = "data1"
            r8 = 2
            r5[r8] = r6     // Catch:{ all -> 0x008d }
            java.lang.String[] r8 = new java.lang.String[r8]     // Catch:{ all -> 0x008d }
            r8[r3] = r12     // Catch:{ all -> 0x008d }
            r8[r7] = r11     // Catch:{ all -> 0x008d }
            java.lang.String r6 = "mimetype=? AND data1=?"
            java.lang.String r11 = "display_name"
            r3 = r10
            r7 = r8
            r8 = r11
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x008d }
            if (r10 == 0) goto L_0x0059
            boolean r11 = r10.moveToFirst()     // Catch:{ all -> 0x0056 }
            if (r11 == 0) goto L_0x0059
            int r11 = r10.getColumnIndex(r0)     // Catch:{ all -> 0x0056 }
            long r3 = r10.getLong(r11)     // Catch:{ all -> 0x0056 }
            java.lang.Long r11 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0056 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r13.<init>(r1)     // Catch:{ all -> 0x0056 }
            r13.append(r11)     // Catch:{ all -> 0x0056 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0056 }
            goto L_0x005b
        L_0x0056:
            r9 = move-exception
            r13 = r10
            goto L_0x008e
        L_0x0059:
            if (r10 == 0) goto L_0x005e
        L_0x005b:
            r10.close()
        L_0x005e:
            if (r13 == 0) goto L_0x0068
            android.net.Uri r9 = android.net.Uri.parse(r13)
            r2.setDataAndType(r9, r12)
            return r2
        L_0x0068:
            com.google.common.f.e r10 = f61930a
            com.google.common.f.x r10 = r10.mo56225c()
            java.lang.String r11 = "Failed to start 3p calling."
            r12 = 48271(0xbc8f, float:6.7642E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r12)).mo56386p(r11)
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = android.os.Looper.getMainLooper()
            r10.<init>(r11)
            com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.c r11 = new com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.c
            r11.<init>(r9)
            r10.post(r11)
            com.google.android.libraries.gsa.conversation.clientop.k r9 = new com.google.android.libraries.gsa.conversation.clientop.k
            r9.<init>()
            throw r9
        L_0x008d:
            r9 = move-exception
        L_0x008e:
            if (r13 == 0) goto L_0x0093
            r13.close()
        L_0x0093:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.C22418d.m41851a(android.content.Context, android.content.ContentResolver, java.lang.String, java.lang.String, java.lang.String):android.content.Intent");
    }
}
