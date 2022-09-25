package com.google.android.libraries.elements.interfaces;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class PerformanceLogger {

    /* compiled from: PG */
    final class CppProxy extends PerformanceLogger {
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

        public static native PerformanceLogger create(PerformanceMonitorAdapter performanceMonitorAdapter, boolean z);

        public static native String nameForPerformanceSpanType(PerformanceSpanType performanceSpanType);

        private native void nativeDestroy(long j);

        private native void native_beginPerformanceSpan(long j, PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

        private native void native_endPerformanceSpan(long j, PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

        private native ArrayList native_flushPerformanceSpans(long j);

        private native long native_getCurrentThread(long j);

        private native boolean native_isMainThread(long j);

        private native void native_logPerformanceSpan(long j, PerformanceSpan performanceSpan);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void beginPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo) {
            native_beginPerformanceSpan(this.nativeRef, performanceSpanType, performanceEventInfo);
        }

        public void endPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo) {
            native_endPerformanceSpan(this.nativeRef, performanceSpanType, performanceEventInfo);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public ArrayList flushPerformanceSpans() {
            return native_flushPerformanceSpans(this.nativeRef);
        }

        public long getCurrentThread() {
            return native_getCurrentThread(this.nativeRef);
        }

        public boolean isMainThread() {
            return native_isMainThread(this.nativeRef);
        }

        public void logPerformanceSpan(PerformanceSpan performanceSpan) {
            native_logPerformanceSpan(this.nativeRef, performanceSpan);
        }
    }

    public static PerformanceLogger create(PerformanceMonitorAdapter performanceMonitorAdapter, boolean z) {
        return CppProxy.create(performanceMonitorAdapter, z);
    }

    public static String nameForPerformanceSpanType(PerformanceSpanType performanceSpanType) {
        return CppProxy.nameForPerformanceSpanType(performanceSpanType);
    }

    public abstract void beginPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

    public abstract void endPerformanceSpan(PerformanceSpanType performanceSpanType, PerformanceEventInfo performanceEventInfo);

    public abstract ArrayList flushPerformanceSpans();

    public abstract long getCurrentThread();

    public abstract boolean isMainThread();

    public abstract void logPerformanceSpan(PerformanceSpan performanceSpan);
}
