package com.google.apps.tiktok.tracing;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.apps.tiktok.tracing.at */
/* compiled from: PG */
public final class C47534at {

    /* renamed from: a */
    public static final ConcurrentHashMap f123373a = new ConcurrentHashMap();

    /* renamed from: b */
    public final ReferenceQueue f123374b = new ReferenceQueue();

    /* renamed from: c */
    public final ExecutorService f123375c;

    /* renamed from: d */
    public final AtomicBoolean f123376d = new AtomicBoolean(false);

    public C47534at(ExecutorService executorService) {
        this.f123375c = executorService;
    }
}
