package com.google.android.apps.search.transcription.voiceime.standalone.settings;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.b */
/* compiled from: PG */
class C142024b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f385353j = false;

    /* renamed from: k */
    private volatile C68314a f385354k;

    /* renamed from: l */
    private final Object f385355l = new Object();

    public C142024b() {
        this.f2705f.mo3343a(new C142023a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116977v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo116977v() {
        if (this.f385354k == null) {
            synchronized (this.f385355l) {
                if (this.f385354k == null) {
                    this.f385354k = mo116976w();
                }
            }
        }
        return this.f385354k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo116976w() {
        throw null;
    }
}
