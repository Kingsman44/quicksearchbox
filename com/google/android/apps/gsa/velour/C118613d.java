package com.google.android.apps.gsa.velour;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.velour.d */
/* compiled from: PG */
class C118613d extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f330909a;

    /* renamed from: b */
    private final Object f330910b = new Object();

    /* renamed from: c */
    private boolean f330911c = false;

    /* renamed from: a */
    public final C68314a mo103788a() {
        if (this.f330909a == null) {
            synchronized (this.f330910b) {
                if (this.f330909a == null) {
                    this.f330909a = new C68314a(this);
                }
            }
        }
        return this.f330909a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103788a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f330911c) {
            this.f330911c = true;
            ((C118612c) mo103788a().mo17653jN()).mo103787dz((DynamicActivityTrampoline) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo103788a().mo60324b();
    }
}
