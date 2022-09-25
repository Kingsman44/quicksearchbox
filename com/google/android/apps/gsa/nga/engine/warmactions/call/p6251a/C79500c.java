package com.google.android.apps.gsa.nga.engine.warmactions.call.p6251a;

import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81014e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82457fx;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.a.c */
/* compiled from: PG */
public final /* synthetic */ class C79500c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81013d f218200a;

    public /* synthetic */ C79500c(C81013d dVar) {
        this.f218200a = dVar;
    }

    public final void accept(Object obj) {
        ((C81014e) this.f218200a).f222055a.mo75579d(new C82457fx("NGA_WARM_ACTIONS_ANSWERED_CALL_DURATION", Double.valueOf((double) ((Duration) obj).toMillis())));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
