package p5304e.p5305a.p5306a.p5390n.p5403g.p5404a;

import com.google.android.libraries.mdi.download.C28695aa;
import com.google.android.libraries.mdi.download.C29316db;
import com.google.android.libraries.phenotype.client.C31650af;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.g.a.h */
/* compiled from: PG */
public final class C68866h implements C68863e {

    /* renamed from: a */
    public static final C31654aj f185080a;

    /* renamed from: b */
    public static final C31654aj f185081b;

    /* renamed from: c */
    public static final C31654aj f185082c;

    /* renamed from: d */
    public static final C31654aj f185083d;

    /* renamed from: e */
    public static final C31654aj f185084e;

    /* renamed from: f */
    public static final C31654aj f185085f;

    /* renamed from: g */
    public static final C31654aj f185086g;

    /* renamed from: h */
    public static final C31654aj f185087h;

    /* renamed from: i */
    public static final C31654aj f185088i;

    /* renamed from: j */
    public static final C31654aj f185089j;

    /* renamed from: k */
    public static final C31654aj f185090k;

    /* renamed from: l */
    public static final C31654aj f185091l;

    /* renamed from: m */
    public static final C31654aj f185092m;

    /* renamed from: n */
    public static final C31654aj f185093n;

    /* renamed from: o */
    public static final C31654aj f185094o;

    /* renamed from: p */
    public static final C31654aj f185095p;

    /* renamed from: q */
    public static final C31654aj f185096q;

    /* renamed from: r */
    public static final C31654aj f185097r;

    /* renamed from: s */
    public static final C31654aj f185098s;

    /* renamed from: t */
    public static final C31654aj f185099t;

    /* renamed from: u */
    public static final C31654aj f185100u;

