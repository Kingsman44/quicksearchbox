package com.google.android.apps.gsa.speech.setupwizard;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.speech.setupwizard.a */
/* compiled from: PG */
class C92649a extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f258629a;

    /* renamed from: b */
    private final Object f258630b = new Object();

    /* renamed from: c */
    private boolean f258631c = false;

    /* renamed from: a */
    public final C68314a mo87419a() {
        if (this.f258629a == null) {
            synchronized (this.f258630b) {
                if (this.f258629a == null) {
                    this.f258629a = new C68314a(this);
                }
            }
        }
        return this.f258629a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo87419a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f258631c) {
            this.f258631c = true;
            ((C92652d) mo87419a().mo17653jN()).mo87422dJ((HotwordSetupWizardActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo87419a().mo60324b();
    }
}
