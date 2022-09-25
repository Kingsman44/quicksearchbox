package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.sidekick.main.endpoints.h */
/* compiled from: PG */
class C91294h extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f254791a;

    /* renamed from: b */
    private final Object f254792b = new Object();

    /* renamed from: c */
    private boolean f254793c = false;

    /* renamed from: b */
    public final C68314a mo85577b() {
        if (this.f254791a == null) {
            synchronized (this.f254792b) {
                if (this.f254791a == null) {
                    this.f254791a = new C68314a(this);
                }
            }
        }
        return this.f254791a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo85577b().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f254793c) {
            this.f254793c = true;
            ((C91292f) mo85577b().mo17653jN()).mo85575dG((GoogleServiceWebviewWrapper) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo85577b().mo60324b();
    }
}
