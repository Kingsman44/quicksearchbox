package com.google.android.libraries.p579ar.sceneviewer.concurrent;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p3186j$.util.Objects;
import p3186j$.util.function.BiConsumer;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Function;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.libraries.ar.sceneviewer.concurrent.CompletableFuture */
/* compiled from: PG */
public class CompletableFuture implements CompletionStage {
    private static final Executor defaultExecutor = Executors.newCachedThreadPool();
    C60870cx listenableFuture;

    public CompletableFuture() {
        this.listenableFuture = new SettableFuture();
    }

    private CompletableFuture(C60870cx cxVar) {
        this.listenableFuture = cxVar;
    }

    public static CompletableFuture allOf(CompletableFuture... completableFutureArr) {
        ArrayList arrayList = new ArrayList();
        for (CompletableFuture completableFuture : completableFutureArr) {
            arrayList.add(completableFuture.listenableFuture);
        }
        return new CompletableFuture(C60856cj.m92892a(arrayList).mo57334a(new C10688g(arrayList), C60826bg.f164896a));
    }

    public static CompletableFuture completedFuture(Object obj) {
        return new CompletableFuture(C60856cj.m92900i(obj));
    }

    static /* synthetic */ void lambda$runAsync$1(Runnable runnable, CompletableFuture completableFuture) {
        try {
            runnable.run();
            completableFuture.complete((Object) null);
        } catch (Throwable th) {
            completableFuture.completeExceptionally(th);
        }
    }

    static /* synthetic */ void lambda$supplyAsync$0(CompletableFuture completableFuture, Supplier supplier) {
        try {
            completableFuture.complete(supplier.get());
        } catch (Throwable th) {
            completableFuture.completeExceptionally(th);
        }
    }

    public static CompletableFuture runAsync(Runnable runnable, Executor executor) {
        CompletableFuture completableFuture = new CompletableFuture();
        executor.execute(new CompletableFuture$$ExternalSyntheticLambda0(runnable, completableFuture));
        return completableFuture;
    }

    public static CompletableFuture supplyAsync(Supplier supplier, Executor executor) {
        CompletableFuture completableFuture = new CompletableFuture();
        executor.execute(new CompletableFuture$$ExternalSyntheticLambda3(completableFuture, supplier));
        return completableFuture;
    }

    public boolean cancel(boolean z) {
        return this.listenableFuture.cancel(z);
    }

    public boolean complete(Object obj) {
        try {
            return ((SettableFuture) this.listenableFuture).mo57356n(obj);
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean completeExceptionally(Throwable th) {
        try {
            return ((SettableFuture) this.listenableFuture).mo57357o(th);
        } catch (ClassCastException e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture exceptionally(Function function) {
        C60870cx cxVar = this.listenableFuture;
        Objects.requireNonNull(function);
        return new CompletableFuture(C60846c.m92878g(cxVar, Throwable.class, new CompletableFuture$$ExternalSyntheticLambda1(function), C60826bg.f164896a));
    }

    public Object get() {
        return this.listenableFuture.get();
    }

    public Object getNow(Object obj) {
        if (!this.listenableFuture.isDone()) {
            return obj;
        }
        try {
            return this.listenableFuture.get();
        } catch (InterruptedException | ExecutionException unused) {
            return obj;
        }
    }

    public CompletableFuture handle(BiFunction biFunction) {
        return handleAsync(biFunction, C60826bg.f164896a);
    }

    public CompletableFuture handleAsync(BiFunction biFunction) {
        return handleAsync(biFunction, defaultExecutor);
    }

    public boolean isCompletedExceptionally() {
        if (!this.listenableFuture.isDone()) {
            return false;
        }
        try {
            this.listenableFuture.get();
        } catch (ExecutionException unused) {
            return true;
        } catch (InterruptedException unused2) {
        }
        return false;
    }

    public boolean isDone() {
        return this.listenableFuture.isDone();
    }

    public Object join() {
        try {
            return this.listenableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public CompletableFuture thenAccept(Consumer consumer) {
        return thenAcceptAsync(consumer, C60826bg.f164896a);
    }

    public CompletableFuture thenAcceptAsync(Consumer consumer) {
        return thenAcceptAsync(consumer, defaultExecutor);
    }

    public CompletableFuture thenAcceptBoth(CompletionStage completionStage, BiConsumer biConsumer) {
        return new CompletableFuture(C60856cj.m92895d(this.listenableFuture, completionStage.toCompletableFuture().listenableFuture).mo57334a(new C10683b(this, biConsumer, completionStage), C60826bg.f164896a));
    }

    public CompletableFuture thenApply(Function function) {
        return thenApplyAsync(function, C60826bg.f164896a);
    }

    public CompletableFuture thenApplyAsync(Function function) {
        return thenApplyAsync(function, defaultExecutor);
    }

    public CompletableFuture thenCombine(CompletionStage completionStage, BiFunction biFunction) {
        return new CompletableFuture(C60856cj.m92895d(this.listenableFuture, completionStage.toCompletableFuture().listenableFuture).mo57334a(new C10689h(this, biFunction, completionStage), C60826bg.f164896a));
    }

    public CompletableFuture thenCompose(Function function) {
        return thenComposeAsync(function, C60826bg.f164896a);
    }

    public CompletableFuture thenComposeAsync(Function function, Executor executor) {
        CompletableFuture completableFuture = new CompletableFuture();
        C60856cj.m92911t(this.listenableFuture, new C10687f(function, completableFuture), executor);
        return completableFuture;
    }

    public CompletableFuture thenRun(Runnable runnable) {
        return thenRunAsync(runnable, C60826bg.f164896a);
    }

    public CompletableFuture thenRunAsync(Runnable runnable, Executor executor) {
        CompletableFuture completableFuture = new CompletableFuture();
        C60856cj.m92911t(this.listenableFuture, new C10685d(runnable, completableFuture), executor);
        return completableFuture;
    }

    public CompletableFuture toCompletableFuture() {
        return this;
    }

    public CompletableFuture handleAsync(BiFunction biFunction, Executor executor) {
        CompletableFuture completableFuture = new CompletableFuture();
        C60856cj.m92911t(this.listenableFuture, new C10684c(completableFuture, biFunction), executor);
        return completableFuture;
    }

    public CompletableFuture thenAcceptAsync(Consumer consumer, Executor executor) {
        return new CompletableFuture(C60922j.m93044g(this.listenableFuture, new C10682a(consumer), executor));
    }

    public CompletableFuture thenApplyAsync(Function function, Executor executor) {
        C60870cx cxVar = this.listenableFuture;
        Objects.requireNonNull(function);
        return new CompletableFuture(C60922j.m93044g(cxVar, new CompletableFuture$$ExternalSyntheticLambda2(function), executor));
    }
}
