package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.google.android.libraries.notifications.p2267d.C29785a;
import com.google.android.libraries.notifications.p2267d.C29786b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2337h.p2338a.C30144a;
import com.google.apps.tiktok.tracing.C47538ax;

/* compiled from: PG */
public final class ScheduledTaskService extends JobService {
    /* renamed from: a */
    private final C29786b m55581a() {
        try {
            return C29785a.m54946a(getApplicationContext());
        } catch (IllegalStateException e) {
            C30058b.m55797i("ScheduledTaskService", e, "Failed to get ChimeComponent for ScheduledTaskService", new Object[0]);
            return null;
        }
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C29786b a = m55581a();
        if (a == null) {
            return false;
        }
        a.mo34988BS();
        C30144a.m56002a(getApplicationContext());
        C47538ax c = a.mo34994rW().f81524a.mo51613c("ScheduledTaskService");
        try {
            boolean a2 = a.mo34989cr().mo35276a(jobParameters, this);
            if (c != null) {
                c.close();
            }
            return a2;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        C29786b a = m55581a();
        if (a == null) {
            return false;
        }
        return a.mo34989cr().mo35277b();
    }
}
