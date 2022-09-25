package com.google.android.libraries.elements.interfaces;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class ResourcePreloader {

    /* compiled from: PG */
    final class CppProxy extends ResourcePreloader {
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

        private native Status native_ensureLoaded(long j, HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

        private native Status native_loadAll(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l) {
            return native_ensureLoaded(this.nativeRef, hashSet, processState, errorPolicy, l);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public Status loadAll() {
            return native_loadAll(this.nativeRef);
        }
    }

    public abstract Status ensureLoaded(HashSet hashSet, ProcessState processState, ErrorPolicy errorPolicy, Long l);

    public abstract Status loadAll();
}
