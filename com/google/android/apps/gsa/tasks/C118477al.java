package com.google.android.apps.gsa.tasks;

import android.app.job.JobParameters;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22868d;

/* renamed from: com.google.android.apps.gsa.tasks.al */
/* compiled from: PG */
final class C118477al implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C118485at f328841a;

    /* renamed from: b */
    final /* synthetic */ JobParameters f328842b;

    /* renamed from: c */
    final /* synthetic */ BackgroundTasksJobService f328843c;

    public C118477al(BackgroundTasksJobService backgroundTasksJobService, C118485at atVar, JobParameters jobParameters) {
        this.f328843c = backgroundTasksJobService;
        this.f328841a = atVar;
        this.f328842b = jobParameters;
    }

    /* renamed from: c */
    private final void m196677c() {
        this.f328843c.mo103709a(this.f328841a);
        this.f328843c.jobFinished(this.f328842b, false);
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        m196677c();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        m196677c();
    }
}
