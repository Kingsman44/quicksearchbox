package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142557aq;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import com.google.android.enterprise.connectedapps.internal.BundlerType;
import com.google.android.enterprise.connectedapps.p10716c.C142568e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.ac */
/* compiled from: PG */
public final class C113818ac implements C113819ad {

    /* renamed from: a */
    private final C142557aq f315225a;

    public C113818ac(C142557aq aqVar) {
        aqVar.getClass();
        this.f315225a = aqVar;
    }

    /* renamed from: a */
    public final C60870cx mo100675a(OpenCalendarEventIntentData openCalendarEventIntentData) {
        C113817ab abVar = C113817ab.f315222a;
        Bundle bundle = new Bundle(Bundler.class.getClassLoader());
        C113817ab.f315223b.mo86971c(bundle, "intentData", openCalendarEventIntentData, BundlerType.m231188a("com.google.android.apps.gsa.staticplugins.opa.util.calendar.OpenCalendarEventIntentData"));
        C142568e eVar = new C142568e(C113817ab.f315223b, BundlerType.m231188a("android.content.Intent"));
        this.f315225a.mo117175b().mo117153e(6018492542292217453L, 0, bundle, eVar, eVar.f386859a);
        return eVar.f386859a;
    }
}
