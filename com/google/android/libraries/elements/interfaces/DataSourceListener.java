package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class DataSourceListener {

    /* compiled from: PG */
    final class CppProxy extends DataSourceListener {
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

        private native Status native_onDataChanged(long j);

        private native Status native_onError(long j, Status status);

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

        public Status onDataChanged() {
            return native_onDataChanged(this.nativeRef);
        }

        public Status onError(Status status) {
            return native_onError(this.nativeRef, status);
        }
    }

    public abstract Status onDataChanged();

    public abstract Status onError(Status status);
}
