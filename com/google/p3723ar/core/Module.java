package com.google.p3723ar.core;

/* renamed from: com.google.ar.core.Module */
/* compiled from: PG */
public enum Module {
    AUGMENTED_FACE_IMPROVED_LIP_EYE(0),
    NORMAL_NET(1),
    DEPTH_NET(2),
    FACE_MESH_ULTRALITE(3),
    DEEP_IO(4);
    
    final int nativeCode;

    private Module(int i) {
        this.nativeCode = i;
    }

    static Module forNumber(int i) {
        for (Module module : values()) {
            if (module.nativeCode == i) {
                return module;
            }
        }
        throw new IllegalArgumentException("Unexpected value for native Module, value=" + i);
    }
}
