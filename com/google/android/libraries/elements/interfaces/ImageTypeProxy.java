package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ImageTypeProxy {

    /* compiled from: PG */
    final class CppProxy extends ImageTypeProxy {
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

        private native ImageProxy native_defaultImage(long j);

        private native ImageProxy native_errorImage(long j);

        private native ImageProxy native_image(long j);

        private native float native_preloadWidthHint(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public ImageProxy defaultImage() {
            return native_defaultImage(this.nativeRef);
        }

        public ImageProxy errorImage() {
            return native_errorImage(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public ImageProxy image() {
            return native_image(this.nativeRef);
        }

        public float preloadWidthHint() {
            return native_preloadWidthHint(this.nativeRef);
        }
    }

    public abstract ImageProxy defaultImage();

    public abstract ImageProxy errorImage();

    public abstract ImageProxy image();

    public abstract float preloadWidthHint();
}
