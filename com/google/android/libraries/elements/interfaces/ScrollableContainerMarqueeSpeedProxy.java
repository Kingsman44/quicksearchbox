package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ScrollableContainerMarqueeSpeedProxy {

    /* compiled from: PG */
    final class CppProxy extends ScrollableContainerMarqueeSpeedProxy {
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

        private native MarqueeSpeedCurveType native_marqueeSpeedCurveType(long j);

        private native long native_scrollSpeed(long j);

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

        public MarqueeSpeedCurveType marqueeSpeedCurveType() {
            return native_marqueeSpeedCurveType(this.nativeRef);
        }

        public long scrollSpeed() {
            return native_scrollSpeed(this.nativeRef);
        }
    }

    public abstract MarqueeSpeedCurveType marqueeSpeedCurveType();

    public abstract long scrollSpeed();
}
