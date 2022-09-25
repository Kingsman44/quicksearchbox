package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class DirectUpdateProcessor {

    /* compiled from: PG */
    final class CppProxy extends DirectUpdateProcessor {
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

        public static native DirectUpdateProcessor create(DirectUpdateExecutor directUpdateExecutor, ByteStore byteStore, CommandHandlerResolver commandHandlerResolver);

        private native void nativeDestroy(long j);

        private native void native_dispose(long j);

        private native void native_processProperties(long j, DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void dispose() {
            native_dispose(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public void processProperties(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties) {
            native_processProperties(this.nativeRef, directUpdatePropertiesOuterClass$DirectUpdateProperties);
        }
    }

    public static DirectUpdateProcessor create(DirectUpdateExecutor directUpdateExecutor, ByteStore byteStore, CommandHandlerResolver commandHandlerResolver) {
        return CppProxy.create(directUpdateExecutor, byteStore, commandHandlerResolver);
    }

    public abstract void dispose();

    public abstract void processProperties(DirectUpdatePropertiesOuterClass$DirectUpdateProperties directUpdatePropertiesOuterClass$DirectUpdateProperties);
}
