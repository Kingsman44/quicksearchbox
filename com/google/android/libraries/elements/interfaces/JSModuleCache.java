package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class JSModuleCache {

    /* compiled from: PG */
    final class CppProxy extends JSModuleCache {
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

        public static native JSModuleCache create();

        private native void nativeDestroy(long j);

        private native void native_addObserver(long j, JSModuleCacheObserver jSModuleCacheObserver);

        private native StatusOr native_getAvailableModuleSetVersion(long j, String str);

        private native JSModuleBytesProvider native_getBytesProvider(long j);

        private native ControllerModuleLoader native_getLoader(long j);

        private native StatusOr native_getModuleContents(long j, String str);

        private native StatusOr native_getModuleDependencies(long j, String str);

        private native StatusOr native_getSerializedModuleConfig(long j, String str);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public void addObserver(JSModuleCacheObserver jSModuleCacheObserver) {
            native_addObserver(this.nativeRef, jSModuleCacheObserver);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public StatusOr getAvailableModuleSetVersion(String str) {
            return native_getAvailableModuleSetVersion(this.nativeRef, str);
        }

        public JSModuleBytesProvider getBytesProvider() {
            return native_getBytesProvider(this.nativeRef);
        }

        public ControllerModuleLoader getLoader() {
            return native_getLoader(this.nativeRef);
        }

        public StatusOr getModuleContents(String str) {
            return native_getModuleContents(this.nativeRef, str);
        }

        public StatusOr getModuleDependencies(String str) {
            return native_getModuleDependencies(this.nativeRef, str);
        }

        public StatusOr getSerializedModuleConfig(String str) {
            return native_getSerializedModuleConfig(this.nativeRef, str);
        }
    }

    public static JSModuleCache create() {
        return CppProxy.create();
    }

    public abstract void addObserver(JSModuleCacheObserver jSModuleCacheObserver);

    public abstract StatusOr getAvailableModuleSetVersion(String str);

    public abstract JSModuleBytesProvider getBytesProvider();

    public abstract ControllerModuleLoader getLoader();

    public abstract StatusOr getModuleContents(String str);

    public abstract StatusOr getModuleDependencies(String str);

    public abstract StatusOr getSerializedModuleConfig(String str);
}
