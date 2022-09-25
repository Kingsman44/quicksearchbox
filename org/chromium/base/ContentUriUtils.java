package org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
public abstract class ContentUriUtils {

    /* renamed from: a */
    private static final Object f192490a = new Object();

    private ContentUriUtils() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|15|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.res.AssetFileDescriptor m107018a(java.lang.String r11) {
        /*
            android.content.Context r0 = org.chromium.base.C72382h.f192527a
            android.content.ContentResolver r0 = r0.getContentResolver()
            android.net.Uri r1 = android.net.Uri.parse(r11)
            r2 = 0
            r3 = 0
            boolean r4 = m107020c(r1)     // Catch:{ Exception -> 0x004f }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = "*/*"
            java.lang.String[] r4 = r0.getStreamTypes(r1, r4)     // Catch:{ Exception -> 0x004f }
            if (r4 == 0) goto L_0x005f
            int r5 = r4.length     // Catch:{ Exception -> 0x004f }
            if (r5 <= 0) goto L_0x005f
            r4 = r4[r3]     // Catch:{ Exception -> 0x004f }
            android.content.res.AssetFileDescriptor r0 = r0.openTypedAssetFileDescriptor(r1, r4, r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x003b
            long r4 = r0.getStartOffset()     // Catch:{ Exception -> 0x004f }
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0030
            goto L_0x003b
        L_0x0030:
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ Exception -> 0x004f }
            java.lang.String r1 = "Cannot open files with non-zero offset type."
            r0.<init>(r1)     // Catch:{ Exception -> 0x004f }
            throw r0     // Catch:{ Exception -> 0x004f }
        L_0x003b:
            return r0
        L_0x003c:
            java.lang.String r4 = "r"
            android.os.ParcelFileDescriptor r6 = r0.openFileDescriptor(r1, r4)     // Catch:{ Exception -> 0x004f }
            if (r6 == 0) goto L_0x005f
            android.content.res.AssetFileDescriptor r0 = new android.content.res.AssetFileDescriptor     // Catch:{ Exception -> 0x004f }
            r7 = 0
            r9 = -1
            r5 = r0
            r5.<init>(r6, r7, r9)     // Catch:{ Exception -> 0x004f }
            return r0
        L_0x004f:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r11 = 1
            r1[r11] = r0
            java.lang.String r11 = "ContentUriUtils"
            java.lang.String r0 = "Cannot open content uri: %s"
            org.chromium.base.C72387m.m107043d(r11, r0, r1)
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.m107018a(java.lang.String):android.content.res.AssetFileDescriptor");
    }

    /* renamed from: b */
    private static boolean m107019b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("flags");
        return columnIndex >= 0 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    /* renamed from: c */
    private static boolean m107020c(Uri uri) {
        Cursor query;
        if (uri != null && DocumentsContract.isDocumentUri(C72382h.f192527a, uri)) {
            try {
                query = C72382h.f192527a.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    if (query.getCount() > 0) {
                        query.moveToFirst();
                        boolean b = m107019b(query);
                        query.close();
                        return b;
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (NullPointerException unused) {
            } catch (Throwable th) {
                C72380f.m107039a(th, th);
            }
        }
        return false;
        throw th;
    }

    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a = m107018a(str);
        boolean z = a != null;
        if (a != null) {
            try {
                a.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    public static boolean delete(String str) {
        return C72382h.f192527a.getContentResolver().delete(Uri.parse(str), (String) null, (String[]) null) > 0;
    }

    public static String getContentUriFromFilePath(String str) {
        try {
            new File(str);
            synchronized (f192490a) {
            }
            return null;
        } catch (IllegalArgumentException e) {
            C72387m.m107041b("ContentUriUtils", "Cannot retrieve content uri from file: %s", str, e);
            return null;
        }
    }

    public static String getMimeType(String str) {
        ContentResolver contentResolver = C72382h.f192527a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!m107020c(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0078, code lost:
        if (r0 != null) goto L_0x0030;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String maybeGetDisplayName(java.lang.String r12) {
        /*
            android.net.Uri r6 = android.net.Uri.parse(r12)
            r7 = 0
            r8 = 0
            android.content.Context r0 = org.chromium.base.C72382h.f192527a     // Catch:{ Exception -> 0x0083 }
            java.lang.String r9 = "_display_name"
            java.lang.String r10 = ""
            if (r6 != 0) goto L_0x0010
            goto L_0x007b
        L_0x0010:
            android.content.ContentResolver r11 = r0.getContentResolver()     // Catch:{ Exception -> 0x0083 }
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r11
            r1 = r6
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch:{ NullPointerException -> 0x007b }
            if (r0 == 0) goto L_0x0078
            int r1 = r0.getCount()     // Catch:{ all -> 0x006e }
            if (r1 <= 0) goto L_0x0078
            r0.moveToFirst()     // Catch:{ all -> 0x006e }
            int r1 = r0.getColumnIndex(r9)     // Catch:{ all -> 0x006e }
            r2 = -1
            if (r1 != r2) goto L_0x0034
        L_0x0030:
            r0.close()     // Catch:{ NullPointerException -> 0x007b }
            goto L_0x007b
        L_0x0034:
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x006e }
            boolean r2 = m107019b(r0)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0069
            java.lang.String r2 = "*/*"
            java.lang.String[] r2 = r11.getStreamTypes(r6, r2)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0069
            int r3 = r2.length     // Catch:{ all -> 0x006e }
            if (r3 <= 0) goto L_0x0069
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ all -> 0x006e }
            r2 = r2[r8]     // Catch:{ all -> 0x006e }
            java.lang.String r2 = r3.getExtensionFromMimeType(r2)     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0069
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r3.<init>()     // Catch:{ all -> 0x006e }
            r3.append(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = "."
            r3.append(r1)     // Catch:{ all -> 0x006e }
            r3.append(r2)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x006e }
        L_0x0069:
            r0.close()     // Catch:{ NullPointerException -> 0x007b }
            r10 = r1
            goto L_0x007b
        L_0x006e:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            org.chromium.base.C72380f.m107039a(r1, r0)     // Catch:{ NullPointerException -> 0x007b }
        L_0x0077:
            throw r1     // Catch:{ NullPointerException -> 0x007b }
        L_0x0078:
            if (r0 == 0) goto L_0x007b
            goto L_0x0030
        L_0x007b:
            boolean r12 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0083 }
            if (r12 == 0) goto L_0x0082
            return r7
        L_0x0082:
            return r10
        L_0x0083:
            r0 = move-exception
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r12
            r12 = 1
            r1[r12] = r0
            java.lang.String r12 = "ContentUriUtils"
            java.lang.String r0 = "Cannot open content uri: %s"
            org.chromium.base.C72387m.m107043d(r12, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ContentUriUtils.maybeGetDisplayName(java.lang.String):java.lang.String");
    }

    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a = m107018a(str);
        if (a != null) {
            return a.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }
}
