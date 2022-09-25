package p5304e.p5305a.p5306a.p5446y.p5447a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.performance.primes.metrics.crash.C31363k;
import com.google.android.libraries.performance.primes.metrics.crash.C31365m;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: e.a.a.y.a.q */
/* compiled from: PG */
public final class C69367q implements C69364n {

    /* renamed from: a */
    public static final C31718bj f185531a;

    /* renamed from: b */
    public static final C31718bj f185532b;

    static {
        C31728bt f = new C31728bt("com.google.android.libraries.performance.primes").mo37345g(C58485gu.m89846n("CLIENT_LOGGING_PROD")).mo37343e().mo37344f();
        try {
            C71304ef efVar = (C71304ef) C62942bv.parseFrom((C62942bv) C71304ef.f190405d, Base64.decode("EAAYAg", 3));
            try {
                f185531a = f.mo37342d("45376983", (C31365m) C62942bv.parseFrom((C62942bv) C31365m.f84460a, Base64.decode("CAAQZBj0AyDoBw", 3)), C69365o.f185529a);
                try {
                    f185532b = f.mo37342d("45371370", (C31363k) C62942bv.parseFrom((C62942bv) C31363k.f84455c, Base64.decode("CAAQAA", 3)), C69366p.f185530a);
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
    public final C31363k mo61032a(Context context) {
        return (C31363k) f185532b.mo37336b(context);
    }

    /* renamed from: b */
    public final C31365m mo61033b(Context context) {
        return (C31365m) f185531a.mo37336b(context);
    }
}
