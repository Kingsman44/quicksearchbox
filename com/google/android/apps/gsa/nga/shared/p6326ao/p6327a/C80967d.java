package com.google.android.apps.gsa.nga.shared.p6326ao.p6327a;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ao.a.d */
/* compiled from: PG */
public final /* synthetic */ class C80967d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f221964a;

    public /* synthetic */ C80967d(Intent intent) {
        this.f221964a = intent;
    }

    public final void accept(Object obj) {
        Intent intent = this.f221964a;
        int i = C80969f.f221966b;
        ((C80963a) obj).mo74737f(intent);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
