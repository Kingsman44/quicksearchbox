package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.m */
/* compiled from: PG */
final class C119201m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f332425a;

    /* renamed from: b */
    final /* synthetic */ String f332426b;

    /* renamed from: c */
    final /* synthetic */ int f332427c;

    /* renamed from: d */
    final /* synthetic */ Instant f332428d;

    /* renamed from: e */
    final /* synthetic */ Callable f332429e;

    /* renamed from: f */
    final /* synthetic */ C119202n f332430f;

    public C119201m(C119202n nVar, String str, String str2, int i, Instant instant, Callable callable) {
        this.f332430f = nVar;
        this.f332425a = str;
        this.f332426b = str2;
        this.f332427c = i;
        this.f332428d = instant;
        this.f332429e = callable;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C119202n.f332431a.mo56225c()).mo56382g(th)).mo56372aa(34339)).mo56386p("Unexpected exception received on callback");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C119207d dVar = (C119207d) obj;
        if (!((C58759qy) C119202n.f332432b).f156534a.equals(dVar)) {
            this.f332430f.mo104241c(this.f332425a);
            ((C59052c) ((C59052c) C119202n.f332431a.mo56224b()).mo56372aa(34343)).mo56359L("%s completed with unretriable status %s on retry attempt %d", this.f332426b, dVar.name(), Integer.valueOf(this.f332427c));
        } else if (!C119202n.f332435e.mo56912b(this.f332427c + 1)) {
            this.f332430f.mo104241c(this.f332425a);
            ((C59052c) ((C59052c) C119202n.f332431a.mo56226d()).mo56372aa(34342)).mo56359L("%s completed with retriable status %s but has reached max retry count of %d; not retrying", this.f332426b, dVar.name(), Integer.valueOf(this.f332427c));
        } else if (C119202n.f332434d.compareTo(Duration.between(this.f332428d, this.f332430f.f332439h.mo57444a())) < 0) {
            this.f332430f.mo104241c(this.f332425a);
            ((C59052c) ((C59052c) C119202n.f332431a.mo56226d()).mo56372aa(34341)).mo56359L("%s completed with retriable status %s but has reached max retry duration of %s; not retrying", this.f332426b, dVar.name(), C119202n.f332434d);
        } else {
            ((C59052c) ((C59052c) C119202n.f332431a.mo56224b()).mo56372aa(34340)).mo56359L("%s completed with retriable status %s; scheduling retry %d", this.f332426b, dVar.name(), Integer.valueOf(this.f332427c + 1));
            ConcurrentMap.EL.compute(this.f332430f.f332441j, this.f332425a, new C119198j(this, this.f332426b, dVar, this.f332427c, this.f332429e));
        }
    }
}
