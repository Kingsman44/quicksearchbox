package p5304e.p5305a.p5306a.p5446y.p5447a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.performance.primes.metrics.p2406c.p2407a.C31323b;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: e.a.a.y.a.l */
/* compiled from: PG */
public final class C69362l implements C69360j {

    /* renamed from: a */
    public static final C31718bj f185526a;

    static {
        C31728bt f = new C31728bt("com.google.android.libraries.performance.primes").mo37345g(C58485gu.m89846n("CLIENT_LOGGING_PROD")).mo37343e().mo37344f();
        try {
            f185526a = f.mo37342d("15", (C71304ef) C62942bv.parseFrom((C62942bv) C71304ef.f190405d, Base64.decode("EAAYAg", 3)), C69361k.f185525a);
            try {
                C31323b bVar = (C31323b) C62942bv.parseFrom((C62942bv) C31323b.f84340a, Base64.decode("CAASABgAIAAoADAAOABAAA", 3));
                try {
                    C31323b bVar2 = (C31323b) C62942bv.parseFrom((C62942bv) C31323b.f84340a, Base64.decode("CAASABgAIAAoADAAOABAAA", 3));
                } catch (Exception e) {
                    throw new AssertionError(e);
                }
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: a */
    public final C71304ef mo61030a(Context context) {
        return (C71304ef) f185526a.mo37336b(context);
    }
}
