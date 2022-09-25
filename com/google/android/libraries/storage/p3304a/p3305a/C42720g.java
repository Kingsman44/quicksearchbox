package com.google.android.libraries.storage.p3304a.p3305a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;

/* renamed from: com.google.android.libraries.storage.a.a.g */
/* compiled from: PG */
public final class C42720g {

    /* renamed from: a */
    private final Context f111978a;

    /* renamed from: b */
    private final C42729p f111979b;

    public C42720g(Context context, C42729p pVar) {
        this.f111978a = context;
        this.f111979b = pVar;
    }

    /* renamed from: b */
    public static void m75464b(Uri uri) {
        if (!uri.getScheme().equals("android")) {
            throw new C42764q("Scheme must be 'android'");
        } else if (uri.getPathSegments().isEmpty()) {
            throw new C42764q(String.format("Path must start with a valid logical location: %s", new Object[]{uri}));
        } else if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new C42764q("Did not expect uri to have query");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File mo45823a(android.net.Uri r11) {
        /*
            r10 = this;
            m75464b(r11)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r11.getPathSegments()
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 5
            r5 = 4
            java.lang.String r6 = "managed"
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r3) {
                case -1820761141: goto L_0x0052;
                case 94416770: goto L_0x0048;
                case 97434231: goto L_0x003e;
                case 835260319: goto L_0x0036;
                case 988548496: goto L_0x002c;
                case 991565957: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x005c
        L_0x0022:
            java.lang.String r3 = "directboot-files"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 0
            goto L_0x005d
        L_0x002c:
            java.lang.String r3 = "directboot-cache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 1
            goto L_0x005d
        L_0x0036:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x005c
            r2 = 4
            goto L_0x005d
        L_0x003e:
            java.lang.String r3 = "files"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 2
            goto L_0x005d
        L_0x0048:
            java.lang.String r3 = "cache"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 3
            goto L_0x005d
        L_0x0052:
            java.lang.String r3 = "external"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x005c
            r2 = 5
            goto L_0x005d
        L_0x005c:
            r2 = -1
        L_0x005d:
            if (r2 == 0) goto L_0x0102
            if (r2 == r9) goto L_0x00f7
            if (r2 == r8) goto L_0x00f0
            if (r2 == r7) goto L_0x00e9
            if (r2 == r5) goto L_0x0082
            if (r2 != r4) goto L_0x0072
            android.content.Context r11 = r10.f111978a
            r1 = 0
            java.io.File r11 = r11.getExternalFilesDir(r1)
            goto L_0x010c
        L_0x0072:
            com.google.android.libraries.storage.a.c.q r0 = new com.google.android.libraries.storage.a.c.q
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r1] = r11
            java.lang.String r11 = "Path must start with a valid logical location: %s"
            java.lang.String r11 = java.lang.String.format(r11, r2)
            r0.<init>((java.lang.String) r11)
            throw r0
        L_0x0082:
            android.content.Context r11 = r10.f111978a
            java.io.File r11 = com.google.android.libraries.storage.p3304a.p3305a.C42717d.m75457b(r11)
            java.io.File r1 = new java.io.File
            r1.<init>(r11, r6)
            int r11 = r0.size()
            if (r11 < r7) goto L_0x00e7
            java.lang.Object r11 = r0.get(r8)     // Catch:{ IllegalArgumentException -> 0x00e0 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IllegalArgumentException -> 0x00e0 }
            android.accounts.Account r11 = com.google.android.libraries.storage.p3304a.p3305a.C42714a.m75443a(r11)     // Catch:{ IllegalArgumentException -> 0x00e0 }
            android.accounts.Account r2 = com.google.android.libraries.storage.p3304a.p3305a.C42714a.f111955a
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x00e7
            com.google.android.libraries.storage.a.a.p r2 = r10.f111979b
            if (r2 == 0) goto L_0x00d8
            com.google.common.util.concurrent.cx r11 = r2.mo45836b(r11)     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x00bf }
            java.lang.Object r11 = r11.get()     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x00bf }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x00bf }
            int r11 = r11.intValue()     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x00bf }
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x00bf }
            r0.set(r8, r11)     // Catch:{ InterruptedException -> 0x00ca, ExecutionException -> 0x00bf }
            goto L_0x00e7
        L_0x00bf:
            r11 = move-exception
            com.google.android.libraries.storage.a.c.q r0 = new com.google.android.libraries.storage.a.c.q
            java.lang.Throwable r11 = r11.getCause()
            r0.<init>((java.lang.Throwable) r11)
            throw r0
        L_0x00ca:
            r11 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            com.google.android.libraries.storage.a.c.q r0 = new com.google.android.libraries.storage.a.c.q
            r0.<init>((java.lang.Throwable) r11)
            throw r0
        L_0x00d8:
            com.google.android.libraries.storage.a.c.q r11 = new com.google.android.libraries.storage.a.c.q
            java.lang.String r0 = "AccountManager cannot be null"
            r11.<init>((java.lang.String) r0)
            throw r11
        L_0x00e0:
            r11 = move-exception
            com.google.android.libraries.storage.a.c.q r0 = new com.google.android.libraries.storage.a.c.q
            r0.<init>((java.lang.Throwable) r11)
            throw r0
        L_0x00e7:
            r11 = r1
            goto L_0x010c
        L_0x00e9:
            android.content.Context r11 = r10.f111978a
            java.io.File r11 = r11.getCacheDir()
            goto L_0x010c
        L_0x00f0:
            android.content.Context r11 = r10.f111978a
            java.io.File r11 = com.google.android.libraries.storage.p3304a.p3305a.C42717d.m75457b(r11)
            goto L_0x010c
        L_0x00f7:
            android.content.Context r11 = r10.f111978a
            android.content.Context r11 = r11.createDeviceProtectedStorageContext()
            java.io.File r11 = r11.getCacheDir()
            goto L_0x010c
        L_0x0102:
            android.content.Context r11 = r10.f111978a
            android.content.Context r11 = r11.createDeviceProtectedStorageContext()
            java.io.File r11 = r11.getFilesDir()
        L_0x010c:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = java.io.File.separator
            int r3 = r0.size()
            java.util.List r0 = r0.subList(r9, r3)
            java.lang.String r0 = android.text.TextUtils.join(r2, r0)
            r1.<init>(r11, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3304a.p3305a.C42720g.mo45823a(android.net.Uri):java.io.File");
    }
}
