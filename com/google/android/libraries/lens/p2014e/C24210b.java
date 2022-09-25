package com.google.android.libraries.lens.p2014e;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.aae;
import com.google.common.p4552o.abk;

/* renamed from: com.google.android.libraries.lens.e.b */
/* compiled from: PG */
final class C24210b extends C24227s {

    /* renamed from: b */
    private final Bitmap f66142b;

    /* renamed from: c */
    private final C58833ax f66143c;

    /* renamed from: d */
    private final RectF f66144d;

    /* renamed from: e */
    private final C24226r f66145e;

    /* renamed from: f */
    private final long f66146f;

    /* renamed from: g */
    private final int f66147g;

    /* renamed from: h */
    private final C26733ab f66148h;

    /* renamed from: i */
    private final aae f66149i;

    /* renamed from: j */
    private final C58833ax f66150j;

    /* renamed from: k */
    private final C58833ax f66151k;

    /* renamed from: l */
    private final int f66152l;

    /* renamed from: m */
    private final int f66153m;

    /* renamed from: n */
    private final int f66154n;

    public C24210b(Bitmap bitmap, C58833ax axVar, RectF rectF, int i, C24226r rVar, int i2, int i3, long j, int i4, C26733ab abVar, aae aae, C58833ax axVar2, C58833ax axVar3) {
        this.f66142b = bitmap;
        this.f66143c = axVar;
        this.f66144d = rectF;
        this.f66152l = i;
        this.f66145e = rVar;
        this.f66153m = i2;
        this.f66154n = i3;
        this.f66146f = j;
        this.f66147g = i4;
        this.f66148h = abVar;
        this.f66149i = aae;
        this.f66150j = axVar2;
        this.f66151k = axVar3;
    }

    /* renamed from: a */
    public final int mo29705a() {
        return this.f66147g;
    }

    /* renamed from: b */
    public final long mo29706b() {
        return this.f66146f;
    }

    /* renamed from: c */
    public final Bitmap mo29707c() {
        return this.f66142b;
    }

    /* renamed from: d */
    public final RectF mo29708d() {
        return this.f66144d;
    }

    /* renamed from: e */
    public final C24226r mo29709e() {
        return this.f66145e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24227s) {
            C24227s sVar = (C24227s) obj;
            if (this.f66142b.equals(sVar.mo29707c()) && this.f66143c.equals(sVar.mo29712g()) && this.f66144d.equals(sVar.mo29708d())) {
                int i = this.f66152l;
                int k = sVar.mo29717k();
                if (i == 0) {
                    throw null;
                } else if (i == k && this.f66145e.equals(sVar.mo29709e())) {
                    int i2 = this.f66153m;
                    int l = sVar.mo29718l();
                    if (i2 == 0) {
                        throw null;
                    } else if (i2 == l) {
                        int i3 = this.f66154n;
                        int m = sVar.mo29719m();
                        if (i3 != 0) {
                            return i3 == m && this.f66146f == sVar.mo29706b() && this.f66147g == sVar.mo29705a() && this.f66148h.equals(sVar.mo29711f()) && this.f66149i.equals(sVar.mo29716j()) && this.f66150j.equals(sVar.mo29715i()) && this.f66151k.equals(sVar.mo29713h());
                        }
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public final C26733ab mo29711f() {
        return this.f66148h;
    }

    /* renamed from: g */
    public final C58833ax mo29712g() {
        return this.f66143c;
    }

    /* renamed from: h */
    public final C58833ax mo29713h() {
        return this.f66151k;
    }

    public final int hashCode() {
        int hashCode = (((((this.f66142b.hashCode() ^ 1000003) * 1000003) ^ this.f66143c.hashCode()) * 1000003) ^ this.f66144d.hashCode()) * 1000003;
        int i = this.f66152l;
        if (i != 0) {
            int hashCode2 = this.f66145e.hashCode();
            int i2 = this.f66153m;
            abk.m92368a(i2);
            int i3 = (((((hashCode ^ i) * 1000003) ^ hashCode2) * 1000003) ^ i2) * 1000003;
            int i4 = this.f66154n;
            if (i4 != 0) {
                long j = this.f66146f;
                return ((((((((((((i3 ^ i4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f66147g) * 1000003) ^ this.f66148h.hashCode()) * 1000003) ^ this.f66149i.hashCode()) * 1000003) ^ this.f66150j.hashCode()) * 1000003) ^ this.f66151k.hashCode();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: i */
    public final C58833ax mo29715i() {
        return this.f66150j;
    }

    /* renamed from: j */
    public final aae mo29716j() {
        return this.f66149i;
    }

    /* renamed from: k */
    public final int mo29717k() {
        return this.f66152l;
    }

    /* renamed from: l */
    public final int mo29718l() {
        return this.f66153m;
    }

    /* renamed from: m */
    public final int mo29719m() {
        return this.f66154n;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f66142b);
        String valueOf2 = String.valueOf(this.f66143c);
        String valueOf3 = String.valueOf(this.f66144d);
        int i = this.f66152l;
        String str = "null";
        String num = i != 0 ? Integer.toString(i - 1) : str;
        String valueOf4 = String.valueOf(this.f66145e);
        int i2 = this.f66153m;
        String num2 = i2 != 0 ? Integer.toString(i2 - 1) : str;
        int i3 = this.f66154n;
        if (i3 != 0) {
            str = Integer.toString(i3 - 1);
        }
        long j = this.f66146f;
        int i4 = this.f66147g;
        String valueOf5 = String.valueOf(this.f66148h);
        String valueOf6 = String.valueOf(this.f66149i);
        String valueOf7 = String.valueOf(this.f66150j);
        String valueOf8 = String.valueOf(this.f66151k);
        return "LensImage{bitmap=" + valueOf + ", fifeUrl=" + valueOf2 + ", userVisibleRegion=" + valueOf3 + ", screenshotType=" + num + ", source=" + valueOf4 + ", imageCategory=" + num2 + ", imageFormat=" + str + ", timestampUs=" + j + ", deviceOrientation=" + i4 + ", captureMetadata=" + valueOf5 + ", frameSelectionMetadata=" + valueOf6 + ", sharpnessScore=" + valueOf7 + ", reticleRegion=" + valueOf8 + "}";
    }
}
