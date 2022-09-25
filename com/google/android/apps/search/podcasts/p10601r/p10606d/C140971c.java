package com.google.android.apps.search.podcasts.p10601r.p10606d;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.search.podcasts.p10576l.C140459au;
import com.google.android.apps.search.podcasts.widgets.feedback.FeedbackHelper;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.dataservice.C46778cv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.r.d.c */
/* compiled from: PG */
public final class C140971c {

    /* renamed from: a */
    public final FeedbackHelper f382745a;

    /* renamed from: b */
    public final C140459au f382746b;

    /* renamed from: c */
    public final C21370a f382747c;

    /* renamed from: d */
    public final C46778cv f382748d;

    /* renamed from: e */
    private final Context f382749e;

    public C140971c(Context context, FeedbackHelper feedbackHelper, C140459au auVar, C21370a aVar, C46778cv cvVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(feedbackHelper, "feedbackHelper");
        C69664n.m101061g(auVar, "preferencesManager");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f382749e = context;
        this.f382745a = feedbackHelper;
        this.f382746b = auVar;
        this.f382747c = aVar;
        this.f382748d = cvVar;
    }

    /* renamed from: a */
    public final void mo116050a() {
        try {
            this.f382749e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.apps.podcasts")));
        } catch (ActivityNotFoundException unused) {
            this.f382749e.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.apps.podcasts")));
        }
    }
}
