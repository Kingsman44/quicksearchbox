package com.google.android.apps.gsa.search.core.p6805i;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseArray;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90964a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10905k.C146606e;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.i.z */
/* compiled from: PG */
public final class C86130z implements C90964a {

    /* renamed from: b */
    private static final C59071e f232791b = C59071e.m91332i("com.google.android.apps.gsa.search.core.i.z");

    /* renamed from: a */
    public String f232792a;

    /* renamed from: c */
    private final SparseArray f232793c = new SparseArray(5);

    /* renamed from: d */
    private final SparseArray f232794d = new SparseArray(5);

    /* renamed from: e */
    private final Context f232795e;

    /* renamed from: f */
    private final C86127w f232796f;

    /* renamed from: g */
    private final SparseArray f232797g;

    /* renamed from: h */
    private volatile SparseArray f232798h;

    static {
        Uri.parse("content://com.google.android.partnersetup.rlzappprovider/");
    }

    public C86130z(Context context, C86127w wVar, C91022f fVar) {
        SparseArray sparseArray = new SparseArray(256);
        this.f232797g = sparseArray;
        this.f232795e = context;
        this.f232796f = wVar;
        sparseArray.put(R.bool.has_external_dasher_account, "has_external_dasher_account");
        sparseArray.put(R.array.default_source_suggest_uris, "default_source_uris");
        sparseArray.put(R.array.default_sources, "default_sources");
        sparseArray.put(R.array.google_search_paths, "google_search_paths");
        sparseArray.put(R.array.google_search_logout_redirects, "google_search_logout_redirects");
        sparseArray.put(R.array.full_size_icon_source_suggest_uris, "full_size_icon_source_suggest_uris");
        sparseArray.put(R.integer.max_displayed_summons_in_results_suggest, "max_displayed_summons_in_results_suggest");
        sparseArray.put(R.integer.min_web_suggestions, "min_web_suggestions");
        sparseArray.put(R.integer.max_web_suggestions, "max_web_suggestions");
        sparseArray.put(R.integer.max_total_suggestions, "max_total_suggestions");
        sparseArray.put(R.integer.max_stat_age_hours, "max_stat_age_hours");
        sparseArray.put(R.integer.min_clicks_for_source_ranking, "min_clicks_for_source_ranking");
        sparseArray.put(R.integer.typing_update_suggestions_delay_millis, "typing_update_suggestions_delay_millis");
        sparseArray.put(R.string.tos_url_format, "tos_url_format");
        sparseArray.put(R.string.search_domain_override, "search_domain_override");
        sparseArray.put(R.integer.location_expiry_time, "location_expirey_time");
        sparseArray.put(R.array.clicked_result_destination_params, "clicked_result_destination_params");
        sparseArray.put(R.string.clicked_ad_url_path, "clicked_ad_url_path");
        sparseArray.put(R.string.clicked_result_url_path, "clicked_result_url_path");
        sparseArray.put(R.array.click_ad_url_exception_patterns, "click_ad_url_exception_patterns");
        sparseArray.put(R.array.click_ad_url_substitutions, "click_ad_url_substitutions");
        sparseArray.put(R.string.corpora_config_uri_24_plus, "corpora_config_uri_24_plus");
        sparseArray.put(R.string.register_gsa_bridge_javascript, "register_gsa_bridge_javascript");
        sparseArray.put(R.integer.suggestion_view_recycle_bin_size, "suggestion_view_recycle_bin_size");
        sparseArray.put(R.integer.suggest_num_visible_summons_rows, "suggest_num_visible_summons_rows");
        sparseArray.put(R.string.velvetgsabridge_interface_name, "velvetgsabridge_interface_name");
        sparseArray.put(R.string.toolbelt_mode_query_param, "toolbelt_mode_query_param");
        sparseArray.put(R.string.toolbelt_state_query_param, "toolbelt_state_query_param");
        sparseArray.put(R.array.domain_whitelist, "domain_whitelist");
        sparseArray.put(R.integer.saved_configuration_expiry_seconds, "saved_configuration_expiry_seconds");
        sparseArray.put(R.integer.saved_whitelisted_configuration_expiry_seconds, "saved_whitelisted_configuration_expiry_seconds");
        sparseArray.put(R.string.google_gen_204_pattern, "google_gen_204_pattern");
        sparseArray.put(R.string.device_country, "device_country");
        sparseArray.put(R.string.sound_search_gms_disable, "gms_disable:com.google.android.ears");
        sparseArray.put(R.bool.udc_settings_cache_enabled, "gms.udc.ctx_mgr_enabled");
        sparseArray.put(R.string.s3_server_override, "s3_server_override");
        sparseArray.put(R.string.history_api_lookup_url_pattern, "history_api_lookup_url_pattern");
        sparseArray.put(R.string.history_api_change_url_pattern, "history_api_change_url_pattern");
        sparseArray.put(R.string.history_api_client_param, "history_api_client_param");
        sparseArray.put(R.bool.debug_audio_logging_enabled, "debug_audio_logging_enabled");
        sparseArray.put(R.string.action_discovery_data_uri, "action_discovery_data_uri");
        sparseArray.put(R.array.action_discovery_supported_locales, "action_discovery_supported_locales");
        sparseArray.put(R.integer.abnf_compiler_num_contacts, "abnf_compiler_num_contacts");
        sparseArray.put(R.integer.predictive_idle_user_threshold_minutes, "predictive_idle_user_threshold_minutes");
        sparseArray.put(R.integer.personal_geofence_radius_meters, "personal_geofence_radius_meters");
        sparseArray.put(R.integer.offline_card_cache_timeout_days, "offline_card_cache_timeout_days");
        sparseArray.put(R.bool.redirect_mfe_requests, "redirect_mfe_requests");
        sparseArray.put(R.bool.hide_dogfood_indicator, "hide_dogfood_indicator");
        sparseArray.put(R.bool.wifi_scan_uploads_enabled, "wifi_scan_uploads_enabled");
        sparseArray.put(R.bool.enable_heterodyne_bright_launch_v6p7, "enable_heterodyne_bright_launch_v6p7");
        sparseArray.put(R.bool.enable_phenotype_bright_launch_v6p11, "enable_phenotype_bright_launch_v6p11");
        sparseArray.put(R.bool.icing_sources_enabled, "icing_sources_enabled");
        sparseArray.put(R.array.ignored_icing_source_packages, "ignored_icing_source_packages");
        sparseArray.put(R.integer.icing_apps_corpus_update_all_interval_millis, "icing_apps_corpus_update_all_interval_millis");
        sparseArray.put(R.integer.icing_contacts_corpus_update_all_interval_without_delta_millis, "icing_contacts_corpus_update_all_interval_without_delta_millis");
        sparseArray.put(R.integer.icing_contacts_corpus_update_all_interval_with_delta_millis, "icing_contacts_corpus_update_all_interval_with_delta_millis");
        sparseArray.put(R.integer.icing_contacts_provider_resync_initial_poll_delay_millis, "icing_contacts_provider_resync_initial_poll_delay_millis");
        sparseArray.put(R.integer.icing_contacts_provider_resync_repoll_period_millis, "icing_contacts_provider_resync_repoll_period_millis");
        sparseArray.put(R.integer.icing_contacts_provider_resync_max_repoll_attempts, "icing_contacts_provider_resync_max_repoll_attempts");
        sparseArray.put(R.integer.icing_contacts_provider_changed_delta_update_delay_millis, "icing_contacts_provider_changed_delta_update_delay_millis");
        sparseArray.put(R.bool.icing_app_launch_broadcast_handling_enabled, "icing_app_launch_broadcast_handling_enabled");
        sparseArray.put(R.integer.icing_launch_log_max_age_days, "icing_launch_log_max_age_days");
        C58838bb.m90883r(sparseArray.size() <= 256);
        fVar.mo85301a(this);
    }

