package com.google.android.apps.gsa.p6484r;

import com.google.android.apps.gsa.binaries.satin.app.adh;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.r.a */
/* compiled from: PG */
abstract class C84246a extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f229264a;

    /* renamed from: b */
    private final Object f229265b = new Object();

    /* renamed from: c */
    private boolean f229266c = false;

    /* renamed from: a */
    public final C68326i mo77727a() {
        if (this.f229264a == null) {
            synchronized (this.f229265b) {
                if (this.f229264a == null) {
                    this.f229264a = new C68326i(this);
                }
            }
        }
        return this.f229264a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo77727a().mo17653jN();
    }

    public final void onCreate() {
        if (!this.f229266c) {
            this.f229266c = true;
            ((C84252g) this).f229274a = new adh(((amb) mo77727a().mo17653jN()).f197807b);
        }
        super.onCreate();
    }
}
