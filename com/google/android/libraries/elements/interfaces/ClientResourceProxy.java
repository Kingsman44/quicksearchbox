package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ClientResourceProxy {

    /* compiled from: PG */
    final class CppProxy extends ClientResourceProxy {
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

        private native String native_bundleId(long j);

        private native long native_imageColor(long j);

        private native String native_imageName(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public String bundleId() {
            return native_bundleId(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public long imageColor() {
            return native_imageColor(this.nativeRef);
        }

        public String imageName() {
            return native_imageName(this.nativeRef);
        }
    }

    public abstract String bundleId();

    public abstract long imageColor();

    public abstract String imageName();
}
