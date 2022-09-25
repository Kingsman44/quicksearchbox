package com.google.android.apps.gsa.nga.shared.p6309ag;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.nga.shared.ag.v */
/* compiled from: PG */
public enum C80627v implements C62957cd {
    GROUP_ID_UNSPECIFIED(0),
    TELEPORT(1),
    QUERY_DEEP_LINKS(2),
    GENIE_FM(3),
    SODA(4),
    APP_ACTIONS(6),
    WEBREF(7),
    TCLIB(8),
    INTENTS(11),
    CANTEEN(12),
    SKIP_COMPONENT_LIST(15),
    DICTATION_FORMATTING(17),
    CORTEX(18),
    SAFT_SEGMENTER(20),
    SOT_CONFIGS(22),
    TCLIB_PERSON_NAME(23),
    POP(25),
    CORRECTIONS_ALTERNATIVES(27),
    WARMACTIONS(28),
    CONTACT_NAMES(29),
    TACTILE(30),
    LIGHTWEIGHT_TOKENS(31),
    NEURAL_MATCHING_ENCODER(32),
    BLOCK_WORDS(33),
    UNRECOGNIZED(-1);
    

    /* renamed from: z */
    private final int f221366z;

    private C80627v(int i) {
        this.f221366z = i;
    }

    /* renamed from: a */
    public static C80627v m128255a(int i) {
        switch (i) {
            case 0:
                return GROUP_ID_UNSPECIFIED;
            case 1:
                return TELEPORT;
            case 2:
                return QUERY_DEEP_LINKS;
            case 3:
                return GENIE_FM;
            case 4:
                return SODA;
            case 6:
                return APP_ACTIONS;
            case 7:
                return WEBREF;
            case 8:
                return TCLIB;
            case 11:
                return INTENTS;
            case 12:
                return CANTEEN;
            case 15:
                return SKIP_COMPONENT_LIST;
            case 17:
                return DICTATION_FORMATTING;
            case 18:
                return CORTEX;
            case 20:
                return SAFT_SEGMENTER;
            case 22:
                return SOT_CONFIGS;
            case 23:
                return TCLIB_PERSON_NAME;
            case 25:
                return POP;
            case 27:
                return CORRECTIONS_ALTERNATIVES;
            case 28:
                return WARMACTIONS;
            case 29:
                return CONTACT_NAMES;
            case 30:
                return TACTILE;
            case 31:
                return LIGHTWEIGHT_TOKENS;
            case 32:
                return NEURAL_MATCHING_ENCODER;
            case 33:
                return BLOCK_WORDS;
            default:
                return null;
        }
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f221366z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
