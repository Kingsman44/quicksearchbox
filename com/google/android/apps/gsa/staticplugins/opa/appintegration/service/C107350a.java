package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.app.Service;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.appintegration.p8997e.C119533b;
import com.google.android.gms.common.C143701ac;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.a */
/* compiled from: PG */
abstract class C107350a extends Service implements C68288b {

    /* renamed from: a */
    private volatile C68326i f298760a;

    /* renamed from: b */
    private final Object f298761b = new Object();

    /* renamed from: c */
    private boolean f298762c = false;

    /* renamed from: a */
    public final C68326i mo95966a() {
        if (this.f298760a == null) {
            synchronized (this.f298761b) {
                if (this.f298760a == null) {
                    this.f298760a = new C68326i(this);
                }
            }
        }
        return this.f298760a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo95966a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f298762c) {
            this.f298762c = true;
            amb amb = (amb) mo95966a().mo17653jN();
            ((AppIntegrationService) this).f298759a = new C107359j((C91142g) amb.f197807b.bq.mo17428b(), (C107374y) amb.f197740M.mo17428b(), C68219e.m98518a(amb.f197807b.fw), (C143701ac) amb.f197807b.a.f203603t.mo17428b(), (C119533b) amb.f197807b.fl.mo17428b());
        }
        super.onCreate();
    }
}
