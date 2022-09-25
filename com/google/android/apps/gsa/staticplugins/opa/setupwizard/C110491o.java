package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.o */
/* compiled from: PG */
class C110491o extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f308035a;

    /* renamed from: b */
    private final Object f308036b = new Object();

    /* renamed from: c */
    private boolean f308037c = false;

    /* renamed from: a */
    public final C68314a mo98736a() {
        if (this.f308035a == null) {
            synchronized (this.f308036b) {
                if (this.f308035a == null) {
                    this.f308035a = new C68314a(this);
                }
            }
        }
        return this.f308035a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo98736a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f308037c) {
            this.f308037c = true;
            ((C110458ah) mo98736a().mo17653jN()).mo98695dX((SuwActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo98736a().mo60324b();
    }
}
