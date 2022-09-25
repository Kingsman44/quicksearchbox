package com.google.android.libraries.web.weblayer.p3468g.p3469a;

import com.google.android.libraries.web.base.p3348b.p3350b.C43242a;
import com.google.android.libraries.web.contrib.debug.internal.C43490n;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.weblayer.g.a.c */
/* compiled from: PG */
final class C44275c implements Consumer {

    /* renamed from: a */
    final /* synthetic */ C43242a f115138a;

    public C44275c(C43242a aVar) {
        this.f115138a = aVar;
    }

    public final /* synthetic */ void accept(Object obj) {
        C43490n nVar = (C43490n) obj;
        C69664n.m101061g(nVar, "it");
        nVar.f113591a.f113612d = this.f115138a;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
