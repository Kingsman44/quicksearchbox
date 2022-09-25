package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.google.common.base.C58887cx;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.v */
/* compiled from: PG */
final class C40057v implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60870cx f105242a;

    /* renamed from: b */
    final /* synthetic */ C40058w f105243b;

    public C40057v(C40058w wVar, C60870cx cxVar) {
        this.f105243b = wVar;
        this.f105242a = cxVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        synchronized (this.f105243b.f105253j) {
            this.f105243b.f105253j.remove(this.f105242a);
        }
        if (!(th instanceof CancellationException)) {
            C58887cx.m90980g(th);
            throw new AssertionError(th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f105243b.f105253j) {
            this.f105243b.f105253j.remove(this.f105242a);
        }
    }
}
