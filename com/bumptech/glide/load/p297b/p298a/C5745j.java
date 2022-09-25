package com.bumptech.glide.load.p297b.p298a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.data.C5930e;
import com.bumptech.glide.load.p297b.C5764ap;

/* renamed from: com.bumptech.glide.load.b.a.j */
/* compiled from: PG */
final class C5745j implements C5930e {

    /* renamed from: a */
    private static final String[] f17303a = {"_data"};

    /* renamed from: b */
    private final Context f17304b;

    /* renamed from: c */
    private final C5764ap f17305c;

    /* renamed from: d */
    private final C5764ap f17306d;

    /* renamed from: e */
    private final Uri f17307e;

    /* renamed from: f */
    private final int f17308f;

    /* renamed from: g */
    private final int f17309g;

    /* renamed from: h */
    private final C5960s f17310h;

    /* renamed from: i */
    private final Class f17311i;

    /* renamed from: j */
    private volatile boolean f17312j;

    /* renamed from: k */
    private volatile C5930e f17313k;

    public C5745j(Context context, C5764ap apVar, C5764ap apVar2, Uri uri, int i, int i2, C5960s sVar, Class cls) {
        this.f17304b = context.getApplicationContext();
        this.f17305c = apVar;
        this.f17306d = apVar2;
        this.f17307e = uri;
        this.f17308f = i;
        this.f17309g = i2;
        this.f17310h = sVar;
        this.f17311i = cls;
    }

    /* renamed from: a */
    public final C5637a mo11921a() {
        return C5637a.LOCAL;
    }

    /* renamed from: b */
    public final Class mo11922b() {
        return this.f17311i;
    }

    /* renamed from: c */
    public final void mo11923c() {
        this.f17312j = true;
        C5930e eVar = this.f17313k;
        if (eVar != null) {
            eVar.mo11923c();
        }
    }

