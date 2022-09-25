package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class JSFunctionBinding {

    /* compiled from: PG */
    final class CppProxy extends JSFunctionBinding {
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

        private native StatusOr native_execute(long j, byte[] bArr);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public StatusOr execute(byte[] bArr) {
            return native_execute(this.nativeRef, bArr);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public abstract StatusOr execute(byte[] bArr);
}
