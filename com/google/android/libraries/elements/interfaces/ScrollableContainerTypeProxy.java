package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ScrollableContainerTypeProxy {

    /* compiled from: PG */
    final class CppProxy extends ScrollableContainerTypeProxy {
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

        private native PointProxy native_contentOffset(long j);

        private native SizeProxy native_contentSize(long j);

        private native ScrollableContainerTypeDirection native_direction(long j);

        private native ScrollableContainerMarqueeConfigProxy native_marqueeConfig(long j);

        private native ScrollableContainerTypeOverscrollMode native_overscrollMode(long j);

        private native boolean native_showHorizontalIndicator(long j);

        private native boolean native_showVerticalIndicator(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public PointProxy contentOffset() {
            return native_contentOffset(this.nativeRef);
        }

        public SizeProxy contentSize() {
            return native_contentSize(this.nativeRef);
        }

        public ScrollableContainerTypeDirection direction() {
            return native_direction(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public ScrollableContainerMarqueeConfigProxy marqueeConfig() {
            return native_marqueeConfig(this.nativeRef);
        }

        public ScrollableContainerTypeOverscrollMode overscrollMode() {
            return native_overscrollMode(this.nativeRef);
        }

        public boolean showHorizontalIndicator() {
            return native_showHorizontalIndicator(this.nativeRef);
        }

        public boolean showVerticalIndicator() {
            return native_showVerticalIndicator(this.nativeRef);
        }
    }

    public abstract PointProxy contentOffset();

    public abstract SizeProxy contentSize();

    public abstract ScrollableContainerTypeDirection direction();

    public abstract ScrollableContainerMarqueeConfigProxy marqueeConfig();

    public abstract ScrollableContainerTypeOverscrollMode overscrollMode();

    public abstract boolean showHorizontalIndicator();

    public abstract boolean showVerticalIndicator();
}
