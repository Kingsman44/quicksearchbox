package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bd */
/* compiled from: PG */
class C108847bd extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f302654a;

    /* renamed from: b */
    private final Object f302655b = new Object();

    /* renamed from: c */
    private boolean f302656c = false;

    /* renamed from: a */
    public final C68314a mo97227a() {
        if (this.f302654a == null) {
            synchronized (this.f302655b) {
                if (this.f302654a == null) {
                    this.f302654a = new C68314a(this);
                }
            }
        }
        return this.f302654a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo97227a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f302656c) {
            this.f302656c = true;
            ((C108953fb) mo97227a().mo17653jN()).mo97307dY((UdcPuntCardActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo97227a().mo60324b();
    }
}
