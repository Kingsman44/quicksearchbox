package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.d.c.c.j */
/* compiled from: PG */
public enum C17908j implements C62957cd {
    UNKNOWN(0),
    VOICE_PLATE_OPENED(1),
    VOICE_PLATE_CLOSED(2),
    VOICE_PLATE_STATE_CHANGED(3),
    RECEIVED_SUGGESTIONS(4),
    RECEIVED_MDD_METADATA(5),
    ASSISTANT_CONNECTION_LOST(6),
    ASSISTANT_CONVERSATION_STATE_CHANGED(7),
    REQUEST_DISMISS_KEYGUARD(8),
    NAVIGATION_STATE_CHANGE_COMPLETE(9),
    UNBIND_CALLBACK_SERVICE(100);
    

    /* renamed from: l */
    public final int f51313l;

    private C17908j(int i) {
        this.f51313l = i;
    }

    /* renamed from: a */
    public static C17908j m35107a(int i) {
        if (i == 100) {
            return UNBIND_CALLBACK_SERVICE;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return VOICE_PLATE_OPENED;
            case 2:
                return VOICE_PLATE_CLOSED;
            case 3:
                return VOICE_PLATE_STATE_CHANGED;
            case 4:
                return RECEIVED_SUGGESTIONS;
            case 5:
                return RECEIVED_MDD_METADATA;
            case 6:
                return ASSISTANT_CONNECTION_LOST;
            case 7:
                return ASSISTANT_CONVERSATION_STATE_CHANGED;
            case 8:
                return REQUEST_DISMISS_KEYGUARD;
            case 9:
                return NAVIGATION_STATE_CHANGE_COMPLETE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m35108b() {
        return C17907i.f51300a;
    }

    public final int getNumber() {
        return this.f51313l;
    }

    public final String toString() {
        return Integer.toString(this.f51313l);
    }
}
