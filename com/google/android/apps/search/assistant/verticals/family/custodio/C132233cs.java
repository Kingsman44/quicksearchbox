package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.app.Activity;
import android.os.Bundle;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.monitoring.feedback.HelpAndFeedbackStarter;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.cs */
/* compiled from: PG */
public final class C132233cs {

    /* renamed from: a */
    public final Activity f360919a;

    /* renamed from: b */
    public final C132230cp f360920b;

    /* renamed from: c */
    public final Bundle f360921c;

    /* renamed from: d */
    public final C46485f f360922d;

    /* renamed from: e */
    public final HelpAndFeedbackStarter f360923e;

    public C132233cs(Activity activity, C132230cp cpVar, C46485f fVar, HelpAndFeedbackStarter helpAndFeedbackStarter) {
        this.f360919a = activity;
        this.f360920b = cpVar;
        Bundle arguments = cpVar.getArguments();
        this.f360921c = arguments == null ? new Bundle() : arguments;
        this.f360922d = fVar;
        this.f360923e = helpAndFeedbackStarter;
    }
}
