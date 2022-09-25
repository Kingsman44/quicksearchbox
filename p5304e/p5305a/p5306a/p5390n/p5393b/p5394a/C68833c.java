package p5304e.p5305a.p5306a.p5390n.p5393b.p5394a;

import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.b.a.c */
/* compiled from: PG */
public final class C68833c implements C68832b {

    /* renamed from: a */
    public static final C31654aj f184922a;

    /* renamed from: b */
    public static final C31654aj f184923b;

    /* renamed from: c */
    public static final C31654aj f184924c;

    /* renamed from: d */
    public static final C31654aj f184925d;

    /* renamed from: e */
    public static final C31654aj f184926e;

    /* renamed from: f */
    public static final C31654aj f184927f;

    /* renamed from: g */
    public static final C31654aj f184928g;

    /* renamed from: h */
    public static final C31654aj f184929h;

    static {
        C31652ah b = new C31652ah(C31676o.m59019a("com.google.android.gms.learning")).mo37298c().mo37296a().mo37297b();
        f184922a = new C31649ae(b, "DiagnosisFeature__clearcut_counters_alias_opt_out", "EXAMPLE_STORE_ERROR_COUNT,TRAINING_SYSTEM_LOW_MEM_STATE,TRAINING_PROCESS_MEM_IMPORTANCE_STATE,TRAINING_PROCESS_MEM_LRU_STATE,SCHEDULER_SKEW_SECONDS,OPSTATS_DB_SIZE_BYTES,OPSTATS_DB_NUM_ENTRIES,OPSTATS_NUM_PRUNED_ENTRIES,OPSTATS_OLDEST_PRUNED_ENTRY_TENURE_HOURS", true);
        f184923b = b.mo37301f("DiagnosisFeature__clearcut_counters_default_alias", 10);
        f184924c = b.mo37302g("DiagnosisFeature__clearcut_counters_enabled", true);
        f184925d = b.mo37302g("DiagnosisFeature__clearcut_log_to_file_enabled_for_test", false);
        f184926e = b.mo37301f("DiagnosisFeature__clearcut_max_samples_per_counter", 200);
        f184927f = b.mo37302g("DiagnosisFeature__debug_diag_enabled", false);
        b.mo37302g("DiagnosisFeature__enable_clearcut_in_dynamite", true);
        b.mo37302g("DiagnosisFeature__increment_learning_context_refcount_for_background_work", true);
        f184928g = b.mo37302g("DiagnosisFeature__log_tensorflow_error_messages", true);
        f184929h = b.mo37302g("DiagnosisFeature__production_diag_enabled", true);
        b.mo37302g("DiagnosisFeature__stop_wrapping_or_ignoring_runtime_exceptions", true);
    }

    /* renamed from: a */
    public final long mo60521a() {
        return ((Long) f184923b.mo37303b()).longValue();
    }

    /* renamed from: b */
    public final long mo60522b() {
        return ((Long) f184926e.mo37303b()).longValue();
    }

    /* renamed from: c */
    public final String mo60523c() {
        return (String) f184922a.mo37303b();
    }

    /* renamed from: d */
    public final boolean mo60524d() {
        return ((Boolean) f184924c.mo37303b()).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo60525e() {
        return ((Boolean) f184925d.mo37303b()).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo60526f() {
        return ((Boolean) f184927f.mo37303b()).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo60527g() {
        return ((Boolean) f184928g.mo37303b()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo60528h() {
        return ((Boolean) f184929h.mo37303b()).booleanValue();
    }
}
