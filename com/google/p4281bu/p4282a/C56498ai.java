package com.google.p4281bu.p4282a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.bu.a.ai */
/* compiled from: PG */
public enum C56498ai implements C62957cd {
    PROMPT_STYLE_UNKNOWN(0),
    PROMPT_STYLE_FIRST_CARD_NON_MODAL(1),
    PROMPT_STYLE_FIRST_CARD_MODAL(2),
    UNRECOGNIZED(-1);
    

    /* renamed from: e */
    private final int f150903e;

    private C56498ai(int i) {
        this.f150903e = i;
    }

    /* renamed from: a */
    public static C56498ai m88205a(int i) {
        if (i == 0) {
            return PROMPT_STYLE_UNKNOWN;
        }
        if (i == 1) {
            return PROMPT_STYLE_FIRST_CARD_NON_MODAL;
        }
        if (i != 2) {
            return null;
        }
        return PROMPT_STYLE_FIRST_CARD_MODAL;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f150903e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
