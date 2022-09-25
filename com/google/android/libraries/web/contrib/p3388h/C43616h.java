package com.google.android.libraries.web.contrib.p3388h;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.web.p3420k.C43861g;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.h.h */
/* compiled from: PG */
public final /* synthetic */ class C43616h implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ BiConsumer f113846a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f113847b;

    public /* synthetic */ C43616h(BiConsumer biConsumer, C2164c cVar) {
        this.f113846a = biConsumer;
        this.f113847b = cVar;
    }

    public final void accept(Object obj) {
        this.f113846a.accept((C43861g) obj, this.f113847b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
