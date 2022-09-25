package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.m */
/* compiled from: PG */
public final class C90379m {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m146982a(android.content.Context r8, java.lang.String r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L_0x00b5
            java.lang.String r1 = "android.permission.READ_CONTACTS"
            int r1 = r8.checkSelfPermission(r1)
            if (r1 != 0) goto L_0x00b5
            java.lang.String r1 = "name:"
            boolean r2 = r9.startsWith(r1)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "mailto:"
            boolean r2 = r9.startsWith(r2)
            if (r2 == 0) goto L_0x002c
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI
            r2 = 7
            java.lang.String r9 = r9.substring(r2)
            java.lang.String r9 = android.net.Uri.encode(r9)
            android.net.Uri r9 = android.net.Uri.withAppendedPath(r1, r9)
        L_0x002a:
            r2 = r9
            goto L_0x0051
        L_0x002c:
            java.lang.String r2 = "tel:"
            boolean r2 = r9.startsWith(r2)
            if (r2 == 0) goto L_0x0044
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI
            r2 = 4
            java.lang.String r9 = r9.substring(r2)
            java.lang.String r9 = android.net.Uri.encode(r9)
            android.net.Uri r9 = android.net.Uri.withAppendedPath(r1, r9)
            goto L_0x002a
        L_0x0044:
            boolean r1 = r9.startsWith(r1)
            if (r1 == 0) goto L_0x004c
            r2 = r0
            goto L_0x0051
        L_0x004c:
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L_0x002a
        L_0x0051:
            if (r2 != 0) goto L_0x0054
            return r0
        L_0x0054:
            android.content.ContentResolver r1 = r8.getContentResolver()
            r8 = 1
            java.lang.String[] r3 = new java.lang.String[r8]
            r9 = 0
            java.lang.String r7 = "display_name"
            r3[r9] = r7
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x00a9
            int r2 = r1.getCount()     // Catch:{ all -> 0x008d }
            if (r2 == 0) goto L_0x00a9
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x008d }
            if (r2 != 0) goto L_0x0076
            goto L_0x00a9
        L_0x0076:
            int r2 = r1.getColumnIndexOrThrow(r7)     // Catch:{ all -> 0x008d }
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x008d }
            if (r3 == 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            java.lang.String r0 = r1.getString(r2)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = com.google.common.base.C58837ba.m90856e(r0)     // Catch:{ all -> 0x008d }
        L_0x0089:
            r1.close()
            return r0
        L_0x008d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0092 }
            goto L_0x00a8
        L_0x0092:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x00a8 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r2[r9] = r3     // Catch:{ Exception -> 0x00a8 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x00a8 }
            r8[r9] = r1     // Catch:{ Exception -> 0x00a8 }
            r2.invoke(r0, r8)     // Catch:{ Exception -> 0x00a8 }
        L_0x00a8:
            throw r0
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            r1.close()
        L_0x00ae:
            return r0
        L_0x00af:
            r8 = 5
            java.lang.String r8 = r9.substring(r8)
            return r8
        L_0x00b5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90379m.m146982a(android.content.Context, java.lang.String):java.lang.String");
    }
}
