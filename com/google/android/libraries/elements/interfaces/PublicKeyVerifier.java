package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class PublicKeyVerifier {

    /* compiled from: PG */
    final class CppProxy extends PublicKeyVerifier {
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

        private native Status native_initialize(long j, String str, byte[] bArr, byte[] bArr2);

        private native Status native_verify(long j, byte[] bArr, byte[] bArr2);

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

        public Status initialize(String str, byte[] bArr, byte[] bArr2) {
            return native_initialize(this.nativeRef, str, bArr, bArr2);
        }

        public Status verify(byte[] bArr, byte[] bArr2) {
            return native_verify(this.nativeRef, bArr, bArr2);
        }
    }

    public abstract Status initialize(String str, byte[] bArr, byte[] bArr2);

    public abstract Status verify(byte[] bArr, byte[] bArr2);
}
