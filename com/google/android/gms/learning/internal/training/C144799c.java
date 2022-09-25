package com.google.android.gms.learning.internal.training;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.core.content.C1882h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.learning.internal.training.c */
/* compiled from: PG */
public final class C144799c {

    /* renamed from: a */
    private static final long f391645a = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: a */
    public static void m235337a(JobInfo jobInfo, long j, boolean z, PersistableBundle persistableBundle) {
        persistableBundle.putInt("job_info_persisted", jobInfo.isPersisted() ? 1 : 0);
        persistableBundle.putInt("job_info_requires_device_idle", jobInfo.isRequireDeviceIdle() ? 1 : 0);
        persistableBundle.putInt("job_info_requires_charging", jobInfo.isRequireCharging() ? 1 : 0);
        persistableBundle.putInt("job_info_required_network_type", jobInfo.getNetworkType());
        persistableBundle.putLong("job_info_override_deadline_ms", jobInfo.getMaxExecutionDelayMillis());
        persistableBundle.putLong("non_idle_retry_minimum_latency_ms", j);
        persistableBundle.putInt("waive_idle_requirement", z ? 1 : 0);
    }

    /* renamed from: b */
    static void m235338b(Context context, JobParameters jobParameters) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        PersistableBundle persistableBundle = new PersistableBundle(jobParameters.getExtras());
        persistableBundle.putLong("debug_rescheduled_because_non_idle", System.currentTimeMillis());
        long j = persistableBundle.getLong("non_idle_retry_minimum_latency_ms", f391645a);
        boolean z = false;
        JobInfo.Builder minimumLatency = new JobInfo.Builder(jobParameters.getJobId(), new ComponentName(context, "com.google.android.gms.learning.internal.training.InAppJobService")).setRequiredNetworkType(persistableBundle.getInt("job_info_required_network_type", 2)).setRequiresDeviceIdle(persistableBundle.getInt("job_info_requires_device_idle", 1) == 1).setRequiresCharging(persistableBundle.getInt("job_info_requires_charging", 1) == 1).setExtras(persistableBundle).setMinimumLatency(j);
        long j2 = persistableBundle.getLong("job_info_override_deadline_ms", 0);
        if (j2 > 0) {
            minimumLatency.setOverrideDeadline(j2);
        }
        if (C1882h.m5137c(context, "android.permission.RECEIVE_BOOT_COMPLETED") == 0) {
            if (persistableBundle.getInt("job_info_persisted", 1) == 1) {
                z = true;
            }
            minimumLatency.setPersisted(z);
        }
        if (jobScheduler.schedule(minimumLatency.build()) == 1) {
            if (Log.isLoggable("brella.InAppJobSvc", 3)) {
                int jobId = jobParameters.getJobId();
                Log.d("brella.InAppJobSvc", "Rescheduled job " + jobId + " to run again in " + j + "ms");
            }
        } else if (Log.isLoggable("brella.InAppJobSvc", 5)) {
            int jobId2 = jobParameters.getJobId();
            Log.w("brella.InAppJobSvc", "Failed to reschedule job " + jobId2);
        }
    }
}
