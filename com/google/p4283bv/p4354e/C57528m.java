package com.google.p4283bv.p4354e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bv.e.m */
/* compiled from: PG */
public enum C57528m implements C62957cd {
    UNKNOWN_SURFACE(0),
    AGSA_MAIN_SCREEN(1),
    AGSA_SECOND_SCREEN(2),
    ANDROID_LAUNCHER_MAIN_SCREEN(3),
    IGSA_MAIN_SCREEN(4),
    IGSA_SECOND_SCREEN(5),
    WEB_SEARCH_HOMEPAGE(6),
    ANDROID_CHROME_NEW_TAB(7),
    IOS_CHROME_NEW_TAB(8),
    ANDROID_FULL_COVERAGE(9),
    IOS_FULL_COVERAGE(10),
    ANDROID_CHANNEL_DETAIL(11),
    ANDROID_GO_LAUNCHER_MAIN_SCREEN(12),
    TESTING(13),
    GOOGLE_GO_IN_APP(14),
    IGSA_CHANNEL_DETAIL(15),
    IOS_CHROME_CHANNEL_DETAIL(16),
    ANDROID_CHROME_FOLLOW_ON_WEBPAGE(17),
    IOS_CHROME_FOLLOW_ON_WEBPAGE(18),
    ANDROID_CHROME_FOLLOW_MANAGEMENT_SURFACE(19),
    IOS_CHROME_FOLLOW_MANAGEMENT_SURFACE(20),
    ANDROID_CHROME_UNKNOWN_SURFACE(21),
    IOS_CHROME_UNKNOWN_SURFACE(22),
    ANDROID_CHROME_FOLLOW_RECOMMENDATION_ACCELERATOR(23),
    IOS_CHROME_FOLLOW_RECOMMENDATION_ACCELERATOR(24),
    CHROME_SIDE_PANEL_WEB(25),
    ANDROID_RELATED_VIDEOS(26);
    

    /* renamed from: B */
    public final int f153693B;

    private C57528m(int i) {
        this.f153693B = i;
    }

    /* renamed from: a */
    public static C57528m m88369a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_SURFACE;
            case 1:
                return AGSA_MAIN_SCREEN;
            case 2:
                return AGSA_SECOND_SCREEN;
            case 3:
                return ANDROID_LAUNCHER_MAIN_SCREEN;
            case 4:
                return IGSA_MAIN_SCREEN;
            case 5:
                return IGSA_SECOND_SCREEN;
            case 6:
                return WEB_SEARCH_HOMEPAGE;
            case 7:
                return ANDROID_CHROME_NEW_TAB;
            case 8:
                return IOS_CHROME_NEW_TAB;
            case 9:
                return ANDROID_FULL_COVERAGE;
            case 10:
                return IOS_FULL_COVERAGE;
            case 11:
                return ANDROID_CHANNEL_DETAIL;
            case 12:
                return ANDROID_GO_LAUNCHER_MAIN_SCREEN;
            case 13:
                return TESTING;
            case 14:
                return GOOGLE_GO_IN_APP;
            case 15:
                return IGSA_CHANNEL_DETAIL;
            case 16:
                return IOS_CHROME_CHANNEL_DETAIL;
            case 17:
                return ANDROID_CHROME_FOLLOW_ON_WEBPAGE;
            case 18:
                return IOS_CHROME_FOLLOW_ON_WEBPAGE;
            case 19:
                return ANDROID_CHROME_FOLLOW_MANAGEMENT_SURFACE;
            case 20:
                return IOS_CHROME_FOLLOW_MANAGEMENT_SURFACE;
            case 21:
                return ANDROID_CHROME_UNKNOWN_SURFACE;
            case 22:
                return IOS_CHROME_UNKNOWN_SURFACE;
            case 23:
                return ANDROID_CHROME_FOLLOW_RECOMMENDATION_ACCELERATOR;
            case 24:
                return IOS_CHROME_FOLLOW_RECOMMENDATION_ACCELERATOR;
            case 25:
                return CHROME_SIDE_PANEL_WEB;
            case 26:
                return ANDROID_RELATED_VIDEOS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m88370b() {
        return C57527l.f153664a;
    }

    public final int getNumber() {
        return this.f153693B;
    }

    public final String toString() {
        return Integer.toString(this.f153693B);
    }
}
