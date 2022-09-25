package com.google.android.libraries.assistant.p1533o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.android.libraries.assistant.o.ba */
/* compiled from: PG */
public enum C18465ba implements C62957cd {
    UNKNOWN(0),
    VOICE_QUERY_ALREADY_STARTED(1),
    VOICE_QUERY_NOT_STARTED(2),
    COMMAND_NOT_SET(3),
    SPEECH_NOT_RECOGNIZED(4),
    CONVERSATION_API_CONNECTING_FAILED(5),
    CONVERSATION_API_START_INTERACTION_FAILED(6),
    CONVERSATION_API_DISCONNECTED_WITH_ERROR(7),
    CONVERSATION_API_DISCONNECTING_FAILED_AFTER_ERROR(8);
    

    /* renamed from: j */
    public static final C62958ce f52401j = null;

    /* renamed from: k */
    private final int f52403k;

    static {
        f52401j = new C18463az();
    }

    private C18465ba(int i) {
        this.f52403k = i;
    }

    /* renamed from: a */
    public static C18465ba m35932a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return VOICE_QUERY_ALREADY_STARTED;
            case 2:
                return VOICE_QUERY_NOT_STARTED;
            case 3:
                return COMMAND_NOT_SET;
            case 4:
                return SPEECH_NOT_RECOGNIZED;
            case 5:
                return CONVERSATION_API_CONNECTING_FAILED;
            case 6:
                return CONVERSATION_API_START_INTERACTION_FAILED;
            case 7:
                return CONVERSATION_API_DISCONNECTED_WITH_ERROR;
            case 8:
                return CONVERSATION_API_DISCONNECTING_FAILED_AFTER_ERROR;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f52403k;
    }

    public final String toString() {
        return Integer.toString(this.f52403k);
    }
}
