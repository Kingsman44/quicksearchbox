package com.google.android.libraries.assistant.auto.tng.morris.onboarding;

import androidx.lifecycle.C2363bk;
import com.google.android.libraries.p1623at.p1626c.p1629c.C19523c;
import dagger.hilt.android.internal.managers.C68314a;
import dagger.hilt.android.internal.p5302a.C68300a;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.onboarding.y */
/* compiled from: PG */
class C15453y extends C19523c implements C68288b {

    /* renamed from: j */
    public boolean f46343j = false;

    /* renamed from: l */
    private volatile C68314a f46344l;

    /* renamed from: m */
    private final Object f46345m = new Object();

    public C15453y() {
        this.f2705f.mo3343a(new C15452x(this));
    }

    public final C2363bk getDefaultViewModelProviderFactory() {
        return C68300a.m98637a(this, super.getDefaultViewModelProviderFactory());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C68314a mo22285j() {
        throw null;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo22340k().mo17653jN();
    }

    /* renamed from: k */
    public final C68314a mo22340k() {
        if (this.f46344l == null) {
            synchronized (this.f46345m) {
                if (this.f46344l == null) {
                    this.f46344l = mo22285j();
                }
            }
        }
        return this.f46344l;
    }
}
