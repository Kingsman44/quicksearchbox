package p5304e.p5305a.p5306a.p5390n.p5393b.p5394a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.b.a.f */
/* compiled from: PG */
public final class C68836f implements C68835e {

    /* renamed from: a */
    public static final C31654aj f184932a;

    static {
        C31652ah b = new C31652ah(C31676o.m59019a("com.google.android.gms.learning")).mo37298c().mo37296a().mo37297b();
        b.mo37301f("ExampleStoreFeature__collection_max_size_bytes", 104857600);
        b.mo37302g("ExampleStoreFeature__delayed_level_db_opening", true);
        new C31649ae(b, "ExampleStoreFeature__example_store_client_blacklist", BuildConfig.FLAVOR, true);
        b.mo37301f("ExampleStoreFeature__expire_check_period_ms", 72000000);
        b.mo37302g("ExampleStoreFeature__is_example_store_enabled", false);
        b.mo37301f("ExampleStoreFeature__max_size_bytes", 524288000);
        b.mo37301f("ExampleStoreFeature__max_ttl_ms", 7776000000L);
        f184932a = b.mo37302g("ExampleStoreFeature__selector_context_include_context_data", false);
        b.mo37301f("ExampleStoreFeature__snapshot_period_ms", 72000000);
    }

    /* renamed from: a */
    public final boolean mo60530a() {
        return ((Boolean) f184932a.mo37303b()).booleanValue();
    }
}
