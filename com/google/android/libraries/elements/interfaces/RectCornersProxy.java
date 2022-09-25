package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class RectCornersProxy {

    /* compiled from: PG */
    final class CppProxy extends RectCornersProxy {
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

        private native boolean native_bottomEnd(long j);

        private native boolean native_bottomLeft(long j);

        private native boolean native_bottomRight(long j);

        private native boolean native_bottomStart(long j);

        private native boolean native_hasBottomEnd(long j);

        private native boolean native_hasBottomLeft(long j);

        private native boolean native_hasBottomRight(long j);

        private native boolean native_hasBottomStart(long j);

        private native boolean native_hasTopEnd(long j);

        private native boolean native_hasTopLeft(long j);

        private native boolean native_hasTopRight(long j);

        private native boolean native_hasTopStart(long j);

        private native boolean native_topEnd(long j);

        private native boolean native_topLeft(long j);

        private native boolean native_topRight(long j);

        private native boolean native_topStart(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public boolean bottomEnd() {
            return native_bottomEnd(this.nativeRef);
        }

        public boolean bottomLeft() {
            return native_bottomLeft(this.nativeRef);
        }

        public boolean bottomRight() {
            return native_bottomRight(this.nativeRef);
        }

        public boolean bottomStart() {
            return native_bottomStart(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public boolean hasBottomEnd() {
            return native_hasBottomEnd(this.nativeRef);
        }

        public boolean hasBottomLeft() {
            return native_hasBottomLeft(this.nativeRef);
        }

        public boolean hasBottomRight() {
            return native_hasBottomRight(this.nativeRef);
        }

        public boolean hasBottomStart() {
            return native_hasBottomStart(this.nativeRef);
        }

        public boolean hasTopEnd() {
            return native_hasTopEnd(this.nativeRef);
        }

        public boolean hasTopLeft() {
            return native_hasTopLeft(this.nativeRef);
        }

        public boolean hasTopRight() {
            return native_hasTopRight(this.nativeRef);
        }

        public boolean hasTopStart() {
            return native_hasTopStart(this.nativeRef);
        }

        public boolean topEnd() {
            return native_topEnd(this.nativeRef);
        }

        public boolean topLeft() {
            return native_topLeft(this.nativeRef);
        }

        public boolean topRight() {
            return native_topRight(this.nativeRef);
        }

        public boolean topStart() {
            return native_topStart(this.nativeRef);
        }
    }

    public abstract boolean bottomEnd();

    public abstract boolean bottomLeft();

    public abstract boolean bottomRight();

    public abstract boolean bottomStart();

    public abstract boolean hasBottomEnd();

    public abstract boolean hasBottomLeft();

    public abstract boolean hasBottomRight();

    public abstract boolean hasBottomStart();

    public abstract boolean hasTopEnd();

    public abstract boolean hasTopLeft();

    public abstract boolean hasTopRight();

    public abstract boolean hasTopStart();

    public abstract boolean topEnd();

    public abstract boolean topLeft();

    public abstract boolean topRight();

    public abstract boolean topStart();
}
