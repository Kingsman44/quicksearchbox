package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C4375a;
import androidx.work.C4380ad;
import androidx.work.C4381ae;
import androidx.work.C4389am;
import androidx.work.C4394ar;
import androidx.work.C4411g;
import androidx.work.C4412h;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4564t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4471af;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.p207b.C4502k;
import androidx.work.impl.p207b.C4508q;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4603j;
import androidx.work.impl.utils.C4604k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.work.impl.background.systemjob.b */
/* compiled from: PG */
public final class C4535b implements C4564t {

    /* renamed from: a */
    private static final String f14344a = C4380ad.m12561i("SystemJobScheduler");

    /* renamed from: b */
    private final Context f14345b;

    /* renamed from: c */
    private final JobScheduler f14346c;

    /* renamed from: d */
    private final C4452ag f14347d;

    /* renamed from: e */
    private final C4534a f14348e;

    public C4535b(Context context, C4452ag agVar) {
        C4534a aVar = new C4534a(context);
        this.f14345b = context;
        this.f14347d = agVar;
        this.f14346c = (JobScheduler) context.getSystemService("jobscheduler");
        this.f14348e = aVar;
    }

    /* renamed from: a */
    public static void m12894a(Context context) {
        List<JobInfo> h;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (h = m12897h(context, jobScheduler)) != null && !h.isEmpty()) {
            for (JobInfo id : h) {
                m12898i(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: f */
    public static boolean m12895f(Context context, C4452ag agVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> h = m12897h(context, jobScheduler);
        List<String> b = agVar.f14143e.mo9361C().mo9463b();
        boolean z = false;
        HashSet hashSet = new HashSet(h != null ? h.size() : 0);
        if (h != null && !h.isEmpty()) {
            for (JobInfo jobInfo : h) {
                C4509r g = m12896g(jobInfo);
                if (g != null) {
                    hashSet.add(g.f14269a);
                } else {
                    m12898i(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = b.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    C4380ad.m12560h().mo9309a(f14344a, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase workDatabase = agVar.f14143e;
            workDatabase.mo8181p();
            try {
                C4471af F = workDatabase.mo9364F();
                for (String v : b) {
                    F.mo9442v(v, -1);
                }
                workDatabase.mo8188w();
            } finally {
                workDatabase.mo8183r();
            }
        }
        return z;
    }

    /* renamed from: g */
    private static C4509r m12896g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C4509r(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: h */
    private static List m12897h(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C4380ad.m12560h().mo9312d(f14344a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private static void m12898i(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C4380ad.m12560h().mo9312d(f14344a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: b */
    public final void mo9474b(String str) {
        ArrayList<Integer> arrayList;
        List<JobInfo> h = m12897h(this.f14345b, this.f14346c);
        if (h == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : h) {
                C4509r g = m12896g(jobInfo);
                if (g != null && str.equals(g.f14269a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            for (Integer intValue : arrayList) {
                m12898i(this.f14346c, intValue.intValue());
            }
            this.f14347d.f14143e.mo9361C().mo9466e(str);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo9475c(C4470ae... aeVarArr) {
        int i;
        WorkDatabase workDatabase = this.f14347d.f14143e;
        C4604k kVar = new C4604k(workDatabase);
        int length = aeVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            C4470ae aeVar = aeVarArr[i2];
            workDatabase.mo8181p();
            try {
                C4470ae b = workDatabase.mo9364F().mo9422b(aeVar.f14217b);
                if (b == null) {
                    C4380ad h = C4380ad.m12560h();
                    String str = f14344a;
                    h.mo9314f(str, "Skipping scheduling " + aeVar.f14217b + " because it's no longer in the DB");
                    workDatabase.mo8188w();
                } else if (b.f14218c != C4394ar.ENQUEUED) {
                    C4380ad h2 = C4380ad.m12560h();
                    String str2 = f14344a;
                    h2.mo9314f(str2, "Skipping scheduling " + aeVar.f14217b + " because it is no longer enqueued");
                    workDatabase.mo8188w();
                } else {
                    C4509r a = C4486au.m12791a(aeVar);
                    C4502k a2 = workDatabase.mo9361C().mo9462a(a);
                    if (a2 != null) {
                        i = a2.f14264c;
                    } else {
                        int i3 = this.f14347d.f14142d.f14069i;
                        Object M = kVar.f14500a.mo8169M(new C4603j(kVar));
                        C69664n.m101060f(M, "workDatabase.runInTransa…            id\n        })");
                        i = ((Number) M).intValue();
                    }
                    if (a2 == null) {
                        this.f14347d.f14143e.mo9361C().mo9464c(C4508q.m12845a(a, i));
                    }
                    mo9497e(aeVar, i);
                    workDatabase.mo8188w();
                }
                workDatabase.mo8183r();
                i2++;
            } catch (Throwable th) {
                workDatabase.mo8183r();
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo9476d() {
        return true;
    }

    /* renamed from: e */
    public final void mo9497e(C4470ae aeVar, int i) {
        int i2;
        C4470ae aeVar2 = aeVar;
        int i3 = i;
        C4534a aVar = this.f14348e;
        C4412h hVar = aeVar2.f14226k;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", aeVar2.f14217b);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", aeVar2.f14236u);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", aeVar.mo9418f());
        JobInfo.Builder extras = new JobInfo.Builder(i3, aVar.f14343b).setRequiresCharging(hVar.f14082c).setRequiresDeviceIdle(hVar.f14083d).setExtras(persistableBundle);
        C4381ae aeVar3 = hVar.f14081b;
        if (Build.VERSION.SDK_INT < 30 || aeVar3 != C4381ae.TEMPORARILY_UNMETERED) {
            C4381ae aeVar4 = C4381ae.NOT_REQUIRED;
            int ordinal = aeVar3.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i2 = 2;
                    } else if (ordinal != 3) {
                        i2 = 4;
                        if (ordinal != 4) {
                            C4380ad h = C4380ad.m12560h();
                            String str = C4534a.f14342a;
                            new StringBuilder("API version too low. Cannot convert network type value ").append(aeVar3);
                            h.mo9309a(str, "API version too low. Cannot convert network type value ".concat(String.valueOf(aeVar3)));
                        }
                    } else {
                        i2 = 3;
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!hVar.f14083d) {
            extras.setBackoffCriteria(aeVar2.f14229n, aeVar2.f14228m == C4375a.LINEAR ? 0 : 1);
        }
        long max = Math.max(aeVar.mo9413a() - System.currentTimeMillis(), 0);
        if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!aeVar2.f14233r) {
            extras.setImportantWhileForeground(true);
        }
        if (hVar.mo9355a()) {
            for (C4411g gVar : hVar.f14088i) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(gVar.f14078a, gVar.f14079b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(hVar.f14086g);
            extras.setTriggerContentMaxDelay(hVar.f14087h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(hVar.f14084e);
        extras.setRequiresStorageNotLow(hVar.f14085f);
        int i4 = aeVar2.f14227l;
        if (Build.VERSION.SDK_INT >= 31 && aeVar2.f14233r && i4 <= 0 && max <= 0) {
            extras.setExpedited(true);
        }
        JobInfo build = extras.build();
        C4380ad h2 = C4380ad.m12560h();
        String str2 = f14344a;
        h2.mo9309a(str2, "Scheduling work ID " + aeVar2.f14217b + "Job ID " + i3);
        try {
            if (this.f14346c.schedule(build) == 0) {
                C4380ad h3 = C4380ad.m12560h();
                h3.mo9314f(str2, "Unable to schedule work ID " + aeVar2.f14217b);
                if (aeVar2.f14233r && aeVar2.f14234s == C4389am.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    aeVar2.f14233r = false;
                    C4380ad.m12560h().mo9309a(str2, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{aeVar2.f14217b}));
                    mo9497e(aeVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List h4 = m12897h(this.f14345b, this.f14346c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(h4 != null ? h4.size() : 0), Integer.valueOf(this.f14347d.f14143e.mo9364F().mo9427g().size()), Integer.valueOf(this.f14347d.f14142d.f14070j)});
            C4380ad.m12560h().mo9311c(f14344a, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C4380ad h5 = C4380ad.m12560h();
            String str3 = f14344a;
            new StringBuilder("Unable to schedule ").append(aeVar2);
            h5.mo9312d(str3, "Unable to schedule ".concat(String.valueOf(aeVar)), th);
        }
    }
}
