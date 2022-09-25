package com.google.android.libraries.elements.interfaces;

/* compiled from: PG */
public final class JSControllerConfig {
    public static final int DEFAULT_VM_CONTEXT_LRU_SIZE = 5;
    final boolean enableDedicatedJsVmThread;
    final boolean enableVmContextLru;
    final JSControllerInitializationMode initializationMode;
    final int jsEngineSelection;
    final boolean shouldLockVmIsolate;
    final boolean shouldUseDirectJsObjectCreation;
    final boolean skipLegacyFunctionBindings;
    final int vmContextLruSize;

    public JSControllerConfig(JSControllerInitializationMode jSControllerInitializationMode, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5, int i2) {
        this.initializationMode = jSControllerInitializationMode;
        this.enableVmContextLru = z;
        this.vmContextLruSize = i;
        this.shouldLockVmIsolate = z2;
        this.shouldUseDirectJsObjectCreation = z3;
        this.skipLegacyFunctionBindings = z4;
        this.enableDedicatedJsVmThread = z5;
        this.jsEngineSelection = i2;
    }

    public boolean getEnableDedicatedJsVmThread() {
        return this.enableDedicatedJsVmThread;
    }

    public boolean getEnableVmContextLru() {
        return this.enableVmContextLru;
    }

    public JSControllerInitializationMode getInitializationMode() {
        return this.initializationMode;
    }

    public int getJsEngineSelection() {
        return this.jsEngineSelection;
    }

    public boolean getShouldLockVmIsolate() {
        return this.shouldLockVmIsolate;
    }

    public boolean getShouldUseDirectJsObjectCreation() {
        return this.shouldUseDirectJsObjectCreation;
    }

    public boolean getSkipLegacyFunctionBindings() {
        return this.skipLegacyFunctionBindings;
    }

    public int getVmContextLruSize() {
        return this.vmContextLruSize;
    }

    public String toString() {
        String valueOf = String.valueOf(this.initializationMode);
        boolean z = this.enableVmContextLru;
        int i = this.vmContextLruSize;
        boolean z2 = this.shouldLockVmIsolate;
        boolean z3 = this.shouldUseDirectJsObjectCreation;
        boolean z4 = this.skipLegacyFunctionBindings;
        boolean z5 = this.enableDedicatedJsVmThread;
        int i2 = this.jsEngineSelection;
        return "JSControllerConfig{initializationMode=" + valueOf + ",enableVmContextLru=" + z + ",vmContextLruSize=" + i + ",shouldLockVmIsolate=" + z2 + ",shouldUseDirectJsObjectCreation=" + z3 + ",skipLegacyFunctionBindings=" + z4 + ",enableDedicatedJsVmThread=" + z5 + ",jsEngineSelection=" + i2 + "}";
    }
}
