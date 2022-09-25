package com.google.android.libraries.elements.interfaces;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ComponentElement {

    /* compiled from: PG */
    final class CppProxy extends ComponentElement {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native ComponentElement create(ByteBuffer byteBuffer);

        private native void nativeDestroy(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public static ComponentElement create(ByteBuffer byteBuffer) {
        return CppProxy.create(byteBuffer);
    }
}
