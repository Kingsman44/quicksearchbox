package com.google.assistant.p3803ag.p3809c;

/* renamed from: com.google.assistant.ag.c.da */
/* compiled from: PG */
public final class C49008da {
    /* renamed from: a */
    public static /* synthetic */ String m85341a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "INTERVAL_NOT_SET" : "LOCAL_INTERVAL" : "LOCAL_DATE_TIME" : "WITHIN_DAY_INTERVAL" : "ABSOLUTE_INTERVAL";
    }

    /* renamed from: b */
    public static int m85342b(int i) {
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }
}
