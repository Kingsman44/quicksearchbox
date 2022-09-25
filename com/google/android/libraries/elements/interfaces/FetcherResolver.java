package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class FetcherResolver {

    /* compiled from: PG */
    final class CppProxy extends FetcherResolver {
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

        private native StatusOr native_getFetcher(long j, int i, byte[] bArr);

        private native void native_register(long j, int i, FetcherFactory fetcherFactory);

        public static native FetcherResolver sharedResolver();

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

        public StatusOr getFetcher(int i, byte[] bArr) {
            return native_getFetcher(this.nativeRef, i, bArr);
        }

        public void register(int i, FetcherFactory fetcherFactory) {
            native_register(this.nativeRef, i, fetcherFactory);
        }
    }

    public static FetcherResolver sharedResolver() {
        return CppProxy.sharedResolver();
    }

    public abstract StatusOr getFetcher(int i, byte[] bArr);

    public abstract void register(int i, FetcherFactory fetcherFactory);
}
