package com.google.android.googlequicksearchbox;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.googlequicksearchbox.a */
/* compiled from: PG */
class C146538a extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f395752a;

    /* renamed from: b */
    private final Object f395753b = new Object();

    /* renamed from: c */
    private boolean f395754c = false;

    /* renamed from: a */
    public final C68314a mo123325a() {
        if (this.f395752a == null) {
            synchronized (this.f395753b) {
                if (this.f395752a == null) {
                    this.f395752a = new C68314a(this);
                }
            }
        }
        return this.f395752a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo123325a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f395754c) {
            this.f395754c = true;
            ((C146545g) mo123325a().mo17653jN()).mo123336dL((LegacySearchActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo123325a().mo60324b();
    }
}
