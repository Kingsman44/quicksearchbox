package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.android.libraries.assistant.soda.Soda;
import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.search.n.c.a.h.av */
/* compiled from: PG */
public final /* synthetic */ class C39557av implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39580br f104136a;

    public /* synthetic */ C39557av(C39580br brVar) {
        this.f104136a = brVar;
    }

    public final Object apply(Object obj) {
        C39580br brVar = this.f104136a;
        Void voidR = (Void) obj;
        if (brVar.f104186s.mo56113h()) {
            ((Soda) brVar.f104186s.mo56107c()).mo24340l();
            brVar.f104186s = C58836b.f156633a;
            brVar.f104177j.set(C39579bq.UNINITIALIZED);
            return null;
        }
        C59104x d = C39580br.f104168a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) d).mo56372aa(53776)).mo56389s("Try to shutdown soda before the soda created! sodaState %s", ((C39579bq) brVar.f104177j.get()).name());
        return null;
    }
}
