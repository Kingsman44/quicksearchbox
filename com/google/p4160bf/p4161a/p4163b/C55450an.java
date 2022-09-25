package com.google.p4160bf.p4161a.p4163b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bf.a.b.an */
/* compiled from: PG */
public enum C55450an implements C62957cd {
    UNKNOWN(0),
    DELIVERED_FCM_PUSH(1),
    SCHEDULED_RECEIVER(2),
    FETCHED_LATEST_THREADS(3),
    FETCHED_UPDATED_THREADS(4),
    LOCAL_NOTIFICATION_CREATED(5),
    LOCAL_NOTIFICATION_UPDATED(6);
    

    /* renamed from: h */
    public final int f146295h;

    private C55450an(int i) {
        this.f146295h = i;
    }

    /* renamed from: a */
    public static C55450an m87692a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return DELIVERED_FCM_PUSH;
            case 2:
                return SCHEDULED_RECEIVER;
            case 3:
                return FETCHED_LATEST_THREADS;
            case 4:
                return FETCHED_UPDATED_THREADS;
            case 5:
                return LOCAL_NOTIFICATION_CREATED;
            case 6:
                return LOCAL_NOTIFICATION_UPDATED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87693b() {
        return C55449am.f146286a;
    }

    public final int getNumber() {
        return this.f146295h;
    }

    public final String toString() {
        return Integer.toString(this.f146295h);
    }
}
