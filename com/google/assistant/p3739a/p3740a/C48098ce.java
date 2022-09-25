package com.google.assistant.p3739a.p3740a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.assistant.a.a.ce */
/* compiled from: PG */
public enum C48098ce implements C62957cd {
    ASSISTANT_ERROR_CODE_UNSPECIFIED(0),
    QUERY_FAILED(1),
    NO_SPEECH(2),
    UNEXPECTED_AUDIO(3),
    UNSUPPORTED_CONFIG(4),
    TIMEOUT(5),
    OFFLINE(6),
    ASSISTANT_NOT_ENABLED(7),
    INVALID_S3_REQUEST(8),
    ARBITRATION_LOSS(9),
    UNEXPECTED_SODA_EVENT(10),
    ACCESSORY_UPGRADE_REQUIRED(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: n */
    private final int f124489n;

    private C48098ce(int i) {
        this.f124489n = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f124489n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
