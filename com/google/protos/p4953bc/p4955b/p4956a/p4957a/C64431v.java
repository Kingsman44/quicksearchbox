package com.google.protos.p4953bc.p4955b.p4956a.p4957a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.protos.bc.b.a.a.v */
/* compiled from: PG */
public enum C64431v implements C62957cd {
    UNKNOWN_CASE(0),
    CANCELED_CASE(1),
    REDIRECTED_CASE(2),
    DIVERTED_CASE(3),
    SCHEDULE_ONLY_CASE(4),
    SCHEDULED_STATUS_CASE(5),
    DEPARTING_ON_TIME_CASE(6),
    DEPARTING_DELAYED_CASE(7),
    ON_THE_RUNWAY_AT_ORIGIN_CASE(8),
    DELAYED_ON_THE_RUNWAY_AT_ORIGIN_CASE(9),
    IN_AIR_UNKNOWN_ARRIVAL_DELAY_CASE(10),
    IN_AIR_ON_TIME_CASE(11),
    IN_AIR_ARRIVING_DELAYED_CASE(12),
    ON_THE_RUNWAY_AT_DESTINATION_CASE(13),
    ON_THE_RUNWAY_AT_DESTINATION_DELAYED_CASE(14),
    DEPARTED_CASE(15),
    DEPARTED_DELAYED_CASE(16),
    ARRIVED_CASE(17),
    ARRIVED_DELAYED_CASE(18);
    

    /* renamed from: t */
    private final int f174789t;

    private C64431v(int i) {
        this.f174789t = i;
    }

    /* renamed from: a */
    public static C64431v m96403a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_CASE;
            case 1:
                return CANCELED_CASE;
            case 2:
                return REDIRECTED_CASE;
            case 3:
                return DIVERTED_CASE;
            case 4:
                return SCHEDULE_ONLY_CASE;
            case 5:
                return SCHEDULED_STATUS_CASE;
            case 6:
                return DEPARTING_ON_TIME_CASE;
            case 7:
                return DEPARTING_DELAYED_CASE;
            case 8:
                return ON_THE_RUNWAY_AT_ORIGIN_CASE;
            case 9:
                return DELAYED_ON_THE_RUNWAY_AT_ORIGIN_CASE;
            case 10:
                return IN_AIR_UNKNOWN_ARRIVAL_DELAY_CASE;
            case 11:
                return IN_AIR_ON_TIME_CASE;
            case 12:
                return IN_AIR_ARRIVING_DELAYED_CASE;
            case 13:
                return ON_THE_RUNWAY_AT_DESTINATION_CASE;
            case 14:
                return ON_THE_RUNWAY_AT_DESTINATION_DELAYED_CASE;
            case 15:
                return DEPARTED_CASE;
            case 16:
                return DEPARTED_DELAYED_CASE;
            case 17:
                return ARRIVED_CASE;
            case 18:
                return ARRIVED_DELAYED_CASE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m96404b() {
        return C64430u.f174768a;
    }

    public final int getNumber() {
        return this.f174789t;
    }

    public final String toString() {
        return Integer.toString(this.f174789t);
    }
}
