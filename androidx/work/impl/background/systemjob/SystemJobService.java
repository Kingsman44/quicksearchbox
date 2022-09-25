package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4539d;
import androidx.work.impl.C4562r;
import androidx.work.impl.C4620v;
import androidx.work.impl.C4621w;
import androidx.work.impl.p207b.C4509r;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public class SystemJobService extends JobService implements C4539d {

    /* renamed from: a */
    private static final String f14338a = C4380ad.m12561i("SystemJobService");

    /* renamed from: b */
    private C4452ag f14339b;

    /* renamed from: c */
    private final Map f14340c = new HashMap();

    /* renamed from: d */
    private final C4621w f14341d = new C4621w();

    /* renamed from: b */
    private static C4509r m12892b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C4509r(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo9473a(C4509r rVar, boolean z) {
        JobParameters jobParameters;
        C4380ad.m12560h().mo9309a(f14338a, String.valueOf(rVar.f14269a).concat(" executed on JobScheduler"));
        synchronized (this.f14340c) {
            jobParameters = (JobParameters) this.f14340c.remove(rVar);
        }
        this.f14341d.mo9561a(rVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            C4452ag j = C4452ag.m12686j(getApplicationContext());
            this.f14339b = j;
            j.f14145g.mo9514b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C4380ad.m12560h().mo9314f(f14338a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C4452ag agVar = this.f14339b;
        if (agVar != null) {
            agVar.f14145g.mo9515c(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = new androidx.work.C4406bc();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (androidx.work.impl.background.systemjob.C4536c.m12903a(r8) == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        java.util.Arrays.asList(androidx.work.impl.background.systemjob.C4536c.m12903a(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (androidx.work.impl.background.systemjob.C4536c.m12904b(r8) == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        java.util.Arrays.asList(androidx.work.impl.background.systemjob.C4536c.m12904b(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        androidx.work.impl.background.systemjob.C4537d.m12905a(r8);
        r7.f14339b.mo9394n(r7.f14341d.mo9562b(r2), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Job is already being executed by SystemJobService: "
            java.lang.String r1 = "onStartJob for "
            androidx.work.impl.ag r2 = r7.f14339b
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x0019
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()
            java.lang.String r1 = f14338a
            java.lang.String r2 = "WorkManager is not initialized; requesting retry."
            r0.mo9309a(r1, r2)
            r7.jobFinished(r8, r3)
            return r4
        L_0x0019:
            androidx.work.impl.b.r r2 = m12892b(r8)
            if (r2 != 0) goto L_0x002b
            androidx.work.ad r8 = androidx.work.C4380ad.m12560h()
            java.lang.String r0 = f14338a
            java.lang.String r1 = "WorkSpec id not found!"
            r8.mo9311c(r0, r1)
            return r4
        L_0x002b:
            java.util.Map r5 = r7.f14340c
            monitor-enter(r5)
            java.util.Map r6 = r7.f14340c     // Catch:{ all -> 0x0096 }
            boolean r6 = r6.containsKey(r2)     // Catch:{ all -> 0x0096 }
            if (r6 == 0) goto L_0x004d
            androidx.work.ad r8 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = f14338a     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r3.<init>(r0)     // Catch:{ all -> 0x0096 }
            r3.append(r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0096 }
            r8.mo9309a(r1, r0)     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            return r4
        L_0x004d:
            androidx.work.ad r0 = androidx.work.C4380ad.m12560h()     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = f14338a     // Catch:{ all -> 0x0096 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r6.<init>(r1)     // Catch:{ all -> 0x0096 }
            r6.append(r2)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0096 }
            r0.mo9309a(r4, r1)     // Catch:{ all -> 0x0096 }
            java.util.Map r0 = r7.f14340c     // Catch:{ all -> 0x0096 }
            r0.put(r2, r8)     // Catch:{ all -> 0x0096 }
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            androidx.work.bc r0 = new androidx.work.bc
            r0.<init>()
            android.net.Uri[] r1 = androidx.work.impl.background.systemjob.C4536c.m12903a(r8)
            if (r1 == 0) goto L_0x007a
            android.net.Uri[] r1 = androidx.work.impl.background.systemjob.C4536c.m12903a(r8)
            java.util.Arrays.asList(r1)
        L_0x007a:
            java.lang.String[] r1 = androidx.work.impl.background.systemjob.C4536c.m12904b(r8)
            if (r1 == 0) goto L_0x0087
            java.lang.String[] r1 = androidx.work.impl.background.systemjob.C4536c.m12904b(r8)
            java.util.Arrays.asList(r1)
        L_0x0087:
            androidx.work.impl.background.systemjob.C4537d.m12905a(r8)
            androidx.work.impl.ag r8 = r7.f14339b
            androidx.work.impl.w r1 = r7.f14341d
            androidx.work.impl.v r1 = r1.mo9562b(r2)
            r8.mo9394n(r1, r0)
            return r3
        L_0x0096:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0096 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f14339b == null) {
            C4380ad.m12560h().mo9309a(f14338a, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C4509r b = m12892b(jobParameters);
        if (b == null) {
            C4380ad.m12560h().mo9311c(f14338a, "WorkSpec id not found!");
            return false;
        }
        C4380ad h = C4380ad.m12560h();
        String str = f14338a;
        new StringBuilder("onStopJob for ").append(b);
        h.mo9309a(str, "onStopJob for ".concat(b.toString()));
        synchronized (this.f14340c) {
            this.f14340c.remove(b);
        }
        C4620v a = this.f14341d.mo9561a(b);
        if (a != null) {
            this.f14339b.mo9395o(a);
        }
        C4562r rVar = this.f14339b.f14145g;
        String str2 = b.f14269a;
        synchronized (rVar.f14405i) {
            contains = rVar.f14404h.contains(str2);
        }
        if (!contains) {
            return true;
        }
        return false;
    }
}
