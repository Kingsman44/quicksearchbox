package com.google.android.apps.search.assistant.verticals.contextdebug;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.verticals.contextdebug.z */
/* compiled from: PG */
class C132056z extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f360439j = false;

    /* renamed from: k */
    private volatile C68314a f360440k;

    /* renamed from: l */
    private final Object f360441l = new Object();

    public C132056z() {
        this.f2705f.mo3343a(new C132055y(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo110395w().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public C68314a mo110383v() {
        throw null;
    }

    /* renamed from: w */
    public final C68314a mo110395w() {
        if (this.f360440k == null) {
            synchronized (this.f360441l) {
                if (this.f360440k == null) {
                    this.f360440k = mo110383v();
                }
            }
        }
        return this.f360440k;
    }
}
