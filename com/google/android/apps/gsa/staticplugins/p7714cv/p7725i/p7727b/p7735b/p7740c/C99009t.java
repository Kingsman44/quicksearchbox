package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.t */
/* compiled from: PG */
public final class C99009t extends C68247h {

    /* renamed from: a */
    private final C68283d f276804a;

    /* renamed from: c */
    private final C68283d f276805c;

    /* renamed from: d */
    private final C68283d f276806d;

    /* renamed from: e */
    private final C68283d f276807e;

    /* renamed from: f */
    private final C68283d f276808f;

    public C99009t(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C99009t.class), aVar);
        this.f276804a = C68236af.m98549d(dVar);
        this.f276805c = C68236af.m98549d(dVar2);
        this.f276806d = C68236af.m98549d(dVar3);
        this.f276807e = C68236af.m98549d(dVar4);
        this.f276808f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
        Query query = (Query) list.get(1);
        b bVar = (b) list.get(2);
        C85596b bVar2 = (C85596b) list.get(3);
        C86124t tVar = (C86124t) list.get(4);
        if (booleanValue || tVar.mo79746e(C90086ek.f250429cv)) {
            return bVar2.mo20304d(bVar, query);
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276804a.mo60297gq(), this.f276805c.mo60297gq(), this.f276806d.mo60297gq(), this.f276807e.mo60297gq(), this.f276808f.mo60297gq());
    }
}
