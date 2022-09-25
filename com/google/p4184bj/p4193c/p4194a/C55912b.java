package com.google.p4184bj.p4193c.p4194a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.bj.c.a.b */
/* compiled from: PG */
public enum C55912b implements C62957cd {
    ACTIVITY_CONTROLS_SETTING_UNKNOWN(0),
    WEB_AND_APP_ACTIVITY(1),
    VOICE_AND_AUDIO_ACTIVITY(2),
    SUPPLEMENTAL_WEB_AND_APP_ACTIVITY(3),
    DEVICE_INFORMATION(4),
    DEVICE_APPS(9),
    DEVICE_CONTACTS(10),
    YOUTUBE_WATCH_HISTORY(5),
    YOUTUBE_SEARCH_HISTORY(6),
    YOUTUBE(8),
    YOUTUBE_VOICE_AND_AUDIO_ACTIVITY(25),
    SEARCH_CUSTOMIZATION(11),
    DBL_ADS_PERSONALIZATION(12),
    LOCATION_HISTORY(13),
    LOCATION_HISTORY_GATES_ADS(39),
    LOCATION_HISTORY_GATES_PERSONALIZATION(40),
    WAA_LOCATION_BASED_RESULTS(41),
    WAA_LOCATION_BASED_RECOMMENDATIONS(42),
    SEARCH_NOTIFICATIONS_BACKGROUND_LOCATION(43),
    SUPERVISED_USER_APP_ACTIVITY(14),
    SEARCH_PERSONAL_RESULTS(22),
    SAFE_SEARCH(23),
    WORKSPACE_SEARCH_ACTIVITY(24),
    ACCOUNT_ENHANCED_SAFE_BROWSING(26),
    PAYMENTS_DATA_USE(15),
    PAYMENTS_1P_DATA_USE(16),
    PAYMENTS_READY_TO_PAY(19),
    PAYMENTS_MARKETING(20),
    PAYMENTS_CREDITWORTHINESS(21),
    EECC_IN_PRODUCT_DATA_USE(17),
    EECC_CROSS_PRODUCT_DATA_USE(18),
    ASSISTANT(7),
    CLOUD_WEBINSIGHTS_PERSONALIZATION(27),
    CLOUD_WEBINSIGHTS_ADVERTISING(28),
    VOICE_FACE_MATCH(29),
    VOICE_MATCH(37),
    GAIA_AD_PERSONALIZATION(30),
    ZWIEBACK_AD_PERSONALIZATION(32),
    YOUTUBE_VISITOR_AD_PERSONALIZATION(33),
    ESSENTIAL_ONLY_MODE(34),
    KID_FRIENDLY_SEARCH(31),
    WALLET_PRIVACY_CONTEXTUAL_SURFACING(35),
    WALLET_PRIVACY_PERSONALIZED_SURFACING(36),
    WALLET_APP_PERSONALIZATION(38),
    DATA_POND_SEARCH(44),
    DATA_POND_YOUTUBE(45),
    DATA_POND_SHOPPING(46);
    

    /* renamed from: V */
    public final int f148826V;

    private C55912b(int i) {
        this.f148826V = i;
    }

    /* renamed from: a */
    public static C55912b m87801a(int i) {
        switch (i) {
            case 0:
                return ACTIVITY_CONTROLS_SETTING_UNKNOWN;
            case 1:
                return WEB_AND_APP_ACTIVITY;
            case 2:
                return VOICE_AND_AUDIO_ACTIVITY;
            case 3:
                return SUPPLEMENTAL_WEB_AND_APP_ACTIVITY;
            case 4:
                return DEVICE_INFORMATION;
            case 5:
                return YOUTUBE_WATCH_HISTORY;
            case 6:
                return YOUTUBE_SEARCH_HISTORY;
            case 7:
                return ASSISTANT;
            case 8:
                return YOUTUBE;
            case 9:
                return DEVICE_APPS;
            case 10:
                return DEVICE_CONTACTS;
            case 11:
                return SEARCH_CUSTOMIZATION;
            case 12:
                return DBL_ADS_PERSONALIZATION;
            case 13:
                return LOCATION_HISTORY;
            case 14:
                return SUPERVISED_USER_APP_ACTIVITY;
            case 15:
                return PAYMENTS_DATA_USE;
            case 16:
                return PAYMENTS_1P_DATA_USE;
            case 17:
                return EECC_IN_PRODUCT_DATA_USE;
            case 18:
                return EECC_CROSS_PRODUCT_DATA_USE;
            case 19:
                return PAYMENTS_READY_TO_PAY;
            case 20:
                return PAYMENTS_MARKETING;
            case 21:
                return PAYMENTS_CREDITWORTHINESS;
            case 22:
                return SEARCH_PERSONAL_RESULTS;
            case 23:
                return SAFE_SEARCH;
            case 24:
                return WORKSPACE_SEARCH_ACTIVITY;
            case 25:
                return YOUTUBE_VOICE_AND_AUDIO_ACTIVITY;
            case 26:
                return ACCOUNT_ENHANCED_SAFE_BROWSING;
            case 27:
                return CLOUD_WEBINSIGHTS_PERSONALIZATION;
            case 28:
                return CLOUD_WEBINSIGHTS_ADVERTISING;
            case 29:
                return VOICE_FACE_MATCH;
            case 30:
                return GAIA_AD_PERSONALIZATION;
            case 31:
                return KID_FRIENDLY_SEARCH;
            case 32:
                return ZWIEBACK_AD_PERSONALIZATION;
            case 33:
                return YOUTUBE_VISITOR_AD_PERSONALIZATION;
            case 34:
                return ESSENTIAL_ONLY_MODE;
            case 35:
                return WALLET_PRIVACY_CONTEXTUAL_SURFACING;
            case 36:
                return WALLET_PRIVACY_PERSONALIZED_SURFACING;
            case 37:
                return VOICE_MATCH;
            case 38:
                return WALLET_APP_PERSONALIZATION;
            case 39:
                return LOCATION_HISTORY_GATES_ADS;
            case 40:
                return LOCATION_HISTORY_GATES_PERSONALIZATION;
            case 41:
                return WAA_LOCATION_BASED_RESULTS;
            case 42:
                return WAA_LOCATION_BASED_RECOMMENDATIONS;
            case 43:
                return SEARCH_NOTIFICATIONS_BACKGROUND_LOCATION;
            case 44:
                return DATA_POND_SEARCH;
            case 45:
                return DATA_POND_YOUTUBE;
            case 46:
                return DATA_POND_SHOPPING;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m87802b() {
        return C55911a.f148777a;
    }

    public final int getNumber() {
        return this.f148826V;
    }

    public final String toString() {
        return Integer.toString(this.f148826V);
    }
}
