package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class DimensionProxy {

    /* compiled from: PG */
    final class CppProxy extends DimensionProxy {
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

        private native DimensionUnit native_unit(long j);

        private native float native_value(long j);

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

        public DimensionUnit unit() {
            return native_unit(this.nativeRef);
        }

        public float value() {
            return native_value(this.nativeRef);
        }
    }

    public abstract DimensionUnit unit();

    public abstract float value();
}
