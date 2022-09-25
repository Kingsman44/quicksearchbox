package com.google.android.apps.gsa.tasks;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.sqlite.SQLiteConstraintException;
import android.net.Uri;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.tasks.az */
/* compiled from: PG */
public final class C118491az implements C118526ca {

    /* renamed from: b */
    private static final C59071e f328882b = C59071e.m91332i("com.google.android.apps.gsa.tasks.az");

    /* renamed from: a */
    public final C118533ch f328883a;

    /* renamed from: c */
    private final Context f328884c;

    /* renamed from: d */
    private final JobScheduler f328885d;

    /* renamed from: e */
    private final C68214a f328886e;

    /* renamed from: f */
    private final C22871g f328887f;

    /* renamed from: g */
    private final C21370a f328888g;

    public C118491az(Context context, C68214a aVar, C118533ch chVar, C22871g gVar, C21370a aVar2) {
        this.f328884c = context;
        this.f328885d = (JobScheduler) context.getSystemService("jobscheduler");
        this.f328886e = aVar;
        this.f328883a = chVar;
        this.f328887f = gVar;
        this.f328888g = aVar2;
    }

    /* renamed from: i */
    private final JobInfo.Builder m196686i(int i) {
        return new JobInfo.Builder(i, new ComponentName(this.f328884c, BackgroundTasksJobService.class));
    }

    /* renamed from: j */
    private final PersistableBundle m196687j(C118485at atVar) {
        String encodeToString = Base64.encodeToString(atVar.toByteArray(), 11);
        C118522by b = C118522by.m196758b(atVar.f328865c);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        int length = encodeToString.length();
        this.f328883a.mo103743g(b, (long) (length + length));
        this.f328883a.mo103744h();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("background_task_data", encodeToString);
        return persistableBundle;
    }

