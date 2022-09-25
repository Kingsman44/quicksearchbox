package com.google.apps.tiktok.concurrent;

import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.concurrent.ag */
/* compiled from: PG */
final class C46420ag implements Runnable {

    /* renamed from: a */
    public C60930r f121479a;

    /* renamed from: b */
    public Executor f121480b;

    public C46420ag(C60930r rVar, Executor executor) {
        rVar.getClass();
        this.f121479a = rVar;
        executor.getClass();
        this.f121480b = executor;
    }

    public final void run() {
        this.f121479a = null;
        this.f121480b = null;
    }
}
