package org.chromium.net.impl;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: org.chromium.net.impl.as */
/* compiled from: PG */
final class C72459as implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ int f192815a;

    public C72459as(int i) {
        this.f192815a = i;
    }

    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(new C72458ar(this, runnable));
    }
}
