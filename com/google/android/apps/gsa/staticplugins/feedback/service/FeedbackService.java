package com.google.android.apps.gsa.staticplugins.feedback.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gsa.j.a;
import com.google.android.apps.gsa.p5846e.C74507e;

/* compiled from: PG */
public class FeedbackService extends C101257f {

    /* renamed from: a */
    public a f282579a;

    /* renamed from: b */
    private C101256e f282580b;

    public final IBinder onBind(Intent intent) {
        return this.f282580b;
    }

    public final void onCreate() {
        C74507e.m120466b(28);
        super.onCreate();
        this.f282580b = new C101256e(this.f282579a);
    }
}
