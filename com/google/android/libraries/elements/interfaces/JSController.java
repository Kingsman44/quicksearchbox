package com.google.android.libraries.elements.interfaces;

import com.youtube.android.libraries.elements.StatusOr;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public abstract class JSController {

    /* compiled from: PG */
    final class CppProxy extends JSController {
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

        public static native JSController create(PerformanceLogger performanceLogger, JSModuleCache jSModuleCache, JSBlocksContainerProvider jSBlocksContainerProvider, JSControllerConfig jSControllerConfig);

        private native void nativeDestroy(long j);

        private native StatusOr native_executeFfiFunction(long j, String str, String str2, byte[] bArr);

        private native void native_executeFunction(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler);

        private native Status native_executePreloadInstruction(long j, byte[] bArr);

        private native void native_prewarmExecutor(long j);

        private native void native_registerControllerInitializer(long j, String str, JSControllerInitializer jSControllerInitializer);

        private native void native_registerFunctionBinding(long j, int i, JSFunctionBinding jSFunctionBinding);

        private native void native_registerStateUpdateHandler(long j, String str, JSStateUpdateHandler jSStateUpdateHandler);

        private native void native_setPreloader(long j, ResourcePreloader resourcePreloader);

        private native Status native_unregisterControllerInitializer(long j, String str);

        private native Status native_unregisterStateUpdateHandler(long j, String str);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public StatusOr executeFfiFunction(String str, String str2, byte[] bArr) {
            return native_executeFfiFunction(this.nativeRef, str, str2, bArr);
        }

        public void executeFunction(byte[] bArr, byte[] bArr2, byte[] bArr3, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler) {
            native_executeFunction(this.nativeRef, bArr, bArr2, bArr3, byteStore, jSCommandResolver, jSFutureHandler);
        }

        public Status executePreloadInstruction(byte[] bArr) {
            return native_executePreloadInstruction(this.nativeRef, bArr);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public void prewarmExecutor() {
            native_prewarmExecutor(this.nativeRef);
        }

        public void registerControllerInitializer(String str, JSControllerInitializer jSControllerInitializer) {
            native_registerControllerInitializer(this.nativeRef, str, jSControllerInitializer);
        }

        public void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding) {
            native_registerFunctionBinding(this.nativeRef, i, jSFunctionBinding);
        }

        public void registerStateUpdateHandler(String str, JSStateUpdateHandler jSStateUpdateHandler) {
            native_registerStateUpdateHandler(this.nativeRef, str, jSStateUpdateHandler);
        }

        public void setPreloader(ResourcePreloader resourcePreloader) {
            native_setPreloader(this.nativeRef, resourcePreloader);
        }

        public Status unregisterControllerInitializer(String str) {
            return native_unregisterControllerInitializer(this.nativeRef, str);
        }

        public Status unregisterStateUpdateHandler(String str) {
            return native_unregisterStateUpdateHandler(this.nativeRef, str);
        }
    }

    public static JSController create(PerformanceLogger performanceLogger, JSModuleCache jSModuleCache, JSBlocksContainerProvider jSBlocksContainerProvider, JSControllerConfig jSControllerConfig) {
        return CppProxy.create(performanceLogger, jSModuleCache, jSBlocksContainerProvider, jSControllerConfig);
    }

    public abstract StatusOr executeFfiFunction(String str, String str2, byte[] bArr);

    public abstract void executeFunction(byte[] bArr, byte[] bArr2, byte[] bArr3, ByteStore byteStore, JSCommandResolver jSCommandResolver, JSFutureHandler jSFutureHandler);

    public abstract Status executePreloadInstruction(byte[] bArr);

    public abstract void prewarmExecutor();

    public abstract void registerControllerInitializer(String str, JSControllerInitializer jSControllerInitializer);

    public abstract void registerFunctionBinding(int i, JSFunctionBinding jSFunctionBinding);

    public abstract void registerStateUpdateHandler(String str, JSStateUpdateHandler jSStateUpdateHandler);

    public abstract void setPreloader(ResourcePreloader resourcePreloader);

    public abstract Status unregisterControllerInitializer(String str);

    public abstract Status unregisterStateUpdateHandler(String str);
}