    static {
        C31652ah b = new C31652ah(C31676o.m59019a("com.google.android.gms.icing.mdd")).mo37297b();
        b.mo37302g("gms_icing_mdd_add_configs_from_phenotype", true);
        b.mo37302g("broadcast_newly_downloaded_groups", true);
        try {
            f185080a = new C31650af(b, "build_id_overrides", C28695aa.f77965b, true, C68864f.f185078a);
            b.mo37302g("gms_icing_mdd_cache_last_location", true);
            b.mo37302g("clear_state_on_mdd_disabled", false);
            f185081b = b.mo37302g("delete_file_groups_with_files_missing", true);
            b.mo37302g("gms_mdd_download_first_on_wifi_then_on_any_network", true);
            b.mo37302g("gms_mdd_dump_mdd_info", false);
            b.mo37302g("enable_android_file_sharing", true);
            b.mo37302g("enable_android_file_sharing_data_clean_up", true);
            b.mo37302g("enable_android_sharing_daily_maintenance", false);
            b.mo37302g("enable_client_error_logging", false);
            f185082c = b.mo37302g("enable_compressed_file", true);
            f185083d = b.mo37302g("enable_days_since_last_maintenance_tracking", true);
            b.mo37302g("gms_mdd_enable_debug_ui", false);
            f185084e = b.mo37302g("enable_delayed_download", true);
            b.mo37302g("enable_delta_download", true);
            f185085f = b.mo37302g("enable_download_stage_experiment_id_propagation", false);
            f185086g = b.mo37302g("enable_isolated_structure_verification", true);
            b.mo37302g("gms_mdd_enable_mdd_gcm_service", true);
            b.mo37302g("enable_mobile_data_download", true);
            b.mo37302g("enable_mobstore_file_service", true);
            b.mo37302g("enable_mobstore_file_service_rename", true);
            b.mo37302g("enable_mobstore_file_service_whitelist", true);
            f185087h = b.mo37302g("enable_rng_based_device_stable_sampling", true);
            f185088i = b.mo37302g("enable_sideloading", false);
            f185089j = b.mo37302g("gms_mdd_enable_silent_feedback", true);
            f185090k = b.mo37302g("enable_zip_folder", true);
            f185091l = b.mo37301f("FeatureFlags__file_key_version", 2);
            b.mo37302g("gcm_reschedule_only_once_per_process_start", true);
            b.mo37302g("gms_mdd_switch_to_cronet", false);
            b.mo37301f("gms_icing_mdd_location_s2_level", 10);
            b.mo37301f("gms_icing_mdd_task_await_time", 5);
            f185092m = b.mo37302g("log_file_groups_with_files_missing", true);
            f185093n = b.mo37302g("log_network_stats", true);
            b.mo37302g("gms_mdd_log_storage_stats", true);
            f185094o = b.mo37302g("gms_icing_mdd_delete_groups_removed_accounts", false);
            f185095p = b.mo37302g("gms_icing_mdd_delete_uninstalled_apps", true);
            f185096q = b.mo37302g("gms_icing_mdd_enable_download_pending_groups", true);
            f185097r = b.mo37302g("gms_icing_mdd_enable_garbage_collection", true);
            f185098s = b.mo37302g("gms_icing_mdd_enable_verify_pending_groups", true);
            f185099t = b.mo37301f("gms_icing_mdd_reset_trigger", 0);
            b.mo37302g("migrate_file_expiration_policy", true);
            b.mo37302g("migrate_to_new_file_key", true);
            try {
                f185100u = new C31650af(b, "FeatureFlags__pds_migration_state", C29316db.f79457b, true, C68865g.f185079a);
                b.mo37302g("remove_groupkeys_with_downloaded_field_not_set", true);
                b.mo37302g("test_only_file_key_version", false);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public final long mo60666a() {
        return ((Long) f185091l.mo37303b()).longValue();
    }

    /* renamed from: b */
    public final long mo60667b() {
        return ((Long) f185099t.mo37303b()).longValue();
    }

    /* renamed from: c */
    public final C28695aa mo60668c() {
        return (C28695aa) f185080a.mo37303b();
    }

    /* renamed from: d */
    public final C29316db mo60669d() {
        return (C29316db) f185100u.mo37303b();
    }

    /* renamed from: e */
    public final boolean mo60670e() {
        return ((Boolean) f185081b.mo37303b()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo60671f() {
        return ((Boolean) f185082c.mo37303b()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo60672g() {
        return ((Boolean) f185083d.mo37303b()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo60673h() {
        return ((Boolean) f185084e.mo37303b()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo60674i() {
        return ((Boolean) f185085f.mo37303b()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo60675j() {
        return ((Boolean) f185086g.mo37303b()).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo60676k() {
        return ((Boolean) f185087h.mo37303b()).booleanValue();
    }

    /* renamed from: l */
    public final boolean mo60677l() {
        return ((Boolean) f185088i.mo37303b()).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo60678m() {
        return ((Boolean) f185089j.mo37303b()).booleanValue();
    }

    /* renamed from: n */
    public final boolean mo60679n() {
        return ((Boolean) f185090k.mo37303b()).booleanValue();
    }

    /* renamed from: o */
    public final boolean mo60680o() {
        return ((Boolean) f185092m.mo37303b()).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo60681p() {
        return ((Boolean) f185093n.mo37303b()).booleanValue();
    }

    /* renamed from: q */
    public final boolean mo60682q() {
        return ((Boolean) f185094o.mo37303b()).booleanValue();
    }

    /* renamed from: r */
    public final boolean mo60683r() {
        return ((Boolean) f185095p.mo37303b()).booleanValue();
    }

    /* renamed from: s */
    public final boolean mo60684s() {
        return ((Boolean) f185096q.mo37303b()).booleanValue();
    }

    /* renamed from: t */
    public final boolean mo60685t() {
        return ((Boolean) f185097r.mo37303b()).booleanValue();
    }

    /* renamed from: u */
    public final boolean mo60686u() {
        return ((Boolean) f185098s.mo37303b()).booleanValue();
    }
}
