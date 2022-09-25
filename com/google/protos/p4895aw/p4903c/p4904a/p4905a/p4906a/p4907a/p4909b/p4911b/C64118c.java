package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4911b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.b.c */
/* compiled from: PG */
public enum C64118c implements C62957cd {
    CAPITALIZATION_UNKNOWN(0),
    CAPITALIZATION_NONE(1),
    CAPITALIZATION_BEGINNING_OF_SENTENCE(2),
    CAPITALIZATION_MIDDLE_OF_SENTENCE(3),
    CAPITALIZATION_STANDALONE(4),
    CAPITALIZATION_UI_LIST_OR_MENU(5);
    

    /* renamed from: g */
    public final int f173348g;

    private C64118c(int i) {
        this.f173348g = i;
    }

    /* renamed from: a */
    public static C64118c m96356a(int i) {
        if (i == 0) {
            return CAPITALIZATION_UNKNOWN;
        }
        if (i == 1) {
            return CAPITALIZATION_NONE;
        }
        if (i == 2) {
            return CAPITALIZATION_BEGINNING_OF_SENTENCE;
        }
        if (i == 3) {
            return CAPITALIZATION_MIDDLE_OF_SENTENCE;
        }
        if (i == 4) {
            return CAPITALIZATION_STANDALONE;
        }
        if (i != 5) {
            return null;
        }
        return CAPITALIZATION_UI_LIST_OR_MENU;
    }

    /* renamed from: b */
    public static C62959cf m96357b() {
        return C64117b.f173340a;
    }

    public final int getNumber() {
        return this.f173348g;
    }

    public final String toString() {
        return Integer.toString(this.f173348g);
    }
}
