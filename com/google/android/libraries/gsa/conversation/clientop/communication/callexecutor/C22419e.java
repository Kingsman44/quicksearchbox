package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import android.telephony.PhoneNumberUtils;
import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.e */
/* compiled from: PG */
public final class C22419e {
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0058 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m41852a(android.content.ContentResolver r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "content://com.android.contacts/data/"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.setAction(r2)
            java.lang.String r2 = "com.whatsapp"
            r1.setPackage(r2)
            r2 = 0
            android.net.Uri r4 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x0061 }
            r3 = 2
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0061 }
            r3 = 0
            r7[r3] = r11     // Catch:{ all -> 0x0061 }
            r3 = 1
            r7[r3] = r10     // Catch:{ all -> 0x0061 }
            r5 = 0
            java.lang.String r6 = "mimetype=? AND data1=?"
            java.lang.String r8 = "display_name"
            r3 = r9
            android.database.Cursor r9 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x0050
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x004d }
            if (r10 == 0) goto L_0x0050
            java.lang.String r10 = "_id"
            int r10 = r9.getColumnIndex(r10)     // Catch:{ all -> 0x004d }
            long r3 = r9.getLong(r10)     // Catch:{ all -> 0x004d }
            java.lang.Long r10 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x004d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            r3.<init>(r0)     // Catch:{ all -> 0x004d }
            r3.append(r10)     // Catch:{ all -> 0x004d }
            java.lang.String r10 = r3.toString()     // Catch:{ all -> 0x004d }
            r9.close()
            goto L_0x0056
        L_0x004d:
            r10 = move-exception
            r2 = r9
            goto L_0x0063
        L_0x0050:
            if (r9 == 0) goto L_0x0055
            r9.close()
        L_0x0055:
            r10 = r2
        L_0x0056:
            if (r10 != 0) goto L_0x0059
            return r2
        L_0x0059:
            android.net.Uri r9 = android.net.Uri.parse(r10)
            r1.setDataAndType(r9, r11)
            return r1
        L_0x0061:
            r9 = move-exception
            r10 = r9
        L_0x0063:
            if (r2 == 0) goto L_0x0068
            r2.close()
        L_0x0068:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor.C22419e.m41852a(android.content.ContentResolver, java.lang.String, java.lang.String):android.content.Intent");
    }

    /* renamed from: b */
    public static String m41853b(String str) {
        return String.format("%s@s.whatsapp.net", new Object[]{PhoneNumberUtils.normalizeNumber(str).replace("+", BuildConfig.FLAVOR)});
    }
}
