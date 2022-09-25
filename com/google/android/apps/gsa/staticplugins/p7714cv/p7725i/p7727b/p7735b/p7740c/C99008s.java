package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85721i;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85722j;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a.C98909aa;
import com.google.common.base.C58833ax;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.s */
/* compiled from: PG */
public final class C99008s extends C68247h {

    /* renamed from: a */
    private final C68283d f276800a;

    /* renamed from: c */
    private final C68283d f276801c;

    /* renamed from: d */
    private final C68283d f276802d;

    /* renamed from: e */
    private final C68283d f276803e;

    public C99008s(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C99008s.class), aVar);
        this.f276800a = C68236af.m98549d(dVar);
        this.f276801c = C68236af.m98549d(dVar2);
        this.f276802d = C68236af.m98549d(dVar3);
        this.f276803e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        C86246cb cbVar = (C86246cb) list.get(2);
        C98909aa aaVar = (C98909aa) list.get(3);
        C58976aa aaVar2 = C58975e.f156826a;
        if (axVar.mo56113h()) {
            if (cbVar instanceof C86261p) {
                ((C86261p) cbVar).f233170c.mo79832b(Boolean.TRUE);
            }
            C85722j.m137726a((C85721i) axVar.mo56107c(), cbVar);
            aaVar.mo91329g(2, query, cbVar);
        } else {
            aaVar.mo91326d(2, true, new C90523o(0), (C86232bo) null);
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276800a.mo60297gq(), this.f276801c.mo60297gq(), this.f276802d.mo60297gq(), this.f276803e.mo60297gq());
    }
}
