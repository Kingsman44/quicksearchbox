package com.google.android.apps.gsa.assistant.handoff;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.ai */
/* compiled from: PG */
class C9452ai extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f32875a;

    /* renamed from: b */
    private final Object f32876b = new Object();

    /* renamed from: c */
    private boolean f32877c = false;

    /* renamed from: a */
    public final C68314a mo17698a() {
        if (this.f32875a == null) {
            synchronized (this.f32876b) {
                if (this.f32875a == null) {
                    this.f32875a = new C68314a(this);
                }
            }
        }
        return this.f32875a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17698a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f32877c) {
            this.f32877c = true;
            ((C9481n) mo17698a().mo17653jN()).mo17711b((BrowserControlActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo17698a().mo60324b();
    }
}
