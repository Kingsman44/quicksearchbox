package com.google.ads.interactivemedia.p367v3.internal;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zj */
/* compiled from: PG */
public final class C7470zj implements C7053jy {

    /* renamed from: a */
    private static final Pattern f24554a = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: b */
    private static final Pattern f24555b = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: c */
    private final String f24556c;

    /* renamed from: d */
    private final aes f24557d;

    /* renamed from: e */
    private final aee f24558e = new aee();

    /* renamed from: f */
    private C7056ka f24559f;

    /* renamed from: g */
    private byte[] f24560g = new byte[1024];

    /* renamed from: h */
    private int f24561h;

    public C7470zj(String str, aes aes) {
        this.f24556c = str;
        this.f24557d = aes;
    }

    /* renamed from: a */
    private final C7073kr m22648a(long j) {
        C7073kr ak = this.f24559f.mo16113ak(0, 3);
        C6863cx cxVar = new C6863cx();
        cxVar.mo15630ae("text/vtt");
        cxVar.mo15620V(this.f24556c);
        cxVar.mo15634ai(j);
        ak.mo16102a(cxVar.mo15625a());
        this.f24559f.mo16114al();
        return ak;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        this.f24559f = kaVar;
        kaVar.mo16115am(new C7069kn(-9223372036854775807L));
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        jvVar.mo16093f(this.f24560g, 0, 6, false);
        this.f24558e.mo14549c(this.f24560g, 6);
        if (aaf.m18049b(this.f24558e)) {
            return true;
        }
        jvVar.mo16093f(this.f24560g, 6, 3, false);
        this.f24558e.mo14549c(this.f24560g, 9);
        return aaf.m18049b(this.f24558e);
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        ary.m19467t(this.f24559f);
        int m = (int) jvVar.mo16100m();
        int i = this.f24561h;
        byte[] bArr = this.f24560g;
        int length = bArr.length;
        if (i == length) {
            if (m != -1) {
                length = m;
            }
            if (m == -1) {
                m = -1;
            }
            this.f24560g = Arrays.copyOf(bArr, (length * 3) / 2);
        }
        byte[] bArr2 = this.f24560g;
        int i2 = this.f24561h;
        int a = jvVar.mo14388a(bArr2, i2, bArr2.length - i2);
        if (a != -1) {
            int i3 = this.f24561h + a;
            this.f24561h = i3;
            if (m == -1 || i3 != m) {
                return 0;
            }
        }
        aee aee = new aee(this.f24560g);
        aaf.m18048a(aee);
        long j = 0;
        long j2 = 0;
        for (String I = aee.mo14545I(); !TextUtils.isEmpty(I); I = aee.mo14545I()) {
            if (I.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f24554a.matcher(I);
                if (!matcher.find()) {
                    String valueOf = String.valueOf(I);
                    throw new C6886dt(valueOf.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(valueOf) : new String("X-TIMESTAMP-MAP doesn't contain local timestamp: "));
                }
                Matcher matcher2 = f24555b.matcher(I);
                if (!matcher2.find()) {
                    String valueOf2 = String.valueOf(I);
                    throw new C6886dt(valueOf2.length() != 0 ? "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(valueOf2) : new String("X-TIMESTAMP-MAP doesn't contain media timestamp: "));
                }
                String group = matcher.group(1);
                ary.m19467t(group);
                j2 = aaf.m18050c(group);
                String group2 = matcher2.group(1);
                ary.m19467t(group2);
                j = aes.m18473i(Long.parseLong(group2));
            }
        }
        Matcher d = aaf.m18051d(aee);
        if (d == null) {
            m22648a(0);
        } else {
            String group3 = d.group(1);
            ary.m19467t(group3);
            long c = aaf.m18050c(group3);
            long f = this.f24557d.mo14602f(aes.m18474j((j + c) - j2) % 8589934592L);
            C7073kr a2 = m22648a(f - c);
            this.f24558e.mo14549c(this.f24560g, this.f24561h);
            a2.mo16105d(this.f24558e, this.f24561h);
            a2.mo16103b(f, 1, this.f24561h, 0, (C7072kq) null);
        }
        return -1;
    }
}