    /* renamed from: k */
    private final void m196688k(int i) {
        try {
            this.f328885d.cancel(i);
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f328882b.mo56225c()).mo56382g(th)).mo56372aa(33982)).mo56387q("Exception while trying to cancel job (%d)", i);
        }
    }

    /* renamed from: l */
    private final void m196689l() {
        if (Math.random() < 1.0E-4d) {
            try {
                this.f328887f.mo28212l("task-number-count", new C118490ay(this));
            } catch (SQLiteConstraintException e) {
                ((C89911f) this.f328886e.mo27525b()).mo83755a(e, 173485157, 29).mo83721a();
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m196690m(android.app.job.JobInfo r7, boolean r8) {
        /*
            r6 = this;
            android.app.job.JobScheduler r0 = r6.f328885d     // Catch:{ all -> 0x0006 }
            r0.schedule(r7)     // Catch:{ all -> 0x0006 }
            return
        L_0x0006:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x0025
            java.lang.String r2 = "No such service"
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x00f4 }
            if (r1 != 0) goto L_0x0016
            goto L_0x0025
        L_0x0016:
            com.google.common.f.e r7 = f328882b     // Catch:{ all -> 0x00f4 }
            com.google.common.f.x r7 = r7.mo56225c()     // Catch:{ all -> 0x00f4 }
            java.lang.String r8 = "Missing JobScheduler service."
            r1 = 33985(0x84c1, float:4.7623E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r0)).mo56372aa(r1)).mo56386p(r8)     // Catch:{ all -> 0x00f4 }
            return
        L_0x0025:
            java.lang.Class<java.lang.IllegalStateException> r1 = java.lang.IllegalStateException.class
            com.google.common.base.ax r1 = com.google.p4449cd.C57937b.m88571a(r0, r1)     // Catch:{ all -> 0x00f4 }
            boolean r1 = r1.mo56113h()     // Catch:{ all -> 0x00f4 }
            if (r1 == 0) goto L_0x00f3
            com.google.common.f.e r1 = f328882b     // Catch:{ all -> 0x00f4 }
            com.google.common.f.x r1 = r1.mo56225c()     // Catch:{ all -> 0x00f4 }
            java.lang.String r2 = "Too many tasks scheduled."
            r3 = 33984(0x84c0, float:4.7622E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)     // Catch:{ all -> 0x00f4 }
            if (r8 == 0) goto L_0x00f2
            java.util.List r8 = r6.mo103720d()     // Catch:{ all -> 0x00f4 }
            if (r8 != 0) goto L_0x0049
            goto L_0x00ee
        L_0x0049:
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x004d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = "background_task_data"
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00f4 }
            android.app.job.JobInfo r2 = (android.app.job.JobInfo) r2     // Catch:{ all -> 0x00f4 }
            boolean r4 = m196691n(r2)     // Catch:{ all -> 0x00f4 }
            if (r4 == 0) goto L_0x004d
            android.os.PersistableBundle r4 = r2.getExtras()     // Catch:{ all -> 0x00f4 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.tasks.at r3 = com.google.android.apps.gsa.tasks.C118529cd.m196772a(r3)     // Catch:{ all -> 0x00f4 }
            boolean r4 = r2.isPeriodic()     // Catch:{ all -> 0x00f4 }
            if (r4 == 0) goto L_0x0085
            int r4 = r3.f328864b     // Catch:{ all -> 0x00f4 }
            int r3 = r3.f328865c     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.tasks.by r3 = com.google.android.apps.gsa.tasks.C118522by.m196758b(r3)     // Catch:{ all -> 0x00f4 }
            if (r3 != 0) goto L_0x007f
            com.google.android.apps.gsa.tasks.by r3 = com.google.android.apps.gsa.tasks.C118522by.UNKNOWN     // Catch:{ all -> 0x00f4 }
        L_0x007f:
            boolean r3 = com.google.android.apps.gsa.tasks.C118523bz.m196763d(r4, r3)     // Catch:{ all -> 0x00f4 }
            if (r3 != 0) goto L_0x004d
        L_0x0085:
            int r2 = r2.getId()     // Catch:{ all -> 0x00f4 }
            r6.m196688k(r2)     // Catch:{ all -> 0x00f4 }
            goto L_0x004d
        L_0x008d:
            com.google.common.b.kl r1 = new com.google.common.b.kl     // Catch:{ all -> 0x00f4 }
            r2 = 12
            r1.<init>((int) r2)     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00f4 }
        L_0x0098:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00f4 }
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00f4 }
            android.app.job.JobInfo r2 = (android.app.job.JobInfo) r2     // Catch:{ all -> 0x00f4 }
            android.os.PersistableBundle r4 = r2.getExtras()     // Catch:{ all -> 0x00f4 }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.tasks.at r4 = com.google.android.apps.gsa.tasks.C118529cd.m196772a(r4)     // Catch:{ all -> 0x00f4 }
            int r4 = r4.f328865c     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.tasks.by r4 = com.google.android.apps.gsa.tasks.C118522by.m196758b(r4)     // Catch:{ all -> 0x00f4 }
            if (r4 != 0) goto L_0x00ba
            com.google.android.apps.gsa.tasks.by r4 = com.google.android.apps.gsa.tasks.C118522by.UNKNOWN     // Catch:{ all -> 0x00f4 }
        L_0x00ba:
            int r2 = r2.getId()     // Catch:{ all -> 0x00f4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00f4 }
            r5 = 0
            r1.mo55583a(r4, r2, r5)     // Catch:{ all -> 0x00f4 }
            goto L_0x0098
        L_0x00c7:
            dagger.a r8 = r6.f328886e     // Catch:{ all -> 0x00f4 }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.shared.logger.f r8 = (com.google.android.apps.gsa.shared.logger.C89911f) r8     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.shared.q.a r2 = new com.google.android.apps.gsa.shared.q.a     // Catch:{ all -> 0x00f4 }
            r3 = 29
            r4 = 917507(0xe0003, float:1.285701E-39)
            r2.<init>(r0, r3, r4)     // Catch:{ all -> 0x00f4 }
            com.google.android.apps.gsa.shared.logger.e r8 = r8.mo83756b(r2)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f4 }
            r0.getClass()
            r8.f246283d = r0     // Catch:{ all -> 0x00f4 }
            r0 = 33687476(0x20207b4, float:9.553102E-38)
            r8.f246282c = r0     // Catch:{ all -> 0x00f4 }
            r8.mo83721a()     // Catch:{ all -> 0x00f4 }
        L_0x00ee:
            r8 = 0
            r6.m196690m(r7, r8)     // Catch:{ all -> 0x00f4 }
        L_0x00f2:
            return
        L_0x00f3:
            throw r0     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            r7 = move-exception
            com.google.common.f.e r8 = f328882b
            com.google.common.f.x r8 = r8.mo56225c()
            java.lang.String r0 = "Exception while trying to schedule job"
            r1 = 33983(0x84bf, float:4.762E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r1)).mo56386p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.tasks.C118491az.m196690m(android.app.job.JobInfo, boolean):void");
    }

    /* renamed from: n */
    private static boolean m196691n(JobInfo jobInfo) {
        return jobInfo.getExtras().getString("background_task_data") != null;
    }

    /* renamed from: o */
    private static int m196692o(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            return i2 != 1 ? 2 : 1;
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JobInfo mo103717a(int i) {
        try {
            return this.f328885d.getPendingJob(i);
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f328882b.mo56225c()).mo56382g(th)).mo56372aa(33980)).mo56386p("Exception while trying to get pending job");
            return null;
        }
    }

    /* renamed from: b */
    public final C118575h mo103718b() {
        return C118575h.VBT_EXECUTION_DELAY_JOBSCHED;
    }

    /* renamed from: c */
    public final Class mo103719c() {
        return getClass();
    }

    /* renamed from: d */
    public final List mo103720d() {
        try {
            return this.f328885d.getAllPendingJobs();
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f328882b.mo56225c()).mo56382g(th)).mo56372aa(33981)).mo56386p("Exception when calling getAllPendingJobs()");
            return null;
        }
    }

    /* renamed from: e */
    public final void mo103721e(C118472ag agVar, C118485at atVar) {
        C118484as asVar = (C118484as) atVar.toBuilder();
        long d = this.f328888g.mo26872d();
        asVar.copyOnWrite();
        C118485at atVar2 = (C118485at) asVar.instance;
        atVar2.f328863a |= 32;
        atVar2.f328869g = d;
        C118485at atVar3 = (C118485at) asVar.build();
        JobInfo.Builder requiresDeviceIdle = m196686i(atVar.f328864b).setPersisted(false).setMinimumLatency(agVar.f328822b).setRequiresCharging(agVar.f328826f).setRequiresDeviceIdle(agVar.f328825e);
        int a = C118470ae.m196676a(agVar.f328824d);
        if (a == 0) {
            a = 1;
        }
        JobInfo.Builder extras = requiresDeviceIdle.setRequiredNetworkType(m196692o(a)).setExtras(m196687j(atVar3));
        C118468ac acVar = agVar.f328828h;
        if (acVar == null) {
            acVar = C118468ac.f328813d;
        }
        if (acVar.f328816b.size() != 0) {
            for (String parse : acVar.f328816b) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(Uri.parse(parse), 0));
            }
            extras.setTriggerContentMaxDelay(acVar.f328817c);
        } else {
            extras.setOverrideDeadline(agVar.f328822b + agVar.f328823c);
        }
        m196690m(extras.build(), true);
        m196689l();
    }

    /* renamed from: f */
    public final void mo103722f(C118474ai aiVar, C118485at atVar) {
        JobInfo.Builder requiresDeviceIdle = m196686i(atVar.f328864b).setPersisted(true).setPeriodic(aiVar.f328833b).setRequiresCharging(aiVar.f328836e).setRequiresDeviceIdle(aiVar.f328835d);
        int a = C118470ae.m196676a(aiVar.f328834c);
        if (a == 0) {
            a = 1;
        }
        m196690m(requiresDeviceIdle.setRequiredNetworkType(m196692o(a)).setExtras(m196687j(atVar)).build(), true);
    }

    /* renamed from: g */
    public final void mo103723g(int i) {
        C90476a aVar = C91018d.f254254a;
        JobInfo a = mo103717a(i);
        if (a != null && m196691n(a)) {
            m196688k(i);
        }
    }

    /* renamed from: h */
    public final boolean mo103724h() {
        return true;
    }
}
