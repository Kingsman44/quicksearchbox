package p5304e.p5305a.p5306a.p5446y.p5447a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71314i;

/* renamed from: e.a.a.y.a.d */
/* compiled from: PG */
public final class C69354d implements C69348b {

    /* renamed from: a */
    public static final C31718bj f185517a;

    /* renamed from: b */
    public static final C31718bj f185518b;

    static {
        C31728bt f = new C31728bt("com.google.android.libraries.performance.primes").mo37345g(C58485gu.m89846n("CLIENT_LOGGING_PROD")).mo37343e().mo37344f();
        f185517a = f.mo37341c("45352228", true);
        try {
            f185518b = f.mo37342d("45352241", (C71314i) C62942bv.parseFrom((C62942bv) C71314i.f190452b, Base64.decode("CAYIBAgFCAM", 3)), C69353c.f185516a);
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    public final C71314i mo61023a(Context context) {
        return (C71314i) f185518b.mo37336b(context);
    }

    /* renamed from: b */
    public final boolean mo61024b(Context context) {
        return ((Boolean) f185517a.mo37336b(context)).booleanValue();
    }
}
