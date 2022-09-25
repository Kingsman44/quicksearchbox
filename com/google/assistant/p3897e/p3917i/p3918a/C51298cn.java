package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.cn */
/* compiled from: PG */
public enum C51298cn implements C62957cd {
    UNSPECIFIED_PERMISSION(0),
    READ_CONTACTS(1),
    CALL_PHONE(2),
    CALL_PRIVILEGED(3),
    READ_CALL_LOG(4),
    SEND_SMS(5),
    BIND_NOTIFICATION_LISTENER_SERVICE(6),
    READ_SMS(7);
    

    /* renamed from: i */
    public final int f133543i;

    private C51298cn(int i) {
        this.f133543i = i;
    }

    /* renamed from: a */
    public static C51298cn m86110a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED_PERMISSION;
            case 1:
                return READ_CONTACTS;
            case 2:
                return CALL_PHONE;
            case 3:
                return CALL_PRIVILEGED;
            case 4:
                return READ_CALL_LOG;
            case 5:
                return SEND_SMS;
            case 6:
                return BIND_NOTIFICATION_LISTENER_SERVICE;
            case 7:
                return READ_SMS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86111b() {
        return C51297cm.f133533a;
    }

    public final int getNumber() {
        return this.f133543i;
    }

    public final String toString() {
        return Integer.toString(this.f133543i);
    }
}
