package p5304e.p5305a.p5306a.p5390n.p5391a.p5392a;

import com.google.android.libraries.phenotype.client.C31648ad;
import com.google.android.libraries.phenotype.client.C31650af;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;
import com.google.protos.p5124m.p5125a.C65603f;

/* renamed from: e.a.a.n.a.a.d */
/* compiled from: PG */
public final class C68826d implements C68824b {

    /* renamed from: a */
    public static final C31654aj f184910a;

    /* renamed from: b */
    public static final C31654aj f184911b;

    /* renamed from: c */
    public static final C31654aj f184912c;

    /* renamed from: d */
    public static final C31654aj f184913d;

    static {
        C31652ah ahVar = new C31652ah(C31676o.m59019a("com.google.android.gms.auth_account"));
        C31652ah a = new C31652ah(ahVar.f85137a, ahVar.f85138b, ahVar.f85139c, ahVar.f85140d, ahVar.f85141e, true, ahVar.f85143g, ahVar.f85144h).mo37296a();
        try {
            f184910a = new C31650af(a, "CapabilityFeatures__blocked_packages_for_connectionless", C65603f.f178305b, true, C68825c.f184909a);
            a.mo37302g("CapabilityFeatures__debug_capability", false);
            f184911b = a.mo37302g("CapabilityFeatures__debug_connectionless", false);
            a.mo37302g("CapabilityFeatures__enable_capability", false);
            a.mo37302g("CapabilityFeatures__enable_fetch_capabilities_in_get_accounts", false);
            a.mo37302g("CapabilityFeatures__enable_force_sync", true);
            a.mo37302g("CapabilityFeatures__enable_force_sync_for_unknown_capability", true);
            a.mo37302g("CapabilityFeatures__enable_logging_capability_app_visibility", true);
            f184912c = a.mo37302g("CapabilityFeatures__enable_logging_capability_latency", false);
            a.mo37302g("CapabilityFeatures__enforce_app_visibility_restrictions", true);
            a.mo37302g("CapabilityFeatures__update_seed_capability_alias_in_account_sync", false);
            f184913d = a.mo37302g("CapabilityFeatures__use_connectionless", false);
            a.mo37302g("CapabilityFeatures__use_gaia_service_flags", true);
            new C31648ad(a, "CapabilityFeatures__visibility_not_restricted_logging_sample_fractions", Double.valueOf(0.01d));
            new C31648ad(a, "CapabilityFeatures__visibility_restricted_logging_sample_fractions", Double.valueOf(1.0d));
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final C65603f mo60512a() {
        return (C65603f) f184910a.mo37303b();
    }

    /* renamed from: b */
    public final boolean mo60513b() {
        return ((Boolean) f184911b.mo37303b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60514c() {
        return ((Boolean) f184912c.mo37303b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo60515d() {
        return ((Boolean) f184913d.mo37303b()).booleanValue();
    }
}
