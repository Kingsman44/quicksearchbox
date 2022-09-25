package p5304e.p5305a.p5306a.p5383k.p5384a;

import android.util.Base64;
import com.google.android.libraries.notifications.p2292g.C29998f;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62942bv;

/* renamed from: e.a.a.k.a.p */
/* compiled from: PG */
public final class C68807p implements C68805n {

    /* renamed from: a */
    public static final C31718bj f184881a;

    /* renamed from: b */
    public static final C31718bj f184882b;

    static {
        C31728bt e = new C31728bt("com.google.android.libraries.notifications").mo37345g(C58485gu.m89850r("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).mo37343e();
        try {
            f184881a = e.mo37342d("RegistrationFeature__disable_registration_by_reason", (C29998f) C62942bv.parseFrom((C62942bv) C29998f.f81208c, Base64.decode("CAM", 3)), C68806o.f184880a);
            f184882b = e.mo37341c("RegistrationFeature__disable_registration_on_login_accounts_changed", true);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public final C29998f mo60490a() {
        return (C29998f) f184881a.mo37337c(C31760t.m59098a());
    }

    /* renamed from: b */
    public final boolean mo60491b() {
        return ((Boolean) f184882b.mo37337c(C31760t.m59098a())).booleanValue();
    }
}
