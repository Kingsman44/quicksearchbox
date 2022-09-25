package p5304e.p5305a.p5306a.p5383k.p5384a;

import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;

/* renamed from: e.a.a.k.a.c */
/* compiled from: PG */
public final class C68794c implements C68793b {

    /* renamed from: a */
    public static final C31718bj f184861a;

    /* renamed from: b */
    public static final C31718bj f184862b;

    /* renamed from: c */
    public static final C31718bj f184863c;

    static {
        C31728bt e = new C31728bt("com.google.android.libraries.notifications").mo37345g(C58485gu.m89850r("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).mo37343e();
        f184861a = e.mo37341c("ChimeBroadcastReceiverFeature__enable_broadcast_receiver_timeout", false);
        f184862b = e.mo37341c("ChimeBroadcastReceiverFeature__enable_check_process_start_for_timeout", true);
        f184863c = e.mo37339a("ChimeBroadcastReceiverFeature__process_start_threshold_ms", 5000);
    }

    /* renamed from: a */
    public final long mo60475a() {
        return ((Long) f184863c.mo37337c(C31760t.m59098a())).longValue();
    }

    /* renamed from: b */
    public final boolean mo60476b() {
        return ((Boolean) f184861a.mo37337c(C31760t.m59098a())).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60477c() {
        return ((Boolean) f184862b.mo37337c(C31760t.m59098a())).booleanValue();
    }
}
