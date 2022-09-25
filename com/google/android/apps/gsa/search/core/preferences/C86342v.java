package com.google.android.apps.gsa.search.core.preferences;

import java.io.File;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.v */
/* compiled from: PG */
public final class C86342v {

    /* renamed from: a */
    private final Executor f233439a;

    /* renamed from: b */
    private final C69464a f233440b;

    public C86342v(Executor executor, C69464a aVar) {
        this.f233439a = executor;
        this.f233440b = aVar;
    }

    /* renamed from: a */
    public final C86346z mo80095a(File file) {
        C86346z zVar = new C86346z(this.f233439a, (Executor) this.f233440b.mo17428b(), file);
        zVar.f233449d.execute(new C86343w(zVar));
        return zVar;
    }
}
