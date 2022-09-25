package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class CellTypeProxy {

    /* compiled from: PG */
    final class CppProxy extends CellTypeProxy {
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

        private native long native_highlightedBackgroundColor(long j);

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

        public long highlightedBackgroundColor() {
            return native_highlightedBackgroundColor(this.nativeRef);
        }
    }

    public abstract long highlightedBackgroundColor();
}
