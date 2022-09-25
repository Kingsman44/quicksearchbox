package com.google.android.apps.gsa.projection;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.projection.f */
/* compiled from: PG */
class C84194f extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f229182a;

    /* renamed from: b */
    private final Object f229183b = new Object();

    /* renamed from: c */
    private boolean f229184c = false;

    /* renamed from: a */
    public final C68314a mo77659a() {
        if (this.f229182a == null) {
            synchronized (this.f229183b) {
                if (this.f229182a == null) {
                    this.f229182a = new C68314a(this);
                }
            }
        }
        return this.f229182a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo77659a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f229184c) {
            this.f229184c = true;
            ((C84195g) mo77659a().mo17653jN()).mo77661dQ((OpaAutoOptInActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo77659a().mo60324b();
    }
}
