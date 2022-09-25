package com.google.common.util.concurrent;

/* renamed from: com.google.common.util.concurrent.dj */
/* compiled from: PG */
final class C60896dj {
    /* renamed from: a */
    static void m92998a(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
