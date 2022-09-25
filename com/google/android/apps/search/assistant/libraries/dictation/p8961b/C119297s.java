package com.google.android.apps.search.assistant.libraries.dictation.p8961b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.libraries.dictation.b.s */
/* compiled from: PG */
public enum C119297s implements C62957cd {
    REQUESTER_UNKNOWN(0),
    REQUESTER_KEYBOARD_MIC_BUTTON(1),
    REQUESTER_KEYBOARD_ONBOARDING_HEADER(8),
    REQUESTER_ASSISTANT_VS(2),
    REQUESTER_ASSISTANT_VR(3),
    REQUESTER_HEY_G_TYPE(9),
    REQUESTER_ASSISTANT_CLIENT_OP(5),
    REQUESTER_DICTATION_VOICE_COMMAND(6),
    REQUESTER_CONNECTION_SHUTDOWN(7),
    REQUESTER_ASSISTANT_UNKNOWN(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: l */
    private final int f332669l;

    private C119297s(int i) {
        this.f332669l = i;
    }

    /* renamed from: a */
    public static C119297s m197993a(int i) {
        switch (i) {
            case 0:
                return REQUESTER_UNKNOWN;
            case 1:
                return REQUESTER_KEYBOARD_MIC_BUTTON;
            case 2:
                return REQUESTER_ASSISTANT_VS;
            case 3:
                return REQUESTER_ASSISTANT_VR;
            case 4:
                return REQUESTER_ASSISTANT_UNKNOWN;
            case 5:
                return REQUESTER_ASSISTANT_CLIENT_OP;
            case 6:
                return REQUESTER_DICTATION_VOICE_COMMAND;
            case 7:
                return REQUESTER_CONNECTION_SHUTDOWN;
            case 8:
                return REQUESTER_KEYBOARD_ONBOARDING_HEADER;
            case 9:
                return REQUESTER_HEY_G_TYPE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m197994b() {
        return C119296r.f332656a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f332669l;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
