package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ik */
/* compiled from: PG */
final class C116789ik implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Query f324005a;

    /* renamed from: b */
    final /* synthetic */ long f324006b;

    /* renamed from: c */
    final /* synthetic */ C116790il f324007c;

    public C116789ik(C116790il ilVar, Query query, long j) {
        this.f324007c = ilVar;
        this.f324005a = query;
        this.f324006b = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C58887cx.m90979f(th, Error.class);
        this.f324007c.mo102946i(this.f324005a, this.f324006b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            this.f324007c.mo102946i(this.f324005a, this.f324006b);
        }
    }
}
