package com.google.android.apps.p489g.p494d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.g.d.ac */
/* compiled from: PG */
public enum C9140ac implements C62957cd {
    OPEN_URL(1),
    SEARCH(2),
    EXPAND_LIST(3),
    COLLAPSE_LIST(37),
    SECOND_SCREEN(4),
    EXPAND_MODULE(5),
    REFRESH(6),
    LATITUDE_OPT_IN(7),
    ENABLE_WIFI(8),
    ENABLE_WIFI_SCAN(9),
    WEB_HISTORY_SETTINGS(10),
    REMINDER_EDIT(11),
    WEB_VIEW(12),
    REMINDER_SNOOZE(13),
    SET_ENROUTE_ALARM(14),
    START_OPT_IN(15),
    START_CUSTOMIZE_GOOGLE_NOW(16),
    REMINDER_DONE(17),
    REMINDER_UNDO(18),
    CUSTOM_SEARCH(19),
    SEND_FEEDBACK(20),
    DISMISS_ENTRY(21),
    PLACES_EDIT(22),
    REQUEST_RUNTIME_PERMISSIONS(23),
    START_HOTWORD_TRAINING(24),
    NOOP(25),
    START_OPT_IN_FROM_HOMESCREEN(26),
    MANAGE_NOTIFICATION_SETTINGS(64),
    SHARE(30),
    INTEREST(31),
    START_WEATHER_IMMERSIVE(32),
    REISSUE(33),
    INTEREST_PICKER(34),
    TRANSLATE(35),
    COPY_TO_CLIPBOARD(36),
    OPEN_AMP_VIEWER(38),
    CLOSET(39),
    START_PRIVACY_AND_ACCOUNT_SETTING(40),
    START_ASSISTANT_SETTINGS(41),
    ORDERS_CARDS(42),
    FOLLOW_INTEREST(43),
    START_OPA(44),
    DISMISS_OPA_NOTIFICATION(45),
    INSTALL_APP_ICON(46),
    SAVE_FOR_LATER(47),
    FEED_STORY_MORE(48),
    FEED_STORY_LESS(49),
    FEED_AD_WTA(50),
    SAVE_FOR_LATER_UNDO(51),
    FEED_STORY_MORE_UNDO(52),
    FEED_STORY_LESS_UNDO(53),
    FEED_REACTION_FROM_DEFAULT(54),
    FEED_REACTION_FROM_SET(55),
    PLAY_VIDEO_ACTION(56),
    OPEN_VIDEO_SETTINGS(61),
    FEED_FOLLOW(57),
    PRELOAD_AMP_VIEWER(58),
    BILINGUAL_OPT_OUT(59),
    CARD_MENU_OPEN(60),
    AD_DISMISS_SURVEY(62),
    REPORT(63),
    IMAGE_VIEWER(65),
    DISCOVER_PINNED_CONTENT(66),
    SILK_MEDIA_PANE(67);
    

    /* renamed from: am */
    public final int f31520am;

    private C9140ac(int i) {
        this.f31520am = i;
    }

    /* renamed from: a */
    public static C9140ac m23674a(int i) {
        switch (i) {
            case 1:
                return OPEN_URL;
            case 2:
                return SEARCH;
            case 3:
                return EXPAND_LIST;
            case 4:
                return SECOND_SCREEN;
            case 5:
                return EXPAND_MODULE;
            case 6:
                return REFRESH;
            case 7:
                return LATITUDE_OPT_IN;
            case 8:
                return ENABLE_WIFI;
            case 9:
                return ENABLE_WIFI_SCAN;
            case 10:
                return WEB_HISTORY_SETTINGS;
            case 11:
                return REMINDER_EDIT;
            case 12:
                return WEB_VIEW;
            case 13:
                return REMINDER_SNOOZE;
            case 14:
                return SET_ENROUTE_ALARM;
            case 15:
                return START_OPT_IN;
            case 16:
                return START_CUSTOMIZE_GOOGLE_NOW;
            case 17:
                return REMINDER_DONE;
            case 18:
                return REMINDER_UNDO;
            case 19:
                return CUSTOM_SEARCH;
            case 20:
                return SEND_FEEDBACK;
            case 21:
                return DISMISS_ENTRY;
            case 22:
                return PLACES_EDIT;
            case 23:
                return REQUEST_RUNTIME_PERMISSIONS;
            case 24:
                return START_HOTWORD_TRAINING;
            case 25:
                return NOOP;
            case 26:
                return START_OPT_IN_FROM_HOMESCREEN;
            case 30:
                return SHARE;
            case 31:
                return INTEREST;
            case 32:
                return START_WEATHER_IMMERSIVE;
            case 33:
                return REISSUE;
            case 34:
                return INTEREST_PICKER;
            case 35:
                return TRANSLATE;
            case 36:
                return COPY_TO_CLIPBOARD;
            case 37:
                return COLLAPSE_LIST;
            case 38:
                return OPEN_AMP_VIEWER;
            case 39:
                return CLOSET;
            case 40:
                return START_PRIVACY_AND_ACCOUNT_SETTING;
            case 41:
                return START_ASSISTANT_SETTINGS;
            case 42:
                return ORDERS_CARDS;
            case 43:
                return FOLLOW_INTEREST;
            case 44:
                return START_OPA;
            case 45:
                return DISMISS_OPA_NOTIFICATION;
            case 46:
                return INSTALL_APP_ICON;
            case 47:
                return SAVE_FOR_LATER;
            case 48:
                return FEED_STORY_MORE;
            case 49:
                return FEED_STORY_LESS;
            case 50:
                return FEED_AD_WTA;
            case 51:
                return SAVE_FOR_LATER_UNDO;
            case 52:
                return FEED_STORY_MORE_UNDO;
            case 53:
                return FEED_STORY_LESS_UNDO;
            case 54:
                return FEED_REACTION_FROM_DEFAULT;
            case 55:
                return FEED_REACTION_FROM_SET;
            case 56:
                return PLAY_VIDEO_ACTION;
            case 57:
                return FEED_FOLLOW;
            case 58:
                return PRELOAD_AMP_VIEWER;
            case 59:
                return BILINGUAL_OPT_OUT;
            case 60:
                return CARD_MENU_OPEN;
            case 61:
                return OPEN_VIDEO_SETTINGS;
            case 62:
                return AD_DISMISS_SURVEY;
            case 63:
                return REPORT;
            case 64:
                return MANAGE_NOTIFICATION_SETTINGS;
            case 65:
                return IMAGE_VIEWER;
            case 66:
                return DISCOVER_PINNED_CONTENT;
            case 67:
                return SILK_MEDIA_PANE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m23675b() {
        return C9139ab.f31454a;
    }

    public final int getNumber() {
        return this.f31520am;
    }

    public final String toString() {
        return Integer.toString(this.f31520am);
    }
}
