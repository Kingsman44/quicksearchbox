package com.google.p4273bs.p4277b.p4278a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bs.b.a.d */
/* compiled from: PG */
public enum C56464d implements C62957cd {
    ACTION_UNSPECIFIED(0),
    OPEN_APP(1),
    OPEN_WEBSITE(2),
    CALL_ON_PHONE_NUMBER(3),
    NAVIGATE_TO_ADDRESS(4),
    CHECK_MENU(5),
    CHECK_RATING(6),
    CHECK_REVIEWS(7),
    RESERVE(8),
    LISTEN(9),
    WATCH(10),
    FIND_MOVIE_SHOWTIMES(11),
    WATCH_TRAILER(12),
    DELIVERY(13);
    

    /* renamed from: o */
    public final int f150830o;

    private C56464d(int i) {
        this.f150830o = i;
    }

    /* renamed from: a */
    public static C56464d m88198a(int i) {
        switch (i) {
            case 0:
                return ACTION_UNSPECIFIED;
            case 1:
                return OPEN_APP;
            case 2:
                return OPEN_WEBSITE;
            case 3:
                return CALL_ON_PHONE_NUMBER;
            case 4:
                return NAVIGATE_TO_ADDRESS;
            case 5:
                return CHECK_MENU;
            case 6:
                return CHECK_RATING;
            case 7:
                return CHECK_REVIEWS;
            case 8:
                return RESERVE;
            case 9:
                return LISTEN;
            case 10:
                return WATCH;
            case 11:
                return FIND_MOVIE_SHOWTIMES;
            case 12:
                return WATCH_TRAILER;
            case 13:
                return DELIVERY;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88199b() {
        return C56463c.f150814a;
    }

    public final int getNumber() {
        return this.f150830o;
    }

    public final String toString() {
        return Integer.toString(this.f150830o);
    }
}
