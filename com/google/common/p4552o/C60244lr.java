package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.lr */
/* compiled from: PG */
public enum C60244lr implements C62957cd {
    UNKNOWN_FAILURE_TYPE(0),
    SPLIT_NAME_AND_MESSAGE(1),
    GET_NAME_FROM_CONTACT_URIS(2),
    NO_EXTRA_TITLE_OR_EXTRA_TEXT(3),
    NO_TICKER_TEXT(4),
    NO_EVENT_START_TIME(5);
    

    /* renamed from: g */
    public final int f163012g;

    private C60244lr(int i) {
        this.f163012g = i;
    }

    /* renamed from: a */
    public static C60244lr m92553a(int i) {
        if (i == 0) {
            return UNKNOWN_FAILURE_TYPE;
        }
        if (i == 1) {
            return SPLIT_NAME_AND_MESSAGE;
        }
        if (i == 2) {
            return GET_NAME_FROM_CONTACT_URIS;
        }
        if (i == 3) {
            return NO_EXTRA_TITLE_OR_EXTRA_TEXT;
        }
        if (i == 4) {
            return NO_TICKER_TEXT;
        }
        if (i != 5) {
            return null;
        }
        return NO_EVENT_START_TIME;
    }

    /* renamed from: b */
    public static C62959cf m92554b() {
        return C60243lq.f163004a;
    }

    public final int getNumber() {
        return this.f163012g;
    }

    public final String toString() {
        return Integer.toString(this.f163012g);
    }
}
