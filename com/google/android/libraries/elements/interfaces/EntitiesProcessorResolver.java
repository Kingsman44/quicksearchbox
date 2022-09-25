package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class EntitiesProcessorResolver {

    /* compiled from: PG */
    final class CppProxy extends EntitiesProcessorResolver {
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        public static native StatusOr create(ByteStore byteStore, EnvironmentDataSource environmentDataSource, EntitiesObserverConfig entitiesObserverConfig);

        private native void nativeDestroy(long j);

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
    }

    public static StatusOr create(ByteStore byteStore, EnvironmentDataSource environmentDataSource, EntitiesObserverConfig entitiesObserverConfig) {
        return CppProxy.create(byteStore, environmentDataSource, entitiesObserverConfig);
    }
}
