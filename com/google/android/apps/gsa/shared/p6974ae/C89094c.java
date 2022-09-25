package com.google.android.apps.gsa.shared.p6974ae;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.protobuf.C62957cd;

/* renamed from: com.google.android.apps.gsa.shared.ae.c */
/* compiled from: PG */
public enum C89094c implements C62957cd {
    NOW(65536),
    NOW_TRAFFIC(65537),
    NOW_CALENDAR_TIME_TO_LEAVE(65538),
    NOW_LOW_PRIORITY(65539),
    NOW_PUBLIC_ALERT(65540),
    NOW_RESTAURANT_TIME_TO_LEAVE(65541),
    NOW_EVENT_TIME_TO_LEAVE(65542),
    NOW_FLIGHT_TIME_TO_LEAVE(65543),
    NOW_REMINDER(65544),
    NOW_LAST_TRAIN_HOME(65545),
    NOW_BARCODE(65546),
    NOW_FLIGHT_STATUS_WARNING(65547),
    NOW_GENERIC_ENTRY(65548),
    NOW_TRAFFIC_INCIDENT(65549),
    NOW_FEEDBACK_SHAKE_TO_SEND(C89885b.S3_NO_RESPONSE_PRODUCER_VALUE),
    NOW_GENERIC_PASSIVE(C89885b.S3_CANCELLED_VALUE),
    NOW_GENERIC_ACTIVE(C89885b.S3_STREAM_FAILED_VALUE),
    NOW_SPORT_SCORE(C89885b.S3_CREATE_INPUT_STREAM_FAILED_VALUE),
    NOW_STOCK(C89885b.S3_INITIAL_RESPONSE_TIMEOUT_VALUE),
    NOW_WEATHER(C89885b.S3_NEXT_RESPONSE_TIMEOUT_VALUE),
    NOW_BROWSE_MODE(C89885b.S3_RETRY_VALUE),
    NOW_HOTEL_PLACE(C89885b.S3_NO_CONNECTION_VALUE),
    NOW_RESTAURANT_PLACE(C89885b.S3_CLOSE_UPLOAD_STREAM_FAILED_VALUE),
    NOW_BROWSE_MODE_TRAVEL_LURE(C89885b.S3_TIMEOUT_CONNECT_VALUE),
    NOW_ATTRACTION(C89885b.S3_TIMEOUT_READ_VALUE),
    NOW_VEHICLE_PARKING_LOCATION(C89885b.S3_TIMEOUT_CONNECT_WARNING_VALUE),
    NOW_PACKAGE_TRACKING(65568),
    NOW_CONTENT_UPDATE_ITEM(65570),
    NOW_MODULE(C89885b.S3_UNPARSABLE_RESPONSE_HEADERS_VALUE),
    NOW_TOPDECK(C89885b.S3_DOWN_CONNECT_FAILED_VALUE),
    SEARCH_SERVICE(C89885b.S3REQUEST_VALUE),
    SEARCH_SERVICE_DEFAULT_FOREGROUND_NOTIFICATION(C89885b.S3REQUEST_BUILD_PINHOLE_PARAMS_FAILED_VALUE),
    SEARCH_SERVICE_FEATURE_PROMOTION(C89885b.S3REQUEST_BUILD_RECOGNIZER_VOCABULARY_CONTEXT_FAILED_VALUE),
    PERSISTENT_SEARCH_NOTIFICATION(C89885b.S3REQUEST_BUILD_MOBILE_USER_INFO_FAILED_VALUE),
    LOCATION_IS_OFF_NOTIFICATION(C89885b.S3REQUEST_BUILD_S3_USER_INFO_FAILED_VALUE),
    AUDIO_PLAYER_WORKER_NOTIFICATION(C89885b.S3REQUEST_BUILD_S3_CLIENT_INFO_FAILED_VALUE),
    HANDSFREE(196608),
    HANDSFREE_DEVICE_CONTENT_OPT_IN(C89885b.GWS_FETCH_INTERRUPTED_VALUE),
    HANDSFREE_GOOGLE_NOW_OPT_IN(C89885b.GWS_RESPONSE_SIZE_EXCEEDED_VALUE),
    HANDSFREE_WEB_HISTORY_OPT_IN(C89885b.GWS_RESPONSE_EMPTY_VALUE),
    HANDSFREE_PERMISSIONS_REQUEST(C89885b.GWS_IO_EXCEPTION_VALUE),
    HANDSFREE_SETTINGS(C89885b.GWS_UNKNOWN_HOST_VALUE),
    OFFLINE_EYESFREE_LP_ONBOARDING(C89885b.GWS_MALFORMED_JSON_VALUE),
    HANDSFREE_SETTINGS_BAR_DEPRECATED(C89885b.GWS_FILE_NOT_FOUND_VALUE),
    HANDSFREE_HEADSET_SETTINGS_DEPRECATED(C89885b.GWS_UNKNOWN_EXCEPTION_VALUE),
    HANDSFREE_ENABLE_AOL(C89885b.GWS_CHUNK_NOT_ACCEPTED_VALUE),
    DYNAMIC_SERVICE(C89885b.HTTP_VALUE),
    DYNAMIC_SERVICE_MIN_ID(C89885b.HTTP_MALFORMED_URL_VALUE),
    DYNAMIC_SERVICE_MAX_ID(327679),
    OPA_EYESFREE_ONBOARDING(C89885b.OKHTTP_VALUE),
    OPA_FEATURE_PROMO(C89885b.OKHTTP_HTTP_PROXY_AUTH_VALUE),
    OPA_WUWA(C89885b.OKHTTP_UNEXPECTED_END_VALUE),
    OPA_SERVER_ACQUISITION(C89885b.OKHTTP_VERSION_NOT_3_VALUE),
    OPA_MORRIS(C89885b.OKHTTP_CONTENT_LENGTH_PROMISED_VALUE),
    OPA_AMB(C89885b.OKHTTP_CONTENT_LENGTH_LIMIT_VALUE),
    OPA_NGA_ONBOARDING(C89885b.OKHTTP_HOSTNAME_NOT_VERIFIED_VALUE),
    OPA_FRE_LANGUAGE_NOW_SUPPORTED(C89885b.OKHTTP_NPN_TRANSPORT_VALUE),
    OPA_LOCK_SCREEN_ENTRY_POINT(C89885b.OKHTTP_JOURNAL_HEADER_VALUE),
    OPA_SETTINGS(C89885b.OKHTTP_CANNOT_BUFFER_BODY_VALUE),
    HARMONY_BACKGROUND_RETRY(393216),
    MULTI_DEVICE_HOTWORD_DETECTION_NOTIFICATION(458752),
    LANGUAGE_PACK_DOWNLOAD_FAILED(524288),
    UPDATE_PROMO_NOTIFICATION(C89885b.WEB_APP_VALUE),
    BUBBLE(655360),
    CHATHEAD(C89885b.CRONET_CONTENT_LENGTH_OUT_OF_RANGE_VALUE),
    NGA_ANDROID_VERSION(C89885b.PUMPKIN_VALUE),
    NGA_SODA(C89885b.PUMPKIN_TAG_FAILED_VALUE),
    NGA_RUNNING(720900),
    NGA_SURVEY(720904),
    NGA_ABNORMAL_MEMORY(720905),
    NGA_APPFLOW_ERROR_OCCURRED(720909),
    NGA_INITIAL_DOWNLOAD(720906),
    NGA_SCREENSHOT(720907),
    NGA_PIE_TRIGGER(720908),
    NGA_WARMACTIONS(720910),
    SMART_SCREENSHOTS(C89885b.SOUND_SEARCH_VALUE),
    MDD_DOWNLOAD_NOTIFICATION_MIN_ID(851968),
    MDD_DOWNLOAD_NOTIFICATION_MAX_ID(C89885b.WEBVIEW_UNHANDLED_JS_INTENT_VALUE),
    LENS_BACKGROUND_RETRY(917504),
    PINNED_STATE(C89885b.BLOB_ON_DEMAND_DOWNLOAD_VALUE),
    TEMPORARY_MODEL_PROMPT(1048576);
    

    /* renamed from: aD */
    public final int f241522aD;

    private C89094c(int i) {
        this.f241522aD = i;
    }

    public final int getNumber() {
        return this.f241522aD;
    }

    public final String toString() {
        return Integer.toString(this.f241522aD);
    }
}