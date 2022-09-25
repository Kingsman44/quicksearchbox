package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.a.i */
/* compiled from: PG */
public enum C112142i implements C62957cd {
    UNSPECIFIED_DIMENSION(0),
    URI(1),
    KG_ENTITY(3),
    APP_PACKAGE(4),
    DISPLAY_TEXT(5),
    CONTACT_ID(6),
    ACTION_FULFILLMENT(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: i */
    private final int f311412i;

    private C112142i(int i) {
        this.f311412i = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f311412i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
