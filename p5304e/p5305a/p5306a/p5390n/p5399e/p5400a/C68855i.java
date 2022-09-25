package p5304e.p5305a.p5306a.p5390n.p5399e.p5400a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.e.a.i */
/* compiled from: PG */
public final class C68855i implements C68854h {

    /* renamed from: a */
    public static final C31654aj f185060a;

    /* renamed from: b */
    public static final C31654aj f185061b;

    /* renamed from: c */
    public static final C31654aj f185062c;

    static {
        C31652ah a = new C31652ah(C31676o.m59019a("com.google.android.gms.droidguard")).mo37296a();
        a.mo37302g("FallbackResponseFeature__catch_all_signal_exceptions", false);
        a.mo37302g("FallbackResponseFeature__enable_signal_selector", true);
        f185060a = a.mo37302g("FallbackResponseFeature__include_build_fingerprint_in_plaintext", true);
        a.mo37302g("FallbackResponseFeature__include_copied_extra_keys", true);
        a.mo37302g("FallbackResponseFeature__include_exception_and_versions_in_plaintext", true);
        f185061b = a.mo37302g("FallbackResponseFeature__include_exception_and_versions_in_plaintext_generalized", true);
        a.mo37302g("FallbackResponseFeature__include_gms_core_version", true);
        a.mo37302g("FallbackResponseFeature__include_gsid", true);
        a.mo37302g("FallbackResponseFeature__include_key_attestation", false);
        f185062c = a.mo37302g("FallbackResponseFeature__include_versions_in_client_plaintext", true);
        new C31649ae(a, "FallbackResponseFeature__main_signals", "5,7,8,9,0,1,2,3,4,6,10,11,12,13,14,19,20,21,27,24,25,26,28,22,29", true);
        new C31649ae(a, "FallbackResponseFeature__per_flow_signal_overrides", BuildConfig.FLAVOR, true);
        new C31649ae(a, "FallbackResponseFeature__safe_flows", BuildConfig.FLAVOR, true);
        new C31649ae(a, "FallbackResponseFeature__safe_signals", "5,0,2,3,6,10,11,12,13,14,19,20,21,23,24,25,26", true);
    }

    /* renamed from: a */
    public final boolean mo60651a() {
        return ((Boolean) f185060a.mo37303b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo60652b() {
        return ((Boolean) f185061b.mo37303b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60653c() {
        return ((Boolean) f185062c.mo37303b()).booleanValue();
    }
}
