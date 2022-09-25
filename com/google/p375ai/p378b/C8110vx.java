package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.vx */
/* compiled from: PG */
public enum C8110vx implements C62957cd {
    BASKETBALL(0),
    FOOTBALL(1),
    BASEBALL(2),
    HOCKEY(3),
    SOCCER(4),
    RUGBY(5),
    CRICKET(6),
    TENNIS(7),
    AUSTRALIAN_FOOTBALL(8),
    UNKNOWN_SPORT(9),
    ESPORTS(10);
    

    /* renamed from: l */
    public final int f28524l;

    private C8110vx(int i) {
        this.f28524l = i;
    }

    /* renamed from: a */
    public static C8110vx m22949a(int i) {
        switch (i) {
            case 0:
                return BASKETBALL;
            case 1:
                return FOOTBALL;
            case 2:
                return BASEBALL;
            case 3:
                return HOCKEY;
            case 4:
                return SOCCER;
            case 5:
                return RUGBY;
            case 6:
                return CRICKET;
            case 7:
                return TENNIS;
            case 8:
                return AUSTRALIAN_FOOTBALL;
            case 9:
                return UNKNOWN_SPORT;
            case 10:
                return ESPORTS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22950b() {
        return C8109vw.f28511a;
    }

    public final int getNumber() {
        return this.f28524l;
    }

    public final String toString() {
        return Integer.toString(this.f28524l);
    }
}
