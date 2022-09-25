package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aan */
/* compiled from: PG */
public final class aan implements Comparable {

    /* renamed from: a */
    public final boolean f20079a;

    /* renamed from: b */
    private final String f20080b;

    /* renamed from: c */
    private final aaq f20081c;

    /* renamed from: d */
    private final boolean f20082d;

    /* renamed from: e */
    private final int f20083e;

    /* renamed from: f */
    private final int f20084f;

    /* renamed from: g */
    private final int f20085g;

    /* renamed from: h */
    private final int f20086h;

    /* renamed from: i */
    private final boolean f20087i;

    /* renamed from: j */
    private final int f20088j;

    /* renamed from: k */
    private final int f20089k;

    /* renamed from: l */
    private final int f20090l;

    public aan(C6864cy cyVar, aaq aaq, int i) {
        int i2;
        int i3;
        this.f20081c = aaq;
        this.f20080b = aaw.m18094c(cyVar.f21803c);
        int i4 = 0;
        this.f20082d = aaw.m18093b(i, false);
        int i5 = 0;
        while (true) {
            i2 = Integer.MAX_VALUE;
            if (i5 >= aaq.f20178A.size()) {
                i5 = Integer.MAX_VALUE;
                i3 = 0;
                break;
            }
            i3 = aaw.m18095d(cyVar, (String) aaq.f20178A.get(i5), false);
            if (i3 > 0) {
                break;
            }
            i5++;
        }
        this.f20084f = i5;
        this.f20083e = i3;
        boolean z = true;
        this.f20087i = 1 == (cyVar.f21804d & 1);
        int i6 = cyVar.f21825y;
        this.f20088j = i6;
        this.f20089k = cyVar.f21826z;
        int i7 = cyVar.f21808h;
        this.f20090l = i7;
        if ((i7 != -1 && i7 > aaq.f20111q) || (i6 != -1 && i6 > aaq.f20110p)) {
            z = false;
        }
        this.f20079a = z;
        String[] af = aeu.m18515af();
        int i8 = 0;
        while (true) {
            if (i8 >= af.length) {
                break;
            }
            int d = aaw.m18095d(cyVar, af[i8], false);
            if (d > 0) {
                i2 = i8;
                i4 = d;
                break;
            }
            i8++;
        }
        this.f20085g = i2;
        this.f20086h = i4;
    }

    /* renamed from: a */
    public final int compareTo(aan aan) {
        asc asc;
        if (!this.f20079a || !this.f20082d) {
            asc = aaw.f20157c.mo15341a();
        } else {
            asc = aaw.f20157c;
        }
        aqv a = aqv.m19338g().mo15220d(this.f20082d, aan.f20082d).mo15217a(Integer.valueOf(this.f20084f), Integer.valueOf(aan.f20084f), asc.m19475b().mo15341a()).mo15218b(this.f20083e, aan.f20083e).mo15220d(this.f20079a, aan.f20079a).mo15217a(Integer.valueOf(this.f20090l), Integer.valueOf(aan.f20090l), this.f20081c.f20116v ? aaw.f20157c.mo15341a() : aaw.f20158d).mo15220d(this.f20087i, aan.f20087i).mo15217a(Integer.valueOf(this.f20085g), Integer.valueOf(aan.f20085g), asc.m19475b().mo15341a()).mo15218b(this.f20086h, aan.f20086h).mo15217a(Integer.valueOf(this.f20088j), Integer.valueOf(aan.f20088j), asc).mo15217a(Integer.valueOf(this.f20089k), Integer.valueOf(aan.f20089k), asc);
        Integer valueOf = Integer.valueOf(this.f20090l);
        Integer valueOf2 = Integer.valueOf(aan.f20090l);
        if (!aeu.m18533c(this.f20080b, aan.f20080b)) {
            asc = aaw.f20158d;
        }
        return a.mo15217a(valueOf, valueOf2, asc).mo15221e();
    }
}
