package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.modular.arguments.TimeDurationArgument;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88518l;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.eo */
/* compiled from: PG */
public final /* synthetic */ class C93645eo implements C88518l {

    /* renamed from: a */
    public final /* synthetic */ C93646ep f261412a;

    public /* synthetic */ C93645eo(C93646ep epVar) {
        this.f261412a = epVar;
    }

    /* renamed from: a */
    public final void mo82131a(long j, long j2, long j3) {
        ((TimeDurationArgument) this.f261412a.f261447m).mo81334P(Long.valueOf(TimeUnit.HOURS.toMillis(j) + TimeUnit.MINUTES.toMillis(j2) + TimeUnit.SECONDS.toMillis(j3)));
    }
}
