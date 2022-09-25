package com.google.android.p10905k;

import android.provider.BaseColumns;

/* renamed from: com.google.android.k.b */
/* compiled from: PG */
public class C146603b implements BaseColumns {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m238837a(android.content.ContentResolver r10, android.net.Uri r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "Can't get key "
            r1 = 1
            r2 = 0
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x0034, all -> 0x0031 }
            java.lang.String r3 = "value"
            r9 = 0
            r5[r9] = r3     // Catch:{ SQLException -> 0x0034, all -> 0x0031 }
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ SQLException -> 0x0034, all -> 0x0031 }
            r7[r9] = r12     // Catch:{ SQLException -> 0x0034, all -> 0x0031 }
            java.lang.String r6 = "name=?"
            r8 = 0
            r3 = r10
            r4 = r11
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ SQLException -> 0x0034, all -> 0x0031 }
            if (r10 == 0) goto L_0x002b
            boolean r1 = r10.moveToFirst()     // Catch:{ SQLException -> 0x0029 }
            if (r1 != 0) goto L_0x0021
            goto L_0x002b
        L_0x0021:
            java.lang.String r11 = r10.getString(r9)     // Catch:{ SQLException -> 0x0029 }
            r10.close()
            return r11
        L_0x0029:
            r1 = move-exception
            goto L_0x0037
        L_0x002b:
            if (r10 == 0) goto L_0x0030
            r10.close()
        L_0x0030:
            return r2
        L_0x0031:
            r10 = move-exception
            r11 = r10
            goto L_0x0058
        L_0x0034:
            r10 = move-exception
            r1 = r10
            r10 = r2
        L_0x0037:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r3.<init>(r0)     // Catch:{ all -> 0x0056 }
            r3.append(r12)     // Catch:{ all -> 0x0056 }
            java.lang.String r12 = " from "
            r3.append(r12)     // Catch:{ all -> 0x0056 }
            r3.append(r11)     // Catch:{ all -> 0x0056 }
            java.lang.String r11 = "GoogleSettings"
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x0056 }
            android.util.Log.e(r11, r12, r1)     // Catch:{ all -> 0x0056 }
            if (r10 == 0) goto L_0x0055
            r10.close()
        L_0x0055:
            return r2
        L_0x0056:
            r11 = move-exception
            r2 = r10
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r2.close()
        L_0x005d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10905k.C146603b.m238837a(android.content.ContentResolver, android.net.Uri, java.lang.String):java.lang.String");
    }
}
