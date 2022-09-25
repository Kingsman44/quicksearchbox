package com.google.p5189s.p5190a.p5191a.p5192a.p5193a.p5194a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.s.a.a.a.a.a.b */
/* compiled from: PG */
public enum C66419b implements C62957cd {
    UNKNOWN(0),
    FAKE_APP(1),
    AGSA_STARTUP(2),
    DISCOVER(3),
    TEST(4),
    ASSISTANT_LITE(5);
    

    /* renamed from: g */
    public final int f180604g;

    private C66419b(int i) {
        this.f180604g = i;
    }

    /* renamed from: a */
    public static C66419b m97202a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FAKE_APP;
        }
        if (i == 2) {
            return AGSA_STARTUP;
        }
        if (i == 3) {
            return DISCOVER;
        }
        if (i == 4) {
            return TEST;
        }
        if (i != 5) {
            return null;
        }
        return ASSISTANT_LITE;
    }

    /* renamed from: b */
    public static C62959cf m97203b() {
        return C66418a.f180596a;
    }

    public final int getNumber() {
        return this.f180604g;
    }

    public final String toString() {
        return Integer.toString(this.f180604g);
    }
}
