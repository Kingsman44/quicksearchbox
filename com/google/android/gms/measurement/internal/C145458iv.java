package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.p10725a.p10730b.C142676c;
import com.google.android.gms.p10725a.p10730b.C142677d;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.iv */
/* compiled from: PG */
public final class C145458iv extends C145478jo {

    /* renamed from: a */
    public final C145336eh f393281a;

    /* renamed from: b */
    public final C145336eh f393282b;

    /* renamed from: c */
    public final C145336eh f393283c;

    /* renamed from: d */
    public final C145336eh f393284d;

    /* renamed from: e */
    public final C145336eh f393285e;

    /* renamed from: f */
    private final Map f393286f = new HashMap();

    public C145458iv(C145488jy jyVar) {
        super(jyVar);
        C145339ek g = this.f393011w.mo120971g();
        Objects.requireNonNull(g);
        this.f393281a = new C145336eh(g, "last_delete_stale", 0);
        C145339ek g2 = this.f393011w.mo120971g();
        Objects.requireNonNull(g2);
        this.f393282b = new C145336eh(g2, "backoff", 0);
        C145339ek g3 = this.f393011w.mo120971g();
        Objects.requireNonNull(g3);
        this.f393283c = new C145336eh(g3, "last_upload", 0);
        C145339ek g4 = this.f393011w.mo120971g();
        Objects.requireNonNull(g4);
        this.f393284d = new C145336eh(g4, "last_upload_attempt", 0);
        C145339ek g5 = this.f393011w.mo120971g();
        Objects.requireNonNull(g5);
        this.f393285e = new C145336eh(g5, "midnight_offset", 0);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: a */
    public final Pair mo121169a(String str) {
        C145457iu iuVar;
        mo120904g();
        C144006f fVar = this.f393011w.f392924A;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C145457iu iuVar2 = (C145457iu) this.f393286f.get(str);
        if (iuVar2 != null && elapsedRealtime < iuVar2.f393280c) {
            return new Pair(iuVar2.f393278a, Boolean.valueOf(iuVar2.f393279b));
        }
        long h = elapsedRealtime + this.f393011w.f392937g.mo120771h(str, C145313dl.f392736b);
        try {
            C142676c b = C142677d.m231497b(this.f393011w.f392931a);
            String str2 = b.f387158a;
            if (str2 != null) {
                iuVar = new C145457iu(str2, b.f387159b, h);
            } else {
                iuVar = new C145457iu(BuildConfig.FLAVOR, b.f387159b, h);
            }
        } catch (Exception e) {
            this.f393011w.mo120965ar().f392802j.mo120895b("Unable to get advertising id", e);
            iuVar = new C145457iu(BuildConfig.FLAVOR, false, h);
        }
        this.f393286f.put(str, iuVar);
        return new Pair(iuVar.f393278a, Boolean.valueOf(iuVar.f393279b));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Pair mo121170b(String str, C145224ad adVar) {
        if (adVar.mo120786f(C145223ac.AD_STORAGE)) {
            return mo121169a(str);
        }
        return new Pair(BuildConfig.FLAVOR, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo120805c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: d */
    public final String mo121171d(String str, boolean z) {
        mo120904g();
        String str2 = z ? (String) mo121169a(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest B = C145495ke.m236482B();
        if (B == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, B.digest(str2.getBytes()))});
    }
}
