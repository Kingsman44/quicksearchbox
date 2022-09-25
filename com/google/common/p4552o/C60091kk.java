package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.kk */
/* compiled from: PG */
public enum C60091kk implements C62957cd {
    HOTWORD_EVENT_UNKNOWN(0),
    HOTWORD_RECOGNIZED_FIRST_STAGE(1),
    HOTWORD_SECOND_STAGE_OFFSET(2),
    HOTWORD_RECOGNIZED_SECOND_STAGE(3),
    HOTWORD_SECOND_STAGE_NOT_DETECTED(9),
    HOTWORD_DATA_TRANSFERRED(4),
    HOTWORD_QUERY_STARTED(5),
    HOTWORD_QUERY_RESPONSE_RECEIVED(6),
    HOTWORD_VOICEINFO_RECEIVED(7),
    HOTWORD_AUDIO_VOICE_STOP(8),
    HOTWORD_DATA_INTERRUPTED(10),
    HOTWORD_ERROR_CLOSING(11),
    HOTWORD_ERROR_OPENING(12),
    HOTWORD_TIMEOUT_CACHING(13),
    HOTWORD_TIMEOUT_CLOSING(14),
    HOTWORD_TIMEOUT_CLOSED(15),
    HOTWORD_FRAMEWORK_EXCEPTION(16),
    HOTWORD_TIMEOUT_OPENING(17);
    

    /* renamed from: s */
    public final int f162478s;

    private C60091kk(int i) {
        this.f162478s = i;
    }

    /* renamed from: a */
    public static C60091kk m92523a(int i) {
        switch (i) {
            case 0:
                return HOTWORD_EVENT_UNKNOWN;
            case 1:
                return HOTWORD_RECOGNIZED_FIRST_STAGE;
            case 2:
                return HOTWORD_SECOND_STAGE_OFFSET;
            case 3:
                return HOTWORD_RECOGNIZED_SECOND_STAGE;
            case 4:
                return HOTWORD_DATA_TRANSFERRED;
            case 5:
                return HOTWORD_QUERY_STARTED;
            case 6:
                return HOTWORD_QUERY_RESPONSE_RECEIVED;
            case 7:
                return HOTWORD_VOICEINFO_RECEIVED;
            case 8:
                return HOTWORD_AUDIO_VOICE_STOP;
            case 9:
                return HOTWORD_SECOND_STAGE_NOT_DETECTED;
            case 10:
                return HOTWORD_DATA_INTERRUPTED;
            case 11:
                return HOTWORD_ERROR_CLOSING;
            case 12:
                return HOTWORD_ERROR_OPENING;
            case 13:
                return HOTWORD_TIMEOUT_CACHING;
            case 14:
                return HOTWORD_TIMEOUT_CLOSING;
            case 15:
                return HOTWORD_TIMEOUT_CLOSED;
            case 16:
                return HOTWORD_FRAMEWORK_EXCEPTION;
            case 17:
                return HOTWORD_TIMEOUT_OPENING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92524b() {
        return C60090kj.f162458a;
    }

    public final int getNumber() {
        return this.f162478s;
    }

    public final String toString() {
        return Integer.toString(this.f162478s);
    }
}
