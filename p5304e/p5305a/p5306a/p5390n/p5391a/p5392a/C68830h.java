package p5304e.p5305a.p5306a.p5390n.p5391a.p5392a;

import android.util.Base64;
import com.google.android.libraries.phenotype.client.C31648ad;
import com.google.android.libraries.phenotype.client.C31650af;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;
import com.google.common.p4535g.C59203do;
import com.google.protobuf.C62942bv;
import com.google.protos.p5124m.p5125a.C65603f;

/* renamed from: e.a.a.n.a.a.h */
/* compiled from: PG */
public final class C68830h implements C68828f {

    /* renamed from: a */
    public static final C31654aj f184917a;

    /* renamed from: b */
    public static final C31654aj f184918b;

    /* renamed from: c */
    public static final C31654aj f184919c;

    static {
        C31652ah a = new C31652ah(C31676o.m59019a("com.google.android.gms.auth_account")).mo37298c().mo37296a();
        Double valueOf = Double.valueOf(C59203do.f157270a);
        new C31648ad(a, "getTokenRefactor__account_data_service_sample_percentage", valueOf);
        a.mo37302g("getTokenRefactor__account_data_service_tokenAPI_usable", true);
        a.mo37301f("getTokenRefactor__account_manager_timeout_seconds", 20);
        a.mo37301f("getTokenRefactor__android_id_shift", 0);
        a.mo37302g("getTokenRefactor__authenticator_logic_improved", false);
        try {
            C31652ah ahVar = a;
            f184917a = new C31650af(ahVar, "getTokenRefactor__blocked_packages", (C65603f) C62942bv.parseFrom((C62942bv) C65603f.f178305b, Base64.decode("ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n", 3)), true, C68829g.f184916a);
            a.mo37302g("getTokenRefactor__chimera_get_token_evolved", true);
            a.mo37301f("getTokenRefactor__clear_token_timeout_seconds", 20);
            a.mo37301f("getTokenRefactor__default_task_timeout_seconds", 20);
            f184918b = a.mo37302g("getTokenRefactor__gaul_accounts_api_evolved", false);
            f184919c = a.mo37302g("getTokenRefactor__gaul_token_api_evolved", false);
            a.mo37301f("getTokenRefactor__get_token_timeout_seconds", 120);
            a.mo37302g("getTokenRefactor__gms_account_authenticator_evolved", true);
            new C31648ad(a, "getTokenRefactor__gms_account_authenticator_sample_percentage", valueOf);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final C65603f mo60517a() {
        return (C65603f) f184917a.mo37303b();
    }

    /* renamed from: b */
    public final boolean mo60518b() {
        return ((Boolean) f184918b.mo37303b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60519c() {
        return ((Boolean) f184919c.mo37303b()).booleanValue();
    }
}
