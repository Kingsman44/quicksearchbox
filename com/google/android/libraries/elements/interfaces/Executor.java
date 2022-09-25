package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class Executor {

    /* compiled from: PG */
    final class CppProxy extends Executor {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native boolean native_currentThreadIsMainThread(long j);

        private native int native_numPendingClosures(long j);

        private native void native_schedule(long j, Closure closure);

        private native boolean native_trySchedule(long j, Closure closure);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public boolean currentThreadIsMainThread() {
            return native_currentThreadIsMainThread(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public int numPendingClosures() {
            return native_numPendingClosures(this.nativeRef);
        }

        public void schedule(Closure closure) {
            native_schedule(this.nativeRef, closure);
        }

        public boolean trySchedule(Closure closure) {
            return native_trySchedule(this.nativeRef, closure);
        }
    }

    public abstract boolean currentThreadIsMainThread();

    public abstract int numPendingClosures();

    public abstract void schedule(Closure closure);

    public abstract boolean trySchedule(Closure closure);
}
