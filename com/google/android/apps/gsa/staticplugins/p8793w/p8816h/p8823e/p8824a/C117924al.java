package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.assistant.auto.ondevice.p713e.C11897m;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.al */
/* compiled from: PG */
public final class C117924al extends C68247h {

    /* renamed from: a */
    private final C68283d f327307a;

    /* renamed from: c */
    private final C68283d f327308c;

    /* renamed from: d */
    private final C68283d f327309d;

    /* renamed from: e */
    private final C68283d f327310e;

    public C117924al(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C117924al.class), aVar);
        this.f327307a = C68236af.m98549d(dVar);
        this.f327308c = C68236af.m98549d(dVar2);
        this.f327309d = C68236af.m98549d(dVar3);
        this.f327310e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        Query query = (Query) list.get(1);
        C68282c cVar = (C68282c) list.get(2);
        C68283d dVar = this.f327310e;
        if (C57940c.m88580g(cVar)) {
            C58833ax b = C57940c.m88575b(cVar);
            if (b.mo56113h()) {
                C59104x c = C117923ak.f327306a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CarAssistTextSearchComp");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) b.mo56107c())).mo56372aa(18936)).mo56386p("offline conversation delta path exception.");
            }
            C58976aa aaVar = C58975e.f156826a;
            return dVar.mo60297gq();
        }
        C58833ax axVar2 = (C58833ax) C57940c.m88577d(cVar);
        if (!axVar2.mo56113h()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return dVar.mo60297gq();
        }
        C58976aa aaVar3 = C58975e.f156826a;
        if (axVar.mo56113h()) {
            ((C11897m) axVar.mo56107c()).mo20282c(query, (C52081en) axVar2.mo56107c());
        }
        return C60856cj.m92900i(axVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327307a.mo60297gq(), this.f327308c.mo60297gq(), C68236af.m98546a(this.f327309d.mo60297gq()));
    }
}
