package p5304e.p5305a.p5306a.p5446y.p5447a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: e.a.a.y.a.ac */
/* compiled from: PG */
public final class C69324ac implements C69322aa {

    /* renamed from: a */
    public static final C31718bj f185484a;

    static {
        C31728bt f = new C31728bt("com.google.android.libraries.performance.primes").mo37345g(C58485gu.m89846n("CLIENT_LOGGING_PROD")).mo37343e().mo37344f();
        try {
            f185484a = f.mo37342d("8", (C71304ef) C62942bv.parseFrom((C62942bv) C71304ef.f190405d, Base64.decode("EOgHGAQ", 3)), C69323ab.f185483a);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final C71304ef mo61006a(Context context) {
        return (C71304ef) f185484a.mo37336b(context);
    }
}
