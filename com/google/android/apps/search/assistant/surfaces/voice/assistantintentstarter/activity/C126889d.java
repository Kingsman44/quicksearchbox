package com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.assistantintentstarter.activity.d */
/* compiled from: PG */
class C126889d extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f349392j = false;

    /* renamed from: k */
    private volatile C68314a f349393k;

    /* renamed from: l */
    private final Object f349394l = new Object();

    public C126889d() {
        this.f2705f.mo3343a(new C126888c(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo107842v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo107842v() {
        if (this.f349393k == null) {
            synchronized (this.f349394l) {
                if (this.f349393k == null) {
                    this.f349393k = mo107840w();
                }
            }
        }
        return this.f349393k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo107840w() {
        throw null;
    }
}
