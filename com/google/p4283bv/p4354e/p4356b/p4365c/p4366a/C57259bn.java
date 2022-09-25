package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.b.c.a.bn */
/* compiled from: PG */
public enum C57259bn implements C62957cd {
    UNKNOWN_REQUEST_REASON(0),
    MANUAL_REFRESH(1),
    SCHEDULED_REFRESH(2),
    WATCHDOG_REFRESH(12),
    APP_CLOSE_REFRESH(13),
    NEXT_PAGE_SCROLL(3),
    CHANNEL(4),
    IN_PLACE_UPDATE(5),
    NEWS_FULL_COVERAGE(6),
    PINNED_CONTENT_REFRESH(7),
    PREFETCHED_CHANNEL(8),
    INTERACTIVE_CHANNEL(9),
    STORY_RECOMMENDATIONS(10),
    FEEDBACK(11),
    WARMUP(14),
    RELATED_VIDEOS(15);
    

    /* renamed from: q */
    public final int f152856q;

    private C57259bn(int i) {
        this.f152856q = i;
    }

    /* renamed from: a */
    public static C57259bn m88289a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_REASON;
            case 1:
                return MANUAL_REFRESH;
            case 2:
                return SCHEDULED_REFRESH;
            case 3:
                return NEXT_PAGE_SCROLL;
            case 4:
                return CHANNEL;
            case 5:
                return IN_PLACE_UPDATE;
            case 6:
                return NEWS_FULL_COVERAGE;
            case 7:
                return PINNED_CONTENT_REFRESH;
            case 8:
                return PREFETCHED_CHANNEL;
            case 9:
                return INTERACTIVE_CHANNEL;
            case 10:
                return STORY_RECOMMENDATIONS;
            case 11:
                return FEEDBACK;
            case 12:
                return WATCHDOG_REFRESH;
            case 13:
                return APP_CLOSE_REFRESH;
            case 14:
                return WARMUP;
            case 15:
                return RELATED_VIDEOS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88290b() {
        return C57258bm.f152838a;
    }

    public final int getNumber() {
        return this.f152856q;
    }

    public final String toString() {
        return Integer.toString(this.f152856q);
    }
}
