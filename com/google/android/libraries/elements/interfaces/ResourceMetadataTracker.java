package com.google.android.libraries.elements.interfaces;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class ResourceMetadataTracker {

    /* compiled from: PG */
    final class CppProxy extends ResourceMetadataTracker {
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

        private native void native_addMetadata(long j, ResourceMetadata resourceMetadata);

        private native ResourceMetadata native_getResourceMetadata(long j, String str);

        private native TreeSet native_getTransitiveDeps(long j, TreeSet treeSet);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void addMetadata(ResourceMetadata resourceMetadata) {
            native_addMetadata(this.nativeRef, resourceMetadata);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public ResourceMetadata getResourceMetadata(String str) {
            return native_getResourceMetadata(this.nativeRef, str);
        }

        public TreeSet getTransitiveDeps(TreeSet treeSet) {
            return native_getTransitiveDeps(this.nativeRef, treeSet);
        }
    }

    public abstract void addMetadata(ResourceMetadata resourceMetadata);

    public abstract ResourceMetadata getResourceMetadata(String str);

    public abstract TreeSet getTransitiveDeps(TreeSet treeSet);
}
