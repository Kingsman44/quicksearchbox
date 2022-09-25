package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class PointProxy {

    /* compiled from: PG */
    final class CppProxy extends PointProxy {
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

        private native float native_x(long j);

        private native float native_y(long j);

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

        /* renamed from: x */
        public float mo25736x() {
            return native_x(this.nativeRef);
        }

        /* renamed from: y */
        public float mo25737y() {
            return native_y(this.nativeRef);
        }
    }

    /* renamed from: x */
    public abstract float mo25736x();

    /* renamed from: y */
    public abstract float mo25737y();
}
