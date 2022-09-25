package com.google.android.libraries.web.weblayer.p3446a.p3447a;

import android.support.p031v4.app.Fragment;
import org.chromium.weblayer.C72615d;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C44115a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f114833a;

    public /* synthetic */ C44115a(Consumer consumer) {
        this.f114833a = consumer;
    }

    public final void accept(Object obj) {
        Consumer consumer = this.f114833a;
        C72615d dVar = C44116b.m77891a((Fragment) obj).f114872j;
        C69664n.m101058d(dVar);
        consumer.accept(dVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
