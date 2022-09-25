package androidx.media3.exoplayer.hls;

import android.text.TextUtils;
import androidx.media3.common.C2599az;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.extractor.C3326aa;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3350ay;
import androidx.media3.extractor.C3363ba;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3627q;
import androidx.media3.extractor.p163j.p171h.C3523m;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.media3.exoplayer.hls.ad */
/* compiled from: PG */
public final class C3161ad implements C3326aa {

    /* renamed from: a */
    private static final Pattern f9375a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b */
    private static final Pattern f9376b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: c */
    private final String f9377c;

    /* renamed from: d */
    private final C2609ah f9378d;

    /* renamed from: e */
    private final C2604ac f9379e = new C2604ac();

    /* renamed from: f */
    private C3329ad f9380f;

    /* renamed from: g */
    private byte[] f9381g = new byte[1024];

    /* renamed from: h */
    private int f9382h;

    public C3161ad(String str, C2609ah ahVar) {
        this.f9377c = str;
        this.f9378d = ahVar;
    }

    /* renamed from: f */
    private final C3368bf m9215f(long j) {
        C3368bf eZ = this.f9380f.mo6987eZ(0, 3);
        C2679w wVar = new C2679w();
        wVar.f7459k = "text/vtt";
        wVar.f7451c = this.f9377c;
        wVar.f7463o = j;
        eZ.mo6850b(new C2680x(wVar));
        this.f9380f.mo6988fa();
        return eZ;
    }

    /* renamed from: c */
    public final void mo7153c() {
    }

    /* renamed from: d */
    public final void mo7154d(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final boolean mo7155e(C3327ab abVar) {
        abVar.mo7320o(this.f9381g, 0, 6, false);
        this.f9379e.mo6157y(this.f9381g, 6);
        if (C3523m.m10178e(this.f9379e)) {
            return true;
        }
        abVar.mo7320o(this.f9381g, 6, 3, false);
        this.f9379e.mo6157y(this.f9381g, 9);
        return C3523m.m10178e(this.f9379e);
    }

    /* renamed from: s */
    public final void mo7156s(C3329ad adVar) {
        this.f9380f = adVar;
        adVar.mo6989q(new C3363ba(-9223372036854775807L, 0));
    }

    /* renamed from: a */
    public final int mo7152a(C3327ab abVar, C3350ay ayVar) {
        int i;
        this.f9380f.getClass();
        int i2 = (int) ((C3627q) abVar).f11565b;
        int i3 = this.f9382h;
        byte[] bArr = this.f9381g;
        int length = bArr.length;
        if (i3 == length) {
            if (i2 != -1) {
                i = i2;
            } else {
                i2 = length;
                i = -1;
            }
            this.f9381g = Arrays.copyOf(bArr, (i2 * 3) / 2);
            i2 = i;
        }
        byte[] bArr2 = this.f9381g;
        int i4 = this.f9382h;
        int a = abVar.mo5879a(bArr2, i4, bArr2.length - i4);
        if (a != -1) {
            int i5 = this.f9382h + a;
            this.f9382h = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        C2604ac acVar = new C2604ac(this.f9381g);
        C3523m.m10177d(acVar);
        long j = 0;
        long j2 = 0;
        for (String q = acVar.mo6149q(); !TextUtils.isEmpty(q); q = acVar.mo6149q()) {
            if (q.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f9375a.matcher(q);
                if (matcher.find()) {
                    Matcher matcher2 = f9376b.matcher(q);
                    if (matcher2.find()) {
                        String group = matcher.group(1);
                        group.getClass();
                        long b = C3523m.m10175b(group);
                        String group2 = matcher2.group(1);
                        group2.getClass();
                        j = b;
                        j2 = C2609ah.m6906f(Long.parseLong(group2));
                    } else {
                        throw C2599az.m6819a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(String.valueOf(q)), (Throwable) null);
                    }
                } else {
                    throw C2599az.m6819a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(String.valueOf(q)), (Throwable) null);
                }
            }
        }
        Matcher c = C3523m.m10176c(acVar);
        if (c == null) {
            m9215f(0);
        } else {
            String group3 = c.group(1);
            group3.getClass();
            long b2 = C3523m.m10175b(group3);
            long b3 = this.f9378d.mo6180b(C2609ah.m6907g((j2 + b2) - j) % 8589934592L);
            C3368bf f = m9215f(b3 - b2);
            this.f9379e.mo6157y(this.f9381g, this.f9382h);
            f.mo6851c(this.f9379e, this.f9382h);
            f.mo6852d(b3, 1, this.f9382h, 0, (C3367be) null);
        }
        return -1;
    }
}
