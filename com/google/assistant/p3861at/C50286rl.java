package com.google.assistant.p3861at;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.at.rl */
/* compiled from: PG */
public enum C50286rl implements C62957cd {
    PAGE_ID_UNSPECIFIED(0),
    ACCESSIBILITY(85),
    ACTIVITY_CONTROLS(50),
    ADD_DEVICE(55),
    AMBIENT_ASSISTANT(83),
    AMBIENT_MODE(70),
    APP_ACTIONS(78),
    APP_INTEGRATIONS(92),
    ASPIRE(91),
    ASSIGNABLE_REMINDERS(57),
    AUDIO(68),
    BASIC_INFO(59),
    BELL_SCHEDULE(80),
    BIRTHDAY(100),
    CALENDAR(3),
    CALLS(4),
    CAR(51),
    CAST_DEVICES(5),
    COMMUTE(6),
    CONVERSATIONAL_MODE(7),
    DAILY_BRIEF(8),
    DEBUG_OPTIONS(71),
    DEVICE_HUB(99),
    DRIVING(62),
    FOOD_AND_RECIPES(61),
    FOOD_AND_RECIPES_V2(79),
    FINANCE(72),
    EMAIL_NOTIFICATIONS(10),
    EMAIL_AND_NOTIFICATIONS(66),
    ENTRY_POINT(88),
    ENTRY_POINT_CONTROLS(104),
    EXPLORE(52),
    FACE_MATCH(11),
    FAMILY_SPACE(95),
    GENERAL(76),
    HELP_IMPROVE_ASSISTANT(84),
    HELP_IMPROVE_ASSISTANT_UNIFIED(103),
    HELP_IMPROVE_ASSISTANT_UNIFIED_V2(105),
    HOME_AUTOMATION(13),
    HOME_WORK(14),
    HOTSAUCE(67),
    HOUSEHOLD(15),
    HOUSEHOLD_YOUR_PEOPLE(60),
    LANGUAGE(16),
    LANGUAGE_PARTNER(86),
    LOCKSCREEN(87),
    MANAGE_ACCOUNT(101),
    MEDIA(90),
    MEMORY_LOCKER(48),
    MOBILE_WARM_WORDS(93),
    MUSIC(17),
    MY_ACTIVITY(49),
    NICKNAME(18),
    NEWS(19),
    NOTES_LISTS(20),
    NOTES_LISTS_ON_CHROME_OS(64),
    NOTIFICATION(65),
    PAYMENTS(21),
    PERSONALIZATION(74),
    PHONE_NUMBER(56),
    PHOTOS(94),
    PLACES_AND_TRANSPORT(69),
    PODCAST(75),
    PRIVACY_ADVISOR(58),
    PRODUCTIVITY(73),
    PROFILE_NEWS(63),
    PURCHASES(24),
    QUICK_PHRASES(96),
    RECOGNITION(89),
    REMINDERS(25),
    RESERVATIONS(26),
    ROUTINES(27),
    SHORTCUTS(47),
    SHOPPING_LIST(28),
    SPEAKER_ID_ENROLLMENT(29),
    SPEECH_PERSONALIZATION(102),
    SCREEN_CONTEXT(106),
    STOCKS(30),
    VIDEOS_PHOTOS(34),
    VIDEO_CALL(54),
    VIDEO_VOICE_CALL(53),
    VOICE_SELECTION(35),
    WARM_WORDS(77),
    WEATHER_UNITS(36),
    WELLNESS(82),
    YOUR_PEOPLE(37),
    VEHICLES(97),
    ZEROSTATE(81),
    PARENTAL_CONTROL(98);
    

    /* renamed from: aL */
    public final int f130864aL;

    private C50286rl(int i) {
        this.f130864aL = i;
    }

