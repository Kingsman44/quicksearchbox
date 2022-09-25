package com.google.android.apps.gsa.search.shared.service.p6940d;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;

/* renamed from: com.google.android.apps.gsa.search.shared.service.d.c */
/* compiled from: PG */
final class C88481c extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C87673aa f239189a;

    /* renamed from: b */
    final /* synthetic */ ClientEventData f239190b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88481c(C87673aa aaVar, ClientEventData clientEventData) {
        super("Connect to SearchService and send generic client event");
        this.f239189a = aaVar;
        this.f239190b = clientEventData;
    }

    public final void run() {
        this.f239189a.mo81932c();
        this.f239189a.mo81937i(this.f239190b);
    }
}
