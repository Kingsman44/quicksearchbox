package com.bumptech.glide.load.p293a;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.a.b */
/* compiled from: PG */
final class C5684b implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(new C5638a(runnable), "glide-active-resources");
    }
}
