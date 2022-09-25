package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import com.google.android.libraries.notifications.p2298k.C30044d;

/* renamed from: com.google.android.libraries.notifications.entrypoints.scheduled.b */
/* compiled from: PG */
public final /* synthetic */ class C29975b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C30044d f81156a;

    /* renamed from: b */
    public final /* synthetic */ PersistableBundle f81157b;

    /* renamed from: c */
    public final /* synthetic */ int f81158c;

    /* renamed from: d */
    public final /* synthetic */ String f81159d;

    /* renamed from: e */
    public final /* synthetic */ JobService f81160e;

    /* renamed from: f */
    public final /* synthetic */ JobParameters f81161f;

    public /* synthetic */ C29975b(C30044d dVar, PersistableBundle persistableBundle, int i, String str, JobService jobService, JobParameters jobParameters) {
        this.f81156a = dVar;
        this.f81157b = persistableBundle;
        this.f81158c = i;
        this.f81159d = str;
        this.f81160e = jobService;
        this.f81161f = jobParameters;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.libraries.notifications.k.d r0 = r10.f81156a
            android.os.PersistableBundle r1 = r10.f81157b
            int r2 = r10.f81158c
            java.lang.String r3 = r10.f81159d
            android.app.job.JobService r4 = r10.f81160e
            android.app.job.JobParameters r5 = r10.f81161f
            r6 = 0
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x006c }
            r7.<init>(r1)     // Catch:{ all -> 0x006c }
            com.google.android.libraries.notifications.g r0 = r0.mo35167b(r7)     // Catch:{ all -> 0x006c }
            int r1 = r0.mo34949b()     // Catch:{ all -> 0x006c }
            int r7 = r1 + -1
            if (r1 == 0) goto L_0x006a
            java.lang.String r1 = "ScheduledTaskServiceHandler"
            r8 = 2
            r9 = 1
            if (r7 == r9) goto L_0x004e
            if (r7 == r8) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x006c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006c }
            r0[r6] = r2     // Catch:{ all -> 0x006c }
            r0[r9] = r3     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "Job finished with SUCCESS code. Job ID: '%d', key: '%s'"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55794f(r1, r2, r0)     // Catch:{ all -> 0x006c }
            goto L_0x0066
        L_0x0036:
            java.lang.Throwable r0 = r0.mo34948a()     // Catch:{ all -> 0x006c }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x006c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006c }
            r7[r6] = r2     // Catch:{ all -> 0x006c }
            com.google.frameworks.client.a.a.b r2 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r3)     // Catch:{ all -> 0x006c }
            r7[r9] = r2     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "Job finished with PERMANENT_FAILURE. Job ID: '%d', key: '%s'"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r1, r0, r2, r7)     // Catch:{ all -> 0x006c }
            goto L_0x0066
        L_0x004e:
            java.lang.Throwable r0 = r0.mo34948a()     // Catch:{ all -> 0x006c }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x006c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x006c }
            r7[r6] = r2     // Catch:{ all -> 0x006c }
            com.google.frameworks.client.a.a.b r2 = com.google.frameworks.client.p4624a.p4625a.C61301b.m93812a(r3)     // Catch:{ all -> 0x006c }
            r7[r9] = r2     // Catch:{ all -> 0x006c }
            java.lang.String r2 = "Job finished with TRANSIENT_FAILURE. Job ID: '%d', key: '%s'"
            com.google.android.libraries.notifications.platform.p2307a.C30058b.m55792d(r1, r0, r2, r7)     // Catch:{ all -> 0x006c }
            r6 = 1
        L_0x0066:
            r4.jobFinished(r5, r6)
            return
        L_0x006a:
            r0 = 0
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            r4.jobFinished(r5, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.entrypoints.scheduled.C29975b.run():void");
    }
}
