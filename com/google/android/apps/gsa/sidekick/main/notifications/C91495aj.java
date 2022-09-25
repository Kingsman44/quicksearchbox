package com.google.android.apps.gsa.sidekick.main.notifications;

import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.sidekick.shared.p7238g.C91734d;
import com.google.p375ai.p378b.C7718hj;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.sidekick.main.notifications.aj */
/* compiled from: PG */
final class C91495aj extends C90888av {

    /* renamed from: a */
    final /* synthetic */ C91734d f255203a;

    /* renamed from: b */
    final /* synthetic */ C91500ao f255204b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91495aj(C91500ao aoVar, C91734d dVar) {
        super("onEntryDismissed", 2, 8);
        this.f255204b = aoVar;
        this.f255203a = dVar;
    }

    public final void run() {
        C91500ao aoVar = this.f255204b;
        C7718hj hjVar = this.f255203a.f255851b;
        if (hjVar == null) {
            hjVar = C7718hj.f26927af;
        }
        aoVar.mo85843h(hjVar);
        C91500ao aoVar2 = this.f255204b;
        C7718hj hjVar2 = this.f255203a.f255851b;
        if (hjVar2 == null) {
            hjVar2 = C7718hj.f26927af;
        }
        aoVar2.mo85841f(Collections.singleton(hjVar2));
    }
}
