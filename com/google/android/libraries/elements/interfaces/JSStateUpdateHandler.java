package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class JSStateUpdateHandler {

    /* compiled from: PG */
    final class CppProxy extends JSStateUpdateHandler {
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

        private native byte[] native_getModel(long j);

        private native byte[] native_getState(long j);

        private native void native_stateDidUpdate(long j, byte[] bArr);

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

        public byte[] getModel() {
            return native_getModel(this.nativeRef);
        }

        public byte[] getState() {
            return native_getState(this.nativeRef);
        }

        public void stateDidUpdate(byte[] bArr) {
            native_stateDidUpdate(this.nativeRef, bArr);
        }
    }

    public abstract byte[] getModel();

    public abstract byte[] getState();

    public abstract void stateDidUpdate(byte[] bArr);
}
