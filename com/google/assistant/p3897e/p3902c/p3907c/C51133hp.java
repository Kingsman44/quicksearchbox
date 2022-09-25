package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.c.c.hp */
/* compiled from: PG */
public enum C51133hp implements C62957cd {
    DEFAULT(0),
    NGA_INPUT_PLATE(1),
    CONVERSATION_STARTERS(4),
    QUICK_ACTIONS(2),
    TACTILE_ASSISTANT_SUGGESTS(3),
    TACTILE_MY_ACTIONS(5),
    TRY_SAYING(7),
    RICH_SUGGESTIONS(8);
    

    /* renamed from: i */
    public final int f133102i;

    private C51133hp(int i) {
        this.f133102i = i;
    }

    /* renamed from: a */
    public static C51133hp m86035a(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return NGA_INPUT_PLATE;
            case 2:
                return QUICK_ACTIONS;
            case 3:
                return TACTILE_ASSISTANT_SUGGESTS;
            case 4:
                return CONVERSATION_STARTERS;
            case 5:
                return TACTILE_MY_ACTIONS;
            case 7:
                return TRY_SAYING;
            case 8:
                return RICH_SUGGESTIONS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86036b() {
        return C51132ho.f133092a;
    }

    public final int getNumber() {
        return this.f133102i;
    }

    public final String toString() {
        return Integer.toString(this.f133102i);
    }
}
