package com.google.android.play.core.p3534f;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.f.c */
/* compiled from: PG */
final class C45091c implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
