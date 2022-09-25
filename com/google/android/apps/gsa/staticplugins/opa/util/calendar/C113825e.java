package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.content.Intent;
import android.net.Uri;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.e */
/* compiled from: PG */
public abstract class C113825e {

    /* renamed from: a */
    public static final C59071e f315231a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.calendar.e");

    /* renamed from: a */
    public final Intent mo100680a(OpenCalendarEventIntentData openCalendarEventIntentData) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(openCalendarEventIntentData.f315216a));
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("use_webview", true);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C60870cx mo100681b(OpenCalendarEventIntentData openCalendarEventIntentData);

    /* renamed from: c */
    public abstract C60870cx mo100682c(OpenCalendarEventIntentData openCalendarEventIntentData);

    /* renamed from: d */
    public abstract boolean mo100683d(OpenCalendarEventIntentData openCalendarEventIntentData);
}
