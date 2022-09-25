package com.google.android.libraries.notifications.entrypoints.scheduled;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.google.android.libraries.notifications.p2266c.C29783b;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2298k.C30044d;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import java.util.Iterator;
import java.util.Set;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68798g;

/* renamed from: com.google.android.libraries.notifications.entrypoints.scheduled.c */
/* compiled from: PG */
public final class C29976c implements C29974a {

    /* renamed from: a */
    private final Set f81162a;

    /* renamed from: b */
    private final C29783b f81163b;

    /* renamed from: c */
    private final C29835a f81164c;

    public C29976c(Set set, C29783b bVar, C29835a aVar) {
        this.f81162a = set;
        this.f81163b = bVar;
        this.f81164c = aVar;
    }

    /* renamed from: a */
    public final boolean mo35276a(JobParameters jobParameters, JobService jobService) {
        int jobId = jobParameters.getJobId();
        if (C68798g.m99324d()) {
            this.f81164c.mo35161c(8).mo35136a();
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            C30058b.m55791c("ScheduledTaskServiceHandler", "Job scheduled with NO extras. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
        try {
            String string = extras.getString("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_HANDLER");
            C30044d dVar = null;
            if (!TextUtils.isEmpty(string)) {
                Iterator it = this.f81162a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C30044d dVar2 = (C30044d) it.next();
                    if (string.equals(dVar2.mo35170e())) {
                        dVar = dVar2;
                        break;
                    }
                }
            }
            if (dVar == null) {
                C30058b.m55791c("ScheduledTaskServiceHandler", "ChimeTask NOT found. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
                return false;
            }
            extras.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", extras.getInt("com.google.android.libraries.notifications.INTENT_EXTRA_TASK_RETRY_COUNT", -1) + 1);
            C30058b.m55794f("ScheduledTaskServiceHandler", "Starting job execution. Job ID: '%d', key: '%s'", Integer.valueOf(jobId), string);
            this.f81163b.mo34980b(new C29975b(dVar, extras, jobId, string, jobService, jobParameters));
            return true;
        } catch (IllegalArgumentException | NullPointerException e) {
            C30058b.m55792d("ScheduledTaskServiceHandler", e, "Error retrieving handler key for Job. Job ID: '%d'", Integer.valueOf(jobId));
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo35277b() {
        return true;
    }
}
