package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.bu */
/* compiled from: PG */
public enum C87739bu implements C62957cd {
    UNKNOWN(0),
    WINDOW_FOCUS_CHANGED(2),
    PADDING_CHANGED(3),
    ACTION_DRAG_BEGIN(10),
    SUGGESTION_ACTION_BUTTON_CLICKED(11),
    CONTACT_SELECTED_EXTERNALLY(12),
    SUGGEST_RESPONSE_RENDERED(17),
    ACTION_VE_LOGGING_EVENT(18),
    ACTION_CHANGED_EXTERNALLY(23),
    SUGGESTION_CLICK(24),
    REMOVE_SUGGESTION(25),
    CANVAS_WORKER_BINDER_REQUEST(27),
    NEW_ACTIVE_NOTIFICATIONS(32),
    CLEAR_ACTIVE_NOTIFICATIONS(64),
    ACTION_COUNTDOWN_CANCELED(34),
    ESCAPE_HATCH_CLICKED(35),
    ACQUIRE_KEYBOARD_FOCUS(36),
    RELEASE_KEYBOARD_FOCUS(37),
    ACTION_USER_INTERACTION(38),
    SAVE_USER_INTERACTION(39),
    SET_GWS_LOGGABLE_EVENT(41),
    SUPPRESS_GWS_LOGGABLE_EVENT(42),
    UNDOABLE_INTERACTION_NOT_HANDLED(44),
    CLEAR_VOICE_ACTIONS(46),
    HANDLE_ACTIONS_BACK_PRESS(52),
    GCM_MESSAGE_RECEIVED(53),
    OPT_IN_REQUEST(54),
    LEGACY_ACTIVE_NOTIFICATIONS(57),
    HOTWORD_DETECTED_IN_INTERACTOR(58),
    HOTWORD_REJECTED_AFTER_DSP_TRIGGERED(59),
    ACTIVITY_COMPLETED_WITH_RESULT(60),
    TTS_PLAYBACK_COMPLETE(61),
    BROWSABLE_INTENT_LAUNCHED_IN_CLIENT(63),
    GEARHEAD_CONNECTED(65),
    GEARHEAD_DISCONNECTED(66),
    REMOTE_ACTION_TRIGGERED(68),
    STOP_LISTENING(69),
    STOP_SPEAKING(70),
    GO_BACK(71),
    SET_BROWSER_DIMENSION(72),
    TTS_STOP_SPEAKING(73),
    WEBVIEW_VISIBLE(74),
    SET_HOTWORD_DETECTION_ENABLED(77),
    QUERY_SET(78),
    QUERY_EDIT(79),
    QUERY_COMMIT(80),
    RECENTLY_SCREENSHOT_CAPTURED(81),
    CANCEL(83),
    REQUEST_EXECUTE_ACTION(84),
    REQUEST_CANCEL_ACTION_EXECUTION(85),
    DEBUG_TRIM_MEMORY(92),
    PRERENDER_AMP_VIEWER(93),
    OPEN_AMP_VIEWER(94),
    OPEN_AMP_ACTIONS_VIEWER(349),
    PRERENDER_AMP_ACTIONS_VIEWER(352),
    PRERENDER_AMP_DOCUMENT(338),
    OPEN_AMP_DOCUMENT(339),
    AMP_VIEWER_SUPPORT_REQUEST(95),
    SEARCH_PLATE_TEXT_SELECTED(96),
    START_CLIENT(98),
    STOP_CLIENT(99),
    MONET_CLIENT_EVENT(100),
    ACTION_UI_READY(106),
    LOG_APP_ENTRY(108),
    MONET_CLIENT_LIFECYCLE_EVENT(114),
    EXECUTE_MEDIA(117),
    OPA_UI_MODE(121),
    REFRESH_SERVICE_STATE(122),
    VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED(126),
    HOTWORD_TRIGGERED_ON_DSP(128),
    VOICE_SEARCH_HANDS_FREE(129),
    DUMMY_CLIENT_EVENT(130),
    DUMMY_BACKGROUND_TASK_EVENT(131),
    GENERIC_SUGGEST_EVENT(133),
    OPEN_AIRPLANE_MODE_SETTINGS_BUTTON_TAPPED(137),
    OPEN_DATA_USAGE_SETTINGS_BUTTON_TAPPED(306),
    OPEN_DATA_ROAMING_SETTINGS_BUTTON_TAPPED(307),
    OPEN_WIFI_SETTINGS_BUTTON_TAPPED(308),
    OPEN_WIRELESS_SETTINGS_BUTTON_TAPPED(473),
    SIGN_IN_TO_NETWORK_BUTTON_TAPPED(139),
    DEEPLINK(148),
    SEARCH_DEEPLINK(149),
    CACHE_BACKGROUND_RETRY(150),
    SEARCH_PLATE_MIC_TAPPED(151),
    START_PRONUNCIATION_LEARNING(152),
    CANCEL_PRONUNCIATION_LEARNING(153),
    OPA_INPUT_MODE(155),
    UPDATE_GSA_CONFIGS(156),
    FETCH_CONFIGS_FROM_PHENOTYPE(157),
    LENS_SERVICE_IMAGE_INJECT(341),
    FINGERPRINT_AUTH_CLIENT_EVENT(168),
    REAUTH_CLIENT_EVENT(169),
    OPA_CLIENT_INPUT(173),
    COMMON_BROADCAST_MESSAGE_RECEIVED(174),
    BACKGROUND_TASK_STARTED(PrivateKeyType.INVALID),
    BACKUP_DATA(189),
    RESTORE_DATA(190),
    START_OPA_ACTIVITY_FOR_L_ASSIST(191),
    WIDGET_INTENT_RECEIVED(194),
    PROPERTIES_UPDATE_IN_PHENOTYPE(196),
    BISTO_DEVICE_INFO_PUBLISH(199),
    PIXEL_APPS(251),
    OPA_DEEPLINK(257),
    COMMON_CONTENT_PROVIDER_QUERY(258),
    COMMON_CONTENT_PROVIDER_GET_TYPE(259),
    COMMON_CONTENT_PROVIDER_INSERT(260),
    COMMON_CONTENT_PROVIDER_BULK_INSERT(270),
    COMMON_CONTENT_PROVIDER_DELETE(261),
    COMMON_CONTENT_PROVIDER_UPDATE(262),
    COMMON_CONTENT_PROVIDER_OPEN_FILE(274),
    OPA_REQUEST_SHERLOG_ENTRIES(267),
    OPA_ACTIVITY_LIFECYCLE_STATE(269),
    SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS(272),
    LOG_APP_FLOW_EVENT(277),
    BISTO_START_ACTIVITY_REQUEST(281),
    OPA_DISPLAY_CONTEXT_UPDATED(283),
    PIXEL_SEARCH_STARTED(284),
    OPA_ACTIVITY_SIZE(286),
    ACETONE_LOG_STATE(297),
    OPA_FOREGROUND_APP_UPDATED(298),
    OPA_REQUEST_MEDIA_SESSION_TOKEN(299),
    RSS_GMM_COMMUTE_UPDATE(300),
    RSS_GMM_COMMUTE_QUERY(301),
    PREPARE_CCT_SESSION(160),
    PIXEL_HOMESCREEN_QSB_TAPPED(311),
    SUGGEST_FEEDBACK_CLICK(314),
    OPA_CANCEL_CONVERSATION(315),
    SAVE_ENTRY_LOCATION(317),
    SAVE_RELATIONSHIP(318),
    BISTO_UPDATE_CUSTOMIZATION(320),
    DEVICE_BOOT(321),
    APP_INSTALL(322),
    HTTP_EXECUTE_REQUEST_UNBUFFERED(323),
    HTTP_EXECUTE_REQUEST(326),
    HTTP_CREATE_GRPC_CHANNEL(331),
    HTTP_GET_STATISTICS(324),
    HTTP_FORCE_START_NETLOG(328),
    HTTP_CAPTURE_NETLOG(329),
    HTTP_SET_TESTING_URL_REWRITER(330),
    ASSISTANT_CLIENT_SYNC_START(325),
    TAPAS_SEARCH_START(445),
    TAPAS_SEARCH_END(454),
    TAPAS_SUBMIT_FEEDBACK(446),
    BACKGROUND_ASSISTANT_CLIENT_SYNC_START(402),
    RELOAD_QUERY_STATE(327),
    FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES(332),
    DELIVER_ACTIVE_NOTIFICATIONS(333),
    DELIVER_APP_NOTIFICATIONS(470),
    DELIVER_NEW_ACTIVE_NOTIFICATIONS(424),
    DELIVER_REMOVED_NOTIFICATIONS(425),
    DELIVER_GEARHEAD_NOTIFICATIONS(400),
    SEND_TTR_CLIENT_INPUT(408),
    SEND_DIRECT_REPLY_CLIENT_INPUT(459),
    SEND_DIGITAL_OBJECT_CLIENT_INPUT(482),
    SEARCH_NOW_ACTIVITY_BOOTSTRAPPED(334),
    MAPS_NAVIGATION_STATE_UPDATE(335),
    BISTO_STARTUP_PREF_CHANGED(336),
    SCREEN_STATE_CHANGE(337),
    END_SESSION(345),
    LENS_SERVICE_WARM_UP_ACTIVITY(347),
    LENS_SERVICE_TARGET_API_VERSION(348),
    BACKGROUND_NOW_OPT_IN(354),
    LENS_SERVICE_START_ACTIVITY(355),
    LENS_SERVICE_START_STREAMING(448),
    LENS_SERVICE_REQUEST_PENDING_INTENT(412),
    PLAY_TTS(358),
    STOP_TTS(359),
    SMARTSPACE_GENERIC_UPDATE(360),
    SMARTSPACE_READY_QUERY(361),
    DEBUG_REFRESH_COOKIES(363),
    DEBUG_SET_COOKIE(364),
    MEDIA_BROWSER_FETCH_MEDIA_SESSION_TOKEN(365),
    MEDIA_BROWSER_LOAD_CHILDREN(366),
    NOTIFICATION_REPLY_RESULT(367),
    BISTO_DOWNLOAD_LOW_THRESHOLD_HOTWORD_MODEL(368),
    LENS_SERVICE_LENS_VIEW_CLIENT_EVENT(370),
    LENS_LITE_CLIENT_EVENT(389),
    SEND_REPLY_TO_NOTIFICATION(372),
    OPA_SESSION_CLIENT_EVENT(375),
    OPA_AMBIENT_SESSION_CLIENT_EVENT(427),
    HOTWORD_DETECTED_ON_ACTIVE_CLIENT(376),
    OPA_APP_INTEGRATION_PLAY_TTS(377),
    OPA_APP_INTEGRATION_STOP_TTS(378),
    HANDS_FREE_QUERY_COMMIT(379),
    REQUEST_ZERO_STATE_RESPONSE(382),
    ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_IN(384),
    ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_OUT(385),
    ACETONE_LOG_USER_EVENT_MINUS_ONE_CLOSE(386),
    ACETONE_LOG_USER_EVENT_MINUS_ONE_TAP_BACK_BUTTON(387),
    ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_FAILED(388),
    HOTWORD_SERVICE_CONNECTED(391),
    ELEMENTS_LOG_CLICK(392),
    ELEMENTS_LOG_VISIBILITY_CHANGE(394),
    NGA_CLIENT_EVENT(397),
    EXTERNAL_VOICE_ASSIST(401),
    BISTO_START_AUDIO_TESTING(403),
    BISTO_STOP_AUDIO_TESTING(404),
    DELIVER_MORRIS_NOTIFICATION(406),
    DELIVER_PARSED_MORRIS_NOTIFICATION(474),
    DELIVER_SINGLE_PARSED_MORRIS_NOTIFICATION(475),
    FETCH_VALID_UNREAD_MESSAGES(410),
    REPLY_TO_NOTIFICATIONS(428),
    CAR_ASSISTANT_FUSION_VOICE_PLATE_OPEN(411),
    TOP_RESUMED_ACTIVTIY(413),
    DEBUG_DEADLOCK_EVENTBUS(414),
    FETCH_NOW_ELIGIBILITY(416),
    NOTIFICATION_ACCESS_MISSING(418),
    NOTIFICATION_ACCESS_MISSING_FALLBACK_DISABLED(429),
    BISTO_CHANGE_HOTWORD_ENABLED_PREF(420),
    CAR_ASSISTANT_SUGGESTION_CLICKED(421),
    SET_EXPECTED_TISID_ENROLLMENT_QUERY(423),
    LAUNCH_CCT_BACK_TO_DISCOVER_ACTIVITY(426),
    DELIVER_PARSED_NOTIFICATIONS(430),
    SEND_MULTI_DEVICE_ARBITRATION_REQUEST(431),
    EXPLORE_ON_CONTENT_REQUEST(434),
    CAR_ASSISTANT_CLOSE_AUDIO_SESSION(435),
    CAR_ASSISTANT_HOTWORD_REQUEST(436),
    BISTO_LOG_VE_EVENT(437),
    LENS_SERVICE_SDK_CLIENT_EVENT(438),
    SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SELECTED(439),
    BISTO_REFRESH_ASSISTANT_SETTINGS(440),
    APP_MOVED_TO_FOREGROUND(443),
    APP_MOVED_TO_BACKGROUND(444),
    APP_ACTIONS_NOTIFICATION(447),
    SAVE_CAR_ASSISTANT_STATE(449),
    REQUEST_WELCOME_TTS_ON_TIMEOUT(450),
    BISTO_PR_OR_HPR_PREF_CHANGED(455),
    BISTO_ALLOW_HEADPHONE_PR(456),
    BISTO_HANDLE_VOICE_SEARCH_INTENT(457),
    SUBSEQUENT_REQUEST_IN_UI_SESSION(460),
    SHOW_CHATHEAD_NOTIFICATION(462),
    SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_INTERACTION_MADE(464),
    CAR_ASSISTANT_COLD_BOOT_ENDED(465),
    SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_CLOSED(466),
    PLAY_TTS_NUDGE_LANGUAGE_PICKER_VOICE_SEARCH(467),
    SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_AUTO_OPTION_SELECTED(483),
    STOP_PLAYING_AUDIO(469),
    SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_NUDGE_SHOWN(471),
    BISTO_CLEANUP_DEVICE(472),
    MANUAL_CORRECTION_ON_VOICE_PLATE(476),
    CAR_ASSISTANT_SESSION_STATE(477),
    SET_TISID_IMPERSONATED_USER(478),
    SEARCH_BUBBLE_SNA_EVENT(479),
    GACS_CLIENT_OP_RESULT(480),
    LANGUAGE_SWITCHER_TAPPED(481);
    

