package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class PbToFb {

    /* compiled from: PG */
    final class CppProxy extends PbToFb {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native StatusOr convert(ByteBuffer byteBuffer, boolean z, boolean z2, boolean z3);

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

    public static StatusOr convert(ByteBuffer byteBuffer, boolean z, boolean z2, boolean z3) {
        return CppProxy.convert(byteBuffer, z, z2, z3);
    }
}
