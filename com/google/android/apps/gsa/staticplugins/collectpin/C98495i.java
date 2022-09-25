package com.google.android.apps.gsa.staticplugins.collectpin;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.collectpin.i */
/* compiled from: PG */
class C98495i extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f275034a;

    /* renamed from: b */
    private final Object f275035b = new Object();

    /* renamed from: c */
    private boolean f275036c = false;

    /* renamed from: d */
    public final C68314a mo91141d() {
        if (this.f275034a == null) {
            synchronized (this.f275035b) {
                if (this.f275034a == null) {
                    this.f275034a = new C68314a(this);
                }
            }
        }
        return this.f275034a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo91141d().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f275036c) {
            this.f275036c = true;
            CollectPinActivity collectPinActivity = (CollectPinActivity) this;
            ((C98494h) mo91141d().mo17653jN()).mo91140es();
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo91141d().mo60324b();
    }
}
