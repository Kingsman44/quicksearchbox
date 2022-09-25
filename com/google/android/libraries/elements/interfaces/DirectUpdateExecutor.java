package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class DirectUpdateExecutor {

    /* compiled from: PG */
    final class CppProxy extends DirectUpdateExecutor {
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

        private native Status native_applyChangeStylePropertiesBackgroundColor(long j, long j2);

        private native Status native_applyChangeStylePropertiesOpacity(long j, float f);

        private native Status native_applyChangeStylePropertiesRotation(long j, float f);

        private native Status native_applyChangeStylePropertiesScale(long j, float f);

        private native Status native_applyChangeStylePropertiesTranslation(long j, float f, float f2);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public Status applyChangeStylePropertiesBackgroundColor(long j) {
            return native_applyChangeStylePropertiesBackgroundColor(this.nativeRef, j);
        }

        public Status applyChangeStylePropertiesOpacity(float f) {
            return native_applyChangeStylePropertiesOpacity(this.nativeRef, f);
        }

        public Status applyChangeStylePropertiesRotation(float f) {
            return native_applyChangeStylePropertiesRotation(this.nativeRef, f);
        }

        public Status applyChangeStylePropertiesScale(float f) {
            return native_applyChangeStylePropertiesScale(this.nativeRef, f);
        }

        public Status applyChangeStylePropertiesTranslation(float f, float f2) {
            return native_applyChangeStylePropertiesTranslation(this.nativeRef, f, f2);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }
    }

    public abstract Status applyChangeStylePropertiesBackgroundColor(long j);

    public abstract Status applyChangeStylePropertiesOpacity(float f);

    public abstract Status applyChangeStylePropertiesRotation(float f);

    public abstract Status applyChangeStylePropertiesScale(float f);

    public abstract Status applyChangeStylePropertiesTranslation(float f, float f2);
}
