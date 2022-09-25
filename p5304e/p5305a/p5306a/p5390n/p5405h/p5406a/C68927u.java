package p5304e.p5305a.p5306a.p5390n.p5405h.p5406a;

import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.h.a.u */
/* compiled from: PG */
public final class C68927u implements C68926t {

    /* renamed from: a */
    public static final C31654aj f185212a;

    /* renamed from: b */
    public static final C31654aj f185213b;

    /* renamed from: c */
    public static final C31654aj f185214c;

    static {
        C31652ah a = new C31652ah(C31676o.m59019a("com.google.android.gms.measurement")).mo37296a();
        a.mo37302g("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f185212a = a.mo37302g("measurement.audience.refresh_event_count_filters_timestamp", false);
        f185213b = a.mo37302g("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f185214c = a.mo37302g("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    /* renamed from: a */
    public final boolean mo60785a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo60786b() {
        return ((Boolean) f185212a.mo37303b()).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60787c() {
        return ((Boolean) f185213b.mo37303b()).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo60788d() {
        return ((Boolean) f185214c.mo37303b()).booleanValue();
    }
}
