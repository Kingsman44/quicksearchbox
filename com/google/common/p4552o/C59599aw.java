package com.google.common.p4552o;

/* renamed from: com.google.common.o.aw */
/* compiled from: PG */
public final class C59599aw {
    /* renamed from: a */
    public static /* synthetic */ String m92465a(int i) {
        if (i == 1) {
            return "FEED_LAUNCH_CANCEL_UNKNOWN";
        }
        if (i == 2) {
            return "FEED_LAUNCH_CANCEL_ACTIVITY_PAUSED";
        }
        if (i == 101) {
            return "FEED_LAUNCH_CANCEL_TAB_SWITCH";
        }
        switch (i) {
            case 103:
                return "FEED_LAUNCH_CANCEL_CONFIGURATION_CHANGE";
            case 104:
                return "FEED_LAUNCH_CANCEL_NAVIGATION_DRAWER_OVERLAID";
            case 105:
                return "FEED_LAUNCH_CANCEL_OK_GOOGLE";
            case 106:
                return "FEED_LAUNCH_CANCEL_TEXT_SEARCH";
            case 107:
                return "FEED_LAUNCH_CANCEL_VOICE_SEARCH";
            case 108:
                return "FEED_LAUNCH_CANCEL_MUSIC_SEARCH";
            default:
                return "null";
        }
    }

    /* renamed from: b */
    public static int m92466b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 100) {
            return 101;
        }
        switch (i) {
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 106:
                return 107;
            case 107:
                return 108;
            default:
                return 0;
        }
    }
}
