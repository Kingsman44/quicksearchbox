package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Intent;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.m */
/* compiled from: PG */
public final /* synthetic */ class C113833m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C113834n f315238a;

    /* renamed from: b */
    public final /* synthetic */ OpenCalendarEventIntentData f315239b;

    public /* synthetic */ C113833m(C113834n nVar, OpenCalendarEventIntentData openCalendarEventIntentData) {
        this.f315238a = nVar;
        this.f315239b = openCalendarEventIntentData;
    }

    public final C60870cx apply(Object obj) {
        C113834n nVar = this.f315238a;
        return nVar.mo100685f((Intent) obj, nVar.mo100684e(this.f315239b));
    }
}
