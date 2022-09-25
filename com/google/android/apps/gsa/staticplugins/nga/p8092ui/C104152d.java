package com.google.android.apps.gsa.staticplugins.nga.p8092ui;

import android.app.Activity;
import android.os.Bundle;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.ui.d */
/* compiled from: PG */
class C104152d extends Activity implements C68288b {

    /* renamed from: a */
    private volatile C68314a f289708a;

    /* renamed from: b */
    private final Object f289709b = new Object();

    /* renamed from: c */
    private boolean f289710c = false;

    /* renamed from: d */
    public final C68314a mo93973d() {
        if (this.f289708a == null) {
            synchronized (this.f289709b) {
                if (this.f289708a == null) {
                    this.f289708a = new C68314a(this);
                }
            }
        }
        return this.f289708a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93973d().mo17653jN();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        if (!this.f289710c) {
            this.f289710c = true;
            ((C104136a) mo93973d().mo17653jN()).mo93961dD((FeedbackEmptyActivity) this);
        }
        super.onCreate(bundle);
    }

    public final Object onRetainNonConfigurationInstance() {
        return mo93973d().mo60324b();
    }
}
