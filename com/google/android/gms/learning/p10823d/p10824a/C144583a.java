package com.google.android.gms.learning.p10823d.p10824a;

import android.app.job.JobScheduler;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.p10823d.C144582a;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29706p;

/* renamed from: com.google.android.gms.learning.d.a.a */
/* compiled from: PG */
public final class C144583a implements C144582a {

    /* renamed from: b */
    private static final C29719k f391234b = C29712d.m54802b("brella", "JobSchdlrDlgt");

    /* renamed from: a */
    public final JobScheduler f391235a;

    /* renamed from: c */
    private final C144584b f391236c;

    /* renamed from: d */
    private final C144827n f391237d;

    public C144583a(JobScheduler jobScheduler, C144584b bVar, C144827n nVar) {
        this.f391235a = jobScheduler;
        this.f391236c = bVar;
        this.f391237d = nVar;
    }

    /* renamed from: a */
    public final void mo120062a(C29706p pVar) {
        this.f391235a.cancel(pVar.f80454e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0161  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo120063b(com.google.android.libraries.micore.learning.p2258a.C29706p r20, long r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            com.google.android.gms.learning.d.a.b r2 = r0.f391236c
            android.content.ComponentName r3 = new android.content.ComponentName
            android.content.Context r4 = r2.f391239b
            java.lang.String r5 = "com.google.android.gms.learning.internal.training.InAppJobService"
            r3.<init>(r4, r5)
            com.google.android.libraries.micore.learning.base.h r4 = r2.f391242e
            long r4 = r4.mo34859a()
            android.app.job.JobInfo$Builder r6 = new android.app.job.JobInfo$Builder
            int r7 = r1.f80454e
            r6.<init>(r7, r3)
            com.google.android.libraries.micore.learning.a.j r3 = r1.f80461l
            if (r3 != 0) goto L_0x0022
            com.google.android.libraries.micore.learning.a.j r3 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
        L_0x0022:
            boolean r3 = r3.f80440b
            android.app.job.JobInfo$Builder r3 = r6.setRequiresDeviceIdle(r3)
            com.google.android.libraries.micore.learning.a.j r7 = r1.f80461l
            if (r7 != 0) goto L_0x002e
            com.google.android.libraries.micore.learning.a.j r7 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
        L_0x002e:
            boolean r7 = r7.f80441c
            android.app.job.JobInfo$Builder r3 = r3.setRequiresCharging(r7)
            com.google.protobuf.fg r7 = r1.f80459j
            if (r7 != 0) goto L_0x003a
            com.google.protobuf.fg r7 = com.google.protobuf.C63042fg.f170152c
        L_0x003a:
            long r7 = com.google.protobuf.p4750c.C62953e.m95478c(r7)
            long r7 = r7 - r4
            r3.setMinimumLatency(r7)
            com.google.android.gms.learning.b r3 = r2.f391240c
            boolean r3 = r3.mo120022bc()
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x0056
            int r3 = r1.f80450a
            r9 = 13
            if (r3 != r9) goto L_0x0056
            r6.setRequiredNetworkType(r7)
            goto L_0x0066
        L_0x0056:
            com.google.android.libraries.micore.learning.a.j r3 = r1.f80461l
            if (r3 != 0) goto L_0x005c
            com.google.android.libraries.micore.learning.a.j r3 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
        L_0x005c:
            boolean r3 = r3.f80442d
            if (r8 == r3) goto L_0x0062
            r3 = 1
            goto L_0x0063
        L_0x0062:
            r3 = 2
        L_0x0063:
            r6.setRequiredNetworkType(r3)
        L_0x0066:
            android.content.Context r3 = r2.f391239b
            java.lang.String r9 = "android.permission.RECEIVE_BOOT_COMPLETED"
            int r3 = androidx.core.content.C1882h.m5137c(r3, r9)
            if (r3 != 0) goto L_0x0074
            r6.setPersisted(r8)
            goto L_0x0082
        L_0x0074:
            com.google.android.libraries.micore.learning.base.k r3 = com.google.android.gms.learning.p10823d.p10824a.C144584b.f391238a
            java.lang.String r9 = "Lost RECEIVE_BOOT_COMPLETED permission, falling back to non-persistent job"
            r3.mo34866h(r9)
            com.google.android.gms.learning.n r3 = r2.f391241d
            r9 = 1173(0x495, float:1.644E-42)
            r3.mo120056h(r9)
        L_0x0082:
            r9 = 0
            int r3 = (r21 > r9 ? 1 : (r21 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x00a4
            boolean r3 = r1.f80464o
            if (r3 == 0) goto L_0x009d
            com.google.android.libraries.micore.learning.a.j r3 = r1.f80461l
            if (r3 != 0) goto L_0x0092
            com.google.android.libraries.micore.learning.a.j r3 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
        L_0x0092:
            com.google.protobuf.ar r3 = r3.f80439a
            if (r3 != 0) goto L_0x0098
            com.google.protobuf.ar r3 = com.google.protobuf.C62910ar.f169858c
        L_0x0098:
            long r11 = com.google.protobuf.p4750c.C62948a.m95453d(r3)
            goto L_0x00a6
        L_0x009d:
            com.google.android.gms.learning.b r3 = r2.f391240c
            long r11 = r3.mo120043w()
            goto L_0x00a6
        L_0x00a4:
            r11 = r21
        L_0x00a6:
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x00cf
            com.google.android.libraries.micore.learning.base.k r13 = com.google.android.gms.learning.p10823d.p10824a.C144584b.f391238a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r9 = "Setting override deadline to "
            r3.<init>(r9)
            r3.append(r11)
            java.lang.String r9 = "ms"
            r3.append(r9)
            java.lang.String r17 = r3.toString()
            java.util.logging.Level r14 = java.util.logging.Level.INFO
            java.lang.String r15 = r13.f80486a
            r16 = 0
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r18 = r3
            r13.mo34855c(r14, r15, r16, r17, r18)
            r6.setOverrideDeadline(r11)
        L_0x00cf:
            android.os.PersistableBundle r3 = new android.os.PersistableBundle
            r3.<init>()
            java.lang.String r9 = "debug_last_modified_ms"
            r3.putLong(r9, r4)
            com.google.android.libraries.micore.learning.a.j r4 = r1.f80461l
            if (r4 != 0) goto L_0x00e0
            com.google.android.libraries.micore.learning.a.j r5 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
            goto L_0x00e1
        L_0x00e0:
            r5 = r4
        L_0x00e1:
            com.google.protobuf.o r5 = r5.f80443e
            if (r5 == 0) goto L_0x00f6
            if (r4 != 0) goto L_0x00e9
            com.google.android.libraries.micore.learning.a.j r4 = com.google.android.libraries.micore.learning.p2258a.C29700j.f80437f
        L_0x00e9:
            com.google.protobuf.o r4 = r4.f80443e
            if (r4 != 0) goto L_0x00ef
            com.google.protobuf.o r4 = com.google.protobuf.C63077o.f170228b
        L_0x00ef:
            boolean r4 = r4.f170230a
            if (r4 == 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r4 = 0
            goto L_0x00f7
        L_0x00f6:
            r4 = 1
        L_0x00f7:
            int r1 = r1.f80450a
            r5 = 4
            if (r1 != r5) goto L_0x0103
            com.google.android.gms.learning.b r1 = r2.f391240c
            long r9 = r1.mo120041u()
            goto L_0x0109
        L_0x0103:
            com.google.android.gms.learning.b r1 = r2.f391240c
            long r9 = r1.mo119942C()
        L_0x0109:
            android.app.job.JobInfo r1 = r6.build()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            long r9 = r5.toMillis(r9)
            com.google.android.gms.learning.b r2 = r2.f391240c
            boolean r2 = r2.mo120014av()
            if (r2 != 0) goto L_0x0120
            if (r4 != 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r2 = 0
            goto L_0x0121
        L_0x0120:
            r2 = 1
        L_0x0121:
            com.google.android.gms.learning.internal.training.C144799c.m235337a(r1, r9, r2, r3)
            r6.setExtras(r3)
            android.app.job.JobInfo r1 = r6.build()
            int r2 = r1.getId()
            android.app.job.JobScheduler r3 = r0.f391235a
            android.app.job.JobInfo r2 = r3.getPendingJob(r2)
            if (r2 != 0) goto L_0x0138
            goto L_0x0161
        L_0x0138:
            android.content.ComponentName r2 = r2.getService()
            android.content.ComponentName r3 = r1.getService()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0161
            com.google.android.libraries.micore.learning.base.k r2 = f391234b
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r7] = r1
            java.lang.String r1 = "Collision with non-Brella job with same job ID (%s) detected, not scheduling!"
            r2.mo34867i(r1, r3)
            com.google.android.gms.learning.n r1 = r0.f391237d
            r2 = 1162(0x48a, float:1.628E-42)
            r1.mo120056h(r2)
            goto L_0x016a
        L_0x0161:
            android.app.job.JobScheduler r2 = r0.f391235a
            int r1 = r2.schedule(r1)
            if (r1 != r8) goto L_0x016a
            return r8
        L_0x016a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.p10823d.p10824a.C144583a.mo120063b(com.google.android.libraries.micore.learning.a.p, long):boolean");
    }
}
