package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ImageSourceProxy {

    /* compiled from: PG */
    final class CppProxy extends ImageSourceProxy {
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

        private native ClientResourceProxy native_clientResource(long j);

        private native long native_height(long j);

        private native byte[] native_imageData(long j);

        private native String native_url(long j);

        private native long native_width(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public ClientResourceProxy clientResource() {
            return native_clientResource(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public long height() {
            return native_height(this.nativeRef);
        }

        public byte[] imageData() {
            return native_imageData(this.nativeRef);
        }

        public String url() {
            return native_url(this.nativeRef);
        }

        public long width() {
            return native_width(this.nativeRef);
        }
    }

    public abstract ClientResourceProxy clientResource();

    public abstract long height();

    public abstract byte[] imageData();

    public abstract String url();

    public abstract long width();
}
