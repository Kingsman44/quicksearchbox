package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class LayoutPropertiesProxy {

    /* compiled from: PG */
    final class CppProxy extends LayoutPropertiesProxy {
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

        private native AlignItems native_alignContent(long j);

        private native AlignItems native_alignItems(long j);

        private native AlignItems native_alignSelf(long j);

        private native float native_aspectRatio(long j);

        private native DimensionProxy native_flexBasis(long j);

        private native FlexDirection native_flexDirection(long j);

        private native float native_flexGrow(long j);

        private native float native_flexShrink(long j);

        private native FlexWrap native_flexWrap(long j);

        private native boolean native_hasAspectRatio(long j);

        private native boolean native_hasFlexGrow(long j);

        private native boolean native_hasFlexShrink(long j);

        private native DimensionProxy native_height(long j);

        private native JustifyContent native_justifyContent(long j);

        private native DimensionEdgesProxy native_margin(long j);

        private native DimensionProxy native_maxHeight(long j);

        private native DimensionProxy native_maxWidth(long j);

        private native DimensionProxy native_minHeight(long j);

        private native DimensionProxy native_minWidth(long j);

        private native DimensionEdgesProxy native_padding(long j);

        private native DimensionEdgesProxy native_position(long j);

        private native Position native_positionType(long j);

        private native SemanticContentAttribute native_semanticContentAttribute(long j);

        private native DimensionProxy native_width(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public AlignItems alignContent() {
            return native_alignContent(this.nativeRef);
        }

        public AlignItems alignItems() {
            return native_alignItems(this.nativeRef);
        }

        public AlignItems alignSelf() {
            return native_alignSelf(this.nativeRef);
        }

        public float aspectRatio() {
            return native_aspectRatio(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public DimensionProxy flexBasis() {
            return native_flexBasis(this.nativeRef);
        }

        public FlexDirection flexDirection() {
            return native_flexDirection(this.nativeRef);
        }

        public float flexGrow() {
            return native_flexGrow(this.nativeRef);
        }

        public float flexShrink() {
            return native_flexShrink(this.nativeRef);
        }

        public FlexWrap flexWrap() {
            return native_flexWrap(this.nativeRef);
        }

        public boolean hasAspectRatio() {
            return native_hasAspectRatio(this.nativeRef);
        }

        public boolean hasFlexGrow() {
            return native_hasFlexGrow(this.nativeRef);
        }

        public boolean hasFlexShrink() {
            return native_hasFlexShrink(this.nativeRef);
        }

        public DimensionProxy height() {
            return native_height(this.nativeRef);
        }

        public JustifyContent justifyContent() {
            return native_justifyContent(this.nativeRef);
        }

        public DimensionEdgesProxy margin() {
            return native_margin(this.nativeRef);
        }

        public DimensionProxy maxHeight() {
            return native_maxHeight(this.nativeRef);
        }

        public DimensionProxy maxWidth() {
            return native_maxWidth(this.nativeRef);
        }

        public DimensionProxy minHeight() {
            return native_minHeight(this.nativeRef);
        }

        public DimensionProxy minWidth() {
            return native_minWidth(this.nativeRef);
        }

        public DimensionEdgesProxy padding() {
            return native_padding(this.nativeRef);
        }

        public DimensionEdgesProxy position() {
            return native_position(this.nativeRef);
        }

        public Position positionType() {
            return native_positionType(this.nativeRef);
        }

        public SemanticContentAttribute semanticContentAttribute() {
            return native_semanticContentAttribute(this.nativeRef);
        }

        public DimensionProxy width() {
            return native_width(this.nativeRef);
        }
    }

    public abstract AlignItems alignContent();

    public abstract AlignItems alignItems();

    public abstract AlignItems alignSelf();

    public abstract float aspectRatio();

    public abstract DimensionProxy flexBasis();

    public abstract FlexDirection flexDirection();

    public abstract float flexGrow();

    public abstract float flexShrink();

    public abstract FlexWrap flexWrap();

    public abstract boolean hasAspectRatio();

    public abstract boolean hasFlexGrow();

    public abstract boolean hasFlexShrink();

    public abstract DimensionProxy height();

    public abstract JustifyContent justifyContent();

    public abstract DimensionEdgesProxy margin();

    public abstract DimensionProxy maxHeight();

    public abstract DimensionProxy maxWidth();

    public abstract DimensionProxy minHeight();

    public abstract DimensionProxy minWidth();

    public abstract DimensionEdgesProxy padding();

    public abstract DimensionEdgesProxy position();

    public abstract Position positionType();

    public abstract SemanticContentAttribute semanticContentAttribute();

    public abstract DimensionProxy width();
}
