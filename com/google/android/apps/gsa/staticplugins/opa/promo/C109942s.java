package com.google.android.apps.gsa.staticplugins.opa.promo;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.s */
/* compiled from: PG */
class C109942s extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f306338a;

    /* renamed from: b */
    private final Object f306339b = new Object();

    /* renamed from: c */
    private boolean f306340c = false;

    /* renamed from: a */
    public final C68314a mo98264a() {
        if (this.f306338a == null) {
            synchronized (this.f306339b) {
                if (this.f306338a == null) {
                    this.f306338a = new C68314a(this);
                }
            }
        }
        return this.f306338a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo98264a().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f306340c) {
            this.f306340c = true;
            ((C109924at) mo98264a().mo17653jN()).mo98258dZ((UpgradePromoTooltipActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo98264a().mo60324b();
    }
}
