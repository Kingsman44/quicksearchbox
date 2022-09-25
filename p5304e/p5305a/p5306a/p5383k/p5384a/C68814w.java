package p5304e.p5305a.p5306a.p5383k.p5384a;

import com.google.android.libraries.notifications.p2292g.C29995c;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;

/* renamed from: e.a.a.k.a.w */
/* compiled from: PG */
public final class C68814w implements C68812u {

    /* renamed from: a */
    public static final C31718bj f184889a;

    /* renamed from: b */
    public static final C31718bj f184890b;

    static {
        C31728bt e = new C31728bt("com.google.android.libraries.notifications").mo37345g(C58485gu.m89850r("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).mo37343e();
        try {
            C29995c cVar = C29995c.f81204c;
            C68813v vVar = C68813v.f184888a;
            f184889a = e.mo37342d("SyncFeature__disable_fetch_latest_threads_by_reason", cVar, vVar);
            try {
                f184890b = e.mo37342d("SyncFeature__disable_fetch_updated_threads_by_reason", C29995c.f81204c, vVar);
            } catch (Exception e2) {
                throw new AssertionError(e2);
            }
        } catch (Exception e3) {
            throw new AssertionError(e3);
        }
    }

    /* renamed from: a */
    public final C29995c mo60495a() {
        return (C29995c) f184889a.mo37337c(C31760t.m59098a());
    }

    /* renamed from: b */
    public final C29995c mo60496b() {
        return (C29995c) f184890b.mo37337c(C31760t.m59098a());
    }
}
