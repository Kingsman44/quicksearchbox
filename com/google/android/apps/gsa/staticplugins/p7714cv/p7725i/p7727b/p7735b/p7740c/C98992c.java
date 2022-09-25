package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7740c;

import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.c.c */
/* compiled from: PG */
public final class C98992c extends C68247h {

    /* renamed from: a */
    private final C68283d f276771a;

    public C98992c(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C98992c.class), aVar);
        this.f276771a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        int i;
        C58976aa aaVar = C58975e.f156826a;
        if (((C89062r) obj).mo83040a()) {
            C59104x b = C98967a.f276657a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "CarHybridOnToOffStrat");
            ((C59052c) ((C59052c) b).mo56372aa(31357)).mo56386p("ConnectivityInfo strategyDecision online fallback to offline");
            i = 1;
        } else {
            C59104x b2 = C98967a.f276657a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "CarHybridOnToOffStrat");
            ((C59052c) ((C59052c) b2).mo56372aa(31356)).mo56386p("ConnectivityInfo strategyDecision offline only");
            i = 0;
        }
        return C60856cj.m92900i(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f276771a.mo60297gq();
    }
}
