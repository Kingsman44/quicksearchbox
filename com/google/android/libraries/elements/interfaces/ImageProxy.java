package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ImageProxy {

    /* compiled from: PG */
    final class CppProxy extends ImageProxy {
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

        private native ContentMode native_contentMode(long j);

        private native boolean native_flipForRtlLayout(long j);

        private native ImageFormatHint native_imageFormatHint(long j);

        private native ArrayList native_sources(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public ContentMode contentMode() {
            return native_contentMode(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public boolean flipForRtlLayout() {
            return native_flipForRtlLayout(this.nativeRef);
        }

        public ImageFormatHint imageFormatHint() {
            return native_imageFormatHint(this.nativeRef);
        }

        public ArrayList sources() {
            return native_sources(this.nativeRef);
        }
    }

    public abstract ContentMode contentMode();

    public abstract boolean flipForRtlLayout();

    public abstract ImageFormatHint imageFormatHint();

    public abstract ArrayList sources();
}
