package com.google.android.libraries.lens.view.p2078at;

import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.view.at.p */
/* compiled from: PG */
public abstract class C25533p {
    /* renamed from: a */
    public abstract C24226r mo30569a();

    /* renamed from: b */
    public abstract C58833ax mo30570b();

    @Deprecated
    /* renamed from: c */
    public abstract C58833ax mo30571c();

    /* renamed from: d */
    public abstract C60870cx mo30572d();

    @Deprecated
    /* renamed from: e */
    public abstract boolean mo30573e();

    /* renamed from: f */
    public final C58833ax mo30587f() {
        C60870cx d = mo30572d();
        if (d.isDone()) {
            try {
                return C58833ax.m90834k((C25531n) C60856cj.m92909r(d));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: g */
    public final void mo30588g(C25532o oVar) {
        C60870cx d = mo30572d();
        C25530m mVar = new C25530m(oVar);
        C60856cj.m92911t(d, C47810es.m84974n(mVar), C60826bg.f164896a);
    }
}