    /* renamed from: j */
    public static String[] m138516j() {
        return new String[]{"device_country", "gms_disable:com.google.android.ears", "gms.udc.ctx_mgr_enabled"};
    }

    /* renamed from: m */
    private final synchronized void m138517m() {
        SparseArray sparseArray;
        if (this.f232798h == null) {
            String string = this.f232796f.f232790a.mo79722a().getString("gservices_overrides", BuildConfig.FLAVOR);
            if (TextUtils.isEmpty(string)) {
                this.f232792a = null;
                this.f232798h = new SparseArray();
                return;
            }
            Map w = C90772bp.m148315w(string);
            if (w != null) {
                this.f232792a = (String) w.get("device_country");
                sparseArray = new SparseArray(w.size());
                for (int i = 0; i < this.f232797g.size(); i++) {
                    String str = (String) w.get(this.f232797g.valueAt(i));
                    if (str != null) {
                        sparseArray.put(this.f232797g.keyAt(i), str);
                    }
                }
            } else {
                sparseArray = new SparseArray();
            }
            this.f232798h = sparseArray;
        }
    }

    /* renamed from: a */
    public final int mo79762a(int i) {
        Integer num;
        SparseArray sparseArray = this.f232798h;
        if (sparseArray != null) {
            Object obj = sparseArray.get(i);
            if (obj != null) {
                if (obj instanceof Integer) {
                    return ((Integer) obj).intValue();
                }
                try {
                    num = Integer.valueOf((String) obj);
                } catch (NumberFormatException unused) {
                    C59104x d = f232791b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Search.SearchConfig");
                    ((C59052c) ((C59052c) d).mo56372aa(7604)).mo56386p("Invalid gservices int");
                    num = null;
                }
                if (num == null) {
                    sparseArray.remove(i);
                    return this.f232795e.getResources().getInteger(i);
                }
                sparseArray.put(i, num);
                return mo79762a(i);
            }
        } else if (this.f232797g.get(i) != null) {
            m138517m();
            return mo79762a(i);
        }
        return this.f232795e.getResources().getInteger(i);
    }

