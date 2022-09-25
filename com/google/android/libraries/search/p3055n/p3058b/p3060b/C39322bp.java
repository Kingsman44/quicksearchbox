package com.google.android.libraries.search.p3055n.p3058b.p3060b;

import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.b.b.bp */
/* compiled from: PG */
public final /* synthetic */ class C39322bp implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C39326bt f103575a;

    public /* synthetic */ C39322bp(C39326bt btVar) {
        this.f103575a = btVar;
    }

    public final void run() {
        C39326bt btVar = this.f103575a;
        if (btVar.f103585d) {
            ((C59052c) ((C59052c) C39326bt.f103582a.mo56224b()).mo56372aa(53471)).mo56386p("Ending audio dump");
            btVar.f103587f.ifPresent(C39323bq.f103576a);
            btVar.f103588g.ifPresent(C39323bq.f103576a);
            btVar.f103587f = Optional.empty();
            btVar.f103588g = Optional.empty();
            btVar.f103586e = Optional.empty();
            btVar.f103585d = false;
        }
    }
}
