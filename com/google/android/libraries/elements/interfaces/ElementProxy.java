package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ElementProxy {

    /* compiled from: PG */
    final class CppProxy extends ElementProxy {
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

        public static native ElementProxy create(byte[] bArr);

        private native void nativeDestroy(long j);

        private native ArrayList native_childElements(long j);

        private native String native_key(long j);

        private native PropertiesProxy native_properties(long j);

        private native TypeProxy native_type(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public ArrayList childElements() {
            return native_childElements(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public String key() {
            return native_key(this.nativeRef);
        }

        public PropertiesProxy properties() {
            return native_properties(this.nativeRef);
        }

        public TypeProxy type() {
            return native_type(this.nativeRef);
        }
    }

    public static ElementProxy create(byte[] bArr) {
        return CppProxy.create(bArr);
    }

    public abstract ArrayList childElements();

    public abstract String key();

    public abstract PropertiesProxy properties();

    public abstract TypeProxy type();
}
