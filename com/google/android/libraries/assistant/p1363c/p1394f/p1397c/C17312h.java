package com.google.android.libraries.assistant.p1363c.p1394f.p1397c;

/* renamed from: com.google.android.libraries.assistant.c.f.c.h */
/* compiled from: PG */
public enum C17312h {
    METADATA,
    S3_RESPONSE,
    REQUEST_NOT_SET;

    /* renamed from: a */
    public static C17312h m34531a(int i) {
        if (i == 0) {
            return REQUEST_NOT_SET;
        }
        if (i == 1) {
            return METADATA;
        }
        if (i != 2) {
            return null;
        }
        return S3_RESPONSE;
    }
}
