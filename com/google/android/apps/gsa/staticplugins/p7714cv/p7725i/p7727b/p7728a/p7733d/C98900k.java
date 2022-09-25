package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7728a.p7733d;

import com.google.android.apps.gsa.g.f.b;
import com.google.android.apps.gsa.search.core.p6519al.p6757s.C85596b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.a.d.k */
/* compiled from: PG */
public final class C98900k extends C68247h {

    /* renamed from: a */
    private final C68283d f276394a;

    /* renamed from: c */
    private final C68283d f276395c;

    /* renamed from: d */
    private final C68283d f276396d;

    public C98900k(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3) {
        super(aVar2, new C68277d(C98900k.class), aVar);
        this.f276394a = C68236af.m98549d(dVar);
        this.f276395c = C68236af.m98549d(dVar2);
        this.f276396d = C68236af.m98549d(dVar3);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C58833ax axVar2 = (C58833ax) list.get(1);
        C85596b bVar = (C85596b) list.get(2);
        if (axVar.mo56113h() && axVar2.mo56113h()) {
            return bVar.mo20304d((b) axVar.mo56107c(), (Query) axVar2.mo56107c());
        }
        C58976aa aaVar = C58975e.f156826a;
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276394a.mo60297gq(), this.f276395c.mo60297gq(), this.f276396d.mo60297gq());
    }
}
