package com.google.android.apps.gsa.shared.p7031bk;

import android.content.BroadcastReceiver;
import android.content.Intent;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90883aq;
import com.google.android.libraries.performance.primes.C31164au;
import com.google.android.libraries.performance.primes.C31167ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bk.a */
/* compiled from: PG */
final class C89692a extends C90883aq {

    /* renamed from: a */
    final /* synthetic */ Intent f242825a;

    /* renamed from: b */
    final /* synthetic */ BroadcastReceiver.PendingResult f242826b;

    /* renamed from: c */
    final /* synthetic */ C89693b f242827c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89692a(C89693b bVar, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        super("finishWidgetIntent", 1, 0);
        this.f242827c = bVar;
        this.f242825a = intent;
        this.f242826b = pendingResult;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C89693b.f242828a.mo56225c()).mo56382g(th)).mo56372aa(11476)).mo56386p("SearchServiceStarter.processGenericClientEventInBackground() failed");
        C31167ax.m58112a().mo36915f(C31164au.m58092b("agsa.widget.intent.processing-time.failure"));
        this.f242827c.mo83603a(this.f242826b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C118826c cVar = (C118826c) obj;
        C59052c cVar2 = (C59052c) C89693b.f242828a.mo56224b();
        cVar2.mo56378ag(C58975e.f156826a, "SearchWidgetFlow");
        ((C59052c) cVar2.mo56372aa(11477)).mo56389s("GsaWidgetProvider:onReceive(%s) done", this.f242825a);
        C31167ax.m58112a().mo36915f(C31164au.m58092b("agsa.widget.intent.processing-time"));
        this.f242827c.mo83603a(this.f242826b);
    }
}
