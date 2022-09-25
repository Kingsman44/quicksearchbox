package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7749g;

import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.g.m */
/* compiled from: PG */
public final class C99157m extends C68247h {

    /* renamed from: a */
    private final C68283d f277341a;

    /* renamed from: c */
    private final C68283d f277342c;

    public C99157m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C99157m.class), aVar);
        this.f277341a = C68236af.m98549d(dVar);
        this.f277342c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C86246cb cbVar = (C86246cb) list.get(1);
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h() || !(cbVar instanceof C86261p)) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C86261p pVar = (C86261p) cbVar;
        pVar.mo79958g((C51195j) axVar.mo56107c());
        cbVar.mo79912ac(ActionData.f235991b);
        return C60856cj.m92900i(C58833ax.m90834k(pVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f277341a.mo60297gq(), this.f277342c.mo60297gq());
    }
}
