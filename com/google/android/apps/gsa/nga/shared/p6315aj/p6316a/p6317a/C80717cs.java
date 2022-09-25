package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80578l;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.cs */
/* compiled from: PG */
public final /* synthetic */ class C80717cs implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Bundle f221594a;

    public /* synthetic */ C80717cs(Bundle bundle) {
        this.f221594a = bundle;
    }

    public final void accept(Object obj) {
        this.f221594a.putByteArray("disclosure_action", ((C80578l) obj).toByteArray());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
