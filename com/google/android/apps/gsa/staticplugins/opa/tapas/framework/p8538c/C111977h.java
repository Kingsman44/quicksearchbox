package com.google.android.apps.gsa.staticplugins.opa.tapas.framework.p8538c;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111885bw;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.c.h */
/* compiled from: PG */
public final class C111977h {

    /* renamed from: a */
    public final C86124t f311080a;

    /* renamed from: b */
    private final C22871g f311081b;

    /* renamed from: c */
    private final C68214a f311082c;

    public C111977h(C22871g gVar, C86124t tVar, C68214a aVar) {
        this.f311081b = gVar;
        this.f311080a = tVar;
        this.f311082c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo99328a(Map map, String str, int i) {
        return this.f311081b.mo28209i(C90877ak.m148468b(C58485gu.m89847o(this.f311081b.mo28204d("wait for waitMs", ((C111885bw) this.f311082c.mo27525b()).mo99273a(str, i), new C111974e(map)), this.f311081b.mo28209i(C60856cj.m92906o(map.values()), "wait for all done", new C111975f(map)))), "partitions responses after all done or timeout", new C111976g(this));
    }
}
