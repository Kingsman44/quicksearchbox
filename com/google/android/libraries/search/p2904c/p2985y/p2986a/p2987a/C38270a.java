package com.google.android.libraries.search.p2904c.p2985y.p2986a.p2987a;

import com.google.android.libraries.search.p2904c.C37459ch;
import com.google.android.libraries.search.p2904c.C37460ci;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.c.y.a.a.a */
/* compiled from: PG */
final class C38270a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58833ax f101384a;

    /* renamed from: b */
    final /* synthetic */ C38280k f101385b;

    public C38270a(C38280k kVar, C58833ax axVar) {
        this.f101385b = kVar;
        this.f101384a = axVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (this.f101384a.mo56113h()) {
            C59104x d = C38280k.f101415b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            ((C59052c) ((C59052c) d).mo56372aa(53058)).mo56389s("#audio# cannot retrieve route disconnect status for audio request client(token(%d))", this.f101384a.mo56107c());
        } else {
            C59104x d2 = C38280k.f101415b.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            ((C59052c) ((C59052c) d2).mo56372aa(53057)).mo56386p("#audio# cannot retrieve route disconnect status for hotword client");
        }
        C38280k kVar = this.f101385b;
        C37459ch chVar = (C37459ch) C37460ci.f99438c.createBuilder();
        C37476cy cyVar = C37476cy.FAILED_GETTING_DISCONNECT_REASON;
        chVar.copyOnWrite();
        C37460ci ciVar = (C37460ci) chVar.instance;
        ciVar.f99441b = cyVar.f99492t;
        ciVar.f99440a |= 1;
        kVar.mo41355k(C38280k.m67575i((C37460ci) chVar.build(), this.f101384a));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37460ci ciVar = (C37460ci) obj;
        if (this.f101384a.mo56113h()) {
            C59104x b = C38280k.f101415b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(53060);
            Object c = this.f101384a.mo56107c();
            C37476cy a = C37476cy.m66492a(ciVar.f99441b);
            if (a == null) {
                a = C37476cy.UNKNOWN_DISCONNECT_REASON;
            }
            cVar.mo56354G("#audio# route for audio request client(token(%d)) disconnected(reason(%s))", c, a.name());
        } else {
            C59104x b2 = C38280k.f101415b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ALT.AudioEventsHolder");
            C59052c cVar2 = (C59052c) ((C59052c) b2).mo56372aa(53059);
            C37476cy a2 = C37476cy.m66492a(ciVar.f99441b);
            if (a2 == null) {
                a2 = C37476cy.UNKNOWN_DISCONNECT_REASON;
            }
            cVar2.mo56389s("#audio# route for hotword client disconnected(reason(%s))", a2.name());
        }
        this.f101385b.mo41355k(C38280k.m67575i(ciVar, this.f101384a));
    }
}
