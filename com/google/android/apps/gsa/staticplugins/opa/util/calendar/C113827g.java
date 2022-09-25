package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.g */
/* compiled from: PG */
public final class C113827g extends C113825e {

    /* renamed from: b */
    private final C113843w f315233b;

    /* renamed from: c */
    private final C113836p f315234c;

    public C113827g(C113843w wVar, C113836p pVar) {
        this.f315233b = wVar;
        this.f315234c = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo100681b(OpenCalendarEventIntentData openCalendarEventIntentData) {
        return this.f315234c.mo100688a(mo100680a(openCalendarEventIntentData));
    }

    /* renamed from: c */
    public final C60870cx mo100682c(OpenCalendarEventIntentData openCalendarEventIntentData) {
        C60870cx a = this.f315233b.mo100692a(openCalendarEventIntentData);
        C113836p pVar = this.f315234c;
        Objects.requireNonNull(pVar);
        return C60922j.m93045h(a, new C113826f(pVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final boolean mo100683d(OpenCalendarEventIntentData openCalendarEventIntentData) {
        return true;
    }
}
