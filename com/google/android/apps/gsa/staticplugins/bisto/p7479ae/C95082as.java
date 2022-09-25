package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.as */
/* compiled from: PG */
final class C95082as extends C95095be {

    /* renamed from: a */
    final /* synthetic */ C95097bg f265992a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95082as(C95097bg bgVar) {
        super(bgVar, "AUDIO_DELAY_COMPENSATION");
        this.f265992a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        super.mo89003a();
        C58833ax a = this.f265992a.f266037i.mo89136a();
        if (!a.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            this.f265992a.mo89018e("DONE");
            return;
        }
        this.f265992a.f266032d.mo28213m("delay moving to DONE", (long) ((Integer) a.mo56107c()).intValue(), new C95081ar(this));
    }
}
