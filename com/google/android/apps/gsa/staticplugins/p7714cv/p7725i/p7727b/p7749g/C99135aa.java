package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7749g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.g.aa */
/* compiled from: PG */
public final class C99135aa extends C68247h {

    /* renamed from: a */
    private final C68283d f277266a;

    /* renamed from: c */
    private final C68283d f277267c;

    /* renamed from: d */
    private final C68283d f277268d;

    public C99135aa(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C99135aa.class), aVar);
        this.f277266a = C68236af.m98549d(dVar);
        this.f277267c = C68236af.m98549d(dVar2);
        this.f277268d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        C86124t tVar = (C86124t) list.get(1);
        Query query = (Query) list.get(2);
        if (!((C89060p) list.get(0)).equals(C89060p.f241366d) && query.mo84422dC() && tVar.mo79746e(C90014bt.f247753nB)) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277266a.mo60297gq(), this.f277267c.mo60297gq(), this.f277268d.mo60297gq());
    }
}
