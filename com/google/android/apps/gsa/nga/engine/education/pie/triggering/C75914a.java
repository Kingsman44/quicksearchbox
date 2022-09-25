package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import java.util.HashMap;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.a */
/* compiled from: PG */
public final /* synthetic */ class C75914a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ HashMap f210621a;

    public /* synthetic */ C75914a(HashMap hashMap) {
        this.f210621a = hashMap;
    }

    public final void accept(Object obj) {
        this.f210621a.remove((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
