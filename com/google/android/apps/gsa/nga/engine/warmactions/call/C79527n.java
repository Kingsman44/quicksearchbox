package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.telecom.Call;
import com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.C79521h;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.n */
/* compiled from: PG */
public final /* synthetic */ class C79527n implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Call f218241a;

    /* renamed from: b */
    public final /* synthetic */ int f218242b;

    public /* synthetic */ C79527n(Call call, int i) {
        this.f218241a = call;
        this.f218242b = i;
    }

    public final void accept(Object obj) {
        ((C79521h) obj).accept(C79504ab.m127585e(this.f218241a, this.f218242b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
