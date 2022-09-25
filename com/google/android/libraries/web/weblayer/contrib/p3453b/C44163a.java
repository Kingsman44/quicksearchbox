package com.google.android.libraries.web.weblayer.contrib.p3453b;

import com.google.android.libraries.web.p3420k.p3421a.C43854a;
import com.google.android.libraries.web.weblayer.contrib.p3453b.p3454a.C44167d;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.b.a */
/* compiled from: PG */
public final /* synthetic */ class C44163a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C43854a f114911a;

    public /* synthetic */ C44163a(C43854a aVar) {
        this.f114911a = aVar;
    }

    public final void accept(Object obj) {
        ((C44167d) obj).f114915a.add(this.f114911a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
