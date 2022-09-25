package com.google.android.apps.gsa.nga.engine.warmactions.p6255g;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.g.b */
/* compiled from: PG */
public enum C79570b implements C62957cd {
    CONTEXT_TYPE_UNSPECIFIED(0),
    ALARM(1),
    TIMER(2),
    CALL(3),
    NOTIFICATION(4),
    KEYBOARD(5),
    TTS(6),
    CALL_CONTACT(7),
    CALL_NUMBER(8),
    GRPC(9),
    SYSUI_NOTIFICATION(10),
    MEDIA(11),
    CALL_CONTACT_V2(12),
    CALL_NUMBER_V2(13);
    

    /* renamed from: o */
    public final int f218339o;

    private C79570b(int i) {
        this.f218339o = i;
    }

    /* renamed from: a */
    public static C79570b m127648a(int i) {
        switch (i) {
            case 0:
                return CONTEXT_TYPE_UNSPECIFIED;
            case 1:
                return ALARM;
            case 2:
                return TIMER;
            case 3:
                return CALL;
            case 4:
                return NOTIFICATION;
            case 5:
                return KEYBOARD;
            case 6:
                return TTS;
            case 7:
                return CALL_CONTACT;
            case 8:
                return CALL_NUMBER;
            case 9:
                return GRPC;
            case 10:
                return SYSUI_NOTIFICATION;
            case 11:
                return MEDIA;
            case 12:
                return CALL_CONTACT_V2;
            case 13:
                return CALL_NUMBER_V2;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m127649b() {
        return C79567a.f218308a;
    }

    public final int getNumber() {
        return this.f218339o;
    }

    public final String toString() {
        return Integer.toString(this.f218339o);
    }
}
