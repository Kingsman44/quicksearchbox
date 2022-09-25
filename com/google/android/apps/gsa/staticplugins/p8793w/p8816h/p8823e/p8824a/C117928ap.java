package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.ap */
/* compiled from: PG */
public final class C117928ap extends C68247h {

    /* renamed from: a */
    private final C68283d f327318a;

    /* renamed from: c */
    private final C68283d f327319c;

    /* renamed from: d */
    private final C68283d f327320d;

    /* renamed from: e */
    private final C68283d f327321e;

    /* renamed from: f */
    private final C68283d f327322f;

    public C117928ap(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C117928ap.class), aVar);
        this.f327318a = C68236af.m98549d(dVar);
        this.f327319c = C68236af.m98549d(dVar2);
        this.f327320d = C68236af.m98549d(dVar3);
        this.f327321e = C68236af.m98549d(dVar4);
        this.f327322f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        C84370p pVar = (C84370p) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C68283d dVar = this.f327321e;
        C89859i iVar = (C89859i) list.get(3);
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            return dVar.mo60297gq();
        }
        iVar.mo83702b(C89849ae.ASSISTANT_AUTO_CLIENTOP_RENDER_STARTED);
        pVar.mo77922d(C60856cj.m92900i(axVar), C60856cj.m92900i(C58836b.f156633a), C58833ax.m90834k(new C84349ah(query.mo84238A())), C60856cj.m92900i(C58836b.f156633a), C60856cj.m92900i(C58836b.f156633a));
        return C118826c.f331423b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327318a.mo60297gq(), this.f327319c.mo60297gq(), this.f327320d.mo60297gq(), this.f327322f.mo60297gq());
    }
}
