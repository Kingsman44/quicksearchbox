package com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice;

import android.telecom.Call;
import com.google.android.apps.gsa.nga.engine.warmactions.call.C79504ab;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.f */
/* compiled from: PG */
public final /* synthetic */ class C79519f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Call f218225a;

    /* renamed from: b */
    public final /* synthetic */ int f218226b;

    public /* synthetic */ C79519f(Call call, int i) {
        this.f218225a = call;
        this.f218226b = i;
    }

    public final void accept(Object obj) {
        ((C79521h) obj).accept(C79504ab.m127585e(this.f218225a, this.f218226b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
