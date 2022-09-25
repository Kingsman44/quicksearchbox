package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.a */
/* compiled from: PG */
class C110503a extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f308083a;

    /* renamed from: b */
    private final Object f308084b = new Object();

    /* renamed from: c */
    private boolean f308085c = false;

    /* renamed from: d */
    public final C68314a mo98744d() {
        if (this.f308083a == null) {
            synchronized (this.f308084b) {
                if (this.f308083a == null) {
                    this.f308083a = new C68314a(this);
                }
            }
        }
        return this.f308083a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo98744d().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f308085c) {
            this.f308085c = true;
            ((C110516ag) mo98744d().mo17653jN()).mo98756dW((SmartspaceTrampolineActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo98744d().mo60324b();
    }
}
