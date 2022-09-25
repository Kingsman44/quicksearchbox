package com.google.android.libraries.notifications;

/* renamed from: com.google.android.libraries.notifications.f */
/* compiled from: PG */
public enum C29986f {
    UNKNOWN_STATUS(0),
    REGISTERED(1),
    PENDING_REGISTRATION(2),
    FAILED_REGISTRATION(3),
    UNREGISTERED(4),
    PENDING_UNREGISTRATION(5),
    FAILED_UNREGISTRATION(6);
    

    /* renamed from: h */
    public final int f81193h;

    private C29986f(int i) {
        this.f81193h = i;
    }

    /* renamed from: a */
    public static C29986f m55599a(int i) {
        switch (i) {
            case 1:
                return REGISTERED;
            case 2:
                return PENDING_REGISTRATION;
            case 3:
                return FAILED_REGISTRATION;
            case 4:
                return UNREGISTERED;
            case 5:
                return PENDING_UNREGISTRATION;
            case 6:
                return FAILED_UNREGISTRATION;
            default:
                return UNKNOWN_STATUS;
        }
    }
}
