package com.google.android.apps.gsa.nga.shared.p6326ao.p6327a;

import android.content.res.Configuration;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ao.a.e */
/* compiled from: PG */
public final /* synthetic */ class C80968e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Configuration f221965a;

    public /* synthetic */ C80968e(Configuration configuration) {
        this.f221965a = configuration;
    }

    public final void accept(Object obj) {
        Configuration configuration = this.f221965a;
        int i = C80969f.f221966b;
        ((C80963a) obj).mo74739h(configuration);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
