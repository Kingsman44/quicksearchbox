package com.facebook.litho.widget;

import android.os.SystemClock;
import java.util.Deque;

/* renamed from: com.facebook.litho.widget.bg */
/* compiled from: PG */
final class C6448bg implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Deque f19123a;

    /* renamed from: b */
    final /* synthetic */ boolean f19124b;

    public C6448bg(Deque deque, boolean z) {
        this.f19123a = deque;
        this.f19124b = z;
    }

    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        while (!this.f19123a.isEmpty()) {
            ((C6543h) this.f19123a.pollFirst()).mo13359b(this.f19124b, uptimeMillis);
        }
    }
}
