package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class ComponentState {

    /* compiled from: PG */
    final class CppProxy extends ComponentState {
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

        public static native ComponentState create();

        private native void nativeDestroy(long j);

        private native Status native_dispose(long j);

        private native boolean native_isEmpty(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public Status dispose() {
            return native_dispose(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public boolean isEmpty() {
            return native_isEmpty(this.nativeRef);
        }
    }

    public static ComponentState create() {
        return CppProxy.create();
    }

    public abstract Status dispose();

    public abstract boolean isEmpty();
}
