package com.google.common.util.concurrent;

import java.util.concurrent.Future;

/* renamed from: com.google.common.util.concurrent.ca */
/* compiled from: PG */
final class C60847ca implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Future f164930a;

    public C60847ca(Future future) {
        this.f164930a = future;
    }

    public final void run() {
        this.f164930a.cancel(false);
    }
}
