package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88518l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.dw */
/* compiled from: PG */
final class C93626dw implements C88518l {

    /* renamed from: a */
    final /* synthetic */ C93627dx f261376a;

    public C93626dw(C93627dx dxVar) {
        this.f261376a = dxVar;
    }

    /* renamed from: a */
    public final void mo82131a(long j, long j2, long j3) {
        ((TimeDurationArgument) this.f261376a.f261447m).mo81334P(Long.valueOf(TimeUnit.HOURS.toMillis(j) + TimeUnit.MINUTES.toMillis(j2) + TimeUnit.SECONDS.toMillis(j3)));
    }
}
