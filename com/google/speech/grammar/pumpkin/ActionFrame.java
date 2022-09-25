package com.google.speech.grammar.pumpkin;

/* compiled from: PG */
public class ActionFrame {

    /* renamed from: a */
    public long f180883a;

    /* renamed from: b */
    private final Object f180884b = new Object();

    protected ActionFrame(long j) {
        if (j != 0) {
            this.f180883a = j;
            return;
        }
        throw new IllegalArgumentException("Can't initialize ActionFrame wrapper with a null ActionFrame");
    }

    private static native void nativeDelete(long j);

    /* access modifiers changed from: protected */
    public final void finalize() {
        synchronized (this.f180884b) {
            long j = this.f180883a;
            if (j != 0) {
                nativeDelete(j);
                this.f180883a = 0;
            }
        }
    }
}
