package androidx.core.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.File;
import java.util.HashMap;

/* compiled from: PG */
public class FileProvider extends ContentProvider {

    /* renamed from: a */
    private static final String[] f5707a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f5708b = new File("/");

    /* renamed from: c */
    private static final HashMap f5709c = new HashMap();

    /* renamed from: d */
    private C1884j f5710d;

    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        f5709c.put(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0115, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0115 A[ExcHandler: XmlPullParserException (r10v3 'e' org.xmlpull.v1.XmlPullParserException A[CUSTOM_DECLARE]), Splitter:B:5:0x000b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.content.C1884j m5057a(android.content.Context r10, java.lang.String r11) {
        /*
            java.util.HashMap r0 = f5709c
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x0129 }
            androidx.core.content.j r1 = (androidx.core.content.C1884j) r1     // Catch:{ all -> 0x0129 }
            if (r1 != 0) goto L_0x0127
            androidx.core.content.j r1 = new androidx.core.content.j     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r1.<init>(r11)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r2 = r2.resolveContentProvider(r11, r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r2 == 0) goto L_0x0105
            android.os.Bundle r3 = r2.metaData     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            android.content.pm.PackageManager r3 = r10.getPackageManager()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r4 = "android.support.FILE_PROVIDER_PATHS"
            android.content.res.XmlResourceParser r2 = r2.loadXmlMetaData(r3, r4)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r2 == 0) goto L_0x00fd
        L_0x002a:
            int r3 = r2.next()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r4 = 1
            if (r3 == r4) goto L_0x00f7
            r5 = 2
            if (r3 != r5) goto L_0x002a
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r5 = "name"
            r6 = 0
            java.lang.String r5 = r2.getAttributeValue(r6, r5)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r7 = "path"
            java.lang.String r7 = r2.getAttributeValue(r6, r7)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r8 = "root-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r9 = 0
            if (r8 == 0) goto L_0x0051
            java.io.File r6 = f5708b     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x00ad
        L_0x0051:
            java.lang.String r8 = "files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 == 0) goto L_0x005e
            java.io.File r6 = r10.getFilesDir()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x00ad
        L_0x005e:
            java.lang.String r8 = "cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 == 0) goto L_0x006b
            java.io.File r6 = r10.getCacheDir()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x00ad
        L_0x006b:
            java.lang.String r8 = "external-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 == 0) goto L_0x0078
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x00ad
        L_0x0078:
            java.lang.String r8 = "external-files-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 == 0) goto L_0x008a
            java.io.File[] r3 = androidx.core.content.C1851b.m5072b(r10, r6)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            int r8 = r3.length     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 <= 0) goto L_0x00ad
            r6 = r3[r9]     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x00ad
        L_0x008a:
            java.lang.String r8 = "external-cache-path"
            boolean r8 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 == 0) goto L_0x009c
            java.io.File[] r3 = androidx.core.content.C1851b.m5071a(r10)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            int r8 = r3.length     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 <= 0) goto L_0x00ad
            r6 = r3[r9]     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x00ad
        L_0x009c:
            java.lang.String r8 = "external-media-path"
            boolean r3 = r8.equals(r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r3 == 0) goto L_0x00ad
            java.io.File[] r3 = androidx.core.content.C1883i.m5139a(r10)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            int r8 = r3.length     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r8 <= 0) goto L_0x00ad
            r6 = r3[r9]     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
        L_0x00ad:
            if (r6 == 0) goto L_0x002a
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r3[r9] = r7     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
        L_0x00b3:
            if (r9 > 0) goto L_0x00c2
            r4 = r3[r9]     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r4 == 0) goto L_0x00bf
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r7.<init>(r6, r4)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r6 = r7
        L_0x00bf:
            int r9 = r9 + 1
            goto L_0x00b3
        L_0x00c2:
            boolean r3 = android.text.TextUtils.isEmpty(r5)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            if (r3 != 0) goto L_0x00ef
            java.io.File r3 = r6.getCanonicalFile()     // Catch:{ IOException -> 0x00d3, XmlPullParserException -> 0x0115 }
            java.util.HashMap r4 = r1.f5767a     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r4.put(r5, r3)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            goto L_0x002a
        L_0x00d3:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r1.<init>()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r2 = "Failed to resolve canonical path for "
            r1.append(r2)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r1.append(r6)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r1 = r6.toString()     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r1 = r2.concat(r1)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r11.<init>(r1, r10)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            throw r11     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
        L_0x00ef:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r11 = "Name must not be empty"
            r10.<init>(r11)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            throw r10     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
        L_0x00f7:
            java.util.HashMap r10 = f5709c     // Catch:{ all -> 0x0129 }
            r10.put(r11, r1)     // Catch:{ all -> 0x0129 }
            goto L_0x0127
        L_0x00fd:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r11 = "Missing android.support.FILE_PROVIDER_PATHS meta-data"
            r10.<init>(r11)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            throw r10     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
        L_0x0105:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r1 = "Couldn't find meta-data for provider with authority "
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            java.lang.String r11 = r1.concat(r11)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            r10.<init>(r11)     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
            throw r10     // Catch:{ IOException -> 0x011e, XmlPullParserException -> 0x0115 }
        L_0x0115:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r11.<init>(r1, r10)     // Catch:{ all -> 0x0129 }
            throw r11     // Catch:{ all -> 0x0129 }
        L_0x011e:
            r10 = move-exception
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0129 }
            java.lang.String r1 = "Failed to parse android.support.FILE_PROVIDER_PATHS meta-data"
            r11.<init>(r1, r10)     // Catch:{ all -> 0x0129 }
            throw r11     // Catch:{ all -> 0x0129 }
        L_0x0127:
            monitor-exit(r0)     // Catch:{ all -> 0x0129 }
            return r1
        L_0x0129:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0129 }
            goto L_0x012d
        L_0x012c:
            throw r10
        L_0x012d:
            goto L_0x012c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.m5057a(android.content.Context, java.lang.String):androidx.core.content.j");
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            String str = providerInfo.authority.split(";")[0];
            HashMap hashMap = f5709c;
            synchronized (hashMap) {
                hashMap.remove(str);
            }
            this.f5710d = m5057a(context, str);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return this.f5710d.mo5045b(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getType(android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.j r0 = r2.f5710d
            java.io.File r3 = r0.mo5045b(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public final boolean onCreate() {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File b = this.f5710d.mo5045b(uri);
        if (C33259r.f88929b.equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
        }
        return ParcelFileDescriptor.open(b, i);
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File b = this.f5710d.mo5045b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f5707a;
        }
        String[] strArr3 = new String[r11];
        Object[] objArr = new Object[r11];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? b.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(b.length());
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
