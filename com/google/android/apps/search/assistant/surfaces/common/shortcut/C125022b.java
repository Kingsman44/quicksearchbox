package com.google.android.apps.search.assistant.surfaces.common.shortcut;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19523c;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.apps.search.assistant.surfaces.common.shortcut.b */
/* compiled from: PG */
class C125022b extends C19523c implements C68288b {

    /* renamed from: j */
    public boolean f344947j = false;

    /* renamed from: l */
    private volatile C68314a f344948l;

    /* renamed from: m */
    private final Object f344949m = new Object();

    public C125022b() {
        this.f2705f.mo3343a(new C125021a(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* renamed from: j */
    public final C68314a mo22285j() {
        if (this.f344948l == null) {
            synchronized (this.f344949m) {
                if (this.f344948l == null) {
                    this.f344948l = mo22340k();
                }
            }
        }
        return this.f344948l;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22285j().mo17653jN();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C68314a mo22340k() {
        throw null;
    }
}
