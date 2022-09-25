package com.google.p4184bj.p4193c.p4197c;

/* renamed from: com.google.bj.c.c.av */
/* compiled from: PG */
public enum C55948av {
    SINGLE_SETTING_UI_DESCRIPTION,
    UI_NOT_AVAILABLE_REASON,
    UIDESCRIPTION_NOT_SET;

    /* renamed from: a */
    public static C55948av m87865a(int i) {
        if (i == 0) {
            return UIDESCRIPTION_NOT_SET;
        }
        if (i == 1) {
            return SINGLE_SETTING_UI_DESCRIPTION;
        }
        if (i != 2) {
            return null;
        }
        return UI_NOT_AVAILABLE_REASON;
    }
}
