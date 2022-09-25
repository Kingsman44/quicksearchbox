package com.google.android.apps.gsa.tasks;

import android.app.job.JobService;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58881cr;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.tasks.ao */
/* compiled from: PG */
abstract class C118480ao extends JobService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f328851a;

    /* renamed from: b */
    private final Object f328852b = new Object();

    /* renamed from: c */
    private boolean f328853c = false;

    /* renamed from: b */
    public final C68326i mo103716b() {
        if (this.f328851a == null) {
            synchronized (this.f328852b) {
                if (this.f328851a == null) {
                    this.f328851a = new C68326i(this);
                }
            }
        }
        return this.f328851a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103716b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f328853c) {
            this.f328853c = true;
            BackgroundTasksJobService backgroundTasksJobService = (BackgroundTasksJobService) this;
            amb amb = (amb) mo103716b().mo17653jN();
            backgroundTasksJobService.f328788a = (C118529cd) amb.f197807b.b.f199996bJ.mo17428b();
            backgroundTasksJobService.f328789b = (C118533ch) amb.f197807b.a.f201953B.mo17428b();
            backgroundTasksJobService.f328790c = (C58881cr) amb.f197807b.a.f202112E.mo17428b();
            backgroundTasksJobService.f328791d = (C22871g) amb.f197807b.aW.mo17428b();
        }
        super.onCreate();
    }
}
