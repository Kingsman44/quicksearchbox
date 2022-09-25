package com.google.p375ai.p378b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.ai.b.nu */
/* compiled from: PG */
public enum C7891nu implements C62957cd {
    UNKNOWN_OPT_IN_SOURCE(0),
    FIRST_RUN(1),
    SETUP_WIZARD(2),
    SETTINGS_MASTER_SWITCH(3),
    SETTINGS_SELECT_ACCOUNT(4),
    GET_NOW_PROMO(5),
    VOICE_SEARCH_ADD_REMINDER(6),
    VOICE_SEARCH_COMMUNICATION(7),
    ACCOUNT_SWITCHER_DRAWER(8),
    GEL(9),
    CLOCKWORK(10),
    GEARHEAD(11),
    NOW_WIDGET(12),
    LOCATION_HISTORY_PROMO_CARD(13),
    WEB_APP_ACTIVITY_PROMO_CARD(14),
    THIRD_PARTY_PROMO_CARD(15),
    PHONELINK_SRP(16),
    NP_REMINDERS_DRAWER_ITEM(17),
    NP_CUSTOMIZE_DRAWER_ITEM(18),
    NP_CUSTOMIZE_STREAM(19),
    NP_WARM_WELCOME_CARD(20),
    SCREEN_ASSIST_OPT_IN(21),
    NOW_OPT_IN_PROMO_CARD(22),
    CARDSYNC(23),
    SETTINGS_SCREEN_ASSIST(24),
    AUTO_ACTIVATION_TASK(25),
    SCREEN_ASSIST_SELECTION_MENU(26),
    SCREEN_ASSIST_CCT(27),
    OLYMPICS_ONEBOX_UPDATES_BUTTON(28),
    OPA_ELIGIBLE_DEVICES(29),
    OPA_INELIGIBLE_DEVICES(30),
    WEB_AND_APP_ACTIVITY_WITH_LOCATION_HISTORY_CARD(31),
    OPT_IN_WORKER(32),
    APP_OPEN_REFRESH(33),
    PODCAST_PLAYER_PROMO_CARD(34),
    GOOGLE_LENS_ONBOARDING(35),
    MINUS_ONE(36),
    COLLECTIONS_SIGN_IN(37),
    DISCOVER_SIGN_IN_PROMO(38),
    SECOND_SCREEN(39);
    

    /* renamed from: O */
    public final int f27730O;

    private C7891nu(int i) {
        this.f27730O = i;
    }

    /* renamed from: a */
    public static C7891nu m22887a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_OPT_IN_SOURCE;
            case 1:
                return FIRST_RUN;
            case 2:
                return SETUP_WIZARD;
            case 3:
                return SETTINGS_MASTER_SWITCH;
            case 4:
                return SETTINGS_SELECT_ACCOUNT;
            case 5:
                return GET_NOW_PROMO;
            case 6:
                return VOICE_SEARCH_ADD_REMINDER;
            case 7:
                return VOICE_SEARCH_COMMUNICATION;
            case 8:
                return ACCOUNT_SWITCHER_DRAWER;
            case 9:
                return GEL;
            case 10:
                return CLOCKWORK;
            case 11:
                return GEARHEAD;
            case 12:
                return NOW_WIDGET;
            case 13:
                return LOCATION_HISTORY_PROMO_CARD;
            case 14:
                return WEB_APP_ACTIVITY_PROMO_CARD;
            case 15:
                return THIRD_PARTY_PROMO_CARD;
            case 16:
                return PHONELINK_SRP;
            case 17:
                return NP_REMINDERS_DRAWER_ITEM;
            case 18:
                return NP_CUSTOMIZE_DRAWER_ITEM;
            case 19:
                return NP_CUSTOMIZE_STREAM;
            case 20:
                return NP_WARM_WELCOME_CARD;
            case 21:
                return SCREEN_ASSIST_OPT_IN;
            case 22:
                return NOW_OPT_IN_PROMO_CARD;
            case 23:
                return CARDSYNC;
            case 24:
                return SETTINGS_SCREEN_ASSIST;
            case 25:
                return AUTO_ACTIVATION_TASK;
            case 26:
                return SCREEN_ASSIST_SELECTION_MENU;
            case 27:
                return SCREEN_ASSIST_CCT;
            case 28:
                return OLYMPICS_ONEBOX_UPDATES_BUTTON;
            case 29:
                return OPA_ELIGIBLE_DEVICES;
            case 30:
                return OPA_INELIGIBLE_DEVICES;
            case 31:
                return WEB_AND_APP_ACTIVITY_WITH_LOCATION_HISTORY_CARD;
            case 32:
                return OPT_IN_WORKER;
            case 33:
                return APP_OPEN_REFRESH;
            case 34:
                return PODCAST_PLAYER_PROMO_CARD;
            case 35:
                return GOOGLE_LENS_ONBOARDING;
            case 36:
                return MINUS_ONE;
            case 37:
                return COLLECTIONS_SIGN_IN;
            case 38:
                return DISCOVER_SIGN_IN_PROMO;
            case 39:
                return SECOND_SCREEN;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m22888b() {
        return C7890nt.f27688a;
    }

    public final int getNumber() {
        return this.f27730O;
    }

    public final String toString() {
        return Integer.toString(this.f27730O);
    }
}
