package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class Fetcher {

    /* compiled from: PG */
    final class CppProxy extends Fetcher {
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

        private native Status native_nextRequest(long j, FetchResultHandler fetchResultHandler);

        private native Status native_reloadRequest(long j, FetchResultHandler fetchResultHandler);

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

        public Status nextRequest(FetchResultHandler fetchResultHandler) {
            return native_nextRequest(this.nativeRef, fetchResultHandler);
        }

        public Status reloadRequest(FetchResultHandler fetchResultHandler) {
            return native_reloadRequest(this.nativeRef, fetchResultHandler);
        }
    }

    public abstract Status nextRequest(FetchResultHandler fetchResultHandler);

    public abstract Status reloadRequest(FetchResultHandler fetchResultHandler);
}