    /* renamed from: a */
    public static C50286rl m85798a(int i) {
        if (i == 0) {
            return PAGE_ID_UNSPECIFIED;
        }
        if (i == 10) {
            return EMAIL_NOTIFICATIONS;
        }
        if (i == 11) {
            return FACE_MATCH;
        }
        switch (i) {
            case 3:
                return CALENDAR;
            case 4:
                return CALLS;
            case 5:
                return CAST_DEVICES;
            case 6:
                return COMMUTE;
            case 7:
                return CONVERSATIONAL_MODE;
            case 8:
                return DAILY_BRIEF;
            default:
                switch (i) {
                    case 13:
                        return HOME_AUTOMATION;
                    case 14:
                        return HOME_WORK;
                    case 15:
                        return HOUSEHOLD;
                    case 16:
                        return LANGUAGE;
                    case 17:
                        return MUSIC;
                    case 18:
                        return NICKNAME;
                    case 19:
                        return NEWS;
                    case 20:
                        return NOTES_LISTS;
                    case 21:
                        return PAYMENTS;
                    default:
                        switch (i) {
                            case 24:
                                return PURCHASES;
                            case 25:
                                return REMINDERS;
                            case 26:
                                return RESERVATIONS;
                            case 27:
                                return ROUTINES;
                            case 28:
                                return SHOPPING_LIST;
                            case 29:
                                return SPEAKER_ID_ENROLLMENT;
                            case 30:
                                return STOCKS;
                            default:
                                switch (i) {
                                    case 34:
                                        return VIDEOS_PHOTOS;
                                    case 35:
                                        return VOICE_SELECTION;
                                    case 36:
                                        return WEATHER_UNITS;
                                    case 37:
                                        return YOUR_PEOPLE;
                                    default:
                                        switch (i) {
                                            case 47:
                                                return SHORTCUTS;
                                            case 48:
                                                return MEMORY_LOCKER;
                                            case 49:
                                                return MY_ACTIVITY;
                                            case 50:
                                                return ACTIVITY_CONTROLS;
                                            case 51:
                                                return CAR;
                                            case 52:
                                                return EXPLORE;
                                            case 53:
                                                return VIDEO_VOICE_CALL;
                                            case 54:
                                                return VIDEO_CALL;
                                            case 55:
                                                return ADD_DEVICE;
                                            case 56:
                                                return PHONE_NUMBER;
                                            case 57:
                                                return ASSIGNABLE_REMINDERS;
                                            case 58:
                                                return PRIVACY_ADVISOR;
                                            case 59:
                                                return BASIC_INFO;
                                            case 60:
                                                return HOUSEHOLD_YOUR_PEOPLE;
                                            case 61:
                                                return FOOD_AND_RECIPES;
                                            case 62:
                                                return DRIVING;
                                            case 63:
                                                return PROFILE_NEWS;
                                            case 64:
                                                return NOTES_LISTS_ON_CHROME_OS;
                                            case 65:
                                                return NOTIFICATION;
                                            case 66:
                                                return EMAIL_AND_NOTIFICATIONS;
                                            case 67:
                                                return HOTSAUCE;
                                            case 68:
                                                return AUDIO;
                                            case 69:
                                                return PLACES_AND_TRANSPORT;
                                            case 70:
                                                return AMBIENT_MODE;
                                            case 71:
                                                return DEBUG_OPTIONS;
                                            case 72:
                                                return FINANCE;
                                            case 73:
                                                return PRODUCTIVITY;
                                            case 74:
                                                return PERSONALIZATION;
                                            case 75:
                                                return PODCAST;
                                            case 76:
                                                return GENERAL;
                                            case 77:
                                                return WARM_WORDS;
                                            case 78:
                                                return APP_ACTIONS;
                                            case 79:
                                                return FOOD_AND_RECIPES_V2;
                                            case 80:
                                                return BELL_SCHEDULE;
                                            case 81:
                                                return ZEROSTATE;
                                            case 82:
                                                return WELLNESS;
                                            case 83:
                                                return AMBIENT_ASSISTANT;
                                            case 84:
                                                return HELP_IMPROVE_ASSISTANT;
                                            case 85:
                                                return ACCESSIBILITY;
                                            case 86:
                                                return LANGUAGE_PARTNER;
                                            case 87:
                                                return LOCKSCREEN;
                                            case 88:
                                                return ENTRY_POINT;
                                            case 89:
                                                return RECOGNITION;
                                            case 90:
                                                return MEDIA;
                                            case 91:
                                                return ASPIRE;
                                            case 92:
                                                return APP_INTEGRATIONS;
                                            case 93:
                                                return MOBILE_WARM_WORDS;
                                            case 94:
                                                return PHOTOS;
                                            case 95:
                                                return FAMILY_SPACE;
                                            case 96:
                                                return QUICK_PHRASES;
                                            case 97:
                                                return VEHICLES;
                                            case 98:
                                                return PARENTAL_CONTROL;
                                            case 99:
                                                return DEVICE_HUB;
                                            case 100:
                                                return BIRTHDAY;
                                            case 101:
                                                return MANAGE_ACCOUNT;
                                            case 102:
                                                return SPEECH_PERSONALIZATION;
                                            case 103:
                                                return HELP_IMPROVE_ASSISTANT_UNIFIED;
                                            case 104:
                                                return ENTRY_POINT_CONTROLS;
                                            case 105:
                                                return HELP_IMPROVE_ASSISTANT_UNIFIED_V2;
                                            case 106:
                                                return SCREEN_CONTEXT;
                                            default:
                                                return null;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m85799b() {
        return C50285rk.f130773a;
    }

    public final int getNumber() {
        return this.f130864aL;
    }

    public final String toString() {
        return Integer.toString(this.f130864aL);
    }
}
