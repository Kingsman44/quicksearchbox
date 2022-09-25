package androidx.work.impl.background.systemjob;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: androidx.work.impl.background.systemjob.c */
/* compiled from: PG */
final class C4536c {
    /* renamed from: a */
    static Uri[] m12903a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    /* renamed from: b */
    static String[] m12904b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
