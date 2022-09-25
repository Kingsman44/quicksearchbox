package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class ExecutorRegistry {

    /* compiled from: PG */
    final class CppProxy extends ExecutorRegistry {
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

        public static native ExecutorRegistry create(Executor executor, Executor executor2);

        private native void nativeDestroy(long j);

        private native Executor native_executorForExecutorThread(long j, ExecutorThread executorThread);

        private native Status native_schedule(long j, ExecutorThread executorThread, Closure closure);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public Executor executorForExecutorThread(ExecutorThread executorThread) {
            return native_executorForExecutorThread(this.nativeRef, executorThread);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public Status schedule(ExecutorThread executorThread, Closure closure) {
            return native_schedule(this.nativeRef, executorThread, closure);
        }
    }

    public static ExecutorRegistry create(Executor executor, Executor executor2) {
        return CppProxy.create(executor, executor2);
    }

    public abstract Executor executorForExecutorThread(ExecutorThread executorThread);

    public abstract Status schedule(ExecutorThread executorThread, Closure closure);
}
