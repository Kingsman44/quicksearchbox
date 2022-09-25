package com.google.android.apps.gsa.nga.engine.p6038j;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.p9372b.p9373a.C124384d;
import com.google.android.libraries.search.p2476a.C32239m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.engine.j.i */
/* compiled from: PG */
public final class C76194i {

    /* renamed from: a */
    public static final C59071e f211198a = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.j.i");

    /* renamed from: b */
    public final Executor f211199b;

    /* renamed from: c */
    public final Context f211200c;

    /* renamed from: d */
    private final C32239m f211201d;

    /* renamed from: com.google.android.apps.gsa.nga.engine.j.i$a */
    /* compiled from: PG */
    public interface C76195a {
        /* renamed from: aw */
        C124384d mo72122aw();
    }

    public C76194i(Executor executor, Context context, C32239m mVar) {
        this.f211199b = new C60904dr(executor);
        this.f211200c = context;
        this.f211201d = mVar;
    }

    /* renamed from: a */
    public final C60870cx mo72121a(C76188c cVar) {
        C32239m mVar = this.f211201d;
        Objects.requireNonNull(mVar);
        C76162a aVar = new C76162a(mVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(aVar), this.f211199b);
        C76187b bVar = new C76187b(this, cVar);
        return C60922j.m93044g(n, C47810es.m84963c(bVar), this.f211199b);
    }
}
