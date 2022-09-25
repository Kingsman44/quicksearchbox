package com.google.android.apps.gsa.staticplugins.feedback.service;

import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.j.a;
import com.google.android.apps.gsa.shared.p6996ar.C89286c;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.service.f */
/* compiled from: PG */
abstract class C101257f extends C89286c implements C68288b {

    /* renamed from: a */
    private volatile C68326i f282596a;

    /* renamed from: b */
    private final Object f282597b = new Object();

    /* renamed from: c */
    private boolean f282598c = false;

    /* renamed from: a */
    public final C68326i mo92206a() {
        if (this.f282596a == null) {
            synchronized (this.f282597b) {
                if (this.f282596a == null) {
                    this.f282596a = new C68326i(this);
                }
            }
        }
        return this.f282596a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo92206a().mo17653jN();
    }

    public void onCreate() {
        if (!this.f282598c) {
            this.f282598c = true;
            ((FeedbackService) this).f282579a = (a) ((amb) mo92206a().mo17653jN()).f197807b.b.f199977ar.mo17428b();
        }
        super.onCreate();
    }
}
