package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.ai.b.eo */
/* compiled from: PG */
public enum C7642eo implements C62957cd {
    OTHER(0),
    FETCH_OPT_IN(1),
    OPT_IN(2),
    CONFIG(3),
    TRANSLATE(4),
    SAMPLE_STATIC_MAP(6),
    STATIC_MAP(7),
    CLOSET(9),
    MY_PLACES(13),
    NOTIFICATIONS(14),
    CALENDAR_NOTIFICATIONS(15),
    SUGGEST_PLACES(16),
    SUGGEST_TV(18),
    USER_REQUESTED_FULL(22),
    ACTION(24),
    ACTIONS(25),
    PLACE_DETAILS(27),
    OBSOLETE_TEST_LAUNCHER(28),
    BACKEND_DATA_VERSION_CHANGED(29),
    INVALID_ENTRY_CACHE_FILE(30),
    CONFIGURATION_NOT_CURRENT(31),
    CARD_SETTINGS_CHANGE(32),
    TRAINING_QUESTION_ANSWER(36),
    PULL_TO_REFRESH(37),
    SECOND_SCREEN_INVALIDATE(38),
    SECOND_SCREEN_LOAD_CARDS(41),
    SEND_FEEDBACK_OVERLAY(43),
    SERVICE_UNKNOWN_REASON(45),
    SERVICE_GCORE_UNAVAILABLE(46),
    BUSINESS_DATA_FILTER_REMOTE(51),
    SECOND_SCREEN_LOAD_ADDITIONAL_ENTRIES(52),
    SECOND_SCREEN_PRELOAD_CARDS(54),
    HOTWORD_ENROLLMENT_REFRESH(55),
    OPTIN_REFRESH(57),
    REQUEST_SCHEDULE(58),
    REQUEST_SCHEDULE_WATCHDOG(59),
    PERMISSIONS_REQUEST_REFRESH(61),
    CARDMAKER_PREVIEW(62),
    PUSH_FOR_REQUEST(63),
    LEGACY_TRIGGER_CONDITION(64),
    PLACE_RENAME(66),
    LOAD_CLOSET(67),
    INTEREST_PICKER_QUERY(68),
    SERVICE_INVALIDATED_LOCALE(71),
    SERVICE_INVALIDATED_STALE_CONTENT(75),
    SERVICE_INVALIDATED_TALKBACK(76),
    SERVICE_INVALIDATED_USER_SESSION_EXPIRED(111),
    SERVICE_NOT_INVALIDATED(77),
    ARP_REMINDERS_CREATED(79),
    REMINDERS_EDIT(80),
    REMINDERS_DELETE(81),
    LEGACY_GEARHEAD_REFRESH(82),
    REMINDERS_INTENT_SERVICE(83),
    GEARHEAD_REFRESH(84),
    GCM_REGISTRATION(85),
    INTEREST_PICKER_SEARCH(86),
    TOPDECK_OPT_IN(87),
    WEATHER_WIDGET(88),
    CLOSET_DONE(89),
    IMPLICIT_APP_OPEN(90),
    REMINDERS_LISTENER_SERVICE(91),
    SHOPPING_LIST_ITEM_ADDED(92),
    CALENDAR_EVENT_ADDED(93),
    BACKGROUND_ACTION_UPLOAD(95),
    PUSHED_APP_OPEN(96),
    BACKEND_DATA_VERSION_CHANGED_MONET(97),
    START_ACTIVITY_FOR_RESULT_UTIL(99),
    UPDATE_FOREGROUND_ACTIONS_TASK(100),
    ADD_NOW_CARDS_TASK(101),
    RELOAD_NOW_CARDS_TASK(102),
    RESTORE_NOW_CARDS_FROM_DISK(125),
    SWAP_CARDS_TASK(103),
    SECOND_SCREEN_LOAD_CARDS_MONET(104),
    SECOND_SCREEN_PULL_TO_REFRESH_MONET(105),
    SECOND_SCREEN_MONET_INVALIDATE(106),
    MONET_FEED_INVALIDATE(107),
    SECOND_SCREEN_FEEDBACK(108),
    BILINGUAL_OPT_OUT(109),
    AD_DOMAIN_BLOCK(110),
    NEXT_PAGE(112),
    RESET_FEED_PREFS(113),
    GESTALT_UI_CHANGE(114),
    LOAD_WEBVIEW_CLOSET(115),
    SMARTSPACE_WEATHER_PULL(116),
    SMARTSPACE_WEATHER_PULL_PERIODIC(117),
    INVALIDATED_NOW_CONTROLLER(118),
    INVALIDATED_NOW_CONTROLLER_MOMO(119),
    PULL_TO_REFRESH_INTERESTS_TAB(120),
    PULL_TO_REFRESH_MINUS_ONE(121),
    NO_CARDS_NOW_CONTROLLER(122),
    NO_CARDS_NOW_CONTROLLER_MOMO(123),
    NO_CARDS_ENTRY_INVALIDATOR(124),
    REFRESH_AFTER_LANGUAGE_SELECT(126),
    REFRESH_FROM_SNACKBAR_AFTER_INTEREST_PICK(127),
    REFRESH_FROM_NOTIFICATION_TOKEN(128),
    LEGACY_NOW_SYNC(129),
    SMART_DOT_PROMO(130),
    LEGACY_NOW_SYNC_WITH_FULL_REFRESH(131),
    DEPRECATED_NETWORK_DEVICE_INFO(8),
    DEPRECATED_SPORTS_DATA(10),
    DEPRECATED_OPT_OUT(12),
    DEPRECATED_SCHEDULED(19),
    DEPRECATED_TRIGGERED_PARTIAL(20),
    DEPRECATED_TRIGGER_FULL(21),
    DEPRECATED_SECOND_SCREEN(26),
    DEPRECATED_TRAINING_CLOSET_PAUSE(33),
    DEPRECATED_TRAINING_CLOSET_PAUSE_NEW_ANSWERS(34),
    DEPRECATED_SETTINGS_CHANGE(35),
    DEPRECATED_MORE_CARD_CLICK(39),
    DEPRECATED_SECOND_SCREEN_LOADER_ATTACH(40),
    DEPRECATED_SEND_FEEDBACK_VELVET(42),
    DEPRECATED_ADD_FRESHEN_INTEREST(44),
    DEPRECATED_SERVICE_NO_CARDS(47),
    DEPRECATED_SERVICE_INVALIDATED(48),
    DEPRECATED_REFRESH_SCHEDULER(49),
    DEPRECATED_BUSINESS_DATA_FILTER(50),
    DEPRECATED_SECOND_SCREEN_LOAD_READER(53),
    DEPRECATED_NOW_SPACE_REFRESH_BUTTON(56),
    DEPRECATED_SCREEN_ASSIST_REQUEST_CARDS(60),
    DEPRECATED_SERVICE_INVALIDATED_LOCATION_FAR(72),
    DEPRECATED_TRAINING_MODE_SYNC(5),
    DEPRECATED_TRAFFIC(17),
    DEPRECATED_REMINDERS(11),
    DEPRECATED_CARDSYNC_USER_REQUESTED(65),
    DEPRECATED_SERVICE_INVALIDATED_GEL(70),
    DEPRECATED_SERVICE_INVALIDATED_LOCATION_SETTINGS(73),
    DEPRECATED_SERVICE_INVALIDATED_RECENT_NOTIFICATION(74),
    DEPRECATED_ASSISTANT_HQ_APP_OPEN(94),
    DEPRECATED_PULL_TO_REFRESH_MONET(98),
    DEPRECATED_USER_REQUESTED_CARD_SELECTOR_REFRESH(69),
    DEPRECATED_USER_REQUESTED_PARTIAL(23),
    DEPRECATED_USER_REQUESTED_AFTER_INTEREST_PICK(78);
    

