package com.google.android.libraries.notifications.p2298k.p2299a.p2300a;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2298k.C30035a;
import com.google.android.libraries.notifications.p2298k.C30042b;
import com.google.android.libraries.notifications.p2298k.C30043c;
import com.google.android.libraries.notifications.p2298k.C30044d;
import com.google.android.libraries.notifications.p2298k.C30045e;
import com.google.android.libraries.notifications.p2298k.C30046f;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30071a;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2334b.C30140a;
import com.google.common.base.C58838bb;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.k.a.a.a */
/* compiled from: PG */
public final class C30037a implements C30045e {

    /* renamed from: a */
    private static final String f81278a = String.format("JobScheduler returned RESULT_FAILURE. Did you forget to add [%s] to your app dependencies?", new Object[]{"java/com/google/android/libraries/notifications/entrypoints/scheduled"});

    /* renamed from: b */
    private final Context f81279b;

    /* renamed from: c */
    private final C30075e f81280c;

    /* renamed from: d */
    private final C30046f f81281d;

    public C30037a(Context context, C30075e eVar, C30046f fVar) {
        this.f81279b = context;
        this.f81280c = eVar;
        this.f81281d = fVar;
    }

    /* renamed from: e */
    private final void m55729e(C29820k kVar, int i, C30044d dVar, Bundle bundle, Long l) {
        C58838bb.m90872g(!dVar.mo35171f() || dVar.mo35166a() > 0, "Job is recurrying but does not have a period > 0, got: %s.", dVar.mo35166a());
        PersistableBundle persistableBundle = new PersistableBundle(bundle.keySet().size());
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof Integer) {
                    persistableBundle.putInt(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    persistableBundle.putLong(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    persistableBundle.putDouble(str, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    persistableBundle.putString(str, (String) obj);
                } else if (obj instanceof String[]) {
                    persistableBundle.putStringArray(str, (String[]) obj);
                } else {
                    throw new IllegalArgumentException("Extra parameter types supported: Integer, Long, Double, String.Error for, key: [" + str + "] value: [" + obj.toString() + "].");
                }
            }
        }
        persistableBundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER", dVar.mo35170e());
        int a = this.f81281d.mo35384a(kVar == null ? null : kVar.mo35004d(), i);
        boolean a2 = C30140a.m55988a(this.f81279b, "android.permission.RECEIVE_BOOT_COMPLETED");
        JobInfo.Builder extras = new JobInfo.Builder(a, new ComponentName(this.f81279b, ((C30071a) this.f81280c).f81361g)).setExtras(persistableBundle);
        C30043c d = dVar.mo35169d();
        C30043c cVar = C30043c.NONE;
        JobInfo.Builder persisted = extras.setRequiredNetworkType(d.ordinal() != 0 ? 1 : 0).setPersisted(a2);
        if (dVar.mo35171f()) {
            persisted.setPeriodic(dVar.mo35166a());
        } else if (l != null) {
            persisted.setMinimumLatency(l.longValue());
        }
        C30042b c = dVar.mo35168c();
        if (c != null) {
            long a3 = c.mo35382a();
            int b = c.mo35383b();
            int i2 = b - 1;
            if (b != 0) {
                persisted.setBackoffCriteria(a3, i2 != 0 ? 1 : 0);
            } else {
                throw null;
            }
        }
        try {
            if (((JobScheduler) this.f81279b.getSystemService("jobscheduler")).schedule(persisted.build()) != 0) {
                C30058b.m55789a("ChimeTaskSchedulerApi", "Successfully scheduled a job for package [%s], with ID: %s, type: %s", this.f81279b.getApplicationContext().getPackageName(), Integer.valueOf(a), Integer.valueOf(i));
                return;
            }
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            C30058b.m55792d("ChimeTaskSchedulerApi", e, "Failed to scheduled job %s", Integer.valueOf(a));
        }
        C30058b.m55796h("ChimeTaskSchedulerApi", "Failed to schedule a job for package [%s] with ID: %s, type: %s", this.f81279b.getApplicationContext().getPackageName(), Integer.valueOf(a), Integer.valueOf(i));
        throw new C30035a(f81278a);
    }

    /* renamed from: a */
    public final void mo35369a(C29820k kVar, int i) {
        Long l;
        C30046f fVar = this.f81281d;
        if (kVar == null) {
            l = null;
        } else {
            l = kVar.mo35004d();
        }
        int a = fVar.mo35384a(l, i);
        C30058b.m55789a("ChimeTaskSchedulerApi", "Cancelling a scheduled job for package [%s] with ID: %s, type: %s", this.f81279b.getApplicationContext().getPackageName(), Integer.valueOf(a), Integer.valueOf(i));
        ((JobScheduler) this.f81279b.getSystemService("jobscheduler")).cancel(a);
    }

    /* renamed from: b */
    public final void mo35370b(C29820k kVar, int i, C30044d dVar, Bundle bundle) {
        m55729e(kVar, i, dVar, bundle, (Long) null);
    }

    /* renamed from: c */
    public final void mo35371c(C29820k kVar, int i, C30044d dVar, Bundle bundle, long j) {
        C58838bb.m90872g(j > 0, "Scheduled job minimumLatencyMs must be > 0, got: %s.", j);
        m55729e(kVar, i, dVar, bundle, Long.valueOf(j));
    }

    /* renamed from: d */
    public final boolean mo35372d() {
        try {
            List<JobInfo> allPendingJobs = ((JobScheduler) this.f81279b.getSystemService("jobscheduler")).getAllPendingJobs();
            if (allPendingJobs == null) {
                return false;
            }
            for (JobInfo id : allPendingJobs) {
                if (id.getId() == this.f81281d.mo35384a((Long) null, 7)) {
                    return true;
                }
            }
            return false;
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            C30058b.m55792d("ChimeTaskSchedulerApi", e, "Failed to get all pending jobs", new Object[0]);
            return false;
        }
    }
}
