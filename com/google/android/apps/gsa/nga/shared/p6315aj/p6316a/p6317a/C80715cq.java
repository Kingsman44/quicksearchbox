package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9683d.C128182n;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cq */
/* compiled from: PG */
public final /* synthetic */ class C80715cq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Bundle f221593a;

    public /* synthetic */ C80715cq(Bundle bundle) {
        this.f221593a = bundle;
    }

    public final void accept(Object obj) {
        this.f221593a.putByteArray("impression_info", ((C128182n) obj).toByteArray());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
