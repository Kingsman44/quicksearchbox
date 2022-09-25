package com.google.android.libraries.elements.interfaces;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class Snapshot {

    /* compiled from: PG */
    final class CppProxy extends Snapshot {
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

        private native long native_byteSize(long j);

        private native boolean native_contains(long j, String str);

        private native boolean native_empty(long j);

        private native boolean native_equals(long j, Snapshot snapshot);

        private native byte[] native_find(long j, String str);

        private native byte[] native_findNoCopy(long j, String str);

        private native HashSet native_keys(long j);

        private native byte[] native_retrieveMetadata(long j, String str);

        private native long native_size(long j);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public long byteSize() {
            return native_byteSize(this.nativeRef);
        }

        public boolean contains(String str) {
            return native_contains(this.nativeRef, str);
        }

        public boolean empty() {
            return native_empty(this.nativeRef);
        }

        public boolean equals(Snapshot snapshot) {
            return native_equals(this.nativeRef, snapshot);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public byte[] find(String str) {
            return native_find(this.nativeRef, str);
        }

        public byte[] findNoCopy(String str) {
            return native_findNoCopy(this.nativeRef, str);
        }

        public HashSet keys() {
            return native_keys(this.nativeRef);
        }

        public byte[] retrieveMetadata(String str) {
            return native_retrieveMetadata(this.nativeRef, str);
        }

        public long size() {
            return native_size(this.nativeRef);
        }
    }

    public abstract long byteSize();

    public abstract boolean contains(String str);

    public abstract boolean empty();

    public abstract boolean equals(Snapshot snapshot);

    public abstract byte[] find(String str);

    public abstract byte[] findNoCopy(String str);

    public abstract HashSet keys();

    public abstract byte[] retrieveMetadata(String str);

    public abstract long size();
}
