package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ScrollableContainerMarqueeConfigProxy {

    /* compiled from: PG */
    final class CppProxy extends ScrollableContainerMarqueeConfigProxy {
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

        private native boolean native_alwaysScroll(long j);

        private native float native_delaySeconds(long j);

        private native long native_loopCount(long j);

        private native float native_marqueeSpacing(long j);

        private native ScrollableContainerMarqueeSpeedProxy native_marqueeSpeed(long j);

        private native MarqueeScrollDirection native_scrollDirection(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public boolean alwaysScroll() {
            return native_alwaysScroll(this.nativeRef);
        }

        public float delaySeconds() {
            return native_delaySeconds(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public long loopCount() {
            return native_loopCount(this.nativeRef);
        }

        public float marqueeSpacing() {
            return native_marqueeSpacing(this.nativeRef);
        }

        public ScrollableContainerMarqueeSpeedProxy marqueeSpeed() {
            return native_marqueeSpeed(this.nativeRef);
        }

        public MarqueeScrollDirection scrollDirection() {
            return native_scrollDirection(this.nativeRef);
        }
    }

    public abstract boolean alwaysScroll();

    public abstract float delaySeconds();

    public abstract long loopCount();

    public abstract float marqueeSpacing();

    public abstract ScrollableContainerMarqueeSpeedProxy marqueeSpeed();

    public abstract MarqueeScrollDirection scrollDirection();
}
