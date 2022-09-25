package com.google.research.p5181a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.research.a.p */
/* compiled from: PG */
public enum C66387p implements C62957cd {
    UNKNOWN(0),
    HOME(1),
    WORK(2),
    LOCAL(3),
    TRAVEL(4),
    TRIP(5),
    TRIP_STAY(6),
    COMMUTE_HOME_TO_WORK(7),
    COMMUTE_WORK_TO_HOME(8),
    FLIGHT_TAKEOFF(9),
    FLIGHT_LANDING(10),
    EXITING_VEHICLE(11);
    

    /* renamed from: m */
    public final int f180519m;

    private C66387p(int i) {
        this.f180519m = i;
    }

    /* renamed from: a */
    public static C66387p m97185a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return HOME;
            case 2:
                return WORK;
            case 3:
                return LOCAL;
            case 4:
                return TRAVEL;
            case 5:
                return TRIP;
            case 6:
                return TRIP_STAY;
            case 7:
                return COMMUTE_HOME_TO_WORK;
            case 8:
                return COMMUTE_WORK_TO_HOME;
            case 9:
                return FLIGHT_TAKEOFF;
            case 10:
                return FLIGHT_LANDING;
            case 11:
                return EXITING_VEHICLE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m97186b() {
        return C66386o.f180505a;
    }

    public final int getNumber() {
        return this.f180519m;
    }

    public final String toString() {
        return Integer.toString(this.f180519m);
    }
}
