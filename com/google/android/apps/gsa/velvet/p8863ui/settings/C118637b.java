package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.b */
/* compiled from: PG */
class C118637b extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f330973a;

    /* renamed from: b */
    private final Object f330974b = new Object();

    /* renamed from: c */
    private boolean f330975c = false;

    /* renamed from: a */
    public final C68314a mo103831a() {
        if (this.f330973a == null) {
            synchronized (this.f330974b) {
                if (this.f330973a == null) {
                    this.f330973a = new C68314a(this);
                }
            }
        }
        return this.f330973a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo103831a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f330975c) {
            this.f330975c = true;
            ((C118649c) mo103831a().mo17653jN()).mo103834dV((PublicSettingsActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo103831a().mo60324b();
    }
}
