package com.google.android.apps.gsa.shared.bisto;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58490gz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.shared.bisto.l */
/* compiled from: PG */
public final /* synthetic */ class C89657l implements C58881cr {

    /* renamed from: a */
    public static final /* synthetic */ C89657l f242766a = new C89657l();

    private /* synthetic */ C89657l() {
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("enabled_features", BuildConfig.FLAVOR);
        gzVar.mo55429h("ota_min_battery", 20);
        gzVar.mo55429h("user_group_name", "Unknown");
        gzVar.mo55429h("min_aggregate_size", 3);
        gzVar.mo55429h("recent_notifs_period_sec", 7);
        gzVar.mo55429h("launch_interruptive_if_off_head_msec", Long.valueOf(TimeUnit.MINUTES.toMillis(5)));
        gzVar.mo55429h("notification_delivery_expiry_time_ms", Long.valueOf(TimeUnit.HOURS.toMillis(1)));
        gzVar.mo55429h("dnd_fetch_ann_freq", Long.valueOf(TimeUnit.MINUTES.toMillis(60)));
        gzVar.mo55429h("messaging_parsing_blacklist", BuildConfig.FLAVOR);
        gzVar.mo55429h("calendar_max_words", 4);
        gzVar.mo55429h("calendar_max_chars", 40);
        gzVar.mo55429h("calendar_mins_after_event_start_to_remove", 1);
        gzVar.mo55429h("tts_rate", Float.valueOf(-1.0f));
        gzVar.mo55429h("audio_player_timeout_ms", 3000);
        gzVar.mo55429h("min_volume_threshold_ratio", Float.valueOf(0.6f));
        gzVar.mo55429h("volume_raise_delay", 300);
        gzVar.mo55429h("ann_add_delay_time_msec", 100);
        gzVar.mo55429h("ann_remove_delay_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
        gzVar.mo55429h("ann_wait_for_parent_or_child_time_msec", Long.valueOf(TimeUnit.SECONDS.toMillis(1)));
        gzVar.mo55429h("clearcut_logging", true);
        gzVar.mo55429h("bisto_spoken_notifications", true);
        gzVar.mo55429h("key_send_diagnostics", false);
        gzVar.mo55429h("enable_message_style_parser_for_whatsapp", false);
        gzVar.mo55429h("enable_message_style_parser_for_messages_and_hangouts", false);
        gzVar.mo55429h("enable_message_style_parser_for_facebook_messenger", false);
        gzVar.mo55429h("key_personal_results_enabled", false);
        gzVar.mo55429h("key_personal_results_headphones_enabled", false);
        return gzVar.mo55427f(false);
    }
}
