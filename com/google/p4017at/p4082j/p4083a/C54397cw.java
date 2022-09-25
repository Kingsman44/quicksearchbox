package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.at.j.a.cw */
/* compiled from: PG */
public enum C54397cw implements C62957cd {
    SHOW_REACTION_TYPE_UNSET(0),
    SHOW_CLEAR(1),
    SHOW_RECOMMEND_MORE(2),
    SHOW_RECOMMEND_LESS(3),
    SHOW_HIDE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f142881g;

    private C54397cw(int i) {
        this.f142881g = i;
    }

    /* renamed from: a */
    public static C54397cw m87374a(int i) {
        if (i == 0) {
            return SHOW_REACTION_TYPE_UNSET;
        }
        if (i == 1) {
            return SHOW_CLEAR;
        }
        if (i == 2) {
            return SHOW_RECOMMEND_MORE;
        }
        if (i == 3) {
            return SHOW_RECOMMEND_LESS;
        }
        if (i != 4) {
            return null;
        }
        return SHOW_HIDE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f142881g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
