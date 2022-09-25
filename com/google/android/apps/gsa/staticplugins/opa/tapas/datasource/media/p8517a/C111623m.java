package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.p8517a;

import android.support.p031v4.media.C0268e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.media.a.m */
/* compiled from: PG */
final class C111623m extends C0268e {

    /* renamed from: c */
    public SettableFuture f310378c = new SettableFuture();

    /* renamed from: a */
    public final void mo839a() {
        C58976aa aaVar = C58975e.f156826a;
        this.f310378c.mo57356n((Object) null);
    }

    /* renamed from: b */
    public final void mo840b() {
        C58976aa aaVar = C58975e.f156826a;
        this.f310378c.cancel(true);
    }

    /* renamed from: c */
    public final void mo841c() {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f310378c.isDone()) {
            this.f310378c.cancel(true);
        }
        this.f310378c = new SettableFuture();
    }
}
