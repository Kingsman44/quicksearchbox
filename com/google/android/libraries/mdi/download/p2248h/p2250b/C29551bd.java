package com.google.android.libraries.mdi.download.p2248h.p2250b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.mdi.download.h.b.bd */
/* compiled from: PG */
public final class C29551bd {

    /* renamed from: a */
    public final C58833ax f80089a;

    /* renamed from: b */
    private final C58495hd f80090b;

    /* renamed from: c */
    private final Executor f80091c;

    public C29551bd(C29550bc bcVar) {
        this.f80090b = bcVar.f80086a.mo55427f(true);
        this.f80091c = bcVar.f80087b;
        this.f80089a = bcVar.f80088c;
    }

    /* renamed from: a */
    public final C60870cx mo34767a(C58833ax axVar, Iterable iterable) {
        C58495hd hdVar = this.f80090b;
        Objects.requireNonNull(hdVar);
        C65753ak akVar = (C65753ak) C58557jl.m90122c(iterable, new C29548ba(hdVar)).mo56109e(C65753ak.UNKNOWN);
        if (!this.f80090b.containsKey(akVar)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C60870cx a = ((C29555bh) this.f80090b.get(akVar)).mo34768a(axVar);
        C29549bb bbVar = new C29549bb(this);
        return C60922j.m93044g(a, C47810es.m84963c(bbVar), this.f80091c);
    }
}
