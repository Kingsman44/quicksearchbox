package com.google.android.apps.search.assistant.platform.appintegration.grpc;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.grpc.aq */
/* compiled from: PG */
public enum C119597aq implements C62957cd {
    ID_UNKNOWN(0),
    ID_TIKTOK_DEVAPP(1),
    ID_STING_DEVAPP(2),
    ID_DAGGER_DEVAPP(3),
    ID_YOUTUBE(5);
    

    /* renamed from: f */
    public final int f333332f;

    private C119597aq(int i) {
        this.f333332f = i;
    }

    /* renamed from: a */
    public static C119597aq m198500a(int i) {
        if (i == 0) {
            return ID_UNKNOWN;
        }
        if (i == 1) {
            return ID_TIKTOK_DEVAPP;
        }
        if (i == 2) {
            return ID_STING_DEVAPP;
        }
        if (i == 3) {
            return ID_DAGGER_DEVAPP;
        }
        if (i != 5) {
            return null;
        }
        return ID_YOUTUBE;
    }

    /* renamed from: b */
    public static C62959cf m198501b() {
        return C119596ap.f333325a;
    }

    public final int getNumber() {
        return this.f333332f;
    }

    public final String toString() {
        return Integer.toString(this.f333332f);
    }
}
