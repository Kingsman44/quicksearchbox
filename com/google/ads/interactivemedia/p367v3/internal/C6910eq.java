package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.eq */
/* compiled from: PG */
public final class C6910eq {

    /* renamed from: a */
    public Object f22036a;

    /* renamed from: b */
    public Object f22037b;

    /* renamed from: c */
    public int f22038c;

    /* renamed from: d */
    public long f22039d;

    /* renamed from: e */
    private long f22040e;

    /* renamed from: f */
    private C7365vm f22041f = C7365vm.f24059a;

    /* renamed from: a */
    public final long mo15831a() {
        return C6821bi.m19754a(this.f22040e);
    }

    /* renamed from: b */
    public final long mo15832b() {
        return this.f22040e;
    }

    /* renamed from: c */
    public final long mo15833c(int i) {
        return this.f22041f.f24061c[i];
    }

    /* renamed from: d */
    public final int mo15834d(int i) {
        return this.f22041f.f24062d[i].mo16662a();
    }

    /* renamed from: e */
    public final int mo15835e(int i, int i2) {
        return this.f22041f.f24062d[i].mo16663b(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            C6910eq eqVar = (C6910eq) obj;
            return aeu.m18533c(this.f22036a, eqVar.f22036a) && aeu.m18533c(this.f22037b, eqVar.f22037b) && this.f22038c == eqVar.f22038c && this.f22039d == eqVar.f22039d && this.f22040e == eqVar.f22040e && aeu.m18533c(this.f22041f, eqVar.f22041f);
        }
    }

    /* renamed from: f */
    public final int mo15837f(long j) {
        C7365vm vmVar = this.f22041f;
        long j2 = this.f22039d;
        int length = vmVar.f24061c.length - 1;
        while (length >= 0 && j != Long.MIN_VALUE) {
            long j3 = vmVar.f24061c[length];
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
            } else if (j2 != -9223372036854775807L && j >= j2) {
                break;
            }
            length--;
        }
        if (length < 0) {
            return -1;
        }
        vmVar.f24062d[length].mo16664c();
        return length;
    }

    /* renamed from: g */
    public final int mo15838g(long j) {
        C7365vm vmVar = this.f22041f;
        long j2 = this.f22039d;
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        int i = 0;
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        while (true) {
            long[] jArr = vmVar.f24061c;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            } else if (j < j3) {
                vmVar.f24062d[i].mo16664c();
                break;
            } else {
                i++;
            }
        }
        if (i < vmVar.f24061c.length) {
            return i;
        }
        return -1;
    }

    /* renamed from: h */
    public final int mo15839h(int i) {
        int i2 = this.f22041f.f24062d[i].f24055a;
        return -1;
    }

    /* renamed from: i */
    public final boolean mo15841i(int i, int i2) {
        int i3 = this.f22041f.f24062d[i].f24055a;
        return false;
    }

    /* renamed from: j */
    public final long mo15842j(int i, int i2) {
        int i3 = this.f22041f.f24062d[i].f24055a;
        return -9223372036854775807L;
    }

    /* renamed from: k */
    public final long mo15843k() {
        long j = this.f22041f.f24063e;
        return 0;
    }

    /* renamed from: l */
    public final C6910eq mo15844l(Object obj, Object obj2, long j, long j2) {
        C7365vm vmVar = C7365vm.f24059a;
        this.f22036a = obj;
        this.f22037b = obj2;
        this.f22038c = 0;
        this.f22039d = j;
        this.f22040e = j2;
        this.f22041f = vmVar;
        return this;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f22036a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 217) * 31;
        Object obj2 = this.f22037b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.f22038c;
        long j = this.f22039d;
        long j2 = this.f22040e;
        return ((((((((i3 + i2) * 31) + i4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.f22041f.hashCode();
    }
}
