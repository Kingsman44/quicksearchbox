package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.libraries.phenotype.client.C31665d;
import com.google.android.libraries.phenotype.client.C31676o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.dl */
/* compiled from: PG */
public final class C145313dl {

    /* renamed from: A */
    public static final C145312dk f392694A = m236053a("measurement.upload.retry_time", 1800000L, 1800000L, C145249bb.f392622a);

    /* renamed from: B */
    public static final C145312dk f392695B = m236053a("measurement.upload.retry_count", 6, 6, C145251bd.f392624a);

    /* renamed from: C */
    public static final C145312dk f392696C = m236053a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, C145252be.f392625a);

    /* renamed from: D */
    public static final C145312dk f392697D = m236053a("measurement.lifetimevalue.max_currency_tracked", 4, 4, C145253bf.f392626a);

    /* renamed from: E */
    public static final C145312dk f392698E = m236053a("measurement.audience.filter_result_max_count", 200, 200, C145255bh.f392628a);

    /* renamed from: F */
    public static final C145312dk f392699F = m236053a("measurement.upload.max_public_user_properties", 25, 25, (C145310di) null);

    /* renamed from: G */
    public static final C145312dk f392700G = m236053a("measurement.upload.max_event_name_cardinality", 500, 500, (C145310di) null);

    /* renamed from: H */
    public static final C145312dk f392701H = m236053a("measurement.upload.max_public_event_params", 25, 25, (C145310di) null);

    /* renamed from: I */
    public static final C145312dk f392702I = m236053a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, C145256bi.f392629a);

    /* renamed from: J */
    public static final C145312dk f392703J = m236053a("measurement.test.boolean_flag", false, false, C145257bj.f392630a);

    /* renamed from: K */
    public static final C145312dk f392704K = m236053a("measurement.test.string_flag", "---", "---", C145258bk.f392631a);

    /* renamed from: L */
    public static final C145312dk f392705L = m236053a("measurement.test.long_flag", -1L, -1L, C145259bl.f392632a);

    /* renamed from: M */
    public static final C145312dk f392706M = m236053a("measurement.test.int_flag", -2, -2, C145260bm.f392633a);

    /* renamed from: N */
    public static final C145312dk f392707N;

    /* renamed from: O */
    public static final C145312dk f392708O = m236053a("measurement.experiment.max_ids", 50, 50, C145263bp.f392636a);

    /* renamed from: P */
    public static final C145312dk f392709P = m236053a("measurement.max_bundles_per_iteration", 100, 100, C145264bq.f392637a);

    /* renamed from: Q */
    public static final C145312dk f392710Q = m236053a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, C145265br.f392638a);

    /* renamed from: R */
    public static final C145312dk f392711R = m236053a("measurement.redaction.app_instance_id.ttl", 7200000L, 7200000L, C145267bt.f392640a);

    /* renamed from: S */
    public static final C145312dk f392712S = m236053a("measurement.collection.log_event_and_bundle_v2", true, true, C145268bu.f392641a);

    /* renamed from: T */
    public static final C145312dk f392713T = m236053a("measurement.quality.checksum", false, false, (C145310di) null);

    /* renamed from: U */
    public static final C145312dk f392714U = m236053a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false, false, C145269bv.f392642a);

    /* renamed from: V */
    public static final C145312dk f392715V = m236053a("measurement.audience.refresh_event_count_filters_timestamp", false, false, C145270bw.f392643a);

    /* renamed from: W */
    public static final C145312dk f392716W = m236053a("measurement.audience.use_bundle_timestamp_for_event_count_filters", false, false, C145271bx.f392644a);

    /* renamed from: X */
    public static final C145312dk f392717X = m236053a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, C145273bz.f392646a);

    /* renamed from: Y */
    public static final C145312dk f392718Y = m236053a("measurement.sdk.collection.last_deep_link_referrer_campaign2", false, false, C145275ca.f392649a);

    /* renamed from: Z */
    public static final C145312dk f392719Z = m236053a("measurement.lifecycle.app_in_background_parameter", false, false, C145276cb.f392650a);

    /* renamed from: a */
    public static final List f392720a = Collections.synchronizedList(new ArrayList());

    /* renamed from: aa */
    public static final C145312dk f392721aa = m236053a("measurement.integration.disable_firebase_instance_id", false, false, C145277cc.f392651a);

    /* renamed from: ab */
    public static final C145312dk f392722ab = m236053a("measurement.collection.service.update_with_analytics_fix", false, false, C145278cd.f392652a);

    /* renamed from: ac */
    public static final C145312dk f392723ac = m236053a("measurement.client.firebase_feature_rollout.v1.enable", true, true, C145280cf.f392654a);

    /* renamed from: ad */
    public static final C145312dk f392724ad = m236053a("measurement.client.sessions.check_on_reset_and_enable2", true, true, C145281cg.f392655a);

    /* renamed from: ae */
    public static final C145312dk f392725ae = m236053a("measurement.service.storage_consent_support_version", 203600, 203600, C145283ci.f392657a);

    /* renamed from: af */
    public static final C145312dk f392726af = m236053a("measurement.service.store_null_safelist", true, true, C145287cm.f392661a);

    /* renamed from: ag */
    public static final C145312dk f392727ag = m236053a("measurement.service.store_safelist", true, true, C145288cn.f392662a);

    /* renamed from: ah */
    public static final C145312dk f392728ah = m236053a("measurement.collection.enable_session_stitching_token.service", false, false, C145289co.f392663a);

    /* renamed from: ai */
    public static final C145312dk f392729ai = m236053a("measurement.collection.enable_session_stitching_token.client.dev", false, false, C145290cp.f392664a);

    /* renamed from: aj */
    public static final C145312dk f392730aj = m236053a("measurement.redaction.e_tag", true, true, C145293cs.f392667a);

    /* renamed from: ak */
    public static final C145312dk f392731ak = m236053a("measurement.redaction.client_ephemeral_aiid_generation", true, true, C145294ct.f392668a);

    /* renamed from: al */
    public static final C145312dk f392732al = m236053a("measurement.redaction.retain_major_os_version", true, true, C145296cv.f392670a);

    /* renamed from: am */
    public static final C145312dk f392733am = m236053a("measurement.redaction.scion_payload_generator", true, true, C145297cw.f392671a);

    /* renamed from: an */
    public static final C145312dk f392734an = m236053a("measurement.audience.dynamic_filters.oob_fix", true, true, C145298cx.f392672a);

    /* renamed from: ao */
    public static final C145312dk f392735ao = m236053a("measurement.service.clear_global_params_on_uninstall", true, true, C145299cy.f392673a);

    /* renamed from: b */
    public static final C145312dk f392736b = m236053a("measurement.ad_id_cache_time", 10000L, 10000L, C145250bc.f392623a);

    /* renamed from: c */
    public static final C145312dk f392737c = m236053a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, C145241au.f392612a);

    /* renamed from: d */
    public static final C145312dk f392738d = m236053a("measurement.config.cache_time", 86400000L, 3600000L, C145254bg.f392627a);

    /* renamed from: e */
    public static final C145312dk f392739e = m236053a("measurement.config.url_scheme", "https", "https", C145266bs.f392639a);

    /* renamed from: f */
    public static final C145312dk f392740f = m236053a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C145279ce.f392653a);

    /* renamed from: g */
    public static final C145312dk f392741g = m236053a("measurement.upload.max_bundles", 100, 100, C145291cq.f392665a);

    /* renamed from: h */
    public static final C145312dk f392742h = m236053a("measurement.upload.max_batch_size", 65536, 65536, C145302da.f392678a);

    /* renamed from: i */
    public static final C145312dk f392743i = m236053a("measurement.upload.max_bundle_size", 65536, 65536, C145303db.f392679a);

    /* renamed from: j */
    public static final C145312dk f392744j = m236053a("measurement.upload.max_events_per_bundle", 1000, 1000, C145304dc.f392680a);

    /* renamed from: k */
    public static final C145312dk f392745k = m236053a("measurement.upload.max_events_per_day", 100000, 100000, C145305dd.f392681a);

    /* renamed from: l */
    public static final C145312dk f392746l = m236053a("measurement.upload.max_error_events_per_day", 1000, 1000, C145261bn.f392634a);

    /* renamed from: m */
    public static final C145312dk f392747m = m236053a("measurement.upload.max_public_events_per_day", 50000, 50000, C145272by.f392645a);

    /* renamed from: n */
    public static final C145312dk f392748n = m236053a("measurement.upload.max_conversions_per_day", 10000, 10000, C145284cj.f392658a);

    /* renamed from: o */
    public static final C145312dk f392749o = m236053a("measurement.upload.max_realtime_events_per_day", 10, 10, C145295cu.f392669a);

    /* renamed from: p */
    public static final C145312dk f392750p = m236053a("measurement.store.max_stored_events_per_app", 100000, 100000, C145306de.f392682a);

    /* renamed from: q */
    public static final C145312dk f392751q = m236053a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C145307df.f392683a);

    /* renamed from: r */
    public static final C145312dk f392752r = m236053a("measurement.upload.backoff_period", 43200000L, 43200000L, C145308dg.f392684a);

    /* renamed from: s */
    public static final C145312dk f392753s = m236053a("measurement.upload.interval", 3600000L, 3600000L, C145239as.f392610a);

    /* renamed from: t */
    public static final C145312dk f392754t = m236053a("measurement.upload.realtime_upload_interval", 10000L, 10000L, C145240at.f392611a);

    /* renamed from: u */
    public static final C145312dk f392755u = m236053a("measurement.upload.debug_upload_interval", 1000L, 1000L, C145242av.f392613a);

    /* renamed from: v */
    public static final C145312dk f392756v = m236053a("measurement.upload.minimum_delay", 500L, 500L, C145243aw.f392614a);

    /* renamed from: w */
    public static final C145312dk f392757w = m236053a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, C145244ax.f392615a);

    /* renamed from: x */
    public static final C145312dk f392758x = m236053a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, C145245ay.f392616a);

    /* renamed from: y */
    public static final C145312dk f392759y = m236053a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, C145246az.f392617a);

    /* renamed from: z */
    public static final C145312dk f392760z = m236053a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, C145248ba.f392621a);

    static {
        Collections.synchronizedSet(new HashSet());
        m236053a("measurement.upload.window_interval", 3600000L, 3600000L, C145309dh.f392685a);
        Double valueOf = Double.valueOf(-3.0d);
        f392707N = m236053a("measurement.test.double_flag", valueOf, valueOf, C145262bo.f392635a);
        m236053a("measurement.collection.synthetic_data_mitigation", false, false, C145282ch.f392656a);
        m236053a("measurement.client.click_identifier_control.dev", false, false, C145285ck.f392659a);
        m236053a("measurement.service.click_identifier_control", false, false, C145286cl.f392660a);
        m236053a("measurement.session_stitching_token_enabled", false, false, C145292cr.f392666a);
        m236053a("measurement.sessionid.enable_client_session_id", true, true, C145300cz.f392674a);
    }

    /* renamed from: a */
    static C145312dk m236053a(String str, Object obj, Object obj2, C145310di diVar) {
        C145312dk dkVar = new C145312dk(str, obj, diVar);
        f392720a.add(dkVar);
        return dkVar;
    }

    /* renamed from: b */
    public static Map m236054b(Context context) {
        C31665d a = C31665d.m59005a(context.getContentResolver(), C31676o.m59019a("com.google.android.gms.measurement"), C145238ar.f392609a);
        return a == null ? Collections.emptyMap() : a.mo37311c();
    }
}
