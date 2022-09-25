package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class LoggingDelegate {

    /* compiled from: PG */
    final class CppProxy extends LoggingDelegate {
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

        private native void native_log(long j, LoggingLevel loggingLevel, String str, String str2);

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

        public void log(LoggingLevel loggingLevel, String str, String str2) {
            native_log(this.nativeRef, loggingLevel, str, str2);
        }
    }

    public abstract void log(LoggingLevel loggingLevel, String str, String str2);
}
