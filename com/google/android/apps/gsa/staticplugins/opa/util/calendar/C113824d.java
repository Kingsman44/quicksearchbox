package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.d */
/* compiled from: PG */
public final /* synthetic */ class C113824d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C113825e f315229a;

    /* renamed from: b */
    public final /* synthetic */ OpenCalendarEventIntentData f315230b;

    public /* synthetic */ C113824d(C113825e eVar, OpenCalendarEventIntentData openCalendarEventIntentData) {
        this.f315229a = eVar;
        this.f315230b = openCalendarEventIntentData;
    }

    public final C60870cx apply(Object obj) {
        C113825e eVar = this.f315229a;
        OpenCalendarEventIntentData openCalendarEventIntentData = this.f315230b;
        ((C59052c) ((C59052c) ((C59052c) C113825e.f315231a.mo56225c()).mo56382g((Exception) obj)).mo56372aa(28459)).mo56386p("Opening the calendar app failed");
        return eVar.mo100681b(openCalendarEventIntentData);
    }
}
