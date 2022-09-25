package p5304e.p5305a.p5306a.p5390n.p5399e.p5400a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.e.a.c */
/* compiled from: PG */
public final class C68849c implements C68848b {

    /* renamed from: a */
    public static final C31654aj f185053a;

    /* renamed from: b */
    public static final C31654aj f185054b;

    static {
        C31652ah a = new C31652ah(C31676o.m59019a("com.google.android.gms.droidguard")).mo37296a();
        f185053a = a.mo37302g("droidguard_enable_client_library_telemetry", false);
        f185054b = new C31649ae(a, "droidguard_flows_with_fine_client_library_telemetry", BuildConfig.FLAVOR, true);
    }

    /* renamed from: a */
    public final String mo60646a() {
        return (String) f185054b.mo37303b();
    }

    /* renamed from: b */
    public final boolean mo60647b() {
        return ((Boolean) f185053a.mo37303b()).booleanValue();
    }
}
