package com.bumptech.glide.load.data.p306a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.C5543d;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.data.C5930e;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.data.a.d */
/* compiled from: PG */
public final class C5924d implements C5930e {

    /* renamed from: a */
    private final Uri f17571a;

    /* renamed from: b */
    private final C5926f f17572b;

    /* renamed from: c */
    private InputStream f17573c;

    public C5924d(Uri uri, C5926f fVar) {
        this.f17571a = uri;
        this.f17572b = fVar;
    }

    /* renamed from: f */
    public static C5924d m15292f(Context context, Uri uri, C5925e eVar) {
        return new C5924d(uri, new C5926f(C5543d.m14321a(context).f16789b.mo12092a().mo12438a(), eVar, C5543d.m14321a(context).f16790c, context.getContentResolver()));
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return InputStream.class;
    }

    /* renamed from: c */
    public final void mo11923c() {
    }

    /* renamed from: d */
    public final void mo11924d() {
        InputStream inputStream = this.f17573c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.bumptech.glide.load.data.k} */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r7 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004d, code lost:
        if (r7 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4 = java.lang.String.valueOf(r5);
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("NPE opening uri: " + r4 + " -> " + r2).initCause(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e4, code lost:
        if (r6 != 0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0101, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0108, code lost:
        if (android.util.Log.isLoggable("MediaStoreThumbFetcher", 3) != false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x010a, code lost:
        android.util.Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x010f, code lost:
        r14.mo12184g(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0112, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00e9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[Catch:{ all -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a4 A[Catch:{ all -> 0x00be, NullPointerException -> 0x0078, FileNotFoundException -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ed A[Catch:{ all -> 0x00be, NullPointerException -> 0x0078, FileNotFoundException -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00fd A[Catch:{ all -> 0x00be, NullPointerException -> 0x0078, FileNotFoundException -> 0x0101 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11925e(com.bumptech.glide.C5997p r13, com.bumptech.glide.load.data.C5929d r14) {
        /*
            r12 = this;
            java.lang.String r13 = "ThumbStreamOpener"
            java.lang.String r0 = "NPE opening uri: "
            java.lang.String r1 = "Failed to open uri: "
            java.lang.String r2 = "Failed to query for thumbnail for Uri: "
            r3 = 3
            com.bumptech.glide.load.data.a.f r4 = r12.f17572b     // Catch:{ FileNotFoundException -> 0x0101 }
            android.net.Uri r5 = r12.f17571a     // Catch:{ FileNotFoundException -> 0x0101 }
            r6 = 0
            com.bumptech.glide.load.data.a.e r7 = r4.f17574a     // Catch:{ SecurityException -> 0x0031, all -> 0x002e }
            android.database.Cursor r7 = r7.mo12379a(r5)     // Catch:{ SecurityException -> 0x0031, all -> 0x002e }
            if (r7 == 0) goto L_0x0027
            boolean r8 = r7.moveToFirst()     // Catch:{ SecurityException -> 0x0025 }
            if (r8 == 0) goto L_0x0027
            r8 = 0
            java.lang.String r2 = r7.getString(r8)     // Catch:{ SecurityException -> 0x0025 }
            r7.close()     // Catch:{ FileNotFoundException -> 0x0101 }
            goto L_0x0050
        L_0x0025:
            r8 = move-exception
            goto L_0x0034
        L_0x0027:
            if (r7 == 0) goto L_0x002c
        L_0x0029:
            r7.close()     // Catch:{ FileNotFoundException -> 0x0101 }
        L_0x002c:
            r2 = r6
            goto L_0x0050
        L_0x002e:
            r13 = move-exception
            goto L_0x00fb
        L_0x0031:
            r7 = move-exception
            r8 = r7
            r7 = r6
        L_0x0034:
            boolean r9 = android.util.Log.isLoggable(r13, r3)     // Catch:{ all -> 0x00f9 }
            if (r9 == 0) goto L_0x004d
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00f9 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f9 }
            r10.<init>(r2)     // Catch:{ all -> 0x00f9 }
            r10.append(r9)     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x00f9 }
            android.util.Log.d(r13, r2, r8)     // Catch:{ all -> 0x00f9 }
        L_0x004d:
            if (r7 == 0) goto L_0x002c
            goto L_0x0029
        L_0x0050:
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ FileNotFoundException -> 0x0101 }
            if (r7 == 0) goto L_0x0058
        L_0x0056:
            r0 = r6
            goto L_0x00a1
        L_0x0058:
            java.io.File r7 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0101 }
            r7.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0101 }
            boolean r2 = r7.exists()     // Catch:{ FileNotFoundException -> 0x0101 }
            if (r2 == 0) goto L_0x0056
            long r8 = r7.length()     // Catch:{ FileNotFoundException -> 0x0101 }
            r10 = 0
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x0056
            android.net.Uri r2 = android.net.Uri.fromFile(r7)     // Catch:{ FileNotFoundException -> 0x0101 }
            android.content.ContentResolver r4 = r4.f17576c     // Catch:{ NullPointerException -> 0x0078 }
            java.io.InputStream r0 = r4.openInputStream(r2)     // Catch:{ NullPointerException -> 0x0078 }
            goto L_0x00a1
        L_0x0078:
            r13 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0101 }
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ FileNotFoundException -> 0x0101 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ FileNotFoundException -> 0x0101 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0101 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0101 }
            r5.append(r4)     // Catch:{ FileNotFoundException -> 0x0101 }
            java.lang.String r0 = " -> "
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0101 }
            r5.append(r2)     // Catch:{ FileNotFoundException -> 0x0101 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0101 }
            r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0101 }
            java.lang.Throwable r13 = r1.initCause(r13)     // Catch:{ FileNotFoundException -> 0x0101 }
            java.io.FileNotFoundException r13 = (java.io.FileNotFoundException) r13     // Catch:{ FileNotFoundException -> 0x0101 }
            throw r13     // Catch:{ FileNotFoundException -> 0x0101 }
        L_0x00a1:
            r2 = -1
            if (r0 == 0) goto L_0x00ea
            com.bumptech.glide.load.data.a.f r4 = r12.f17572b     // Catch:{ FileNotFoundException -> 0x0101 }
            android.net.Uri r5 = r12.f17571a     // Catch:{ FileNotFoundException -> 0x0101 }
            android.content.ContentResolver r7 = r4.f17576c     // Catch:{ IOException -> 0x00c2, NullPointerException -> 0x00c0 }
            java.io.InputStream r6 = r7.openInputStream(r5)     // Catch:{ IOException -> 0x00c2, NullPointerException -> 0x00c0 }
            java.util.List r7 = r4.f17577d     // Catch:{ IOException -> 0x00c2, NullPointerException -> 0x00c0 }
            com.bumptech.glide.load.a.a.b r4 = r4.f17575b     // Catch:{ IOException -> 0x00c2, NullPointerException -> 0x00c0 }
            int r13 = com.bumptech.glide.load.C5954m.m15364a(r7, r6, r4)     // Catch:{ IOException -> 0x00c2, NullPointerException -> 0x00c0 }
            if (r6 == 0) goto L_0x00eb
            r6.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00eb
        L_0x00bc:
            goto L_0x00eb
        L_0x00be:
            r13 = move-exception
            goto L_0x00e4
        L_0x00c0:
            r4 = move-exception
            goto L_0x00c3
        L_0x00c2:
            r4 = move-exception
        L_0x00c3:
            boolean r7 = android.util.Log.isLoggable(r13, r3)     // Catch:{ all -> 0x00be }
            if (r7 == 0) goto L_0x00dc
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00be }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00be }
            r7.<init>(r1)     // Catch:{ all -> 0x00be }
            r7.append(r5)     // Catch:{ all -> 0x00be }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x00be }
            android.util.Log.d(r13, r1, r4)     // Catch:{ all -> 0x00be }
        L_0x00dc:
            if (r6 == 0) goto L_0x00ea
            r6.close()     // Catch:{ IOException -> 0x00e2 }
            goto L_0x00ea
        L_0x00e2:
            goto L_0x00ea
        L_0x00e4:
            if (r6 == 0) goto L_0x00e9
            r6.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            throw r13     // Catch:{ FileNotFoundException -> 0x0101 }
        L_0x00ea:
            r13 = -1
        L_0x00eb:
            if (r13 == r2) goto L_0x00f3
            com.bumptech.glide.load.data.k r1 = new com.bumptech.glide.load.data.k     // Catch:{ FileNotFoundException -> 0x0101 }
            r1.<init>(r0, r13)     // Catch:{ FileNotFoundException -> 0x0101 }
            r0 = r1
        L_0x00f3:
            r12.f17573c = r0     // Catch:{ FileNotFoundException -> 0x0101 }
            r14.mo12183f(r0)     // Catch:{ FileNotFoundException -> 0x0101 }
            return
        L_0x00f9:
            r13 = move-exception
            r6 = r7
        L_0x00fb:
            if (r6 == 0) goto L_0x0100
            r6.close()     // Catch:{ FileNotFoundException -> 0x0101 }
        L_0x0100:
            throw r13     // Catch:{ FileNotFoundException -> 0x0101 }
        L_0x0101:
            r13 = move-exception
            java.lang.String r0 = "MediaStoreThumbFetcher"
            boolean r1 = android.util.Log.isLoggable(r0, r3)
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = "Failed to find thumbnail file"
            android.util.Log.d(r0, r1, r13)
        L_0x010f:
            r14.mo12184g(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.p306a.C5924d.mo11925e(com.bumptech.glide.p, com.bumptech.glide.load.data.d):void");
    }
}
