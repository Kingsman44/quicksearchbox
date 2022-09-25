package com.google.android.libraries.web.weblayer.contrib.p3453b;

import com.google.android.libraries.web.p3420k.p3421a.C43854a;
import com.google.android.libraries.web.weblayer.contrib.p3453b.p3454a.C44167d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.b.b */
/* compiled from: PG */
public final /* synthetic */ class C44168b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43854a f114917a;

    public /* synthetic */ C44168b(C43854a aVar) {
        this.f114917a = aVar;
    }

    public final void accept(Object obj) {
        ((C44167d) obj).f114915a.remove(this.f114917a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
