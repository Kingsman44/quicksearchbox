package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fc */
/* compiled from: PG */
public enum C82914fc implements C62957cd {
    UNKNOWN(0),
    TTS_STARTED(1),
    TTS_ENDED(2),
    TTS_INFO(18),
    CONVERSATION_ONGOING(3),
    CONVERSATION_TERMINATED(4),
    OPEN_MIC(5),
    CONVERSATION_PARAMS_UPDATE(6),
    UI_ELEMENTS_UPDATE(7),
    CLIENT_CONVERSATION_DONE_EVENT_DATA(8),
    FLUID_ACTIONS_EVENT_DATA(9),
    QUERY_CANCELLED(10),
    CLIENT_DEACTIVATED_EVENT_DATA(11),
    CLOSE_MIC(12),
    NON_VOICE_INTERACTION(13),
    SHOW_SUGGESTIONS(14),
    CLIENT_INTERACTION_REQUEST(15),
    QUERY_FAILURE(16),
    CONTEXTUAL_CHIPS(17);
    

    /* renamed from: t */
    public final int f226203t;

    private C82914fc(int i) {
        this.f226203t = i;
    }

    /* renamed from: a */
    public static C82914fc m132426a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TTS_STARTED;
            case 2:
                return TTS_ENDED;
            case 3:
                return CONVERSATION_ONGOING;
            case 4:
                return CONVERSATION_TERMINATED;
            case 5:
                return OPEN_MIC;
            case 6:
                return CONVERSATION_PARAMS_UPDATE;
            case 7:
                return UI_ELEMENTS_UPDATE;
            case 8:
                return CLIENT_CONVERSATION_DONE_EVENT_DATA;
            case 9:
                return FLUID_ACTIONS_EVENT_DATA;
            case 10:
                return QUERY_CANCELLED;
            case 11:
                return CLIENT_DEACTIVATED_EVENT_DATA;
            case 12:
                return CLOSE_MIC;
            case 13:
                return NON_VOICE_INTERACTION;
            case 14:
                return SHOW_SUGGESTIONS;
            case 15:
                return CLIENT_INTERACTION_REQUEST;
            case 16:
                return QUERY_FAILURE;
            case 17:
                return CONTEXTUAL_CHIPS;
            case 18:
                return TTS_INFO;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m132427b() {
        return C82913fb.f226182a;
    }

    public final int getNumber() {
        return this.f226203t;
    }

    public final String toString() {
        return Integer.toString(this.f226203t);
    }
}
