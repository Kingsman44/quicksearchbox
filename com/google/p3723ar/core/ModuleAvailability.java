package com.google.p3723ar.core;

/* renamed from: com.google.ar.core.ModuleAvailability */
/* compiled from: PG */
public enum ModuleAvailability {
    SUPPORTED_INSTALLED(0),
    SUPPORTED_PENDING_IMMEDIATE_INSTALL(10),
    SUPPORTED_NOT_INSTALLED(11),
    SUPPORTED_PENDING_DEFERRED_INSTALL(20),
    UNKNOWN_ERROR(50);
    
    final int nativeCode;

    private ModuleAvailability(int i) {
        this.nativeCode = i;
    }

    static ModuleAvailability forNumber(int i) {
        for (ModuleAvailability moduleAvailability : values()) {
            if (moduleAvailability.nativeCode == i) {
                return moduleAvailability;
            }
        }
        throw new IllegalArgumentException("Unexpected value for native ModuleAvailability, value=" + i);
    }
}
