package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.ar.cu;
import com.google.android.libraries.mdi.C29690f;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.q */
/* compiled from: PG */
public final /* synthetic */ class C79611q implements Function {

    /* renamed from: a */
    public final /* synthetic */ C29690f f218411a;

    public /* synthetic */ C79611q(C29690f fVar) {
        this.f218411a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C29690f fVar = this.f218411a;
        C79614t tVar = (C79614t) obj;
        int i = C79615u.f218413b;
        Optional c = cu.c(fVar, tVar.mo74143a().f218407c);
        if (c.isEmpty()) {
            return tVar;
        }
        c.get();
        C79613s b = tVar.mo74144b();
        b.mo74142b((Uri) c.get());
        return b.mo74141a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
