package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class ResourceLoader {

    /* compiled from: PG */
    final class CppProxy extends ResourceLoader {
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

        public static native StatusOr create(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native StatusOr createWithCache(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig);

        public static native ResourceLoader createWithDefaultConfig(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate);

        public static native ResourceLoader createWithDefaultConfigWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate);

        private native void nativeDestroy(long j);

        private native Status native_cacheResources(long j);

        private native Status native_commitCachedTrackableResources(long j);

        private native CertificateTracker native_getCertificateTracker(long j);

        private native ResourceMetadataTracker native_getMetadataTracker(long j);

        private native ResourcePreloader native_getPreloader(long j);

        private native Status native_handleOmittedResources(long j, TreeSet treeSet);

        private native Status native_handleResources(long j, ArrayList arrayList);

        private native boolean native_isCacheValid(long j);

        private native void native_registerMissingResourceHandler(long j, MissingResourceHandler missingResourceHandler);

        private native void native_registerVerifier(long j, String str, StatusOr statusOr);

        private native void native_updateResourceStatus(long j, ResourceCheck resourceCheck);

        private native Status native_updateResources(long j, ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public Status cacheResources() {
            return native_cacheResources(this.nativeRef);
        }

        public Status commitCachedTrackableResources() {
            return native_commitCachedTrackableResources(this.nativeRef);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public CertificateTracker getCertificateTracker() {
            return native_getCertificateTracker(this.nativeRef);
        }

        public ResourceMetadataTracker getMetadataTracker() {
            return native_getMetadataTracker(this.nativeRef);
        }

        public ResourcePreloader getPreloader() {
            return native_getPreloader(this.nativeRef);
        }

        public Status handleOmittedResources(TreeSet treeSet) {
            return native_handleOmittedResources(this.nativeRef, treeSet);
        }

        public Status handleResources(ArrayList arrayList) {
            return native_handleResources(this.nativeRef, arrayList);
        }

        public boolean isCacheValid() {
            return native_isCacheValid(this.nativeRef);
        }

        public void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler) {
            native_registerMissingResourceHandler(this.nativeRef, missingResourceHandler);
        }

        public void registerVerifier(String str, StatusOr statusOr) {
            native_registerVerifier(this.nativeRef, str, statusOr);
        }

        public void updateResourceStatus(ResourceCheck resourceCheck) {
            native_updateResourceStatus(this.nativeRef, resourceCheck);
        }

        public Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback) {
            return native_updateResources(this.nativeRef, arrayList, resourceLoaderCallback);
        }
    }

    public static StatusOr create(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.create(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, resourceLoaderConfig);
    }

    public static StatusOr createWithCache(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate, CacheStrategyDelegate cacheStrategyDelegate, ResourceLoaderConfig resourceLoaderConfig) {
        return CppProxy.createWithCache(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate, cacheStrategyDelegate, resourceLoaderConfig);
    }

    public static ResourceLoader createWithDefaultConfig(ControllerModuleLoader controllerModuleLoader, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate) {
        return CppProxy.createWithDefaultConfig(controllerModuleLoader, publicKeyVerifierProvider, resourceLoaderDelegate);
    }

    public static ResourceLoader createWithDefaultConfigWithBlocks(ControllerModuleLoader controllerModuleLoader, BlocksContainerLoaderProxy blocksContainerLoaderProxy, PublicKeyVerifierProvider publicKeyVerifierProvider, ResourceLoaderDelegate resourceLoaderDelegate) {
        return CppProxy.createWithDefaultConfigWithBlocks(controllerModuleLoader, blocksContainerLoaderProxy, publicKeyVerifierProvider, resourceLoaderDelegate);
    }

    public abstract Status cacheResources();

    public abstract Status commitCachedTrackableResources();

    public abstract CertificateTracker getCertificateTracker();

    public abstract ResourceMetadataTracker getMetadataTracker();

    public abstract ResourcePreloader getPreloader();

    public abstract Status handleOmittedResources(TreeSet treeSet);

    public abstract Status handleResources(ArrayList arrayList);

    public abstract boolean isCacheValid();

    public abstract void registerMissingResourceHandler(MissingResourceHandler missingResourceHandler);

    public abstract void registerVerifier(String str, StatusOr statusOr);

    public abstract void updateResourceStatus(ResourceCheck resourceCheck);

    public abstract Status updateResources(ArrayList arrayList, ResourceLoaderCallback resourceLoaderCallback);
}
