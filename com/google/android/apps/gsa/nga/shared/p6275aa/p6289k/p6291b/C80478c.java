package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.b.c */
/* compiled from: PG */
public enum C80478c implements C62957cd {
    UNKNOWN(0),
    ASR(1),
    SODA(2),
    SYSTEM(3),
    TEXT_QUERY(4),
    PROACTIVE(5),
    OPA_SUGGESTION(6),
    KEYBOARD_INPUT(8),
    S3(7),
    STASH_CHIP(9),
    KEYBOARD_DICTATION(10),
    WATCH_SUGGESTION(11),
    CONVERSATION_API(12),
    TITAN_VOICE_PLATE(13),
    UNRECOGNIZED(-1);
    

    /* renamed from: p */
    private final int f220902p;

    private C80478c(int i) {
        this.f220902p = i;
    }

    /* renamed from: a */
    public static C80478c m128173a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return ASR;
            case 2:
                return SODA;
            case 3:
                return SYSTEM;
            case 4:
                return TEXT_QUERY;
            case 5:
                return PROACTIVE;
            case 6:
                return OPA_SUGGESTION;
            case 7:
                return S3;
            case 8:
                return KEYBOARD_INPUT;
            case 9:
                return STASH_CHIP;
            case 10:
                return KEYBOARD_DICTATION;
            case 11:
                return WATCH_SUGGESTION;
            case 12:
                return CONVERSATION_API;
            case 13:
                return TITAN_VOICE_PLATE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m128174b() {
        return C80477b.f220885a;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f220902p;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
