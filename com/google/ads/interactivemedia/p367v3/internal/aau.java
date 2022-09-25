package com.google.ads.interactivemedia.p367v3.internal;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aau */
/* compiled from: PG */
public final class aau implements Comparable {

    /* renamed from: a */
    public final boolean f20140a;

    /* renamed from: b */
    private final boolean f20141b;

    /* renamed from: c */
    private final boolean f20142c;

    /* renamed from: d */
    private final boolean f20143d;

    /* renamed from: e */
    private final int f20144e;

    /* renamed from: f */
    private final int f20145f;

    /* renamed from: g */
    private final int f20146g;

    /* renamed from: h */
    private final int f20147h;

    /* renamed from: i */
    private final boolean f20148i;

    public aau(C6864cy cyVar, aaq aaq, int i, String str) {
        arn arn;
        int i2;
        boolean z = false;
        this.f20141b = aaw.m18093b(i, false);
        int i3 = cyVar.f21804d & (aaq.f20182E ^ -1);
        this.f20142c = 1 == (i3 & 1);
        this.f20143d = (i3 & 2) != 0;
        if (aaq.f20179B.isEmpty()) {
            arn = arn.m19403j(BuildConfig.FLAVOR);
        } else {
            arn = aaq.f20179B;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= arn.size()) {
                i4 = Integer.MAX_VALUE;
                i2 = 0;
                break;
            }
            i2 = aaw.m18095d(cyVar, (String) arn.get(i4), aaq.f20181D);
            if (i2 > 0) {
                break;
            }
            i4++;
        }
        this.f20144e = i4;
        this.f20145f = i2;
        int bitCount = Integer.bitCount(cyVar.f21805e & aaq.f20180C);
        this.f20146g = bitCount;
        this.f20148i = (cyVar.f21805e & 1088) != 0;
        int d = aaw.m18095d(cyVar, str, aaw.m18094c(str) == null);
        this.f20147h = d;
        if (i2 > 0 || ((aaq.f20179B.isEmpty() && bitCount > 0) || this.f20142c || (this.f20143d && d > 0))) {
            z = true;
        }
        this.f20140a = z;
    }

    /* renamed from: a */
    public final int compareTo(aau aau) {
        asc asc;
        aqv d = aqv.m19338g().mo15220d(this.f20141b, aau.f20141b).mo15217a(Integer.valueOf(this.f20144e), Integer.valueOf(aau.f20144e), asc.m19475b().mo15341a()).mo15218b(this.f20145f, aau.f20145f).mo15218b(this.f20146g, aau.f20146g).mo15220d(this.f20142c, aau.f20142c);
        Boolean valueOf = Boolean.valueOf(this.f20143d);
        Boolean valueOf2 = Boolean.valueOf(aau.f20143d);
        if (this.f20145f == 0) {
            asc = asc.m19475b();
        } else {
            asc = asc.m19475b().mo15341a();
        }
        aqv b = d.mo15217a(valueOf, valueOf2, asc).mo15218b(this.f20147h, aau.f20147h);
        if (this.f20146g == 0) {
            b = b.mo15219c(this.f20148i, aau.f20148i);
        }
        return b.mo15221e();
    }
}
