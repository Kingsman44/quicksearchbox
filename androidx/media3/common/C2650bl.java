package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.common.bl */
/* compiled from: PG */
public final class C2650bl implements C2668l {

    /* renamed from: a */
    public static final Object f7335a = new Object();

    /* renamed from: r */
    private static final C2590aq f7336r;

    /* renamed from: b */
    public Object f7337b = f7335a;

    /* renamed from: c */
    public C2590aq f7338c = f7336r;

    /* renamed from: d */
    public Object f7339d;

    /* renamed from: e */
    public long f7340e;

    /* renamed from: f */
    public long f7341f;

    /* renamed from: g */
    public long f7342g;

    /* renamed from: h */
    public boolean f7343h;

    /* renamed from: i */
    public boolean f7344i;
    @Deprecated

    /* renamed from: j */
    public boolean f7345j;

    /* renamed from: k */
    public C2583aj f7346k;

    /* renamed from: l */
    public boolean f7347l;

    /* renamed from: m */
    public long f7348m;

    /* renamed from: n */
    public long f7349n;

    /* renamed from: o */
    public int f7350o;

    /* renamed from: p */
    public int f7351p;

    /* renamed from: q */
    public long f7352q;

    static {
        C2576ac acVar = new C2576ac();
        acVar.f7103a = "androidx.media3.common.Timeline";
        acVar.f7104b = Uri.EMPTY;
        f7336r = acVar.mo6082a();
    }

    /* renamed from: a */
    public final boolean mo6292a() {
        C2601a.m6832d(this.f7345j == (this.f7346k != null));
        return this.f7346k != null;
    }

    /* renamed from: b */
    public final void mo6293b(Object obj, C2590aq aqVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C2583aj ajVar, long j4, long j5, int i, int i2, long j6) {
        C2583aj ajVar2 = ajVar;
        this.f7337b = obj;
        this.f7338c = aqVar != null ? aqVar : f7336r;
        this.f7339d = obj2;
        this.f7340e = j;
        this.f7341f = j2;
        this.f7342g = j3;
        this.f7343h = z;
        this.f7344i = z2;
        this.f7345j = ajVar2 != null;
        this.f7346k = ajVar2;
        this.f7348m = j4;
        this.f7349n = j5;
        this.f7350o = i;
        this.f7351p = i2;
        this.f7352q = j6;
        this.f7347l = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            C2650bl blVar = (C2650bl) obj;
            return C2612ak.m6951aa(this.f7337b, blVar.f7337b) && C2612ak.m6951aa(this.f7338c, blVar.f7338c) && C2612ak.m6951aa(this.f7339d, blVar.f7339d) && C2612ak.m6951aa(this.f7346k, blVar.f7346k) && this.f7340e == blVar.f7340e && this.f7341f == blVar.f7341f && this.f7342g == blVar.f7342g && this.f7343h == blVar.f7343h && this.f7344i == blVar.f7344i && this.f7347l == blVar.f7347l && this.f7348m == blVar.f7348m && this.f7349n == blVar.f7349n && this.f7350o == blVar.f7350o && this.f7351p == blVar.f7351p && this.f7352q == blVar.f7352q;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f7337b.hashCode() + 217) * 31) + this.f7338c.hashCode()) * 31;
        Object obj = this.f7339d;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (hashCode + i) * 31;
        C2583aj ajVar = this.f7346k;
        if (ajVar != null) {
            i2 = ajVar.hashCode();
        }
        long j = this.f7340e;
        long j2 = this.f7341f;
        long j3 = this.f7342g;
        boolean z = this.f7343h;
        boolean z2 = this.f7344i;
        boolean z3 = this.f7347l;
        long j4 = this.f7348m;
        long j5 = this.f7349n;
        int i4 = this.f7350o;
        long j6 = this.f7352q;
        return ((((((((((((((((((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + i4) * 31) + this.f7351p) * 31) + ((int) ((j6 >>> 32) ^ j6));
    }
}