    /* renamed from: dL */
    public final int f237476dL;

    private C87739bu(int i) {
        this.f237476dL = i;
    }

    /* renamed from: a */
    public static C87739bu m142761a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 2:
                return WINDOW_FOCUS_CHANGED;
            case 3:
                return PADDING_CHANGED;
            case 10:
                return ACTION_DRAG_BEGIN;
            case 11:
                return SUGGESTION_ACTION_BUTTON_CLICKED;
            case 12:
                return CONTACT_SELECTED_EXTERNALLY;
            case 17:
                return SUGGEST_RESPONSE_RENDERED;
            case 18:
                return ACTION_VE_LOGGING_EVENT;
            case 23:
                return ACTION_CHANGED_EXTERNALLY;
            case 24:
                return SUGGESTION_CLICK;
            case 25:
                return REMOVE_SUGGESTION;
            case 27:
                return CANVAS_WORKER_BINDER_REQUEST;
            case 32:
                return NEW_ACTIVE_NOTIFICATIONS;
            case 34:
                return ACTION_COUNTDOWN_CANCELED;
            case 35:
                return ESCAPE_HATCH_CLICKED;
            case 36:
                return ACQUIRE_KEYBOARD_FOCUS;
            case 37:
                return RELEASE_KEYBOARD_FOCUS;
            case 38:
                return ACTION_USER_INTERACTION;
            case 39:
                return SAVE_USER_INTERACTION;
            case 41:
                return SET_GWS_LOGGABLE_EVENT;
            case 42:
                return SUPPRESS_GWS_LOGGABLE_EVENT;
            case 44:
                return UNDOABLE_INTERACTION_NOT_HANDLED;
            case 46:
                return CLEAR_VOICE_ACTIONS;
            case 52:
                return HANDLE_ACTIONS_BACK_PRESS;
            case 53:
                return GCM_MESSAGE_RECEIVED;
            case 54:
                return OPT_IN_REQUEST;
            case 57:
                return LEGACY_ACTIVE_NOTIFICATIONS;
            case 58:
                return HOTWORD_DETECTED_IN_INTERACTOR;
            case 59:
                return HOTWORD_REJECTED_AFTER_DSP_TRIGGERED;
            case 60:
                return ACTIVITY_COMPLETED_WITH_RESULT;
            case 61:
                return TTS_PLAYBACK_COMPLETE;
            case 63:
                return BROWSABLE_INTENT_LAUNCHED_IN_CLIENT;
            case 64:
                return CLEAR_ACTIVE_NOTIFICATIONS;
            case 65:
                return GEARHEAD_CONNECTED;
            case 66:
                return GEARHEAD_DISCONNECTED;
            case 68:
                return REMOTE_ACTION_TRIGGERED;
            case 69:
                return STOP_LISTENING;
            case 70:
                return STOP_SPEAKING;
            case 71:
                return GO_BACK;
            case 72:
                return SET_BROWSER_DIMENSION;
            case 73:
                return TTS_STOP_SPEAKING;
            case 74:
                return WEBVIEW_VISIBLE;
            case 77:
                return SET_HOTWORD_DETECTION_ENABLED;
            case 78:
                return QUERY_SET;
            case 79:
                return QUERY_EDIT;
            case 80:
                return QUERY_COMMIT;
            case 81:
                return RECENTLY_SCREENSHOT_CAPTURED;
            case 83:
                return CANCEL;
            case 84:
                return REQUEST_EXECUTE_ACTION;
            case 85:
                return REQUEST_CANCEL_ACTION_EXECUTION;
            case 92:
                return DEBUG_TRIM_MEMORY;
            case 93:
                return PRERENDER_AMP_VIEWER;
            case 94:
                return OPEN_AMP_VIEWER;
            case 95:
                return AMP_VIEWER_SUPPORT_REQUEST;
            case 96:
                return SEARCH_PLATE_TEXT_SELECTED;
            case 98:
                return START_CLIENT;
            case 99:
                return STOP_CLIENT;
            case 100:
                return MONET_CLIENT_EVENT;
            case 106:
                return ACTION_UI_READY;
            case 108:
                return LOG_APP_ENTRY;
            case 114:
                return MONET_CLIENT_LIFECYCLE_EVENT;
            case 117:
                return EXECUTE_MEDIA;
            case 121:
                return OPA_UI_MODE;
            case 122:
                return REFRESH_SERVICE_STATE;
            case 126:
                return VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED;
            case 128:
                return HOTWORD_TRIGGERED_ON_DSP;
            case 129:
                return VOICE_SEARCH_HANDS_FREE;
            case 130:
                return DUMMY_CLIENT_EVENT;
            case 131:
                return DUMMY_BACKGROUND_TASK_EVENT;
            case 133:
                return GENERIC_SUGGEST_EVENT;
            case 137:
                return OPEN_AIRPLANE_MODE_SETTINGS_BUTTON_TAPPED;
            case 139:
                return SIGN_IN_TO_NETWORK_BUTTON_TAPPED;
            case 148:
                return DEEPLINK;
            case 149:
                return SEARCH_DEEPLINK;
            case 150:
                return CACHE_BACKGROUND_RETRY;
            case 151:
                return SEARCH_PLATE_MIC_TAPPED;
            case 152:
                return START_PRONUNCIATION_LEARNING;
            case 153:
                return CANCEL_PRONUNCIATION_LEARNING;
            case 155:
                return OPA_INPUT_MODE;
            case 156:
                return UPDATE_GSA_CONFIGS;
            case 157:
                return FETCH_CONFIGS_FROM_PHENOTYPE;
            case 160:
                return PREPARE_CCT_SESSION;
            case 168:
                return FINGERPRINT_AUTH_CLIENT_EVENT;
            case 169:
                return REAUTH_CLIENT_EVENT;
            case 173:
                return OPA_CLIENT_INPUT;
            case 174:
                return COMMON_BROADCAST_MESSAGE_RECEIVED;
            case 189:
                return BACKUP_DATA;
            case 190:
                return RESTORE_DATA;
            case 191:
                return START_OPA_ACTIVITY_FOR_L_ASSIST;
            case 194:
                return WIDGET_INTENT_RECEIVED;
            case 196:
                return PROPERTIES_UPDATE_IN_PHENOTYPE;
            case 199:
                return BISTO_DEVICE_INFO_PUBLISH;
            case 251:
                return PIXEL_APPS;
            case PrivateKeyType.INVALID:
                return BACKGROUND_TASK_STARTED;
            case 257:
                return OPA_DEEPLINK;
            case 258:
                return COMMON_CONTENT_PROVIDER_QUERY;
            case 259:
                return COMMON_CONTENT_PROVIDER_GET_TYPE;
            case 260:
                return COMMON_CONTENT_PROVIDER_INSERT;
            case 261:
                return COMMON_CONTENT_PROVIDER_DELETE;
            case 262:
                return COMMON_CONTENT_PROVIDER_UPDATE;
            case 267:
                return OPA_REQUEST_SHERLOG_ENTRIES;
            case 269:
                return OPA_ACTIVITY_LIFECYCLE_STATE;
            case 270:
                return COMMON_CONTENT_PROVIDER_BULK_INSERT;
            case 272:
                return SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS;
            case 274:
                return COMMON_CONTENT_PROVIDER_OPEN_FILE;
            case 277:
                return LOG_APP_FLOW_EVENT;
            case 281:
                return BISTO_START_ACTIVITY_REQUEST;
            case 283:
                return OPA_DISPLAY_CONTEXT_UPDATED;
            case 284:
                return PIXEL_SEARCH_STARTED;
            case 286:
                return OPA_ACTIVITY_SIZE;
            case 297:
                return ACETONE_LOG_STATE;
            case 298:
                return OPA_FOREGROUND_APP_UPDATED;
            case 299:
                return OPA_REQUEST_MEDIA_SESSION_TOKEN;
            case 300:
                return RSS_GMM_COMMUTE_UPDATE;
            case 301:
                return RSS_GMM_COMMUTE_QUERY;
            case 306:
                return OPEN_DATA_USAGE_SETTINGS_BUTTON_TAPPED;
            case 307:
                return OPEN_DATA_ROAMING_SETTINGS_BUTTON_TAPPED;
            case 308:
                return OPEN_WIFI_SETTINGS_BUTTON_TAPPED;
            case 311:
                return PIXEL_HOMESCREEN_QSB_TAPPED;
            case 314:
                return SUGGEST_FEEDBACK_CLICK;
            case 315:
                return OPA_CANCEL_CONVERSATION;
            case 317:
                return SAVE_ENTRY_LOCATION;
            case 318:
                return SAVE_RELATIONSHIP;
            case 320:
                return BISTO_UPDATE_CUSTOMIZATION;
            case 321:
                return DEVICE_BOOT;
            case 322:
                return APP_INSTALL;
            case 323:
                return HTTP_EXECUTE_REQUEST_UNBUFFERED;
            case 324:
                return HTTP_GET_STATISTICS;
            case 325:
                return ASSISTANT_CLIENT_SYNC_START;
            case 326:
                return HTTP_EXECUTE_REQUEST;
            case 327:
                return RELOAD_QUERY_STATE;
            case 328:
                return HTTP_FORCE_START_NETLOG;
            case 329:
                return HTTP_CAPTURE_NETLOG;
            case 330:
                return HTTP_SET_TESTING_URL_REWRITER;
            case 331:
                return HTTP_CREATE_GRPC_CHANNEL;
            case 332:
                return FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES;
            case 333:
                return DELIVER_ACTIVE_NOTIFICATIONS;
            case 334:
                return SEARCH_NOW_ACTIVITY_BOOTSTRAPPED;
            case 335:
                return MAPS_NAVIGATION_STATE_UPDATE;
            case 336:
                return BISTO_STARTUP_PREF_CHANGED;
            case 337:
                return SCREEN_STATE_CHANGE;
            case 338:
                return PRERENDER_AMP_DOCUMENT;
            case 339:
                return OPEN_AMP_DOCUMENT;
            case 341:
                return LENS_SERVICE_IMAGE_INJECT;
            case 345:
                return END_SESSION;
            case 347:
                return LENS_SERVICE_WARM_UP_ACTIVITY;
            case 348:
                return LENS_SERVICE_TARGET_API_VERSION;
            case 349:
                return OPEN_AMP_ACTIONS_VIEWER;
            case 352:
                return PRERENDER_AMP_ACTIONS_VIEWER;
            case 354:
                return BACKGROUND_NOW_OPT_IN;
            case 355:
                return LENS_SERVICE_START_ACTIVITY;
            case 358:
                return PLAY_TTS;
            case 359:
                return STOP_TTS;
            case 360:
                return SMARTSPACE_GENERIC_UPDATE;
            case 361:
                return SMARTSPACE_READY_QUERY;
            case 363:
                return DEBUG_REFRESH_COOKIES;
            case 364:
                return DEBUG_SET_COOKIE;
            case 365:
                return MEDIA_BROWSER_FETCH_MEDIA_SESSION_TOKEN;
            case 366:
                return MEDIA_BROWSER_LOAD_CHILDREN;
            case 367:
                return NOTIFICATION_REPLY_RESULT;
            case 368:
                return BISTO_DOWNLOAD_LOW_THRESHOLD_HOTWORD_MODEL;
            case 370:
                return LENS_SERVICE_LENS_VIEW_CLIENT_EVENT;
            case 372:
                return SEND_REPLY_TO_NOTIFICATION;
            case 375:
                return OPA_SESSION_CLIENT_EVENT;
            case 376:
                return HOTWORD_DETECTED_ON_ACTIVE_CLIENT;
            case 377:
                return OPA_APP_INTEGRATION_PLAY_TTS;
            case 378:
                return OPA_APP_INTEGRATION_STOP_TTS;
            case 379:
                return HANDS_FREE_QUERY_COMMIT;
            case 382:
                return REQUEST_ZERO_STATE_RESPONSE;
            case 384:
                return ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_IN;
            case 385:
                return ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_OUT;
            case 386:
                return ACETONE_LOG_USER_EVENT_MINUS_ONE_CLOSE;
            case 387:
                return ACETONE_LOG_USER_EVENT_MINUS_ONE_TAP_BACK_BUTTON;
            case 388:
                return ACETONE_LOG_USER_EVENT_MINUS_ONE_SWIPE_FAILED;
            case 389:
                return LENS_LITE_CLIENT_EVENT;
            case 391:
                return HOTWORD_SERVICE_CONNECTED;
            case 392:
                return ELEMENTS_LOG_CLICK;
            case 394:
                return ELEMENTS_LOG_VISIBILITY_CHANGE;
            case 397:
                return NGA_CLIENT_EVENT;
            case 400:
                return DELIVER_GEARHEAD_NOTIFICATIONS;
            case 401:
                return EXTERNAL_VOICE_ASSIST;
            case 402:
                return BACKGROUND_ASSISTANT_CLIENT_SYNC_START;
            case 403:
                return BISTO_START_AUDIO_TESTING;
            case 404:
                return BISTO_STOP_AUDIO_TESTING;
            case 406:
                return DELIVER_MORRIS_NOTIFICATION;
            case 408:
                return SEND_TTR_CLIENT_INPUT;
            case 410:
                return FETCH_VALID_UNREAD_MESSAGES;
            case 411:
                return CAR_ASSISTANT_FUSION_VOICE_PLATE_OPEN;
            case 412:
                return LENS_SERVICE_REQUEST_PENDING_INTENT;
            case 413:
                return TOP_RESUMED_ACTIVTIY;
            case 414:
                return DEBUG_DEADLOCK_EVENTBUS;
            case 416:
                return FETCH_NOW_ELIGIBILITY;
            case 418:
                return NOTIFICATION_ACCESS_MISSING;
            case 420:
                return BISTO_CHANGE_HOTWORD_ENABLED_PREF;
            case 421:
                return CAR_ASSISTANT_SUGGESTION_CLICKED;
            case 423:
                return SET_EXPECTED_TISID_ENROLLMENT_QUERY;
            case 424:
                return DELIVER_NEW_ACTIVE_NOTIFICATIONS;
            case 425:
                return DELIVER_REMOVED_NOTIFICATIONS;
            case 426:
                return LAUNCH_CCT_BACK_TO_DISCOVER_ACTIVITY;
            case 427:
                return OPA_AMBIENT_SESSION_CLIENT_EVENT;
            case 428:
                return REPLY_TO_NOTIFICATIONS;
            case 429:
                return NOTIFICATION_ACCESS_MISSING_FALLBACK_DISABLED;
            case 430:
                return DELIVER_PARSED_NOTIFICATIONS;
            case 431:
                return SEND_MULTI_DEVICE_ARBITRATION_REQUEST;
            case 434:
                return EXPLORE_ON_CONTENT_REQUEST;
            case 435:
                return CAR_ASSISTANT_CLOSE_AUDIO_SESSION;
            case 436:
                return CAR_ASSISTANT_HOTWORD_REQUEST;
            case 437:
                return BISTO_LOG_VE_EVENT;
            case 438:
                return LENS_SERVICE_SDK_CLIENT_EVENT;
            case 439:
                return SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SELECTED;
            case 440:
                return BISTO_REFRESH_ASSISTANT_SETTINGS;
            case 443:
                return APP_MOVED_TO_FOREGROUND;
            case 444:
                return APP_MOVED_TO_BACKGROUND;
            case 445:
                return TAPAS_SEARCH_START;
            case 446:
                return TAPAS_SUBMIT_FEEDBACK;
            case 447:
                return APP_ACTIONS_NOTIFICATION;
            case 448:
                return LENS_SERVICE_START_STREAMING;
            case 449:
                return SAVE_CAR_ASSISTANT_STATE;
            case 450:
                return REQUEST_WELCOME_TTS_ON_TIMEOUT;
            case 454:
                return TAPAS_SEARCH_END;
            case 455:
                return BISTO_PR_OR_HPR_PREF_CHANGED;
            case 456:
                return BISTO_ALLOW_HEADPHONE_PR;
            case 457:
                return BISTO_HANDLE_VOICE_SEARCH_INTENT;
            case 459:
                return SEND_DIRECT_REPLY_CLIENT_INPUT;
            case 460:
                return SUBSEQUENT_REQUEST_IN_UI_SESSION;
            case 462:
                return SHOW_CHATHEAD_NOTIFICATION;
            case 464:
                return SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_INTERACTION_MADE;
            case 465:
                return CAR_ASSISTANT_COLD_BOOT_ENDED;
            case 466:
                return SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_CLOSED;
            case 467:
                return PLAY_TTS_NUDGE_LANGUAGE_PICKER_VOICE_SEARCH;
            case 469:
                return STOP_PLAYING_AUDIO;
            case 470:
                return DELIVER_APP_NOTIFICATIONS;
            case 471:
                return SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_NUDGE_SHOWN;
            case 472:
                return BISTO_CLEANUP_DEVICE;
            case 473:
                return OPEN_WIRELESS_SETTINGS_BUTTON_TAPPED;
            case 474:
                return DELIVER_PARSED_MORRIS_NOTIFICATION;
            case 475:
                return DELIVER_SINGLE_PARSED_MORRIS_NOTIFICATION;
            case 476:
                return MANUAL_CORRECTION_ON_VOICE_PLATE;
            case 477:
                return CAR_ASSISTANT_SESSION_STATE;
            case 478:
                return SET_TISID_IMPERSONATED_USER;
            case 479:
                return SEARCH_BUBBLE_SNA_EVENT;
            case 480:
                return GACS_CLIENT_OP_RESULT;
            case 481:
                return LANGUAGE_SWITCHER_TAPPED;
            case 482:
                return SEND_DIGITAL_OBJECT_CLIENT_INPUT;
            case 483:
                return SEARCH_PLATE_VOICE_SEARCH_LANGUAGE_SWITCHER_AUTO_OPTION_SELECTED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m142762b() {
        return C87738bt.f237229a;
    }

    public final int getNumber() {
        return this.f237476dL;
    }

    public final String toString() {
        return Integer.toString(this.f237476dL);
    }
}
