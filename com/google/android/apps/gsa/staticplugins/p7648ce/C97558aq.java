package com.google.android.apps.gsa.staticplugins.p7648ce;

import android.view.View;
import com.google.android.apps.gsa.p6484r.C84251f;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.aq */
/* compiled from: PG */
public final class C97558aq {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f272493a;

    /* renamed from: b */
    final /* synthetic */ C97565ax f272494b;

    public C97558aq(C97565ax axVar, SettableFuture settableFuture) {
        this.f272494b = axVar;
        this.f272493a = settableFuture;
    }

    /* renamed from: a */
    public final void mo90744a() {
        View g = this.f272494b.mo90750g(7);
        if (g != null) {
            C84251f.f229273b.remove(this);
            this.f272494b.f272541b.mo85150o(new C97557ap(this, g), 7000);
        }
    }
}
