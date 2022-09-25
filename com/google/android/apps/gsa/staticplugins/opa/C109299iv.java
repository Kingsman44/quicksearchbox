package com.google.android.apps.gsa.staticplugins.opa;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.iv */
/* compiled from: PG */
class C109299iv extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f304477a;

    /* renamed from: b */
    private final Object f304478b = new Object();

    /* renamed from: c */
    private boolean f304479c = false;

    /* renamed from: b */
    public final C68314a mo97755b() {
        if (this.f304477a == null) {
            synchronized (this.f304478b) {
                if (this.f304477a == null) {
                    this.f304477a = new C68314a(this);
                }
            }
        }
        return this.f304477a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo97755b().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f304479c) {
            this.f304479c = true;
            ((C109277il) mo97755b().mo17653jN()).mo97740dB((EnterOpaActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo97755b().mo60324b();
    }
}
