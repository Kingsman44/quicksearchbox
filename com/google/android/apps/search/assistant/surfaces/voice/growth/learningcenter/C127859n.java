package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.n */
/* compiled from: PG */
class C127859n extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f351912j = false;

    /* renamed from: k */
    private volatile C68314a f351913k;

    /* renamed from: l */
    private final Object f351914l = new Object();

    public C127859n() {
        this.f2705f.mo3343a(new C127858m(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo108250v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo108250v() {
        if (this.f351913k == null) {
            synchronized (this.f351914l) {
                if (this.f351913k == null) {
                    this.f351913k = mo108238w();
                }
            }
        }
        return this.f351913k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo108238w() {
        throw null;
    }
}
