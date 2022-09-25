package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class CommandRunCompletionCallback {

    /* compiled from: PG */
    final class CppProxy extends CommandRunCompletionCallback {
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

        private native void native_completion(long j, Status status);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void completion(Status status) {
            native_completion(this.nativeRef, status);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public abstract void completion(Status status);
}
