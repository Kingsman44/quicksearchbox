package p5304e.p5305a.p5306a.p5383k.p5384a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.stable.C31718bj;
import com.google.android.libraries.phenotype.client.stable.C31728bt;
import com.google.common.p4522b.C58485gu;

/* renamed from: e.a.a.k.a.z */
/* compiled from: PG */
public final class C68817z implements C68816y {

    /* renamed from: a */
    public static final C31718bj f184893a;

    /* renamed from: b */
    public static final C31718bj f184894b;

    /* renamed from: c */
    public static final C31718bj f184895c;

    /* renamed from: d */
    public static final C31718bj f184896d;

    static {
        C31728bt e = new C31728bt("com.google.android.libraries.notifications").mo37345g(C58485gu.m89850r("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES")).mo37343e();
        f184893a = e.mo37341c("SystemTrayFeature__enable_html_tags", true);
        f184894b = e.mo37340b("SystemTrayFeature__force_action_to_open_as_activity", BuildConfig.FLAVOR);
        f184895c = e.mo37341c("SystemTrayFeature__forced_notifications_storage_update", false);
        f184896d = e.mo37341c("SystemTrayFeature__schedule_refresh_notifications_task", false);
    }

    /* renamed from: a */
    public final String mo60498a() {
        return (String) f184894b.mo37337c(C31760t.m59098a());
    }

    /* renamed from: b */
    public final boolean mo60499b() {
        return ((Boolean) f184893a.mo37337c(C31760t.m59098a())).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo60500c() {
        return ((Boolean) f184895c.mo37337c(C31760t.m59098a())).booleanValue();
    }

    /* renamed from: d */
    public final boolean mo60501d() {
        return ((Boolean) f184896d.mo37337c(C31760t.m59098a())).booleanValue();
    }
}
