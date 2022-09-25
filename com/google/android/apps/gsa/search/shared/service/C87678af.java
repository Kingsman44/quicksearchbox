package com.google.android.apps.gsa.search.shared.service;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.common.p4522b.C58476gl;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import java.util.EnumSet;

/* renamed from: com.google.android.apps.gsa.search.shared.service.af */
/* compiled from: PG */
public final class C87678af {

    /* renamed from: a */
    public static final C58528ij f237025a = C58476gl.m89803b(EnumSet.of(C87739bu.ACTIVITY_COMPLETED_WITH_RESULT, new C87739bu[]{C87739bu.CANVAS_WORKER_BINDER_REQUEST, C87739bu.MONET_CLIENT_EVENT, C87739bu.MONET_CLIENT_LIFECYCLE_EVENT, C87739bu.OPT_IN_REQUEST, C87739bu.BACKGROUND_NOW_OPT_IN}));

    /* renamed from: b */
    public static final C58528ij f237026b;

    /* renamed from: c */
    public static final C58528ij f237027c;

    /* renamed from: d */
    public static final C58528ij f237028d = C58528ij.m90015O("nga", "lens_background", "bubble", "monet_multi_client", "pronunciationlearning", "test_multi_client_session", "content_provider", "customtabs", "voice_access", "legacy_http_engine", "now_opt_in", "media_browser", "pcp");

    /* renamed from: e */
    public static final C58528ij f237029e = C58476gl.m89803b(EnumSet.of(C87739bu.VOICE_SEARCH_HANDS_FREE, new C87739bu[]{C87739bu.HOTWORD_TRIGGERED_ON_DSP, C87739bu.TTS_STOP_SPEAKING, C87739bu.VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED, C87739bu.EXTERNAL_VOICE_ASSIST, C87739bu.SCREEN_STATE_CHANGE, C87739bu.REFRESH_SERVICE_STATE, C87739bu.START_OPA_ACTIVITY_FOR_L_ASSIST}));

    static {
        C58528ij b = C58476gl.m89803b(EnumSet.of(C87739bu.BACKGROUND_NOW_OPT_IN, new C87739bu[]{C87739bu.CACHE_BACKGROUND_RETRY, C87739bu.DUMMY_BACKGROUND_TASK_EVENT, C87739bu.GCM_MESSAGE_RECEIVED, C87739bu.UPDATE_GSA_CONFIGS, C87739bu.FETCH_CONFIGS_FROM_PHENOTYPE, C87739bu.COMMON_BROADCAST_MESSAGE_RECEIVED, C87739bu.BACKGROUND_TASK_STARTED, C87739bu.PROPERTIES_UPDATE_IN_PHENOTYPE, C87739bu.BISTO_DEVICE_INFO_PUBLISH, C87739bu.BISTO_DOWNLOAD_LOW_THRESHOLD_HOTWORD_MODEL, C87739bu.BISTO_HANDLE_VOICE_SEARCH_INTENT, C87739bu.BISTO_START_ACTIVITY_REQUEST, C87739bu.BISTO_UPDATE_CUSTOMIZATION, C87739bu.BISTO_STARTUP_PREF_CHANGED, C87739bu.BISTO_PR_OR_HPR_PREF_CHANGED, C87739bu.BISTO_START_AUDIO_TESTING, C87739bu.BISTO_STOP_AUDIO_TESTING, C87739bu.BISTO_CHANGE_HOTWORD_ENABLED_PREF, C87739bu.BISTO_LOG_VE_EVENT, C87739bu.BISTO_ALLOW_HEADPHONE_PR, C87739bu.BACKUP_DATA, C87739bu.RESTORE_DATA, C87739bu.RSS_GMM_COMMUTE_QUERY, C87739bu.RSS_GMM_COMMUTE_UPDATE, C87739bu.SMARTSPACE_READY_QUERY, C87739bu.SMARTSPACE_GENERIC_UPDATE, C87739bu.WIDGET_INTENT_RECEIVED, C87739bu.DEVICE_BOOT, C87739bu.APP_INSTALL, C87739bu.HOTWORD_SERVICE_CONNECTED, C87739bu.MAPS_NAVIGATION_STATE_UPDATE, C87739bu.DELIVER_ACTIVE_NOTIFICATIONS, C87739bu.DELIVER_APP_NOTIFICATIONS, C87739bu.DELIVER_NEW_ACTIVE_NOTIFICATIONS, C87739bu.DELIVER_REMOVED_NOTIFICATIONS, C87739bu.DELIVER_MORRIS_NOTIFICATION, C87739bu.DELIVER_PARSED_MORRIS_NOTIFICATION, C87739bu.DELIVER_SINGLE_PARSED_MORRIS_NOTIFICATION, C87739bu.NOTIFICATION_REPLY_RESULT, C87739bu.OPA_APP_INTEGRATION_PLAY_TTS, C87739bu.OPA_APP_INTEGRATION_STOP_TTS, C87739bu.BACKGROUND_ASSISTANT_CLIENT_SYNC_START, C87739bu.DELIVER_PARSED_NOTIFICATIONS, C87739bu.BISTO_REFRESH_ASSISTANT_SETTINGS, C87739bu.CAR_ASSISTANT_COLD_BOOT_ENDED, C87739bu.BISTO_CLEANUP_DEVICE, C87739bu.GACS_CLIENT_OP_RESULT}));
        f237026b = b;
        C58526ih ihVar = new C58526ih();
        ihVar.mo55489i(b);
        ihVar.mo55373c(C87739bu.HOTWORD_DETECTED_IN_INTERACTOR);
        ihVar.mo55373c(C87739bu.HOTWORD_REJECTED_AFTER_DSP_TRIGGERED);
        ihVar.mo55373c(C87739bu.APP_MOVED_TO_FOREGROUND);
        ihVar.mo55373c(C87739bu.APP_MOVED_TO_BACKGROUND);
        f237027c = ihVar.mo55486f();
    }
}