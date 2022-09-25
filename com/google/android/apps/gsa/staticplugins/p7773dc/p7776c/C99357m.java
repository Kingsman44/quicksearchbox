package com.google.android.apps.gsa.staticplugins.p7773dc.p7776c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6820r.C86385ag;
import com.google.android.apps.gsa.search.core.p6820r.C86570p;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.p7773dc.p7777d.C99361c;
import com.google.common.base.C58819aj;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dc.c.m */
/* compiled from: PG */
public final class C99357m extends C68247h {

    /* renamed from: a */
    private final C68283d f277993a;

    /* renamed from: c */
    private final C68283d f277994c;

    /* renamed from: d */
    private final C68283d f277995d;

    /* renamed from: e */
    private final C68283d f277996e;

    public C99357m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C99357m.class), aVar);
        this.f277993a = C68236af.m98549d(dVar);
        this.f277994c = C68236af.m98549d(dVar2);
        this.f277995d = C68236af.m98549d(dVar3);
        this.f277996e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C118826c cVar = (C118826c) list.get(2);
        C99361c cVar2 = (C99361c) list.get(3);
        if (!axVar.mo56113h()) {
            return C86570p.f233891a;
        }
        C60870cx g = C60922j.m93044g(((C86385ag) axVar.mo56107c()).mo80162a(), new C58819aj(C58833ax.m90834k(new C99345a())), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277993a.mo60297gq(), this.f277994c.mo60297gq(), this.f277995d.mo60297gq(), this.f277996e.mo60297gq());
    }
}
