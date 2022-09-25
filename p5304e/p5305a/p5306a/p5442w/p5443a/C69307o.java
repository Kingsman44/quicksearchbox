package p5304e.p5305a.p5306a.p5442w.p5443a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;

/* renamed from: e.a.a.w.a.o */
/* compiled from: PG */
public final class C69307o implements C69306n {

    /* renamed from: a */
    public static final C31654aj f185450a;

    /* renamed from: b */
    public static final C31654aj f185451b;

    /* renamed from: c */
    public static final C31654aj f185452c;

    /* renamed from: d */
    public static final C31654aj f185453d;

    static {
        C31652ah a = new C31652ah("phenotype__com.google.android.libraries.social.populous").mo37296a();
        new C31649ae(a, "GrpcLoaderFeature__auth_scope", "oauth2:https://www.googleapis.com/auth/peopleapi.readonly", true);
        f185450a = a.mo37302g("GrpcLoaderFeature__enable_locale_interceptor", false);
        a.mo37302g("GrpcLoaderFeature__enable_private_photo_url", false);
        f185451b = a.mo37302g("GrpcLoaderFeature__log_network_usage", true);
        f185452c = new C31649ae(a, "GrpcLoaderFeature__people_stack_service_authority_override", BuildConfig.FLAVOR, true);
        new C31649ae(a, "GrpcLoaderFeature__service_authority_override", BuildConfig.FLAVOR, true);
        a.mo37302g("GrpcLoaderFeature__skip_live_peopleapi_loader_when_logged_out", false);
        a.mo37302g("GrpcLoaderFeature__sort_iant_originating_fields_by_affinity", true);
        f185453d = a.mo37301f("GrpcLoaderFeature__timeout_ms", 60000);
        a.mo37302g("GrpcLoaderFeature__use_async_loaders", true);
        a.mo37302g("GrpcLoaderFeature__use_generated_request_mask", false);
        a.mo37302g("GrpcLoaderFeature__use_targeted_request_mask", false);
    }

    /* renamed from: a */
    public final long mo60985a() {
        return ((Long) f185453d.mo37303b()).longValue();
    }

    /* renamed from: b */
    public final String mo60986b() {
        return (String) f185452c.mo37303b();
    }

    /* renamed from: c */
    public final boolean mo60987c() {
        return ((Boolean) f185450a.mo37303b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo60988d() {
        return ((Boolean) f185451b.mo37303b()).booleanValue();
    }
}
