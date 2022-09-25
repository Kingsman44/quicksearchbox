package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.ik */
/* compiled from: PG */
public enum C7746ik implements C62957cd {
    UNKNOWN(48),
    FREQUENT_PLACE(1),
    WEATHER(7),
    TRANSIT_STATION(9),
    GENERIC_CARD(11),
    FLIGHT_STATUS(12),
    SPORT_SCORE(13),
    SPORT_EVENT(114),
    PUBLIC_ALERT(19),
    REMINDER(43),
    REMINDER_LIST(44),
    BROWSE_MODE_READING_STORY(128),
    AGENDA(137),
    MODULE(143),
    MODULE_LIST(148),
    PIET(210),
    CLUSTER_METADATA(155),
    CAROUSEL_MODULE_LIST(156),
    APP_LAUNCH_LIST(160),
    CLOSET_INTERESTS_PAGE(197),
    CLOSET_INTEREST_CATEGORY(198),
    CLOSET_CONTROL_LIST(199),
    CLOSET_CONTROL_CATEGORY(200),
    CLOSET_PROFILE_SINGLE_TYPE(174),
    CLOSET_PROFILE_MULTI_TYPE(175),
    CLOSET_PROFILE_BUTTON(180),
    CLOSET_ENTITY(176),
    CLOSET_CONTROL(177),
    CLOSET_QUESTION(204),
    CLOSET_TEMPLATE_GROUP(205),
    CLOSET_NOW_SETTINGS(206),
    COMMUTE_NOTIFICATION(172),
    NOW_CLIENT_OPT_IN_PROMO(202),
    FEED_COLLECTION(208),
    CARD_CAP(209);
    

    /* renamed from: J */
    public final int f27108J;

    private C7746ik(int i) {
        this.f27108J = i;
    }

    /* renamed from: a */
    public static C7746ik m22834a(int i) {
        switch (i) {
            case 1:
                return FREQUENT_PLACE;
            case 7:
                return WEATHER;
            case 9:
                return TRANSIT_STATION;
            case 11:
                return GENERIC_CARD;
            case 12:
                return FLIGHT_STATUS;
            case 13:
                return SPORT_SCORE;
            case 19:
                return PUBLIC_ALERT;
            case 43:
                return REMINDER;
            case 44:
                return REMINDER_LIST;
            case 48:
                return UNKNOWN;
            case 114:
                return SPORT_EVENT;
            case 128:
                return BROWSE_MODE_READING_STORY;
            case 137:
                return AGENDA;
            case 143:
                return MODULE;
            case 148:
                return MODULE_LIST;
            case 155:
                return CLUSTER_METADATA;
            case 156:
                return CAROUSEL_MODULE_LIST;
            case 160:
                return APP_LAUNCH_LIST;
            case 172:
                return COMMUTE_NOTIFICATION;
            case 174:
                return CLOSET_PROFILE_SINGLE_TYPE;
            case 175:
                return CLOSET_PROFILE_MULTI_TYPE;
            case 176:
                return CLOSET_ENTITY;
            case 177:
                return CLOSET_CONTROL;
            case 180:
                return CLOSET_PROFILE_BUTTON;
            case 197:
                return CLOSET_INTERESTS_PAGE;
            case 198:
                return CLOSET_INTEREST_CATEGORY;
            case 199:
                return CLOSET_CONTROL_LIST;
            case 200:
                return CLOSET_CONTROL_CATEGORY;
            case 202:
                return NOW_CLIENT_OPT_IN_PROMO;
            case 204:
                return CLOSET_QUESTION;
            case 205:
                return CLOSET_TEMPLATE_GROUP;
            case 206:
                return CLOSET_NOW_SETTINGS;
            case 208:
                return FEED_COLLECTION;
            case 209:
                return CARD_CAP;
            case 210:
                return PIET;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22835b() {
        return C7745ij.f27071a;
    }

    public final int getNumber() {
        return this.f27108J;
    }

    public final String toString() {
        return Integer.toString(this.f27108J);
    }
}
