package com.google.android.apps.gsa.staticplugins.p8793w.p8795b.p8796a.p8798b;

import android.content.Context;
import com.google.android.apps.gsa.p8839t.p8840a.C118339a;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.search.assistant.platform.pcp.api.C123598n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.b.a.b.k */
/* compiled from: PG */
public final class C117747k implements C16269a {

    /* renamed from: a */
    public static final C58528ij f326826a = new C58759qy(10);

    /* renamed from: b */
    public final C118339a f326827b;

    /* renamed from: c */
    public final Context f326828c;

    /* renamed from: d */
    private final C86034c f326829d;

    /* renamed from: e */
    private final Executor f326830e;

    /* renamed from: com.google.android.apps.gsa.staticplugins.w.b.a.b.k$a */
    /* compiled from: PG */
    public interface C117748a {
        /* renamed from: ep */
        C16269a mo103448ep();
    }

    public C117747k(C118339a aVar, Context context, C86034c cVar, Executor executor) {
        this.f326827b = aVar;
        this.f326828c = context;
        this.f326829d = cVar;
        this.f326830e = executor;
    }

    /* renamed from: a */
    public final C60870cx mo22867a(C53306j jVar, List list, boolean z, C53270hr hrVar, Optional optional) {
        C60870cx cxVar;
        C53306j jVar2 = C53306j.UNKNOWNN;
        int ordinal = jVar.ordinal();
        if (ordinal != 11 && ordinal != 12) {
            return C47633f.m84733g(this.f326829d.mo79697b()).mo51515h(new C117744h(this), this.f326830e).mo51516i(new C117745i(jVar, list, z, hrVar, optional), this.f326830e);
        }
        Stream stream = Collection.EL.stream(list);
        C58528ij ijVar = f326826a;
        Objects.requireNonNull(ijVar);
        if (stream.anyMatch(new C117740d(ijVar))) {
            cxVar = C47633f.m84733g(this.f326829d.mo79697b()).mo51516i(new C117739c(this), this.f326830e).mo51515h(new C117741e(list), this.f326830e);
        } else {
            cxVar = C60856cj.m92900i(C58485gu.m89842j(list));
        }
        return C47633f.m84733g(C47633f.m84733g(cxVar).mo51515h(new C117742f(list), this.f326830e)).mo51516i(new C117746j(this, optional, jVar, z), this.f326830e);
    }

    /* renamed from: b */
    public final boolean mo22868b(C123598n nVar) {
        this.f326827b.mo90816f(nVar);
        return true;
    }
}
