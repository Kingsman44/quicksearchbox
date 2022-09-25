package com.google.android.p10890h.p10891a.p10893b;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.h.a.b.d */
/* compiled from: PG */
final class C146573d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146574e f395832a;

    /* renamed from: b */
    private final Uri f395833b;

    /* renamed from: c */
    private final String f395834c;

    /* renamed from: d */
    private final boolean f395835d;

    /* renamed from: e */
    private final Map f395836e;

    /* renamed from: f */
    private int f395837f = 3;

    public C146573d(C146574e eVar, Uri uri, String str, boolean z) {
        this.f395832a = eVar;
        this.f395833b = uri;
        this.f395834c = str;
        this.f395835d = z;
        HashMap hashMap = new HashMap(eVar.f395840c);
        this.f395836e = hashMap;
        hashMap.put("X-Goog-Event-Time", Long.toString(System.currentTimeMillis()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.f395836e.put("X-Goog-Request-Time", java.lang.Long.toString(java.lang.System.currentTimeMillis()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r4.f395832a.f395838a.mo95061a(r4.f395833b, r4.f395836e) == 204) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r4.f395835d != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r0 = r4.f395832a.f395841d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.f395832a.f395841d.add(r4.f395834c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.android.h.a.b.e r0 = r4.f395832a     // Catch:{ IOException -> 0x005a }
            java.util.ArrayList r0 = r0.f395841d     // Catch:{ IOException -> 0x005a }
            monitor-enter(r0)     // Catch:{ IOException -> 0x005a }
            com.google.android.h.a.b.e r1 = r4.f395832a     // Catch:{ all -> 0x0057 }
            java.util.ArrayList r1 = r1.f395841d     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = r4.f395834c     // Catch:{ all -> 0x0057 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0020
            boolean r1 = r4.f395835d     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x001e
            com.google.android.h.a.b.e r1 = r4.f395832a     // Catch:{ all -> 0x0057 }
            java.util.ArrayList r1 = r1.f395841d     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = r4.f395834c     // Catch:{ all -> 0x0057 }
            r1.remove(r2)     // Catch:{ all -> 0x0057 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            return
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            java.util.Map r0 = r4.f395836e     // Catch:{ IOException -> 0x005a }
            java.lang.String r1 = "X-Goog-Request-Time"
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x005a }
            java.lang.String r2 = java.lang.Long.toString(r2)     // Catch:{ IOException -> 0x005a }
            r0.put(r1, r2)     // Catch:{ IOException -> 0x005a }
            com.google.android.h.a.b.e r0 = r4.f395832a     // Catch:{ IOException -> 0x005a }
            com.google.android.h.a.b.f r0 = r0.f395838a     // Catch:{ IOException -> 0x005a }
            android.net.Uri r1 = r4.f395833b     // Catch:{ IOException -> 0x005a }
            java.util.Map r2 = r4.f395836e     // Catch:{ IOException -> 0x005a }
            int r0 = r0.mo95061a(r1, r2)     // Catch:{ IOException -> 0x005a }
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x006d
            boolean r0 = r4.f395835d     // Catch:{ IOException -> 0x005a }
            if (r0 != 0) goto L_0x006d
            com.google.android.h.a.b.e r0 = r4.f395832a     // Catch:{ IOException -> 0x005a }
            java.util.ArrayList r0 = r0.f395841d     // Catch:{ IOException -> 0x005a }
            monitor-enter(r0)     // Catch:{ IOException -> 0x005a }
            com.google.android.h.a.b.e r1 = r4.f395832a     // Catch:{ all -> 0x0054 }
            java.util.ArrayList r1 = r1.f395841d     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = r4.f395834c     // Catch:{ all -> 0x0054 }
            r1.add(r2)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x0054:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r1     // Catch:{ IOException -> 0x005a }
        L_0x0057:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0057 }
            throw r1     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            int r0 = r4.f395837f
            int r1 = r0 + -1
            r4.f395837f = r1
            if (r0 <= 0) goto L_0x006d
            com.google.android.h.a.b.e r0 = r4.f395832a
            com.google.android.h.a.b.a r0 = r0.f395839b
            r1 = 300000(0x493e0, double:1.482197E-318)
            r0.mo95062a(r1, r4)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.p10890h.p10891a.p10893b.C146573d.run():void");
    }
}
