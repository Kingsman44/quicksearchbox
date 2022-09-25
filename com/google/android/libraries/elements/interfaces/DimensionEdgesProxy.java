package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class DimensionEdgesProxy {

    /* compiled from: PG */
    final class CppProxy extends DimensionEdgesProxy {
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

        private native DimensionProxy native_all(long j);

        private native DimensionProxy native_bottom(long j);

        private native DimensionProxy native_end(long j);

        private native DimensionProxy native_horizontal(long j);

        private native DimensionProxy native_left(long j);

        private native DimensionProxy native_right(long j);

        private native DimensionProxy native_start(long j);

        private native DimensionProxy native_top(long j);

        private native DimensionProxy native_vertical(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public DimensionProxy all() {
            return native_all(this.nativeRef);
        }

        public DimensionProxy bottom() {
            return native_bottom(this.nativeRef);
        }

        public DimensionProxy end() {
            return native_end(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public DimensionProxy horizontal() {
            return native_horizontal(this.nativeRef);
        }

        public DimensionProxy left() {
            return native_left(this.nativeRef);
        }

        public DimensionProxy right() {
            return native_right(this.nativeRef);
        }

        public DimensionProxy start() {
            return native_start(this.nativeRef);
        }

        public DimensionProxy top() {
            return native_top(this.nativeRef);
        }

        public DimensionProxy vertical() {
            return native_vertical(this.nativeRef);
        }
    }

    public abstract DimensionProxy all();

    public abstract DimensionProxy bottom();

    public abstract DimensionProxy end();

    public abstract DimensionProxy horizontal();

    public abstract DimensionProxy left();

    public abstract DimensionProxy right();

    public abstract DimensionProxy start();

    public abstract DimensionProxy top();

    public abstract DimensionProxy vertical();
}
