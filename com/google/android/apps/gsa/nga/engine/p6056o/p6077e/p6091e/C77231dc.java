package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6091e;

import android.content.Intent;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.e.dc */
/* compiled from: PG */
public final /* synthetic */ class C77231dc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Intent f213071a;

    public /* synthetic */ C77231dc(Intent intent) {
        this.f213071a = intent;
    }

    public final void accept(Object obj) {
        this.f213071a.putExtra("android.intent.extra.alarm.SNOOZE_DURATION", (int) ((Duration) obj).toMinutes());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
