package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class PropertiesProxy {

    /* compiled from: PG */
    final class CppProxy extends PropertiesProxy {
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

        private native boolean native_hasLayoutProperties(long j);

        private native boolean native_hasStyleProperties(long j);

        private native LayoutPropertiesProxy native_layoutProperties(long j);

        private native StylePropertiesProxy native_styleProperties(long j);

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

        public boolean hasLayoutProperties() {
            return native_hasLayoutProperties(this.nativeRef);
        }

        public boolean hasStyleProperties() {
            return native_hasStyleProperties(this.nativeRef);
        }

        public LayoutPropertiesProxy layoutProperties() {
            return native_layoutProperties(this.nativeRef);
        }

        public StylePropertiesProxy styleProperties() {
            return native_styleProperties(this.nativeRef);
        }
    }

    public abstract boolean hasLayoutProperties();

    public abstract boolean hasStyleProperties();

    public abstract LayoutPropertiesProxy layoutProperties();

    public abstract StylePropertiesProxy styleProperties();
}
