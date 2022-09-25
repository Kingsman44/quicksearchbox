package androidx.media3.common;

import com.google.common.base.C58832aw;
import java.util.Arrays;

/* renamed from: androidx.media3.common.bg */
/* compiled from: PG */
public final class C2645bg implements C2668l {

    /* renamed from: a */
    public final Object f7319a;

    /* renamed from: b */
    public final int f7320b;

    /* renamed from: c */
    public final C2590aq f7321c;

    /* renamed from: d */
    public final Object f7322d;

    /* renamed from: e */
    public final int f7323e;

    /* renamed from: f */
    public final long f7324f;

    /* renamed from: g */
    public final long f7325g;

    /* renamed from: h */
    public final int f7326h;

    /* renamed from: i */
    public final int f7327i;

    public C2645bg(Object obj, int i, C2590aq aqVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f7319a = obj;
        this.f7320b = i;
        this.f7321c = aqVar;
        this.f7322d = obj2;
        this.f7323e = i2;
        this.f7324f = j;
        this.f7325g = j2;
        this.f7326h = i3;
        this.f7327i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2645bg bgVar = (C2645bg) obj;
            return this.f7320b == bgVar.f7320b && this.f7323e == bgVar.f7323e && this.f7324f == bgVar.f7324f && this.f7325g == bgVar.f7325g && this.f7326h == bgVar.f7326h && this.f7327i == bgVar.f7327i && C58832aw.m90831a(this.f7319a, bgVar.f7319a) && C58832aw.m90831a(this.f7322d, bgVar.f7322d) && C58832aw.m90831a(this.f7321c, bgVar.f7321c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7319a, Integer.valueOf(this.f7320b), this.f7321c, this.f7322d, Integer.valueOf(this.f7323e), Long.valueOf(this.f7324f), Long.valueOf(this.f7325g), Integer.valueOf(this.f7326h), Integer.valueOf(this.f7327i)});
    }
}
