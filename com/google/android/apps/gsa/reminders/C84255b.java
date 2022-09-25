package com.google.android.apps.gsa.reminders;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.gms.reminders.C145819m;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.reminders.b */
/* compiled from: PG */
abstract class C84255b extends C145819m implements C68288b {

    /* renamed from: a */
    private volatile C68326i f229295a;

    /* renamed from: b */
    private final Object f229296b = new Object();

    /* renamed from: f */
    private boolean f229297f = false;

    /* renamed from: a */
    public final C68326i mo77744a() {
        if (this.f229295a == null) {
            synchronized (this.f229296b) {
                if (this.f229295a == null) {
                    this.f229295a = new C68326i(this);
                }
            }
        }
        return this.f229295a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo77744a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f229297f) {
            this.f229297f = true;
            RemindersListenerService remindersListenerService = (RemindersListenerService) this;
            amb amb = (amb) mo77744a().mo17653jN();
            remindersListenerService.f229288a = C68219e.m98518a(amb.f197807b.a.f202324I);
            remindersListenerService.f229289b = (C83793i) amb.f197807b.a.f202814eF.mo17428b();
            C86124t tVar = (C86124t) amb.f197807b.a.f202006C.mo17428b();
        }
        super.onCreate();
    }
}
