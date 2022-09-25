package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8060ui;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.as */
/* compiled from: PG */
class C103129as extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f287810j = false;

    /* renamed from: k */
    private volatile C68314a f287811k;

    /* renamed from: l */
    private final Object f287812l = new Object();

    public C103129as() {
        this.f2705f.mo3343a(new C103128ar(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo93644v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo93644v() {
        if (this.f287811k == null) {
            synchronized (this.f287812l) {
                if (this.f287811k == null) {
                    this.f287811k = mo93617w();
                }
            }
        }
        return this.f287811k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo93617w() {
        throw null;
    }
}
