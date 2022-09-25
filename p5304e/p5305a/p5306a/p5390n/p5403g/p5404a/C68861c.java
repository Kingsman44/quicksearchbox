package p5304e.p5305a.p5306a.p5390n.p5403g.p5404a;

import com.google.android.libraries.phenotype.client.C31648ad;
import com.google.android.libraries.phenotype.client.C31652ah;
import com.google.android.libraries.phenotype.client.C31654aj;
import com.google.android.libraries.phenotype.client.C31676o;

/* renamed from: e.a.a.n.g.a.c */
/* compiled from: PG */
public final class C68861c implements C68860b {

    /* renamed from: a */
    public static final C31654aj f185068a;

    /* renamed from: b */
    public static final C31654aj f185069b;

    /* renamed from: c */
    public static final C31654aj f185070c;

    /* renamed from: d */
    public static final C31654aj f185071d;

    /* renamed from: e */
    public static final C31654aj f185072e;

    /* renamed from: f */
    public static final C31654aj f185073f;

    /* renamed from: g */
    public static final C31654aj f185074g;

    /* renamed from: h */
    public static final C31654aj f185075h;

    static {
        C31652ah b = new C31652ah(C31676o.m59019a("com.google.android.gms.icing.mdd")).mo37297b();
        f185068a = b.mo37301f("abs_free_space_after_download", 524288000);
        f185069b = b.mo37301f("abs_free_space_after_download_extremely_low_storage_allowed", 2097152);
        f185070c = b.mo37301f("abs_free_space_after_download_low_storage_allowed", 104857600);
        f185071d = b.mo37302g("downloader_enforce_https", true);
        f185072e = b.mo37301f("downloader_max_retry_on_checksum_mismatch_count", 5);
        f185073f = b.mo37301f("downloader_max_threads", 2);
        f185074g = b.mo37302g("enforce_low_storage_behavior", true);
        f185075h = new C31648ad(b, "fraction_free_space_after_download", Double.valueOf(0.1d));
        b.mo37301f("time_to_wait_for_downloader", 120000);
    }

    /* renamed from: a */
    public final double mo60657a() {
        return ((Double) f185075h.mo37303b()).doubleValue();
    }

    /* renamed from: b */
    public final long mo60658b() {
        return ((Long) f185068a.mo37303b()).longValue();
    }

    /* renamed from: c */
    public final long mo60659c() {
        return ((Long) f185069b.mo37303b()).longValue();
    }

    /* renamed from: d */
    public final long mo60660d() {
        return ((Long) f185070c.mo37303b()).longValue();
    }

    /* renamed from: e */
    public final long mo60661e() {
        return ((Long) f185072e.mo37303b()).longValue();
    }

    /* renamed from: f */
    public final long mo60662f() {
        return ((Long) f185073f.mo37303b()).longValue();
    }

    /* renamed from: g */
    public final boolean mo60663g() {
        return ((Boolean) f185071d.mo37303b()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo60664h() {
        return ((Boolean) f185074g.mo37303b()).booleanValue();
    }
}
