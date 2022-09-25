package com.google.p4181bi;

/* renamed from: com.google.bi.ai */
/* compiled from: PG */
public enum C55799ai {
    EMAIL,
    PHONE,
    PROFILE_ID,
    ID_NOT_SET;

    /* renamed from: a */
    public static C55799ai m87736a(int i) {
        if (i == 0) {
            return ID_NOT_SET;
        }
        if (i == 1) {
            return EMAIL;
        }
        if (i == 2) {
            return PHONE;
        }
        if (i != 3) {
            return null;
        }
        return PROFILE_ID;
    }
}
