package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7748f;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.f.b */
/* compiled from: PG */
public final class C99131b extends C68247h {

    /* renamed from: a */
    private final C68283d f277259a;

    /* renamed from: c */
    private final C68283d f277260c;

    public C99131b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C99131b.class), aVar);
        this.f277259a = C68236af.m98549d(dVar);
        this.f277260c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        if (axVar.mo56113h()) {
            C86246cb cbVar = (C86246cb) axVar.mo56107c();
            if (C57940c.m88582i(cVar) && ((C58833ax) C57940c.m88577d(cVar)).mo56113h()) {
                cbVar.mo79912ac((ActionData) ((C58833ax) C57940c.m88577d(cVar)).mo56107c());
                cbVar.mo79914ae();
            } else if (C57940c.m88582i(cVar)) {
                cbVar.mo79921al(ActionData.f235991b);
            } else {
                C59104x c = C99130a.f277258a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "EmbeddedPushToTalkDone");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) C57940c.m88575b(cVar).mo56107c())).mo56372aa(31542)).mo56386p("Failure during producing ActionData");
            }
        }
        return C60856cj.m92900i(C118826c.f331422a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f277259a.mo60297gq()), this.f277260c.mo60297gq());
    }
}
