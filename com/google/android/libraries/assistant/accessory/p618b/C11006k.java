package com.google.android.libraries.assistant.accessory.p618b;

import com.google.common.util.concurrent.C60829bj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

/* renamed from: com.google.android.libraries.assistant.accessory.b.k */
/* compiled from: PG */
public final class C11006k extends FutureTask implements Comparable, C60870cx {

    /* renamed from: a */
    private final Integer f36172a;

    /* renamed from: b */
    private final C60829bj f36173b = new C60829bj();

    public C11006k(Runnable runnable, Integer num) {
        super(runnable, (Object) null);
        this.f36172a = num;
    }

    /* renamed from: b */
    public final void mo4106b(Runnable runnable, Executor executor) {
        this.f36173b.mo57297a(runnable, executor);
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f36172a.compareTo(((C11006k) obj).f36172a);
    }

    /* access modifiers changed from: protected */
    public final void done() {
        this.f36173b.mo57298b();
    }

    public C11006k(Callable callable, Integer num) {
        super(callable);
        this.f36172a = num;
    }
}
