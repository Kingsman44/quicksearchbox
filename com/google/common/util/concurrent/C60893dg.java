package com.google.common.util.concurrent;

import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.common.util.concurrent.dg */
/* compiled from: PG */
final class C60893dg extends C60873d.C60883i implements Runnable {

    /* renamed from: a */
    private final Runnable f164996a;

    public C60893dg(Runnable runnable) {
        runnable.getClass();
        this.f164996a = runnable;
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        return "task=[" + this.f164996a + "]";
    }

    public final void run() {
        try {
            this.f164996a.run();
        } catch (Error | RuntimeException e) {
            mo57357o(e);
            throw e;
        }
    }
}
