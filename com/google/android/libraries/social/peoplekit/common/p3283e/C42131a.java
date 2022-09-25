package com.google.android.libraries.social.peoplekit.common.p3283e;

import android.content.Context;
import com.google.android.libraries.phenotype.client.C31646ab;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;

/* renamed from: com.google.android.libraries.social.peoplekit.common.e.a */
/* compiled from: PG */
public final class C42131a {

    /* renamed from: a */
    public static final C31654aj f110203a;

    /* renamed from: b */
    public static final C31654aj f110204b;

    /* renamed from: c */
    public static final C31654aj f110205c;

    /* renamed from: d */
    public static final C31654aj f110206d;

    /* renamed from: e */
    public static final C31654aj f110207e;

    /* renamed from: f */
    public static final C31654aj f110208f;

    /* renamed from: g */
    public static final C31654aj f110209g;

    /* renamed from: h */
    public static final C31654aj f110210h;

    /* renamed from: i */
    public static final C31654aj f110211i;

    /* renamed from: j */
    public static final C31654aj f110212j;

    /* renamed from: k */
    public static final C31654aj f110213k;

    /* renamed from: l */
    public static final C31654aj f110214l;

    /* renamed from: m */
    public static final C31654aj f110215m;

    /* renamed from: n */
    public static final C31654aj f110216n;

    /* renamed from: o */
    public static final C31654aj f110217o;

    /* renamed from: p */
    private static final C31652ah f110218p;

    static {
        C31652ah d = new C31652ah("phenotype_shared_prefs").mo37299d("PeopleKitFlags__");
        f110218p = d;
        f110203a = d.mo37300e("remove_sendkit_cache_flag", false);
        f110204b = d.mo37300e("use_populous_az_api_flag", false);
        d.mo37300e("set_selection_to_end_for_set_uncommited_text_for_autocomplete_bar", true);
        f110205c = d.mo37300e("ignore_on_text_changed_without_change", true);
        f110206d = d.mo37300e("hide_suggestions_flag", false);
        f110207e = d.mo37300e("hide_suggestions_device_contact_handling_flag", true);
        f110208f = d.mo37300e("use_log_verifier_flag", true);
        new C31646ab(d, "contextual_suggestions_trigger_size", 2);
        f110209g = d.mo37300e("enable_private_avatars", false);
        f110210h = d.mo37300e("enable_material_next", true);
        d.mo37300e("fix_status_bar_color_flag", true);
        f110211i = d.mo37300e("enable_auto_select_with_key_event", true);
        f110212j = d.mo37300e("require_targets_for_target_selected", true);
        d.mo37300e("fix_chip_duplication", true);
        new C31646ab(d, "contextual_suggestion_ui_type", 0);
        d.mo37300e("enforce_limit_keep_in_list_3p", true);
        d.mo37300e("report_3p_app_selection", true);
        f110213k = d.mo37300e("enable_people_sheet", false);
        f110214l = d.mo37300e("merge_session_logging", false);
        f110215m = d.mo37300e("fix_delete_key_action_on_chip", true);
        f110216n = d.mo37300e("fix_ood_with_preselected_contacts", true);
        new C31646ab(d, "third_party_apps_row_button_throttle", 500);
        f110217o = d.mo37300e("fix_people_chips_scroll_view_in_auto_complete_bar", true);
        d.mo37300e("show_more_3p_targets_for_large_screens", false);
        d.mo37300e("autocomplete_bar_focus_fix", false);
        d.mo37300e("fix_people_kit_custom_avatar_binding_view", true);
        d.mo37300e("dc_consent_experiment", false);
    }

    /* renamed from: a */
    public static void m73918a(Context context) {
        C31654aj.m58985d(context);
    }

    /* renamed from: b */
    public static boolean m73919b() {
        return ((Boolean) f110210h.mo37303b()).booleanValue();
    }

    /* renamed from: c */
    public static boolean m73920c() {
        return ((Boolean) f110209g.mo37303b()).booleanValue();
    }

    /* renamed from: d */
    public static boolean m73921d() {
        return ((Boolean) f110215m.mo37303b()).booleanValue();
    }

    /* renamed from: e */
    public static boolean m73922e() {
        return ((Boolean) f110216n.mo37303b()).booleanValue();
    }

    /* renamed from: f */
    public static boolean m73923f() {
        return ((Boolean) f110217o.mo37303b()).booleanValue();
    }

    /* renamed from: g */
    public static boolean m73924g() {
        return ((Boolean) f110214l.mo37303b()).booleanValue();
    }

    /* renamed from: h */
    public static boolean m73925h() {
        return ((Boolean) f110203a.mo37303b()).booleanValue();
    }

    /* renamed from: i */
    public static boolean m73926i() {
        return ((Boolean) f110212j.mo37303b()).booleanValue();
    }

    /* renamed from: j */
    public static boolean m73927j() {
        return ((Boolean) f110206d.mo37303b()).booleanValue();
    }

    /* renamed from: k */
    public static void m73928k() {
        ((Boolean) f110213k.mo37303b()).booleanValue();
    }
}
