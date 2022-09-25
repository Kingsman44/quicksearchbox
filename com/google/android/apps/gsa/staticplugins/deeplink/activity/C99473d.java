package com.google.android.apps.gsa.staticplugins.deeplink.activity;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.activity.d */
/* compiled from: PG */
class C99473d extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f278355a;

    /* renamed from: b */
    private final Object f278356b = new Object();

    /* renamed from: c */
    private boolean f278357c = false;

    /* renamed from: a */
    public final C68314a mo91474a() {
        if (this.f278355a == null) {
            synchronized (this.f278356b) {
                if (this.f278355a == null) {
                    this.f278355a = new C68314a(this);
                }
            }
        }
        return this.f278355a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo91474a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f278357c) {
            this.f278357c = true;
            ((C99471b) mo91474a().mo17653jN()).mo91473dy((DeeplinkActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo91474a().mo60324b();
    }
}
