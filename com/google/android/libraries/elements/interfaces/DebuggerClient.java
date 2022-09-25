package com.google.android.libraries.elements.interfaces;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class DebuggerClient {

    /* compiled from: PG */
    final class CppProxy extends DebuggerClient {
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

        public static native DebuggerClient create(String str, String str2, String str3, DebuggerCallback debuggerCallback);

        private native void nativeDestroy(long j);

        private native boolean native_sendLog(long j, byte[] bArr);

        private native boolean native_sendStoreSnapshot(long j, byte[] bArr);

        private native boolean native_sendTimelineEvent(long j, byte[] bArr);

        private native boolean native_traverseViewHierarchyResponse(long j, byte[] bArr);

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

        public boolean sendLog(byte[] bArr) {
            return native_sendLog(this.nativeRef, bArr);
        }

        public boolean sendStoreSnapshot(byte[] bArr) {
            return native_sendStoreSnapshot(this.nativeRef, bArr);
        }

        public boolean sendTimelineEvent(byte[] bArr) {
            return native_sendTimelineEvent(this.nativeRef, bArr);
        }

        public boolean traverseViewHierarchyResponse(byte[] bArr) {
            return native_traverseViewHierarchyResponse(this.nativeRef, bArr);
        }
    }

    public static DebuggerClient create(String str, String str2, String str3, DebuggerCallback debuggerCallback) {
        return CppProxy.create(str, str2, str3, debuggerCallback);
    }

    public abstract boolean sendLog(byte[] bArr);

    public abstract boolean sendStoreSnapshot(byte[] bArr);

    public abstract boolean sendTimelineEvent(byte[] bArr);

    public abstract boolean traverseViewHierarchyResponse(byte[] bArr);
}
