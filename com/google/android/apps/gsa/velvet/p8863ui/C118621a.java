package com.google.android.apps.gsa.velvet.p8863ui;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.velvet.ui.a */
/* compiled from: PG */
class C118621a extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f330924a;

    /* renamed from: b */
    private final Object f330925b = new Object();

    /* renamed from: c */
    private boolean f330926c = false;

    /* renamed from: a */
    public final C68314a mo103796a() {
        if (this.f330924a == null) {
            synchronized (this.f330925b) {
                if (this.f330924a == null) {
                    this.f330924a = new C68314a(this);
                }
            }
        }
        return this.f330924a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103796a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f330926c) {
            this.f330926c = true;
            VelvetIntentDispatcher velvetIntentDispatcher = (VelvetIntentDispatcher) this;
            ((C118622b) mo103796a().mo17653jN()).mo103798fO();
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo103796a().mo60324b();
    }
}
