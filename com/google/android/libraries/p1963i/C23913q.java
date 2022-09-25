package com.google.android.libraries.p1963i;

import android.os.Process;

/* renamed from: com.google.android.libraries.i.q */
/* compiled from: PG */
public final /* synthetic */ class C23913q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f65392a;

    /* renamed from: b */
    public final /* synthetic */ int f65393b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f65394c;

    public /* synthetic */ C23913q(int i, int i2, Runnable runnable) {
        this.f65392a = i;
        this.f65393b = i2;
        this.f65394c = runnable;
    }

    public final void run() {
        int i = this.f65392a;
        int i2 = this.f65393b;
        Runnable runnable = this.f65394c;
        if (C23915s.m44503b(i) != i2) {
            Process.setThreadPriority(i2);
        }
        runnable.run();
    }
}
