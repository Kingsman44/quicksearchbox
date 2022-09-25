package p5304e.p5305a.p5306a.p5390n.p5405h.p5406a;

import com.google.android.libraries.phenotype.client.C31648ad;
import com.google.android.libraries.phenotype.client.C31649ae;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.h.a.am */
/* compiled from: PG */
public final class C68883am implements C68882al {

    /* renamed from: a */
    public static final C31654aj f185124a;

    /* renamed from: b */
    public static final C31654aj f185125b;

    /* renamed from: c */
    public static final C31654aj f185126c;

    /* renamed from: d */
    public static final C31654aj f185127d;

    /* renamed from: e */
    public static final C31654aj f185128e;

    static {
        C31652ah a = new C31652ah(C31676o.m59019a("com.google.android.gms.measurement")).mo37296a();
        f185124a = a.mo37302g("measurement.test.boolean_flag", false);
        f185125b = new C31648ad(a, "measurement.test.double_flag", Double.valueOf(-3.0d));
        f185126c = a.mo37301f("measurement.test.int_flag", -2);
        f185127d = a.mo37301f("measurement.test.long_flag", -1);
        f185128e = new C31649ae(a, "measurement.test.string_flag", "---", true);
    }

    /* renamed from: a */
    public final double mo60706a() {
        return ((Double) f185125b.mo37303b()).doubleValue();
    }

    /* renamed from: b */
    public final long mo60707b() {
        return ((Long) f185126c.mo37303b()).longValue();
    }

    /* renamed from: c */
    public final long mo60708c() {
        return ((Long) f185127d.mo37303b()).longValue();
    }

    /* renamed from: d */
    public final String mo60709d() {
        return (String) f185128e.mo37303b();
    }

    /* renamed from: e */
    public final boolean mo60710e() {
        return ((Boolean) f185124a.mo37303b()).booleanValue();
    }
}
