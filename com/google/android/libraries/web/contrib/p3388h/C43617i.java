package com.google.android.libraries.web.contrib.p3388h;

import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.web.p3420k.C43861g;
import java.util.concurrent.atomic.AtomicInteger;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.web.contrib.h.i */
/* compiled from: PG */
public final /* synthetic */ class C43617i implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ C43626r f113848a;

    /* renamed from: b */
    public final /* synthetic */ AtomicInteger f113849b;

    /* renamed from: c */
    public final /* synthetic */ C43624p f113850c;

    public /* synthetic */ C43617i(C43626r rVar, AtomicInteger atomicInteger, C43624p pVar) {
        this.f113848a = rVar;
        this.f113849b = atomicInteger;
        this.f113850c = pVar;
    }

    public final void accept(Object obj, Object obj2) {
        C43626r.m76984d((C43861g) obj, true, new C43621m(this.f113848a, this.f113849b, this.f113850c, (C2164c) obj2));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
