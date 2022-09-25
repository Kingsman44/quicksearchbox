package com.google.assistant.p3861at;

/* renamed from: com.google.assistant.at.ro */
/* compiled from: PG */
public enum C50289ro {
    CAST_DEVICE_ID,
    HOME_GRAPH_DEVICE_ID,
    DEVICEID_NOT_SET;

    /* renamed from: a */
    public static C50289ro m85801a(int i) {
        if (i == 0) {
            return DEVICEID_NOT_SET;
        }
        if (i == 1) {
            return CAST_DEVICE_ID;
        }
        if (i != 2) {
            return null;
        }
        return HOME_GRAPH_DEVICE_ID;
    }
}
