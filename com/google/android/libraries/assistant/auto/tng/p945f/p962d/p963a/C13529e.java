package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.e */
/* compiled from: PG */
public enum C13529e implements C62957cd {
    UNKNOWN_TYPE(0),
    TEXT_REPLY(1),
    EMOJI_REPLY(5),
    SHARE_ETA(4),
    SHARE_LOCATION(2),
    NAVIGATE(8),
    CALL_SENDER(6),
    CALL_NUMBER(7),
    UNRECOGNIZED(-1);
    

    /* renamed from: j */
    private final int f41473j;

    private C13529e(int i) {
        this.f41473j = i;
    }

    /* renamed from: a */
    public static C13529e m29814a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TYPE;
            case 1:
                return TEXT_REPLY;
            case 2:
                return SHARE_LOCATION;
            case 4:
                return SHARE_ETA;
            case 5:
                return EMOJI_REPLY;
            case 6:
                return CALL_SENDER;
            case 7:
                return CALL_NUMBER;
            case 8:
                return NAVIGATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m29815b() {
        return C13497d.f41405a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f41473j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
