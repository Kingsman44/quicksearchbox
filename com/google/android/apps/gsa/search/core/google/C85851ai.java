package com.google.android.apps.gsa.search.core.google;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.search.core.google.ai */
/* compiled from: PG */
class C85851ai extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f232134a;

    /* renamed from: b */
    private final Object f232135b = new Object();

    /* renamed from: c */
    private boolean f232136c = false;

    /* renamed from: a */
    public final C68314a mo79485a() {
        if (this.f232134a == null) {
            synchronized (this.f232135b) {
                if (this.f232134a == null) {
                    this.f232134a = new C68314a(this);
                }
            }
        }
        return this.f232134a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo79485a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f232136c) {
            this.f232136c = true;
            ((C85844ac) mo79485a().mo17653jN()).mo79477dF((C85843ab) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo79485a().mo60324b();
    }
}
