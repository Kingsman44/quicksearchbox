package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.google.assistant.p3775ac.p3779d.C48462b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cp */
/* compiled from: PG */
public final /* synthetic */ class C80714cp implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Bundle f221592a;

    public /* synthetic */ C80714cp(Bundle bundle) {
        this.f221592a = bundle;
    }

    public final void accept(Object obj) {
        this.f221592a.putByteArray("log_data", ((C48462b) obj).toByteArray());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
