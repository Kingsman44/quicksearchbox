package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.h */
/* compiled from: PG */
public enum C127050h implements C62957cd {
    UNSPECIFIED(0),
    KEYBOARD_OPENED(1),
    GLOW_CLICK(2),
    ASSISTANT_DISMISSED(3),
    CLIENT_OP_DISMISS_ASSISTANT(4),
    EXIT_INTERPRETER_MODE(5),
    EXIT_CANVAS(6),
    NEW_INTERACTION_START(7),
    FULL_LISTENING_TIMEOUT(8),
    EXECUTION_TIMEOUT(9),
    FINAL_RECOGNITION_CANDIDATE_TIMEOUT(10),
    MIC_NOT_OPENED_TIMEOUT(11),
    UNRECOGNIZED(-1);
    

    /* renamed from: n */
    private final int f349863n;

    private C127050h(int i) {
        this.f349863n = i;
    }

    /* renamed from: a */
    public static C127050h m207796a(int i) {
        switch (i) {
            case 0:
                return UNSPECIFIED;
            case 1:
                return KEYBOARD_OPENED;
            case 2:
                return GLOW_CLICK;
            case 3:
                return ASSISTANT_DISMISSED;
            case 4:
                return CLIENT_OP_DISMISS_ASSISTANT;
            case 5:
                return EXIT_INTERPRETER_MODE;
            case 6:
                return EXIT_CANVAS;
            case 7:
                return NEW_INTERACTION_START;
            case 8:
                return FULL_LISTENING_TIMEOUT;
            case 9:
                return EXECUTION_TIMEOUT;
            case 10:
                return FINAL_RECOGNITION_CANDIDATE_TIMEOUT;
            case 11:
                return MIC_NOT_OPENED_TIMEOUT;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f349863n;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
