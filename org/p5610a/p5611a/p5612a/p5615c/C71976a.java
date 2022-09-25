package org.p5610a.p5611a.p5612a.p5615c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.p5610a.p5611a.p5612a.C71978d;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Consumer;

/* renamed from: org.a.a.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C71976a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f191679a;

    /* renamed from: b */
    public final /* synthetic */ BiFunction f191680b;

    /* renamed from: c */
    public final /* synthetic */ AtomicInteger f191681c;

    public /* synthetic */ C71976a(AtomicReference atomicReference, BiFunction biFunction, AtomicInteger atomicInteger) {
        this.f191679a = atomicReference;
        this.f191680b = biFunction;
        this.f191681c = atomicInteger;
    }

    public final void accept(Object obj) {
        AtomicReference atomicReference = this.f191679a;
        BiFunction biFunction = this.f191680b;
        AtomicInteger atomicInteger = this.f191681c;
        try {
            C71978d.m105265f((File) obj);
        } catch (IOException e) {
            if (atomicReference.get() == null) {
                atomicReference.set(new ArrayList());
            }
            if (biFunction != null) {
                atomicInteger.get();
                ((List) atomicReference.get()).add(e);
            }
        }
        atomicInteger.incrementAndGet();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
