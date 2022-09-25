package org.p5633c.p5634a.p5640f;

import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.f.b */
/* compiled from: PG */
public final class C72272b extends C72288l {

    /* renamed from: a */
    private static final int f192359a;
    private static final long serialVersionUID = 5472298452022250685L;

    /* renamed from: f */
    private final C72288l f192360f;

    /* renamed from: g */
    private final C72271a[] f192361g = new C72271a[(f192359a + 1)];

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        f192359a = i - 1;
    }

    public C72272b(C72288l lVar) {
        super(lVar.f192423d);
        this.f192360f = lVar;
    }

    /* renamed from: c */
    private final C72271a m106721c(long j) {
        int i = (int) (j >> 32);
        C72271a[] aVarArr = this.f192361g;
        int i2 = f192359a & i;
        C72271a aVar = aVarArr[i2];
        if (aVar != null && ((int) (aVar.f192353a >> 32)) == i) {
            return aVar;
        }
        long j2 = j & -4294967296L;
        C72271a aVar2 = new C72271a(this.f192360f, j2);
        long j3 = 4294967295L | j2;
        C72271a aVar3 = aVar2;
        while (true) {
            long d = this.f192360f.mo37826d(j2);
            if (d == j2 || d > j3) {
                aVarArr[i2] = aVar2;
            } else {
                C72271a aVar4 = new C72271a(this.f192360f, d);
                aVar3.f192355c = aVar4;
                aVar3 = aVar4;
                j2 = d;
            }
        }
        aVarArr[i2] = aVar2;
        return aVar2;
    }

    /* renamed from: a */
    public final int mo37823a(long j) {
        return m106721c(j).mo63651a(j);
    }

    /* renamed from: b */
    public final int mo37824b(long j) {
        return m106721c(j).mo63652b(j);
    }

    /* renamed from: d */
    public final long mo37826d(long j) {
        return this.f192360f.mo37826d(j);
    }

    /* renamed from: e */
    public final long mo37827e(long j) {
        return this.f192360f.mo37827e(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72272b) {
            return this.f192360f.equals(((C72272b) obj).f192360f);
        }
        return false;
    }

    /* renamed from: g */
    public final String mo37830g(long j) {
        return m106721c(j).mo63653c(j);
    }

    /* renamed from: h */
    public final boolean mo37831h() {
        return false;
    }

    public final int hashCode() {
        return this.f192360f.hashCode();
    }
}
