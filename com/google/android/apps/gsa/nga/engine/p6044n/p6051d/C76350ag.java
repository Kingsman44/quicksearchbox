package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.ag */
/* compiled from: PG */
public final /* synthetic */ class C76350ag implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Bundle f211447a;

    public /* synthetic */ C76350ag(Bundle bundle) {
        this.f211447a = bundle;
    }

    public final void accept(Object obj) {
        Bundle bundle = this.f211447a;
        C58974d dVar = C76363at.f211461a;
        bundle.putInt("android.opa.extra.TRIGGERED_BY", ((e) obj).ca);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
