package p5304e.p5305a.p5306a.p5446y.p5447a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: e.a.a.y.a.ar */
/* compiled from: PG */
public final class C69339ar implements C69337ap {

    /* renamed from: a */
    public static final C31718bj f185501a;

    /* renamed from: b */
    public static final C31718bj f185502b;

    /* renamed from: c */
    public static final C31718bj f185503c;

    static {
        C31728bt f = new C31728bt("com.google.android.libraries.performance.primes").mo37345g(C58485gu.m89846n("CLIENT_LOGGING_PROD")).mo37343e().mo37344f();
        f185501a = f.mo37341c("3", false);
        f185502b = f.mo37339a("45357887", 1);
        try {
            f185503c = f.mo37342d("19", (C71304ef) C62942bv.parseFrom((C62942bv) C71304ef.f190405d, Base64.decode("EAAYAg", 3)), C69338aq.f185500a);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final long mo61016a(Context context) {
        return ((Long) f185502b.mo37336b(context)).longValue();
    }

    /* renamed from: b */
    public final C71304ef mo61017b(Context context) {
        return (C71304ef) f185503c.mo37336b(context);
    }

    /* renamed from: c */
    public final boolean mo61018c(Context context) {
        return ((Boolean) f185501a.mo37336b(context)).booleanValue();
    }
}
