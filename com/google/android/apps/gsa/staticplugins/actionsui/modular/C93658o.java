package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88518l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.o */
/* compiled from: PG */
final class C93658o implements C88518l {

    /* renamed from: a */
    final /* synthetic */ TimeDurationArgument f261427a;

    /* renamed from: b */
    final /* synthetic */ C93660q f261428b;

    public C93658o(C93660q qVar, TimeDurationArgument timeDurationArgument) {
        this.f261428b = qVar;
        this.f261427a = timeDurationArgument;
    }

    /* renamed from: a */
    public final void mo82131a(long j, long j2, long j3) {
        this.f261427a.mo81334P(Long.valueOf(TimeUnit.HOURS.toMillis(j) + TimeUnit.MINUTES.toMillis(j2) + TimeUnit.SECONDS.toMillis(j3)));
        this.f261428b.f261430a.mo82057t();
    }
}
