package p5304e.p5305a.p5306a.p5390n.p5399e.p5400a;

import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.e.a.f */
/* compiled from: PG */
public final class C68852f implements C68851e {

    /* renamed from: a */
    public static final C31654aj f185057a;

    static {
        C31652ah a = new C31652ah(C31676o.m59019a("com.google.android.gms.droidguard")).mo37296a();
        a.mo37301f("DroidguardCore__backend_reachability_check_timeout_millis", 30000);
        a.mo37301f("droidguard_client_timeout_millis", 60000);
        f185057a = a.mo37301f("DroidguardCore__default_client_library_request_timeout_millis", 60000);
        a.mo37302g("DroidguardCore__disable_posix_signals_handling", false);
        a.mo37302g("DroidguardCore__enable_backend_reachability_check", false);
        a.mo37302g("DroidguardCore__enable_task_required_uri_reachability_check", false);
        a.mo37301f("DroidguardCore__fetch_creation_response_max_attempts", 2);
        a.mo37301f("droidguard_connection_timeout_millis", 30000);
        a.mo37301f("droidguard_read_timeout_millis", 30000);
        a.mo37301f("gms:droidguard:retry_backoff_seconds_base", 900);
        a.mo37301f("gms:droidguard:retry_backoff_seconds_limit", 28800);
        a.mo37302g("DroidguardCore__use_migrated_network_stack", false);
        a.mo37301f("DroidguardCore__wait_on_init_timeout_millis", 0);
    }

    /* renamed from: a */
    public final long mo60649a() {
        return ((Long) f185057a.mo37303b()).longValue();
    }
}
