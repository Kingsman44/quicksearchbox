package com.google.common.util.concurrent;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Objects;

/* renamed from: com.google.common.util.concurrent.du */
/* compiled from: PG */
final class C60907du implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ ThreadFactory f165015a;

    /* renamed from: b */
    final /* synthetic */ String f165016b;

    /* renamed from: c */
    final /* synthetic */ AtomicLong f165017c;

    /* renamed from: d */
    final /* synthetic */ Boolean f165018d;

    /* renamed from: e */
    final /* synthetic */ Integer f165019e;

    public C60907du(ThreadFactory threadFactory, String str, AtomicLong atomicLong, Boolean bool, Integer num) {
        this.f165015a = threadFactory;
        this.f165016b = str;
        this.f165017c = atomicLong;
        this.f165018d = bool;
        this.f165019e = num;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f165015a.newThread(runnable);
        String str = this.f165016b;
        if (str != null) {
            newThread.setName(String.format(Locale.ROOT, str, new Object[]{Long.valueOf(((AtomicLong) Objects.requireNonNull(this.f165017c)).getAndIncrement())}));
        }
        Boolean bool = this.f165018d;
        if (bool != null) {
            newThread.setDaemon(bool.booleanValue());
        }
        Integer num = this.f165019e;
        if (num != null) {
            newThread.setPriority(num.intValue());
        }
        return newThread;
    }
}
