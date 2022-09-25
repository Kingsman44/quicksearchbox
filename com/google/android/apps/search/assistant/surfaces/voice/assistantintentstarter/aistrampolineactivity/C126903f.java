package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.aistrampolineactivity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.aistrampolineactivity.f */
/* compiled from: PG */
class C126903f extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f349412j = false;

    /* renamed from: k */
    private volatile C68314a f349413k;

    /* renamed from: l */
    private final Object f349414l = new Object();

    public C126903f() {
        this.f2705f.mo3343a(new C126902e(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107851w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo107848v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo107851w() {
        if (this.f349413k == null) {
            synchronized (this.f349414l) {
                if (this.f349413k == null) {
                    this.f349413k = mo107848v();
                }
            }
        }
        return this.f349413k;
    }
}
