package com.google.android.apps.gsa.search.shared.service.p6940d;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.p7159c.C90891ay;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.shared.service.d.d */
/* compiled from: PG */
final class C88482d extends C90891ay {

    /* renamed from: a */
    final /* synthetic */ ClientEventData f239191a;

    /* renamed from: b */
    final /* synthetic */ C87673aa f239192b;

    /* renamed from: c */
    final /* synthetic */ SettableFuture f239193c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88482d(ClientEventData clientEventData, C87673aa aaVar, SettableFuture settableFuture) {
        super("Disconnect from SearchService");
        this.f239191a = clientEventData;
        this.f239192b = aaVar;
        this.f239193c = settableFuture;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59052c cVar = (C59052c) ((C59052c) ((C59052c) C88483e.f239194a.mo56225c()).mo56382g(th)).mo56372aa(9780);
        C87739bu a = C87739bu.m142761a(this.f239191a.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        cVar.mo56353F("Task %s failed or timed out. Client %d disconnecting from SearchService!", a, this.f239192b.f236988d);
        this.f239193c.cancel(true);
        this.f239192b.mo81933e();
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        this.f239192b.mo81933e();
    }
}
