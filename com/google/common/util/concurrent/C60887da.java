package com.google.common.util.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.util.concurrent.da */
/* compiled from: PG */
public interface C60887da extends ExecutorService {
    /* renamed from: a */
    C60870cx mo19398a(Runnable runnable);

    /* renamed from: b */
    C60870cx mo19399b(Callable callable);

    /* renamed from: c */
    C60870cx mo19400c(Runnable runnable, Object obj);

    List invokeAll(Collection collection);

    List invokeAll(Collection collection, long j, TimeUnit timeUnit);
}
