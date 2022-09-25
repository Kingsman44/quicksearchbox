package com.google.assistant.p3897e.p3912f;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.f.d */
/* compiled from: PG */
public enum C51209d implements C62957cd {
    UNKNOWN_SOURCE(0),
    CLICKED_SUGGESTION(1),
    TYPED(2),
    SPOKEN(3),
    DEVICE_AUTOMATED(4),
    SERVER_AUTOMATED(5),
    MIC_TIMEOUT(6),
    IMAGE_TAP(7),
    UI_CLICK(8),
    APP_INITIATED(9),
    SCHEDULED_ACTION(10),
    ROUTINE_ACTION(11),
    EVENT_INITIATED(12);
    

    /* renamed from: n */
    public final int f133323n;

    private C51209d(int i) {
        this.f133323n = i;
    }

    /* renamed from: a */
    public static C51209d m86086a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SOURCE;
            case 1:
                return CLICKED_SUGGESTION;
            case 2:
                return TYPED;
            case 3:
                return SPOKEN;
            case 4:
                return DEVICE_AUTOMATED;
            case 5:
                return SERVER_AUTOMATED;
            case 6:
                return MIC_TIMEOUT;
            case 7:
                return IMAGE_TAP;
            case 8:
                return UI_CLICK;
            case 9:
                return APP_INITIATED;
            case 10:
                return SCHEDULED_ACTION;
            case 11:
                return ROUTINE_ACTION;
            case 12:
                return EVENT_INITIATED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86087b() {
        return C51208c.f133308a;
    }

    public final int getNumber() {
        return this.f133323n;
    }

    public final String toString() {
        return Integer.toString(this.f133323n);
    }
}
