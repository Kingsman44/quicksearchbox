package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.support.p031v4.app.C0167am;
import androidx.lifecycle.C2363bk;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.k */
/* compiled from: PG */
class C123974k extends C0167am implements C68288b {

    /* renamed from: j */
    public boolean f342444j = false;

    /* renamed from: k */
    private volatile C68314a f342445k;

    /* renamed from: l */
    private final Object f342446l = new Object();

    public C123974k() {
        this.f2705f.mo3343a(new C123973j(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C68314a mo106221j() {
        if (this.f342445k == null) {
            synchronized (this.f342446l) {
                if (this.f342445k == null) {
                    this.f342445k = mo106167k();
                }
            }
        }
        return this.f342445k;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo106221j().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C68314a mo106167k() {
        throw null;
    }
}
