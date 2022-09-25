package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103321ab;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.be */
/* compiled from: PG */
public final class C103500be extends C68247h {

    /* renamed from: a */
    private final C68283d f288406a;

    /* renamed from: c */
    private final C68283d f288407c;

    /* renamed from: d */
    private final C68283d f288408d;

    /* renamed from: e */
    private final C69464a f288409e;

    public C103500be(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C69464a aVar3) {
        super(aVar2, new C68277d(C103500be.class), aVar);
        this.f288406a = C68236af.m98549d(dVar);
        this.f288407c = C68236af.m98549d(dVar2);
        this.f288408d = C68236af.m98549d(dVar3);
        this.f288409e = aVar3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C22871g gVar = (C22871g) list.get(2);
        C103498bc bcVar = new C103498bc(gVar, this.f288409e);
        ((C103335ap) list.get(1)).f288119a.mo93770d(new C103321ab(C103589cy.m171571a((Query) list.get(0)), bcVar));
        return C60846c.m92879h(C90877ak.m148471e(bcVar.f288402a, 10, TimeUnit.SECONDS, gVar), TimeoutException.class, C103496ba.f288400a, C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288406a.mo60297gq(), this.f288407c.mo60297gq(), this.f288408d.mo60297gq());
    }
}
