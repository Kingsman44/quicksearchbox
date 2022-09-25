package com.google.protos.youtube.elements;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.protos.youtube.elements.ca */
/* compiled from: PG */
public enum C66156ca implements C62957cd {
    DYNAMIC_PROP_TYPE_UNKNOWN(0),
    DYNAMIC_PROP_TYPE_BACKGROUND_COLOR(1),
    DYNAMIC_PROP_TYPE_ALPHA(2),
    DYNAMIC_PROP_TYPE_TRANSLATION_X(3),
    DYNAMIC_PROP_TYPE_TRANSLATION_Y(4),
    DYNAMIC_PROP_TYPE_SCALE(5),
    DYNAMIC_PROP_TYPE_ROTATION(6);
    

    /* renamed from: h */
    private final int f179893h;

    private C66156ca(int i) {
        this.f179893h = i;
    }

    public final int getNumber() {
        return this.f179893h;
    }

    public final String toString() {
        return Integer.toString(this.f179893h);
    }
}
