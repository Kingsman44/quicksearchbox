package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.hx */
/* compiled from: PG */
public enum C7732hx implements C62957cd {
    DISMISS_SWIPE_MENU(1),
    IOS_PROMINENCE_HIGH(2),
    IOS_PROMINENCE_POCKET(3),
    NOTIFICATION_BRANDING(4),
    SUPPESSS_LOCATION_SETTINGS_CARD(5),
    ALTERNATE_NOTIFICATION_BRANDING(6),
    SPLIT_NOW_STREAM_INTO_TABS(7),
    UPDATABLE_NOTIFICATION_IOS(8),
    ASSISTANT_NOTIFICATION_BRANDING(9);
    

    /* renamed from: j */
    public final int f27037j;

    private C7732hx(int i) {
        this.f27037j = i;
    }

    /* renamed from: a */
    public static C7732hx m22829a(int i) {
        switch (i) {
            case 1:
                return DISMISS_SWIPE_MENU;
            case 2:
                return IOS_PROMINENCE_HIGH;
            case 3:
                return IOS_PROMINENCE_POCKET;
            case 4:
                return NOTIFICATION_BRANDING;
            case 5:
                return SUPPESSS_LOCATION_SETTINGS_CARD;
            case 6:
                return ALTERNATE_NOTIFICATION_BRANDING;
            case 7:
                return SPLIT_NOW_STREAM_INTO_TABS;
            case 8:
                return UPDATABLE_NOTIFICATION_IOS;
            case 9:
                return ASSISTANT_NOTIFICATION_BRANDING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22830b() {
        return C7731hw.f27026a;
    }

    public final int getNumber() {
        return this.f27037j;
    }

    public final String toString() {
        return Integer.toString(this.f27037j);
    }
}
