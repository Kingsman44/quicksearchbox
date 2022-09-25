package com.google.android.apps.gsa.settingsui;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.settingsui.d */
/* compiled from: PG */
class C88989d extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f241154a;

    /* renamed from: b */
    private final Object f241155b = new Object();

    /* renamed from: c */
    private boolean f241156c = false;

    /* renamed from: a */
    public final C68314a mo82951a() {
        if (this.f241154a == null) {
            synchronized (this.f241155b) {
                if (this.f241154a == null) {
                    this.f241154a = new C68314a(this);
                }
            }
        }
        return this.f241154a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo82951a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f241156c) {
            this.f241156c = true;
            ((C88998m) mo82951a().mo17653jN()).mo82957ec((VoiceSearchPreferences) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo82951a().mo60324b();
    }
}
