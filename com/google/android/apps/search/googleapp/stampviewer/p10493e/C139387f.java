package com.google.android.apps.search.googleapp.stampviewer.p10493e;

import com.google.android.apps.search.googleapp.stampviewer.p10497i.C139423b;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.libraries.search.logging.p3034a.C38763l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.e.f */
/* compiled from: PG */
public final class C139387f {

    /* renamed from: a */
    public static final C59071e f379020a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.e.f");

    /* renamed from: b */
    public final Executor f379021b;

    /* renamed from: c */
    public final C38763l f379022c;

    /* renamed from: d */
    public C143673z f379023d;

    /* renamed from: e */
    private final C60836bq f379024e = new C60836bq();

    /* renamed from: f */
    private final boolean f379025f;

    public C139387f(Executor executor, boolean z, C38763l lVar) {
        this.f379021b = executor;
        this.f379025f = z;
        this.f379022c = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo114941a() {
        return this.f379024e.mo57305b(C47810es.m84965e(new C139383b(this)), this.f379021b);
    }

    /* renamed from: b */
    public final void mo114942b(C139423b bVar, Exception exc) {
        ((C59052c) ((C59052c) ((C59052c) f379020a.mo56225c()).mo56382g(exc)).mo56372aa(41376)).mo56389s("Cannot open shared STAMP: %s", bVar.name());
        C60870cx a = mo114941a();
        C139386e eVar = new C139386e("STAMP_VIEWER_INVALID_SHARE_LINK", bVar);
        C60856cj.m92911t(a, C47810es.m84974n(eVar), this.f379021b);
    }

    /* renamed from: c */
    public final void mo114943c(boolean z) {
        if (this.f379025f) {
            C60870cx a = mo114941a();
            C139385d dVar = new C139385d(z);
            C60856cj.m92911t(a, C47810es.m84974n(dVar), this.f379021b);
        }
    }
}
