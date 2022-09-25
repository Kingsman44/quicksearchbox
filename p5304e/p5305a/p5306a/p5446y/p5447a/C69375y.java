package p5304e.p5305a.p5306a.p5446y.p5447a;

import android.content.Context;
import android.util.Base64;
import com.google.android.libraries.performance.primes.metrics.p2409d.C31372aa;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71304ef;

/* renamed from: e.a.a.y.a.y */
/* compiled from: PG */
public final class C69375y implements C69372v {

    /* renamed from: a */
    public static final C31718bj f185540a;

    /* renamed from: b */
    public static final C31718bj f185541b;

    /* renamed from: c */
    public static final C31718bj f185542c;

    /* renamed from: d */
    public static final C31718bj f185543d;

    /* renamed from: e */
    public static final C31718bj f185544e;

    static {
        C31728bt f = new C31728bt("com.google.android.libraries.performance.primes").mo37345g(C58485gu.m89846n("CLIENT_LOGGING_PROD")).mo37343e().mo37344f();
        f185540a = f.mo37341c("45374182", false);
        f185541b = f.mo37341c("25", false);
        try {
            f185542c = f.mo37342d("40", (C31372aa) C62942bv.parseFrom((C62942bv) C31372aa.f84469d, Base64.decode("Ci1jb20uZ29vZ2xlLmFuZHJvaWQucHJpbWVzLWphbmstJVBBQ0tBR0VfTkFNRSUSIwgCEh9KPCVFVkVOVF9OQU1FJT4jbWlzc2VkQXBwRnJhbWVzEh8IAxIbSjwlRVZFTlRfTkFNRSU+I3RvdGFsRnJhbWVzEiYIBRIiSjwlRVZFTlRfTkFNRSU+I21heEZyYW1lVGltZU1pbGxpcw", 3)), C69373w.f185538a);
            try {
                f185543d = f.mo37342d("13", (C71304ef) C62942bv.parseFrom((C62942bv) C71304ef.f190405d, Base64.decode("EAAYAg", 3)), C69374x.f185539a);
                f185544e = f.mo37341c("45351799", false);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public final C31372aa mo61037a(Context context) {
        return (C31372aa) f185542c.mo37336b(context);
    }

    /* renamed from: b */
    public final C71304ef mo61038b(Context context) {
        return (C71304ef) f185543d.mo37336b(context);
    }

    /* renamed from: c */
    public final boolean mo61039c(Context context) {
        return ((Boolean) f185540a.mo37336b(context)).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo61040d(Context context) {
        return ((Boolean) f185541b.mo37336b(context)).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo61041e(Context context) {
        return ((Boolean) f185544e.mo37336b(context)).booleanValue();
    }
}
