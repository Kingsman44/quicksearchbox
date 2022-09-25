package com.google.p4242bp.p4267h.p4268a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bp.h.a.r */
/* compiled from: PG */
public enum C56385r implements C62957cd {
    NONE(0),
    ADD_ONLY_TIMEOUT_PROMPTS_AS_SERVER_PROMPT(10),
    CLEAR_ALL_PROMPTS(1),
    CLEAR_ALL_DISPLAY_PROMPTS(2),
    CLEAR_ALL_VOCAL_PROMPTS(3),
    CLEAR_INTERACTION_FOR_MODULAR_ANSWER(9),
    CLEAR_NON_FOLLOW_ON_VOCAL_PROMPTS(5),
    INCLUDE_SERVER_SIDE_TIMEOUT_PROMPTS(6),
    STOP_ALL_INTERACTIONS(4),
    SYSTEM_SERVE_RESOURCE_SET_SERVER_PROMPT(7),
    SYSTEM_SERVE_TIMEOUT_SERVER_PROMPT(8);
    

    /* renamed from: l */
    private final int f150372l;

    private C56385r(int i) {
        this.f150372l = i;
    }

    /* renamed from: a */
    public static C56385r m87982a(int i) {
        switch (i) {
            case 0:
                return NONE;
            case 1:
                return CLEAR_ALL_PROMPTS;
            case 2:
                return CLEAR_ALL_DISPLAY_PROMPTS;
            case 3:
                return CLEAR_ALL_VOCAL_PROMPTS;
            case 4:
                return STOP_ALL_INTERACTIONS;
            case 5:
                return CLEAR_NON_FOLLOW_ON_VOCAL_PROMPTS;
            case 6:
                return INCLUDE_SERVER_SIDE_TIMEOUT_PROMPTS;
            case 7:
                return SYSTEM_SERVE_RESOURCE_SET_SERVER_PROMPT;
            case 8:
                return SYSTEM_SERVE_TIMEOUT_SERVER_PROMPT;
            case 9:
                return CLEAR_INTERACTION_FOR_MODULAR_ANSWER;
            case 10:
                return ADD_ONLY_TIMEOUT_PROMPTS_AS_SERVER_PROMPT;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87983b() {
        return C56384q.f150359a;
    }

    public final int getNumber() {
        return this.f150372l;
    }

    public final String toString() {
        return Integer.toString(this.f150372l);
    }
}
