package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.il */
/* compiled from: PG */
class C96297il extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f269482a;

    /* renamed from: b */
    private final Object f269483b = new Object();

    /* renamed from: c */
    private boolean f269484c = false;

    /* renamed from: a */
    public final C68314a mo90057a() {
        if (this.f269482a == null) {
            synchronized (this.f269483b) {
                if (this.f269482a == null) {
                    this.f269482a = new C68314a(this);
                }
            }
        }
        return this.f269482a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo90057a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f269484c) {
            this.f269484c = true;
            ((C96229fy) mo90057a().mo17653jN()).mo90012dI((HerbieAudioTestingActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo90057a().mo60324b();
    }
}
