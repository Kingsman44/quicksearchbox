package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class AttributedStringProxy {

    /* compiled from: PG */
    final class CppProxy extends AttributedStringProxy {
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

        private native TextAlignment native_alignment(long j);

        private native boolean native_androidIncludeFontPadding(long j);

        private native String native_content(long j);

        private native LineBreakMode native_lineBreakMode(long j);

        private native float native_lineSpacing(long j);

        private native TruncationMode native_truncationMode(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public TextAlignment alignment() {
            return native_alignment(this.nativeRef);
        }

        public boolean androidIncludeFontPadding() {
            return native_androidIncludeFontPadding(this.nativeRef);
        }

        public String content() {
            return native_content(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public LineBreakMode lineBreakMode() {
            return native_lineBreakMode(this.nativeRef);
        }

        public float lineSpacing() {
            return native_lineSpacing(this.nativeRef);
        }

        public TruncationMode truncationMode() {
            return native_truncationMode(this.nativeRef);
        }
    }

    public abstract TextAlignment alignment();

    public abstract boolean androidIncludeFontPadding();

    public abstract String content();

    public abstract LineBreakMode lineBreakMode();

    public abstract float lineSpacing();

    public abstract TruncationMode truncationMode();
}
