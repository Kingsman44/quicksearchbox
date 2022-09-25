package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.p4283bv.p4354e.C57528m;
import java.util.UUID;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.x */
/* compiled from: PG */
public final /* synthetic */ class C134235x implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C57528m f365706a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f365707b;

    public /* synthetic */ C134235x(C57528m mVar, Consumer consumer) {
        this.f365706a = mVar;
        this.f365707b = consumer;
    }

    public final void accept(Object obj, Object obj2) {
        C57528m mVar = this.f365706a;
        Consumer consumer = this.f365707b;
        UUID uuid = (UUID) obj;
        C134198ac acVar = (C134198ac) obj2;
        if (acVar.f365544b == mVar) {
            consumer.accept(acVar);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