    /* renamed from: d */
    public final void mo11924d() {
        C5930e eVar = this.f17313k;
        if (eVar != null) {
            eVar.mo11924d();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [com.bumptech.glide.load.data.e] */
    /* JADX WARNING: type inference failed for: r4v3, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e A[SYNTHETIC, Splitter:B:25:0x007e] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11925e(com.bumptech.glide.C5997p r13, com.bumptech.glide.load.data.C5929d r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Failed to build fetcher for: "
            java.lang.String r1 = "File path was empty in media store for: "
            java.lang.String r2 = "Failed to media store entry for: "
            boolean r3 = android.os.Environment.isExternalStorageLegacy()     // Catch:{ FileNotFoundException -> 0x00d0 }
            r4 = 0
            if (r3 == 0) goto L_0x0082
            com.bumptech.glide.load.b.ap r3 = r12.f17305c     // Catch:{ FileNotFoundException -> 0x00d0 }
            android.net.Uri r11 = r12.f17307e     // Catch:{ FileNotFoundException -> 0x00d0 }
            android.content.Context r5 = r12.f17304b     // Catch:{ all -> 0x007b }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ all -> 0x007b }
            java.lang.String[] r7 = f17303a     // Catch:{ all -> 0x007b }
            r8 = 0
            r9 = 0
            r10 = 0
            r6 = r11
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x007b }
            if (r5 == 0) goto L_0x0062
            boolean r6 = r5.moveToFirst()     // Catch:{ all -> 0x0078 }
            if (r6 == 0) goto L_0x0062
            java.lang.String r2 = "_data"
            int r2 = r5.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0078 }
            java.lang.String r2 = r5.getString(r2)     // Catch:{ all -> 0x0078 }
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0078 }
            if (r6 != 0) goto L_0x004c
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0078 }
            r1.<init>(r2)     // Catch:{ all -> 0x0078 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x00d0 }
            int r2 = r12.f17308f     // Catch:{ FileNotFoundException -> 0x00d0 }
            int r5 = r12.f17309g     // Catch:{ FileNotFoundException -> 0x00d0 }
            com.bumptech.glide.load.s r6 = r12.f17310h     // Catch:{ FileNotFoundException -> 0x00d0 }
            com.bumptech.glide.load.b.ao r1 = r3.mo11928a(r1, r2, r5, r6)     // Catch:{ FileNotFoundException -> 0x00d0 }
            goto L_0x00a1
        L_0x004c:
            java.io.FileNotFoundException r13 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r2.<init>(r1)     // Catch:{ all -> 0x0078 }
            r2.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0078 }
            r13.<init>(r0)     // Catch:{ all -> 0x0078 }
            throw r13     // Catch:{ all -> 0x0078 }
        L_0x0062:
            java.io.FileNotFoundException r13 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0078 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0078 }
            r1.<init>(r2)     // Catch:{ all -> 0x0078 }
            r1.append(r0)     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0078 }
            r13.<init>(r0)     // Catch:{ all -> 0x0078 }
            throw r13     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r13 = move-exception
            r4 = r5
            goto L_0x007c
        L_0x007b:
            r13 = move-exception
        L_0x007c:
            if (r4 == 0) goto L_0x0081
            r4.close()     // Catch:{ FileNotFoundException -> 0x00d0 }
        L_0x0081:
            throw r13     // Catch:{ FileNotFoundException -> 0x00d0 }
        L_0x0082:
            android.content.Context r1 = r12.f17304b     // Catch:{ FileNotFoundException -> 0x00d0 }
            java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
            int r1 = r1.checkSelfPermission(r2)     // Catch:{ FileNotFoundException -> 0x00d0 }
            if (r1 != 0) goto L_0x0093
            android.net.Uri r1 = r12.f17307e     // Catch:{ FileNotFoundException -> 0x00d0 }
            android.net.Uri r1 = android.provider.MediaStore.setRequireOriginal(r1)     // Catch:{ FileNotFoundException -> 0x00d0 }
            goto L_0x0095
        L_0x0093:
            android.net.Uri r1 = r12.f17307e     // Catch:{ FileNotFoundException -> 0x00d0 }
        L_0x0095:
            com.bumptech.glide.load.b.ap r2 = r12.f17306d     // Catch:{ FileNotFoundException -> 0x00d0 }
            int r3 = r12.f17308f     // Catch:{ FileNotFoundException -> 0x00d0 }
            int r5 = r12.f17309g     // Catch:{ FileNotFoundException -> 0x00d0 }
            com.bumptech.glide.load.s r6 = r12.f17310h     // Catch:{ FileNotFoundException -> 0x00d0 }
            com.bumptech.glide.load.b.ao r1 = r2.mo11928a(r1, r3, r5, r6)     // Catch:{ FileNotFoundException -> 0x00d0 }
        L_0x00a1:
            if (r1 == 0) goto L_0x00a5
            com.bumptech.glide.load.data.e r4 = r1.f17348c     // Catch:{ FileNotFoundException -> 0x00d0 }
        L_0x00a5:
            if (r4 != 0) goto L_0x00c2
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException     // Catch:{ FileNotFoundException -> 0x00d0 }
            android.net.Uri r1 = r12.f17307e     // Catch:{ FileNotFoundException -> 0x00d0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ FileNotFoundException -> 0x00d0 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00d0 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00d0 }
            r2.append(r1)     // Catch:{ FileNotFoundException -> 0x00d0 }
            java.lang.String r0 = r2.toString()     // Catch:{ FileNotFoundException -> 0x00d0 }
            r13.<init>(r0)     // Catch:{ FileNotFoundException -> 0x00d0 }
            r14.mo12184g(r13)     // Catch:{ FileNotFoundException -> 0x00d0 }
            return
        L_0x00c2:
            r12.f17313k = r4     // Catch:{ FileNotFoundException -> 0x00d0 }
            boolean r0 = r12.f17312j     // Catch:{ FileNotFoundException -> 0x00d0 }
            if (r0 == 0) goto L_0x00cc
            r12.mo11923c()     // Catch:{ FileNotFoundException -> 0x00d0 }
            return
        L_0x00cc:
            r4.mo11925e(r13, r14)     // Catch:{ FileNotFoundException -> 0x00d0 }
            return
        L_0x00d0:
            r13 = move-exception
            r14.mo12184g(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p297b.p298a.C5745j.mo11925e(com.bumptech.glide.p, com.bumptech.glide.load.data.d):void");
    }
}
