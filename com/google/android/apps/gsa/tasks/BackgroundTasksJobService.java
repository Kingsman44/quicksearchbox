package com.google.android.apps.gsa.tasks;

import android.app.job.JobParameters;
import android.os.PersistableBundle;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ProguardMustNotDelete
/* compiled from: PG */
public class BackgroundTasksJobService extends C118480ao {

    /* renamed from: a */
    public C118529cd f328788a;

    /* renamed from: b */
    public C118533ch f328789b;

    /* renamed from: c */
    public C58881cr f328790c;

    /* renamed from: d */
    public C22871g f328791d;

    /* renamed from: e */
    private final Set f328792e = Collections.synchronizedSet(new HashSet());

    public BackgroundTasksJobService() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    /* renamed from: d */
    private static C118485at m196655d(PersistableBundle persistableBundle) {
        return C118529cd.m196772a(persistableBundle.getString("background_task_data"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        r1 = (com.google.android.apps.gsa.tasks.C118491az) r7.f328790c.mo6453a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103709a(com.google.android.apps.gsa.tasks.C118485at r8) {
        /*
            r7 = this;
            int r0 = r8.f328864b
            com.google.android.apps.gsa.tasks.aa r1 = com.google.android.apps.gsa.tasks.C118523bz.m196762c(r0)
            com.google.android.apps.gsa.tasks.aa r2 = com.google.android.apps.gsa.tasks.C118466aa.PERIODIC
            if (r1 == r2) goto L_0x0045
            com.google.common.base.cr r1 = r7.f328790c
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.apps.gsa.tasks.ca r1 = (com.google.android.apps.gsa.tasks.C118526ca) r1
            java.lang.Class r1 = r1.mo103719c()
            java.lang.Class<com.google.android.apps.gsa.tasks.az> r2 = com.google.android.apps.gsa.tasks.C118491az.class
            if (r1 == r2) goto L_0x001b
            goto L_0x0045
        L_0x001b:
            com.google.common.base.cr r1 = r7.f328790c
            java.lang.Object r1 = r1.mo6453a()
            com.google.android.apps.gsa.tasks.az r1 = (com.google.android.apps.gsa.tasks.C118491az) r1
            android.app.job.JobInfo r2 = r1.mo103717a(r0)
            if (r2 == 0) goto L_0x0045
            long r3 = r8.f328869g
            android.os.PersistableBundle r8 = r2.getExtras()
            com.google.android.apps.gsa.tasks.at r8 = m196655d(r8)
            long r5 = r8.f328869g
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0045
            java.util.Set r8 = r7.f328792e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r8.remove(r2)
            r1.mo103723g(r0)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.tasks.BackgroundTasksJobService.mo103709a(com.google.android.apps.gsa.tasks.at):void");
    }

    public final void onCreate() {
        C74507e.m120466b(35);
        C89838ab.m146265i();
        super.onCreate();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C118485at d = m196655d(jobParameters.getExtras());
        C60870cx b = this.f328788a.mo103736b(C118491az.class, d);
        if (b == null) {
            mo103709a(d);
            return false;
        }
        this.f328792e.add(Integer.valueOf(d.f328864b));
        C22871g gVar = this.f328791d;
        C118522by b2 = C118522by.m196758b(d.f328865c);
        if (b2 == null) {
            b2 = C118522by.UNKNOWN;
        }
        String name = b2.name();
        gVar.mo28211k(b, String.valueOf(name).concat("-completion"), new C118477al(this, d, jobParameters));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        if (!this.f328792e.contains(Integer.valueOf(jobParameters.getJobId()))) {
            return false;
        }
        C118522by b = C118522by.m196758b(m196655d(jobParameters.getExtras()).f328865c);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        this.f328789b.mo103742f(b);
        this.f328789b.mo103744h();
        return false;
    }
}
