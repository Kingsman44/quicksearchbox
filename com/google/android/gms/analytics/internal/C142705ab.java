package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.C143919bh;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.analytics.internal.ab */
/* compiled from: PG */
public final class C142705ab extends C142737g {

    /* renamed from: a */
    public volatile String f387231a;

    /* renamed from: b */
    public Future f387232b;

    protected C142705ab(C142740j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
    }

    /* renamed from: b */
    public final String mo117491b() {
        String str;
        mo117537k();
        synchronized (this) {
            if (this.f387231a == null) {
                this.f387232b = this.f387328e.mo117542b().mo117602a(new C142756z(this));
            }
            Future future = this.f387232b;
            if (future != null) {
                try {
                    this.f387231a = (String) future.get();
                } catch (InterruptedException e) {
                    super.mo117536i(5, "ClientId loading or generation was interrupted", e, (Object) null, (Object) null);
                    this.f387231a = "0";
                } catch (ExecutionException e2) {
                    super.mo117536i(6, "Failed to load or generate client id", e2, (Object) null, (Object) null);
                    this.f387231a = "0";
                }
                if (this.f387231a == null) {
                    this.f387231a = "0";
                }
                super.mo117536i(2, "Loaded clientId", this.f387231a, (Object) null, (Object) null);
                this.f387232b = null;
            }
            str = this.f387231a;
        }
        return str;
    }

    /* renamed from: c */
    public final String mo117492c() {
        FileOutputStream fileOutputStream;
        int i;
        String str;
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        try {
            Context context = this.f387328e.mo117542b().f387399b;
            C143919bh.m233969l(lowerCase);
            C143919bh.m233965h("ClientId should be saved from worker thread");
            fileOutputStream = null;
            try {
                super.mo117536i(2, "Storing clientId", lowerCase, (Object) null, (Object) null);
                fileOutputStream = context.openFileOutput("gaClientId", 0);
                fileOutputStream.write(lowerCase.getBytes());
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        super.mo117536i(6, "Failed to close clientId writing stream", e, (Object) null, (Object) null);
                    }
                }
                return lowerCase;
                super.mo117536i(i, str, e, (Object) null, (Object) null);
                return "0";
            } catch (FileNotFoundException e2) {
                super.mo117536i(6, "Error creating clientId file", e2, (Object) null, (Object) null);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        i = 6;
                        str = "Failed to close clientId writing stream";
                    }
                }
                return "0";
            } catch (IOException e4) {
                super.mo117536i(6, "Error writing to clientId file", e4, (Object) null, (Object) null);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e = e5;
                        i = 6;
                        str = "Failed to close clientId writing stream";
                    }
                }
                return "0";
            }
        } catch (Exception e6) {
            super.mo117536i(6, "Error saving clientId file", e6, (Object) null, (Object) null);
            return "0";
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e7) {
                    super.mo117536i(6, "Failed to close clientId writing stream", e7, (Object) null, (Object) null);
                }
            }
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009b A[SYNTHETIC, Splitter:B:40:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a4 A[SYNTHETIC, Splitter:B:45:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b8 A[SYNTHETIC, Splitter:B:53:0x00b8] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00cf A[RETURN] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo117493d() {
        /*
            r12 = this;
            java.lang.String r1 = "gaClientId"
            com.google.android.gms.analytics.internal.j r0 = r12.f387328e
            com.google.android.gms.analytics.q r0 = r0.mo117542b()
            android.content.Context r8 = r0.f387399b
            java.lang.String r0 = "ClientId should be loaded from worker thread"
            com.google.android.gms.common.internal.C143919bh.m233965h(r0)
            r9 = 0
            java.io.FileInputStream r10 = r8.openFileInput(r1)     // Catch:{ FileNotFoundException -> 0x00b4, IOException -> 0x008a, all -> 0x0087 }
            r0 = 36
            byte[] r2 = new byte[r0]     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            r3 = 0
            int r0 = r10.read(r2, r3, r0)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            int r4 = r10.available()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            if (r4 <= 0) goto L_0x0041
            java.lang.String r4 = "clientId file seems corrupted, deleting it."
            r3 = 5
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r12
            super.mo117536i(r3, r4, r5, r6, r7)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            r8.deleteFile(r1)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            if (r10 == 0) goto L_0x00c8
            r10.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x00c8
        L_0x003a:
            r0 = move-exception
            r1 = r0
            r3 = 6
            java.lang.String r4 = "Failed to close client id reading stream"
            goto L_0x00c1
        L_0x0041:
            r4 = 14
            if (r0 >= r4) goto L_0x005c
            java.lang.String r4 = "clientId file is empty, deleting it."
            r3 = 5
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r12
            super.mo117536i(r3, r4, r5, r6, r7)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            r10.close()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            r8.deleteFile(r1)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            if (r10 == 0) goto L_0x00c8
            r10.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00c8
        L_0x005c:
            r10.close()     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            java.lang.String r11 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            r11.<init>(r2, r3, r0)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            java.lang.String r4 = "Read client id from disk"
            r3 = 2
            r6 = 0
            r7 = 0
            r2 = r12
            r5 = r11
            super.mo117536i(r3, r4, r5, r6, r7)     // Catch:{ FileNotFoundException -> 0x0085, IOException -> 0x0082 }
            if (r10 == 0) goto L_0x0080
            r10.close()     // Catch:{ IOException -> 0x0074 }
            goto L_0x0080
        L_0x0074:
            r0 = move-exception
            r1 = r0
            r3 = 6
            java.lang.String r4 = "Failed to close client id reading stream"
            r6 = 0
            r7 = 0
            r2 = r12
            r5 = r1
            super.mo117536i(r3, r4, r5, r6, r7)
        L_0x0080:
            r9 = r11
            goto L_0x00c8
        L_0x0082:
            r0 = move-exception
            r5 = r0
            goto L_0x008d
        L_0x0085:
            goto L_0x00b6
        L_0x0087:
            r0 = move-exception
            r1 = r0
            goto L_0x00a2
        L_0x008a:
            r0 = move-exception
            r5 = r0
            r10 = r9
        L_0x008d:
            java.lang.String r4 = "Error reading client id file, deleting it"
            r3 = 6
            r6 = 0
            r7 = 0
            r2 = r12
            super.mo117536i(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x009f }
            r8.deleteFile(r1)     // Catch:{ all -> 0x009f }
            if (r10 == 0) goto L_0x00c8
            r10.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00c8
        L_0x009f:
            r0 = move-exception
            r1 = r0
            r9 = r10
        L_0x00a2:
            if (r9 == 0) goto L_0x00b3
            r9.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x00b3
        L_0x00a8:
            r0 = move-exception
            r5 = r0
            r3 = 6
            java.lang.String r4 = "Failed to close client id reading stream"
            r6 = 0
            r7 = 0
            r2 = r12
            super.mo117536i(r3, r4, r5, r6, r7)
        L_0x00b3:
            throw r1
        L_0x00b4:
            r10 = r9
        L_0x00b6:
            if (r10 == 0) goto L_0x00c8
            r10.close()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00c8
        L_0x00bc:
            r0 = move-exception
            r1 = r0
            r3 = 6
            java.lang.String r4 = "Failed to close client id reading stream"
        L_0x00c1:
            r6 = 0
            r7 = 0
            r2 = r12
            r5 = r1
            super.mo117536i(r3, r4, r5, r6, r7)
        L_0x00c8:
            if (r9 != 0) goto L_0x00cf
            java.lang.String r0 = r12.mo117492c()
            return r0
        L_0x00cf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.internal.C142705ab.mo117493d():java.lang.String");
    }
}
