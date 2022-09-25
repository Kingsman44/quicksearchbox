package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class TextTypeProxy {

    /* compiled from: PG */
    final class CppProxy extends TextTypeProxy {
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

        private native AttributedStringProxy native_additionalTruncationText(long j);

        private native int native_maxLines(long j);

        private native AttributedStringProxy native_text(long j);

        private native AttributedStringProxy native_truncationText(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public AttributedStringProxy additionalTruncationText() {
            return native_additionalTruncationText(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public int maxLines() {
            return native_maxLines(this.nativeRef);
        }

        public AttributedStringProxy text() {
            return native_text(this.nativeRef);
        }

        public AttributedStringProxy truncationText() {
            return native_truncationText(this.nativeRef);
        }
    }

    public abstract AttributedStringProxy additionalTruncationText();

    public abstract int maxLines();

    public abstract AttributedStringProxy text();

    public abstract AttributedStringProxy truncationText();
}
