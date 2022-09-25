package com.google.android.apps.search.transcription.p10679ui;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1627a.C19473a;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.transcription.ui.b */
/* compiled from: PG */
class C141935b extends C19473a implements C68288b {

    /* renamed from: j */
    public boolean f385144j = false;

    /* renamed from: k */
    private volatile C68314a f385145k;

    /* renamed from: l */
    private final Object f385146l = new Object();

    public C141935b() {
        this.f2705f.mo3343a(new C141934a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo116904v().mo17653jN();
    }

    /* renamed from: v */
    public final C68314a mo116904v() {
        if (this.f385145k == null) {
            synchronized (this.f385146l) {
                if (this.f385145k == null) {
                    this.f385145k = mo116903w();
                }
            }
        }
        return this.f385145k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C68314a mo116903w() {
        throw null;
    }
}
