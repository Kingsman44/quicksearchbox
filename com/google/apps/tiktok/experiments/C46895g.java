package com.google.apps.tiktok.experiments;

/* renamed from: com.google.apps.tiktok.experiments.g */
/* compiled from: PG */
public enum C46895g {
    LONG_VALUE,
    BOOLEAN_VALUE,
    DOUBLE_VALUE,
    STRING_VALUE,
    BYTES_VALUE,
    PROTO_VALUE,
    FLAGVALUE_NOT_SET;

    /* renamed from: a */
    public static C46895g m83534a(int i) {
        switch (i) {
            case 0:
                return FLAGVALUE_NOT_SET;
            case 1:
                return LONG_VALUE;
            case 2:
                return BOOLEAN_VALUE;
            case 3:
                return DOUBLE_VALUE;
            case 4:
                return STRING_VALUE;
            case 5:
                return BYTES_VALUE;
            case 6:
                return PROTO_VALUE;
            default:
                return null;
        }
    }
}
