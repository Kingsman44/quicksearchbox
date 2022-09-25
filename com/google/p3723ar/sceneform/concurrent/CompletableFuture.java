package com.google.p3723ar.sceneform.concurrent;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.ar.sceneform.concurrent.CompletableFuture */
/* compiled from: PG */
public class CompletableFuture {

    /* renamed from: a */
    public static final Executor f124263a = Executors.newCachedThreadPool();

    /* renamed from: b */
    public C60870cx f124264b;

    public CompletableFuture() {
        this.f124264b = new SettableFuture();
    }

    public CompletableFuture(C60870cx cxVar) {
        this.f124264b = cxVar;
    }

    public Object get() {
        return this.f124264b.get();
    }
}
