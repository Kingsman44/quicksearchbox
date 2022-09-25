package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.at */
/* compiled from: PG */
public enum C11689at implements C62957cd {
    KEY_UNKNOWN_SETTING(0),
    KEY_HOTWORD_ENABLED(1),
    KEY_OPA_ENABLED(2),
    KEY_CURRENT_ACCOUNT_NAME(3),
    KEY_OPA_PRIMARY_LANGUAGE(4),
    KEY_RAIL_INVOKED_MEDIA_REC_ENABLED(5),
    KEY_TRANSCRIPTION_ENABLED(6),
    KEY_DIRECT_REPLY_ENABLED(7),
    KEY_PROACTIVE_READ_MESSAGE_SUPPORTED(8);
    

    /* renamed from: j */
    public final int f37699j;

    private C11689at(int i) {
        this.f37699j = i;
    }

    /* renamed from: a */
    public static C11689at m27357a(int i) {
        switch (i) {
            case 0:
                return KEY_UNKNOWN_SETTING;
            case 1:
                return KEY_HOTWORD_ENABLED;
            case 2:
                return KEY_OPA_ENABLED;
            case 3:
                return KEY_CURRENT_ACCOUNT_NAME;
            case 4:
                return KEY_OPA_PRIMARY_LANGUAGE;
            case 5:
                return KEY_RAIL_INVOKED_MEDIA_REC_ENABLED;
            case 6:
                return KEY_TRANSCRIPTION_ENABLED;
            case 7:
                return KEY_DIRECT_REPLY_ENABLED;
            case 8:
                return KEY_PROACTIVE_READ_MESSAGE_SUPPORTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m27358b() {
        return C11688as.f37688a;
    }

    public final int getNumber() {
        return this.f37699j;
    }

    public final String toString() {
        return Integer.toString(this.f37699j);
    }
}
