package com.google.android.apps.gsa.staticplugins.p8025l.p8026a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86227bj;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.l.a.d */
/* compiled from: PG */
public final class C102610d extends C68247h {

    /* renamed from: a */
    private final C68283d f286375a;

    /* renamed from: c */
    private final C68283d f286376c;

    /* renamed from: d */
    private final C68283d f286377d;

    /* renamed from: e */
    private final C68283d f286378e;

    /* renamed from: f */
    private final C68283d f286379f;

    public C102610d(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C102610d.class), aVar);
        this.f286375a = C68236af.m98549d(dVar);
        this.f286376c = C68236af.m98549d(dVar2);
        this.f286377d = C68236af.m98549d(dVar3);
        this.f286378e = C68236af.m98549d(dVar4);
        this.f286379f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C86227bj bjVar = (C86227bj) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C89859i iVar = (C89859i) list.get(3);
        C89856f fVar = (C89856f) list.get(4);
        if (!((C86124t) list.get(0)).mo79746e(C90014bt.f247372fs)) {
            obj2 = C58836b.f156633a;
        } else if (axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            iVar.mo83702b(C89849ae.OPA_FLUID_ACTION_FLOW_SUCCESS);
            bjVar.mo79850C((C51195j) axVar.mo56107c());
            fVar.f246201a = C89849ae.ASSISTANT_RESULT_DOWNLOADED;
            iVar.mo74236a(fVar.mo83699a());
            obj2 = C58833ax.m90834k(bjVar.f233010k);
        } else {
            iVar.mo83702b(C89849ae.OPA_FLUID_ACTION_FLOW_CANCEL);
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f286375a.mo60297gq(), this.f286376c.mo60297gq(), this.f286377d.mo60297gq(), this.f286378e.mo60297gq(), this.f286379f.mo60297gq());
    }
}
