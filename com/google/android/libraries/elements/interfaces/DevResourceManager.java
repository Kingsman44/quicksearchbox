package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class DevResourceManager {

    /* compiled from: PG */
    final class CppProxy extends DevResourceManager {
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

        private native StatusOr native_getTemplateDetails(long j, String str);

        private native StatusOr native_getTemplateFixture(long j, String str, String str2);

        private native Status native_loadResource(long j, String str);

        private native void native_logError(long j, String str);

        private native String native_resolveIdentifier(long j, String str);

        private native DevResourceSubscription native_subscribe(long j, String str, DevResourceObserver devResourceObserver);

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

        public StatusOr getTemplateDetails(String str) {
            return native_getTemplateDetails(this.nativeRef, str);
        }

        public StatusOr getTemplateFixture(String str, String str2) {
            return native_getTemplateFixture(this.nativeRef, str, str2);
        }

        public Status loadResource(String str) {
            return native_loadResource(this.nativeRef, str);
        }

        public void logError(String str) {
            native_logError(this.nativeRef, str);
        }

        public String resolveIdentifier(String str) {
            return native_resolveIdentifier(this.nativeRef, str);
        }

        public DevResourceSubscription subscribe(String str, DevResourceObserver devResourceObserver) {
            return native_subscribe(this.nativeRef, str, devResourceObserver);
        }
    }

    public abstract StatusOr getTemplateDetails(String str);

    public abstract StatusOr getTemplateFixture(String str, String str2);

    public abstract Status loadResource(String str);

    public abstract void logError(String str);

    public abstract String resolveIdentifier(String str);

    public abstract DevResourceSubscription subscribe(String str, DevResourceObserver devResourceObserver);
}
