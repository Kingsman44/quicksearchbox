package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.C97016d;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97043f;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.d.h */
/* compiled from: PG */
public final class C97093h {

    /* renamed from: a */
    public final C97043f f271289a;

    /* renamed from: b */
    public String f271290b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f271291c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C97016d f271292d = C97016d.f271129d;

    /* renamed from: e */
    public C97094i f271293e;

    /* renamed from: f */
    public int f271294f = 1;

    /* renamed from: g */
    public int f271295g = 1;

    public C97093h(C97043f fVar) {
        this.f271289a = fVar;
    }

    /* renamed from: b */
    public final void mo90459b(int i) {
        if (this.f271294f != i) {
            this.f271294f = i;
            C97043f fVar = this.f271289a;
            C97094i iVar = this.f271293e;
            Objects.requireNonNull(iVar);
            fVar.mo90405a("onExpansionStateChangeCallback", new C97089d(iVar));
        }
    }

    /* renamed from: a */
    public final void mo90458a(int i) {
        int i2 = this.f271295g;
        if (i2 == 0) {
            throw null;
        } else if (i2 != i) {
            this.f271295g = i;
            C97043f fVar = this.f271289a;
            C97094i iVar = this.f271293e;
            Objects.requireNonNull(iVar);
            fVar.mo90405a("onDataFreshnessChangeCallback", new C97090e(iVar));
        }
    }
}
