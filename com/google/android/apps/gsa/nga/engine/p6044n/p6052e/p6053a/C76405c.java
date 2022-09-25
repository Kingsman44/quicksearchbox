package com.google.android.apps.gsa.nga.engine.p6044n.p6052e.p6053a;

import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76402a;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76438k;
import com.google.android.apps.gsa.nga.engine.p6044n.p6052e.C76440m;
import com.google.android.apps.gsa.nga.engine.p6056o.C77426t;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import dagger.C68214a;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.e.a.c */
/* compiled from: PG */
public final class C76405c implements C76402a {

    /* renamed from: a */
    private final C68214a f211546a;

    public C76405c(C68214a aVar) {
        this.f211546a = aVar;
    }

    /* renamed from: a */
    public final boolean mo72188a(C76590bg bgVar, C77426t tVar, C76438k kVar) {
        C76440m mVar;
        C76428z zVar = (C76428z) this.f211546a.mo27525b();
        if (kVar.f211605a == 103) {
            mVar = (C76440m) kVar.f211606b;
        } else {
            mVar = C76440m.f211607b;
        }
        return Collection.EL.stream(mVar.f211609a).allMatch(new C76404b(zVar, bgVar, tVar));
    }

    /* renamed from: b */
    public final boolean mo72189b(C76438k kVar) {
        C76440m mVar;
        C76428z zVar = (C76428z) this.f211546a.mo27525b();
        if (kVar.f211605a == 103) {
            mVar = (C76440m) kVar.f211606b;
        } else {
            mVar = C76440m.f211607b;
        }
        Stream stream = Collection.EL.stream(mVar.f211609a);
        Objects.requireNonNull(zVar);
        return stream.allMatch(new C76403a(zVar));
    }
}
