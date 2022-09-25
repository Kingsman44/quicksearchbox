package com.google.android.apps.gsa.staticplugins.opa.p8345bl;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bl.d */
/* compiled from: PG */
public final class C108098d {

    /* renamed from: a */
    public final Context f300682a;

    /* renamed from: b */
    public final C86124t f300683b;

    /* renamed from: c */
    private final Executor f300684c;

    /* renamed from: d */
    private final C86034c f300685d;

    public C108098d(Context context, C86124t tVar, C60887da daVar, C86034c cVar) {
        this.f300682a = context;
        this.f300683b = tVar;
        this.f300684c = daVar;
        this.f300685d = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo96434a() {
        C60870cx b = this.f300685d.mo79697b();
        C108095a aVar = new C108095a(this);
        C60870cx g = C60922j.m93044g(b, C47810es.m84963c(aVar), this.f300684c);
        C108096b bVar = new C108096b();
        return C60922j.m93045h(g, C47810es.m84966f(bVar), this.f300684c);
    }
}
