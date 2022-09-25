package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class FetchResultHandler {

    /* compiled from: PG */
    final class CppProxy extends FetchResultHandler {
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

        private native Status native_onError(long j, Status status);

        private native Status native_onSuccess(long j, ArrayList arrayList);

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

        public Status onError(Status status) {
            return native_onError(this.nativeRef, status);
        }

        public Status onSuccess(ArrayList arrayList) {
            return native_onSuccess(this.nativeRef, arrayList);
        }
    }

    public abstract Status onError(Status status);

    public abstract Status onSuccess(ArrayList arrayList);
}
