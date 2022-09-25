package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7752j;

import com.google.android.apps.gsa.opa.C83583an;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b.C118962c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.core.p6816p.C86261p;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.j.m */
/* compiled from: PG */
public final class C99209m extends C68247h {

    /* renamed from: a */
    private final C68283d f277550a;

    /* renamed from: c */
    private final C68283d f277551c;

    /* renamed from: d */
    private final C68283d f277552d;

    /* renamed from: e */
    private final C68283d f277553e;

    /* renamed from: f */
    private final C68283d f277554f;

    /* renamed from: g */
    private final C68283d f277555g;

    public C99209m(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6) {
        super(aVar2, new C68277d(C99209m.class), aVar);
        this.f277550a = C68236af.m98549d(dVar);
        this.f277551c = C68236af.m98549d(dVar2);
        this.f277552d = C68236af.m98549d(dVar3);
        this.f277553e = C68236af.m98549d(dVar4);
        this.f277554f = C68236af.m98549d(dVar5);
        this.f277555g = C68236af.m98549d(dVar6);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        boolean z = false;
        C68282c cVar = (C68282c) list.get(0);
        C68282c cVar2 = (C68282c) list.get(1);
        C58833ax axVar = (C58833ax) list.get(2);
        C89061q qVar = (C89061q) list.get(3);
        C86124t tVar = (C86124t) list.get(4);
        C89062r rVar = (C89062r) list.get(5);
        C58976aa aaVar = C58975e.f156826a;
        if (axVar.mo56113h()) {
            C86246cb cbVar = (C86246cb) axVar.mo56107c();
            if (C83583an.m133150e(tVar, rVar)) {
                if (cbVar instanceof C86261p) {
                    ((C86261p) cbVar).mo79958g(C51195j.f133264n);
                }
                cbVar.mo79912ac(ActionData.f235991b);
                cbVar.mo79914ae();
            } else {
                boolean z2 = C57940c.m88582i(cVar) && ((C58833ax) C57940c.m88577d(cVar)).mo56113h();
                if (C57940c.m88582i(cVar2) && ((C58833ax) C57940c.m88577d(cVar2)).mo56113h()) {
                    z = true;
                }
                if (z2) {
                    cbVar.mo79912ac((ActionData) ((C58833ax) C57940c.m88577d(cVar)).mo56107c());
                }
                if (z && (cbVar instanceof C86261p)) {
                    ((C86261p) cbVar).mo79958g((C51195j) ((C58833ax) C57940c.m88577d(cVar2)).mo56107c());
                    cbVar.mo79912ac(ActionData.f235991b);
                }
                if (z2 || z) {
                    cbVar.mo79914ae();
                } else {
                    cbVar.mo79840k(C118962c.m197481a(C58833ax.m90834k(qVar)));
                }
            }
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f277550a.mo60297gq()), C68236af.m98546a(this.f277551c.mo60297gq()), this.f277552d.mo60297gq(), this.f277553e.mo60297gq(), this.f277554f.mo60297gq(), this.f277555g.mo60297gq());
    }
}
