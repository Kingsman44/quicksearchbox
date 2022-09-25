package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fy */
/* compiled from: PG */
public enum C82936fy implements C62957cd {
    UNKNOWN_TYPE(0),
    CREATE(1),
    CONNECT(2),
    START(3),
    STOP(4),
    DISCONNECT(5),
    UPDATE(6);
    

    /* renamed from: h */
    public final int f226272h;

    private C82936fy(int i) {
        this.f226272h = i;
    }

    /* renamed from: a */
    public static C82936fy m132431a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return CREATE;
            case 2:
                return CONNECT;
            case 3:
                return START;
            case 4:
                return STOP;
            case 5:
                return DISCONNECT;
            case 6:
                return UPDATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m132432b() {
        return C82935fx.f226263a;
    }

    public final int getNumber() {
        return this.f226272h;
    }

    public final String toString() {
        return Integer.toString(this.f226272h);
    }
}
