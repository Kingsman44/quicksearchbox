package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p7012bb.p7016d.C89380h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60324oh;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.b */
/* compiled from: PG */
public final class C98991b extends C68247h {

    /* renamed from: a */
    private final C68283d f276769a;

    /* renamed from: c */
    private final C68283d f276770c;

    public C98991b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C98991b.class), aVar);
        this.f276769a = C68236af.m98549d(dVar);
        this.f276770c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        int i = 0;
        C89380h hVar = (C89380h) list.get(0);
        C89060p pVar = (C89060p) list.get(1);
        if (pVar.f241367e == C60324oh.OFFLINE || pVar.f241367e == C60324oh.NETWORK_LEVEL_NOT_MET) {
            hVar.mo83316b(2, 5);
        } else {
            hVar.mo83316b(2, 6);
            i = 1;
        }
        C59104x b = C98967a.f276657a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "CarHybridOnToOffStrat");
        ((C59052c) ((C59052c) b).mo56372aa(31354)).mo56387q("ConnectivityCheckResult strategyDecision: %d", i);
        return C60856cj.m92900i(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f276769a.mo60297gq(), this.f276770c.mo60297gq());
    }
}
