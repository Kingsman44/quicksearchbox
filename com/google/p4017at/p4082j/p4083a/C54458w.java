package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.at.j.a.w */
/* compiled from: PG */
public enum C54458w implements C62957cd {
    EPISODE_REACTION_TYPE_UNSET(0),
    EPISODE_CLEAR(1),
    EPISODE_RECOMMEND_MORE(2),
    EPISODE_RECOMMEND_LESS(3),
    EPISODE_HIDE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g */
    private final int f143003g;

    private C54458w(int i) {
        this.f143003g = i;
    }

    /* renamed from: a */
    public static C54458w m87383a(int i) {
        if (i == 0) {
            return EPISODE_REACTION_TYPE_UNSET;
        }
        if (i == 1) {
            return EPISODE_CLEAR;
        }
        if (i == 2) {
            return EPISODE_RECOMMEND_MORE;
        }
        if (i == 3) {
            return EPISODE_RECOMMEND_LESS;
        }
        if (i != 4) {
            return null;
        }
        return EPISODE_HIDE;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f143003g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final String toString() {
        return Integer.toString(getNumber());
    }
}
