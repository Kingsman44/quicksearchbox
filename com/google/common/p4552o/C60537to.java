package com.google.common.p4552o;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.common.o.to */
/* compiled from: PG */
public enum C60537to implements C62957cd {
    UNKNOWN_STATE(0),
    SERVER_ERROR(1),
    WEBVIEW_ERROR(2),
    S3_ERROR(3),
    NO_SPEECH_DETECTED(4),
    NO_MATCH_FROM_NETWORK(5),
    NO_CONNECTIVITY(6),
    CAPTCHA_SHOWN(7),
    GENERIC_GSA_ERROR(9),
    GENERIC_ERROR(10),
    WEBVIEW_RENDERED(11),
    ACTION_SHOWN(12),
    TTS_PLAYED(13),
    NO_LONGER_HANDLED(8),
    TASKGRAPH_NO_ENDSTATE_LOGGED(15),
    TASKGRAPH_SUCCESS(14),
    GENERIC_TASKGRAPH_FAILURE(16),
    NATIVE_VOICE_RENDERED(17),
    NOW_CARDS_RENDERED(18),
    NOW_CANCELED_BY_QUERY(19),
    NOW_ERROR_OFFLINE(47),
    NOW_CANCELED_BACK_BUTTON(48),
    NOW_ERROR_FAILED_TO_LOAD_CARDS(50),
    NOW_ERROR_SCOPE_LOAD_FAILURE(51),
    NOW_CANCELED_APP_EXIT(20),
    NOW_CANCELED_REQUEST_MERGED(21),
    NOW_CANCELED_NEW_CARDS_FETCHED(22),
    BAD_ACCOUNT(23),
    AUTH_FAILURE(24),
    INTERNAL_ERROR(25),
    NETWORK_FAILURE(26),
    INTEREST_PICKER_PAGE_RENDERED(27),
    INTEREST_PICKER_PAGE_CANCELED_BACK_PRESSED(28),
    INTEREST_PICKER_PAGE_CANCELED_BREADCRUMB_USED(29),
    INTEREST_PICKER_PAGE_CANCELED_ACTIVITY_DESTROYED(30),
    INTEREST_PICKER_SEARCH_CANCELED(31),
    NATIVE_SOUND_SEARCH_RENDERED(32),
    NATIVE_TEXT_RENDERED(33),
    BACK_PRESSED(34),
    CORPUS_SWITCH(35),
    NEW_QUERY(36),
    CLOSET_PAGE_RENDERED(37),
    CLOSET_PAGE_CANCELED_BACK_PRESSED(38),
    CLOSET_PAGE_CANCELED_ACTIVITY_DESTROYED(39),
    WEBVIEW_CLICKED(40),
    NEW_QUERY_FROM_VOICE_ACTION(41),
    NEW_HOTWORD_QUERY(42),
    NEW_SENTINEL_QUERY(43),
    NEW_EXTERNAL_ACTIVITY_SENTINEL(44),
    IPA_QUERY(45),
    RESTORE_FROM_EXTERNAL_ACTIVITY(46),
    CLOCKWORK_SEARCH_RESPONSE(49),
    INLINE_VIDEO_PLAYER_INIT(52),
    INLINE_VIDEO_PLAY(53),
    QUERY_RESTORED(54),
    MANUAL_CORRECTION_ON_VOICE_PLATE(55),
    LANGUAGE_SWITCHER_TAPPED(56);
    

    /* renamed from: af */
    public final int f164013af;

    private C60537to(int i) {
        this.f164013af = i;
    }

    /* renamed from: a */
    public static C60537to m92607a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_STATE;
            case 1:
                return SERVER_ERROR;
            case 2:
                return WEBVIEW_ERROR;
            case 3:
                return S3_ERROR;
            case 4:
                return NO_SPEECH_DETECTED;
            case 5:
                return NO_MATCH_FROM_NETWORK;
            case 6:
                return NO_CONNECTIVITY;
            case 7:
                return CAPTCHA_SHOWN;
            case 8:
                return NO_LONGER_HANDLED;
            case 9:
                return GENERIC_GSA_ERROR;
            case 10:
                return GENERIC_ERROR;
            case 11:
                return WEBVIEW_RENDERED;
            case 12:
                return ACTION_SHOWN;
            case 13:
                return TTS_PLAYED;
            case 14:
                return TASKGRAPH_SUCCESS;
            case 15:
                return TASKGRAPH_NO_ENDSTATE_LOGGED;
            case 16:
                return GENERIC_TASKGRAPH_FAILURE;
            case 17:
                return NATIVE_VOICE_RENDERED;
            case 18:
                return NOW_CARDS_RENDERED;
            case 19:
                return NOW_CANCELED_BY_QUERY;
            case 20:
                return NOW_CANCELED_APP_EXIT;
            case 21:
                return NOW_CANCELED_REQUEST_MERGED;
            case 22:
                return NOW_CANCELED_NEW_CARDS_FETCHED;
            case 23:
                return BAD_ACCOUNT;
            case 24:
                return AUTH_FAILURE;
            case 25:
                return INTERNAL_ERROR;
            case 26:
                return NETWORK_FAILURE;
            case 27:
                return INTEREST_PICKER_PAGE_RENDERED;
            case 28:
                return INTEREST_PICKER_PAGE_CANCELED_BACK_PRESSED;
            case 29:
                return INTEREST_PICKER_PAGE_CANCELED_BREADCRUMB_USED;
            case 30:
                return INTEREST_PICKER_PAGE_CANCELED_ACTIVITY_DESTROYED;
            case 31:
                return INTEREST_PICKER_SEARCH_CANCELED;
            case 32:
                return NATIVE_SOUND_SEARCH_RENDERED;
            case 33:
                return NATIVE_TEXT_RENDERED;
            case 34:
                return BACK_PRESSED;
            case 35:
                return CORPUS_SWITCH;
            case 36:
                return NEW_QUERY;
            case 37:
                return CLOSET_PAGE_RENDERED;
            case 38:
                return CLOSET_PAGE_CANCELED_BACK_PRESSED;
            case 39:
                return CLOSET_PAGE_CANCELED_ACTIVITY_DESTROYED;
            case 40:
                return WEBVIEW_CLICKED;
            case 41:
                return NEW_QUERY_FROM_VOICE_ACTION;
            case 42:
                return NEW_HOTWORD_QUERY;
            case 43:
                return NEW_SENTINEL_QUERY;
            case 44:
                return NEW_EXTERNAL_ACTIVITY_SENTINEL;
            case 45:
                return IPA_QUERY;
            case 46:
                return RESTORE_FROM_EXTERNAL_ACTIVITY;
            case 47:
                return NOW_ERROR_OFFLINE;
            case 48:
                return NOW_CANCELED_BACK_BUTTON;
            case 49:
                return CLOCKWORK_SEARCH_RESPONSE;
            case 50:
                return NOW_ERROR_FAILED_TO_LOAD_CARDS;
            case 51:
                return NOW_ERROR_SCOPE_LOAD_FAILURE;
            case 52:
                return INLINE_VIDEO_PLAYER_INIT;
            case 53:
                return INLINE_VIDEO_PLAY;
            case 54:
                return QUERY_RESTORED;
            case 55:
                return MANUAL_CORRECTION_ON_VOICE_PLATE;
            case 56:
                return LANGUAGE_SWITCHER_TAPPED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m92608b() {
        return C60536tn.f163954a;
    }

    public final int getNumber() {
        return this.f164013af;
    }

    public final String toString() {
        return Integer.toString(this.f164013af);
    }
}