    /* renamed from: b */
    public final String mo79763b() {
        String c = mo79764c(R.string.register_gsa_bridge_javascript);
        String c2 = mo79764c(R.string.velvetgsabridge_interface_name);
        return String.format(Locale.US, c, new Object[]{c2});
    }

    /* renamed from: c */
    public final String mo79764c(int i) {
        SparseArray sparseArray = this.f232798h;
        if (sparseArray != null) {
            Object obj = sparseArray.get(i);
            if (obj != null) {
                return (String) obj;
            }
        } else if (this.f232797g.get(i) != null) {
            m138517m();
            return mo79764c(i);
        }
        return this.f232795e.getResources().getString(i);
    }

    /* renamed from: e */
    public final synchronized Set mo79765e(int i) {
        Set set = (Set) this.f232793c.get(i);
        if (set != null) {
            return set;
        }
        String[] k = mo79770k(i, false);
        HashSet g = C58758qx.m90649g(k.length);
        Collections.addAll(g, k);
        this.f232793c.put(i, g);
        return g;
    }

    /* renamed from: f */
    public final synchronized void mo79766f() {
        this.f232798h = null;
        this.f232792a = null;
        this.f232793c.clear();
        this.f232794d.clear();
    }

    /* renamed from: g */
    public final boolean mo79767g(int i) {
        Boolean bool;
        SparseArray sparseArray = this.f232798h;
        if (sparseArray != null) {
            Object obj = sparseArray.get(i);
            if (obj != null) {
                if (obj instanceof Boolean) {
                    return ((Boolean) obj).booleanValue();
                }
                String str = (String) obj;
                if (C146606e.f395968c.matcher(str).matches()) {
                    bool = Boolean.TRUE;
                } else if (C146606e.f395969d.matcher(str).matches()) {
                    bool = Boolean.FALSE;
                } else {
                    C59104x d = f232791b.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "Search.SearchConfig");
                    ((C59052c) ((C59052c) d).mo56372aa(7603)).mo56386p("Invalid gservices boolean");
                    bool = null;
                }
                if (bool == null) {
                    sparseArray.remove(i);
                    return this.f232795e.getResources().getBoolean(i);
                }
                sparseArray.put(i, bool);
                return mo79767g(i);
            }
        } else if (this.f232797g.get(i) != null) {
            m138517m();
            return mo79767g(i);
        }
        return this.f232795e.getResources().getBoolean(i);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        Object obj;
        fVar.mo85291r("GServices Config Values");
        for (int i = 0; i < this.f232797g.size(); i++) {
            String str = (String) this.f232797g.valueAt(i);
            int keyAt = this.f232797g.keyAt(i);
            StringBuilder sb = new StringBuilder("[Default: ");
            try {
                sb.append(this.f232795e.getResources().getString(keyAt));
            } catch (Resources.NotFoundException unused) {
                sb.append("NOT FOUND");
            }
            sb.append("]");
            if (!(this.f232798h == null || (obj = this.f232798h.get(keyAt)) == null)) {
                sb.append(" [Override: ");
                sb.append(obj);
                sb.append("]");
            }
            fVar.mo85279c(str).mo85276a(C90752i.m148229c(sb));
        }
    }

    /* renamed from: h */
    public final boolean mo79768h(String str) {
        return mo79765e(R.array.google_search_paths).contains(str);
    }

    /* renamed from: i */
    public final boolean mo79769i(String str) {
        return mo79765e(R.array.ignored_icing_source_packages).contains(str);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] mo79770k(int r5, boolean r6) {
        /*
            r4 = this;
            android.util.SparseArray r0 = r4.f232798h
            if (r0 == 0) goto L_0x004c
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L_0x005c
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L_0x0011
            java.lang.String[] r1 = (java.lang.String[]) r1
            return r1
        L_0x0011:
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 0
            if (r2 != 0) goto L_0x0034
            if (r6 == 0) goto L_0x002e
            com.google.common.b.gu r1 = com.google.android.apps.gsa.shared.util.C90772bp.m148304l(r1)
            if (r1 != 0) goto L_0x0023
            goto L_0x0034
        L_0x0023:
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            r3 = r1
            java.lang.String[] r3 = (java.lang.String[]) r3
            goto L_0x0034
        L_0x002e:
            java.lang.String r2 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r1, r2)
        L_0x0034:
            if (r3 != 0) goto L_0x0044
            r0.remove(r5)
            android.content.Context r6 = r4.f232795e
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String[] r5 = r6.getStringArray(r5)
            return r5
        L_0x0044:
            r0.put(r5, r3)
            java.lang.String[] r5 = r4.mo79770k(r5, r6)
            return r5
        L_0x004c:
            android.util.SparseArray r0 = r4.f232797g
            java.lang.Object r0 = r0.get(r5)
            if (r0 == 0) goto L_0x005c
            r4.m138517m()
            java.lang.String[] r5 = r4.mo79770k(r5, r6)
            return r5
        L_0x005c:
            android.content.Context r6 = r4.f232795e
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String[] r5 = r6.getStringArray(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.p6805i.C86130z.mo79770k(int, boolean):java.lang.String[]");
    }

    /* renamed from: l */
    public final synchronized Map mo79771l() {
        Map map = (Map) this.f232794d.get(R.array.countrycode_domain_overrides);
        if (map != null) {
            return map;
        }
        String[] k = mo79770k(R.array.countrycode_domain_overrides, false);
        HashMap hashMap = new HashMap();
        boolean z = true;
        if (1 != ((k.length & 1) ^ 1)) {
            z = false;
        }
        C58838bb.m90883r(z);
        for (int i = 0; i < k.length - 1; i += 2) {
            hashMap.put(k[i], k[i + 1]);
        }
        this.f232794d.put(R.array.countrycode_domain_overrides, hashMap);
        return hashMap;
    }
}
