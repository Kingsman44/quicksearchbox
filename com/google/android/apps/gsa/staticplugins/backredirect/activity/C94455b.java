package com.google.android.apps.gsa.staticplugins.backredirect.activity;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.backredirect.activity.b */
/* compiled from: PG */
class C94455b extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f264052a;

    /* renamed from: b */
    private final Object f264053b = new Object();

    /* renamed from: c */
    private boolean f264054c = false;

    /* renamed from: a */
    public final C68314a mo88475a() {
        if (this.f264052a == null) {
            synchronized (this.f264053b) {
                if (this.f264052a == null) {
                    this.f264052a = new C68314a(this);
                }
            }
        }
        return this.f264052a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo88475a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f264054c) {
            this.f264054c = true;
            ((C94454a) mo88475a().mo17653jN()).mo88474dx((BackRedirectActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo88475a().mo60324b();
    }
}
