package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.j */
/* compiled from: PG */
public final class C118034j extends C68247h {

    /* renamed from: a */
    private final C68283d f327586a;

    /* renamed from: c */
    private final C68283d f327587c;

    /* renamed from: d */
    private final C68283d f327588d;

    /* renamed from: e */
    private final C68283d f327589e;

    public C118034j(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C118034j.class), aVar);
        this.f327586a = C68236af.m98549d(dVar);
        this.f327587c = C68236af.m98549d(dVar2);
        this.f327588d = C68236af.m98549d(dVar3);
        this.f327589e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C68282c cVar2 = (C68282c) list.get(1);
        C118826c cVar3 = (C118826c) list.get(2);
        C118826c cVar4 = (C118826c) list.get(3);
        C58976aa aaVar = C58975e.f156826a;
        C87421i a = C87421i.m141588a(2);
        try {
            a = (C87421i) cVar.mo60292a();
        } catch (ExecutionException e) {
            C59104x c = C118033i.f327582a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ActionV2Renderer");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(18804)).mo56386p("Got exception producing an ExecutionResult");
        }
        if (!a.mo81197b()) {
            a = C87421i.m141588a(2);
            try {
                a = (C87421i) cVar2.mo60292a();
            } catch (ExecutionException e2) {
                C59104x c2 = C118033i.f327582a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ActionV2Renderer");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(18803)).mo56386p("Got exception processing card decision");
            }
        }
        return C60856cj.m92900i(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f327586a.mo60297gq()), C68236af.m98546a(this.f327587c.mo60297gq()), this.f327588d.mo60297gq(), this.f327589e.mo60297gq());
    }
}
