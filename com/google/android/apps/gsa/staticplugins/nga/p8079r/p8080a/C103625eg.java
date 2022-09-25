package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89978aq;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.eg */
/* compiled from: PG */
public final class C103625eg extends C68247h {

    /* renamed from: a */
    private final C68283d f288663a;

    /* renamed from: c */
    private final C69464a f288664c;

    /* renamed from: d */
    private final C68283d f288665d;

    /* renamed from: e */
    private final C68283d f288666e;

    public C103625eg(C69464a aVar, C69464a aVar2, C68283d dVar, C69464a aVar3, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C103625eg.class), aVar);
        this.f288663a = C68236af.m98549d(dVar);
        this.f288664c = aVar3;
        this.f288665d = C68236af.m98549d(dVar2);
        this.f288666e = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C57981b bVar = (C57981b) list.get(0);
        C68214a a = C68219e.m98518a(this.f288664c);
        C22871g gVar = (C22871g) list.get(1);
        if (((C86124t) list.get(2)).mo79746e(C89978aq.f246614m)) {
            return bVar.mo20440jJ(new C103623ee(a, gVar));
        }
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288663a.mo60297gq(), this.f288665d.mo60297gq(), this.f288666e.mo60297gq());
    }
}
