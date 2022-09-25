package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class CertificateTracker {

    /* compiled from: PG */
    final class CppProxy extends CertificateTracker {
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

        private native byte[] native_getCertificateBytes(long j, String str);

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

        public byte[] getCertificateBytes(String str) {
            return native_getCertificateBytes(this.nativeRef, str);
        }
    }

    public abstract byte[] getCertificateBytes(String str);
}
