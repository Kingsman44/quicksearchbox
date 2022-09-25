package p5304e.p5305a.p5306a.p5388m.p5389a;

import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;

/* renamed from: e.a.a.m.a.c */
/* compiled from: PG */
public final class C68822c implements C68821b {

    /* renamed from: a */
    public static final C31718bj f184899a;

    /* renamed from: b */
    public static final C31718bj f184900b;

    /* renamed from: c */
    public static final C31718bj f184901c;

    /* renamed from: d */
    public static final C31718bj f184902d;

    /* renamed from: e */
    public static final C31718bj f184903e;

    /* renamed from: f */
    public static final C31718bj f184904f;

    /* renamed from: g */
    public static final C31718bj f184905g;

    /* renamed from: h */
    public static final C31718bj f184906h;

    static {
        C31728bt e = new C31728bt("com.google.android.libraries.consent.flows.footprints").mo37343e();
        f184899a = e.mo37341c("FootprintsConsentFeature__call_facs_cache_to_get_device_level_settings", false);
        f184900b = e.mo37341c("FootprintsConsentFeature__call_facs_cache_to_update_settings", false);
        f184901c = e.mo37341c("FootprintsConsentFeature__call_update_settings_with_empty_settings_on", false);
        f184902d = e.mo37339a("FootprintsConsentFeature__footprints_oneplatform_service_deadline_ms", 10000);
        f184903e = e.mo37340b("FootprintsConsentFeature__footprints_oneplatform_service_host", "footprints-pa.googleapis.com");
        f184904f = e.mo37339a("FootprintsConsentFeature__footprints_oneplatform_service_port", 443);
        f184905g = e.mo37339a("FootprintsConsentFeature__footprints_responses_cache_ttl_seconds", 300);
        f184906h = e.mo37341c("FootprintsConsentFeature__kill_switch_on", false);
    }

    /* renamed from: a */
    public final long mo60503a() {
        return ((Long) f184902d.mo37337c(C31760t.m59098a())).longValue();
    }

    /* renamed from: b */
    public final long mo60504b() {
        return ((Long) f184904f.mo37337c(C31760t.m59098a())).longValue();
    }

    /* renamed from: c */
    public final long mo60505c() {
        return ((Long) f184905g.mo37337c(C31760t.m59098a())).longValue();
    }

    /* renamed from: d */
    public final String mo60506d() {
        return (String) f184903e.mo37337c(C31760t.m59098a());
    }

    /* renamed from: e */
    public final boolean mo60507e() {
        return ((Boolean) f184899a.mo37337c(C31760t.m59098a())).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo60508f() {
        return ((Boolean) f184900b.mo37337c(C31760t.m59098a())).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo60509g() {
        return ((Boolean) f184901c.mo37337c(C31760t.m59098a())).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo60510h() {
        return ((Boolean) f184906h.mo37337c(C31760t.m59098a())).booleanValue();
    }
}