    /* renamed from: bC */
    public final int f26533bC;

    private C7642eo(int i) {
        this.f26533bC = i;
    }

    /* renamed from: a */
    public static C7642eo m22791a(int i) {
        switch (i) {
            case 0:
                return OTHER;
            case 1:
                return FETCH_OPT_IN;
            case 2:
                return OPT_IN;
            case 3:
                return CONFIG;
            case 4:
                return TRANSLATE;
            case 5:
                return DEPRECATED_TRAINING_MODE_SYNC;
            case 6:
                return SAMPLE_STATIC_MAP;
            case 7:
                return STATIC_MAP;
            case 8:
                return DEPRECATED_NETWORK_DEVICE_INFO;
            case 9:
                return CLOSET;
            case 10:
                return DEPRECATED_SPORTS_DATA;
            case 11:
                return DEPRECATED_REMINDERS;
            case 12:
                return DEPRECATED_OPT_OUT;
            case 13:
                return MY_PLACES;
            case 14:
                return NOTIFICATIONS;
            case 15:
                return CALENDAR_NOTIFICATIONS;
            case 16:
                return SUGGEST_PLACES;
            case 17:
                return DEPRECATED_TRAFFIC;
            case 18:
                return SUGGEST_TV;
            case 19:
                return DEPRECATED_SCHEDULED;
            case 20:
                return DEPRECATED_TRIGGERED_PARTIAL;
            case 21:
                return DEPRECATED_TRIGGER_FULL;
            case 22:
                return USER_REQUESTED_FULL;
            case 23:
                return DEPRECATED_USER_REQUESTED_PARTIAL;
            case 24:
                return ACTION;
            case 25:
                return ACTIONS;
            case 26:
                return DEPRECATED_SECOND_SCREEN;
            case 27:
                return PLACE_DETAILS;
            case 28:
                return OBSOLETE_TEST_LAUNCHER;
            case 29:
                return BACKEND_DATA_VERSION_CHANGED;
            case 30:
                return INVALID_ENTRY_CACHE_FILE;
            case 31:
                return CONFIGURATION_NOT_CURRENT;
            case 32:
                return CARD_SETTINGS_CHANGE;
            case 33:
                return DEPRECATED_TRAINING_CLOSET_PAUSE;
            case 34:
                return DEPRECATED_TRAINING_CLOSET_PAUSE_NEW_ANSWERS;
            case 35:
                return DEPRECATED_SETTINGS_CHANGE;
            case 36:
                return TRAINING_QUESTION_ANSWER;
            case 37:
                return PULL_TO_REFRESH;
            case 38:
                return SECOND_SCREEN_INVALIDATE;
            case 39:
                return DEPRECATED_MORE_CARD_CLICK;
            case 40:
                return DEPRECATED_SECOND_SCREEN_LOADER_ATTACH;
            case 41:
                return SECOND_SCREEN_LOAD_CARDS;
            case 42:
                return DEPRECATED_SEND_FEEDBACK_VELVET;
            case 43:
                return SEND_FEEDBACK_OVERLAY;
            case 44:
                return DEPRECATED_ADD_FRESHEN_INTEREST;
            case 45:
                return SERVICE_UNKNOWN_REASON;
            case 46:
                return SERVICE_GCORE_UNAVAILABLE;
            case 47:
                return DEPRECATED_SERVICE_NO_CARDS;
            case 48:
                return DEPRECATED_SERVICE_INVALIDATED;
            case 49:
                return DEPRECATED_REFRESH_SCHEDULER;
            case 50:
                return DEPRECATED_BUSINESS_DATA_FILTER;
            case 51:
                return BUSINESS_DATA_FILTER_REMOTE;
            case 52:
                return SECOND_SCREEN_LOAD_ADDITIONAL_ENTRIES;
            case 53:
                return DEPRECATED_SECOND_SCREEN_LOAD_READER;
            case 54:
                return SECOND_SCREEN_PRELOAD_CARDS;
            case 55:
                return HOTWORD_ENROLLMENT_REFRESH;
            case 56:
                return DEPRECATED_NOW_SPACE_REFRESH_BUTTON;
            case 57:
                return OPTIN_REFRESH;
            case 58:
                return REQUEST_SCHEDULE;
            case 59:
                return REQUEST_SCHEDULE_WATCHDOG;
            case 60:
                return DEPRECATED_SCREEN_ASSIST_REQUEST_CARDS;
            case 61:
                return PERMISSIONS_REQUEST_REFRESH;
            case 62:
                return CARDMAKER_PREVIEW;
            case 63:
                return PUSH_FOR_REQUEST;
            case 64:
                return LEGACY_TRIGGER_CONDITION;
            case 65:
                return DEPRECATED_CARDSYNC_USER_REQUESTED;
            case 66:
                return PLACE_RENAME;
            case 67:
                return LOAD_CLOSET;
            case 68:
                return INTEREST_PICKER_QUERY;
            case 69:
                return DEPRECATED_USER_REQUESTED_CARD_SELECTOR_REFRESH;
            case 70:
                return DEPRECATED_SERVICE_INVALIDATED_GEL;
            case 71:
                return SERVICE_INVALIDATED_LOCALE;
            case 72:
                return DEPRECATED_SERVICE_INVALIDATED_LOCATION_FAR;
            case 73:
                return DEPRECATED_SERVICE_INVALIDATED_LOCATION_SETTINGS;
            case 74:
                return DEPRECATED_SERVICE_INVALIDATED_RECENT_NOTIFICATION;
            case 75:
                return SERVICE_INVALIDATED_STALE_CONTENT;
            case 76:
                return SERVICE_INVALIDATED_TALKBACK;
            case 77:
                return SERVICE_NOT_INVALIDATED;
            case 78:
                return DEPRECATED_USER_REQUESTED_AFTER_INTEREST_PICK;
            case 79:
                return ARP_REMINDERS_CREATED;
            case 80:
                return REMINDERS_EDIT;
            case 81:
                return REMINDERS_DELETE;
            case 82:
                return LEGACY_GEARHEAD_REFRESH;
            case 83:
                return REMINDERS_INTENT_SERVICE;
            case 84:
                return GEARHEAD_REFRESH;
            case 85:
                return GCM_REGISTRATION;
            case 86:
                return INTEREST_PICKER_SEARCH;
            case 87:
                return TOPDECK_OPT_IN;
            case 88:
                return WEATHER_WIDGET;
            case 89:
                return CLOSET_DONE;
            case 90:
                return IMPLICIT_APP_OPEN;
            case 91:
                return REMINDERS_LISTENER_SERVICE;
            case 92:
                return SHOPPING_LIST_ITEM_ADDED;
            case 93:
                return CALENDAR_EVENT_ADDED;
            case 94:
                return DEPRECATED_ASSISTANT_HQ_APP_OPEN;
            case 95:
                return BACKGROUND_ACTION_UPLOAD;
            case 96:
                return PUSHED_APP_OPEN;
            case 97:
                return BACKEND_DATA_VERSION_CHANGED_MONET;
            case 98:
                return DEPRECATED_PULL_TO_REFRESH_MONET;
            case 99:
                return START_ACTIVITY_FOR_RESULT_UTIL;
            case 100:
                return UPDATE_FOREGROUND_ACTIONS_TASK;
            case 101:
                return ADD_NOW_CARDS_TASK;
            case 102:
                return RELOAD_NOW_CARDS_TASK;
            case 103:
                return SWAP_CARDS_TASK;
            case 104:
                return SECOND_SCREEN_LOAD_CARDS_MONET;
            case 105:
                return SECOND_SCREEN_PULL_TO_REFRESH_MONET;
            case 106:
                return SECOND_SCREEN_MONET_INVALIDATE;
            case 107:
                return MONET_FEED_INVALIDATE;
            case 108:
                return SECOND_SCREEN_FEEDBACK;
            case 109:
                return BILINGUAL_OPT_OUT;
            case 110:
                return AD_DOMAIN_BLOCK;
            case 111:
                return SERVICE_INVALIDATED_USER_SESSION_EXPIRED;
            case 112:
                return NEXT_PAGE;
            case 113:
                return RESET_FEED_PREFS;
            case 114:
                return GESTALT_UI_CHANGE;
            case 115:
                return LOAD_WEBVIEW_CLOSET;
            case 116:
                return SMARTSPACE_WEATHER_PULL;
            case 117:
                return SMARTSPACE_WEATHER_PULL_PERIODIC;
            case 118:
                return INVALIDATED_NOW_CONTROLLER;
            case 119:
                return INVALIDATED_NOW_CONTROLLER_MOMO;
            case 120:
                return PULL_TO_REFRESH_INTERESTS_TAB;
            case 121:
                return PULL_TO_REFRESH_MINUS_ONE;
            case 122:
                return NO_CARDS_NOW_CONTROLLER;
            case 123:
                return NO_CARDS_NOW_CONTROLLER_MOMO;
            case 124:
                return NO_CARDS_ENTRY_INVALIDATOR;
            case 125:
                return RESTORE_NOW_CARDS_FROM_DISK;
            case 126:
                return REFRESH_AFTER_LANGUAGE_SELECT;
            case 127:
                return REFRESH_FROM_SNACKBAR_AFTER_INTEREST_PICK;
            case 128:
                return REFRESH_FROM_NOTIFICATION_TOKEN;
            case 129:
                return LEGACY_NOW_SYNC;
            case 130:
                return SMART_DOT_PROMO;
            case 131:
                return LEGACY_NOW_SYNC_WITH_FULL_REFRESH;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f26533bC;
    }

    public final String toString() {
        return Integer.toString(this.f26533bC);
    }
}
