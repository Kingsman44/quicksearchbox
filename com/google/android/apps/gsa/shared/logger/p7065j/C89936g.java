package com.google.android.apps.gsa.shared.logger.p7065j;

import com.google.common.p4552o.C59998iv;
import com.google.common.p4552o.aiv;
import com.google.common.p4552o.ajl;
import com.google.common.p4552o.akb;
import com.google.common.p4552o.aln;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.g */
/* compiled from: PG */
final class C89936g extends C89940k {

    /* renamed from: a */
    private final ajl f246427a;

    /* renamed from: b */
    private final C59998iv f246428b;

    /* renamed from: c */
    private final aiv f246429c;

    /* renamed from: d */
    private final aln f246430d;

    /* renamed from: e */
    private final akb f246431e;

    public C89936g(ajl ajl, C59998iv ivVar, aiv aiv, aln aln, akb akb) {
        this.f246427a = ajl;
        this.f246428b = ivVar;
        this.f246429c = aiv;
        this.f246430d = aln;
        this.f246431e = akb;
    }

    /* renamed from: a */
    public final C59998iv mo83782a() {
        return this.f246428b;
    }

    /* renamed from: b */
    public final aiv mo83783b() {
        return this.f246429c;
    }

    /* renamed from: c */
    public final ajl mo83784c() {
        return this.f246427a;
    }

    /* renamed from: d */
    public final akb mo83785d() {
        return this.f246431e;
    }

    /* renamed from: e */
    public final aln mo83786e() {
        return this.f246430d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89940k) {
            C89940k kVar = (C89940k) obj;
            ajl ajl = this.f246427a;
            if (ajl != null ? ajl.equals(kVar.mo83784c()) : kVar.mo83784c() == null) {
                C59998iv ivVar = this.f246428b;
                if (ivVar != null ? ivVar.equals(kVar.mo83782a()) : kVar.mo83782a() == null) {
                    aiv aiv = this.f246429c;
                    if (aiv != null ? aiv.equals(kVar.mo83783b()) : kVar.mo83783b() == null) {
                        aln aln = this.f246430d;
                        if (aln != null ? aln.equals(kVar.mo83786e()) : kVar.mo83786e() == null) {
                            akb akb = this.f246431e;
                            if (akb != null ? akb.equals(kVar.mo83785d()) : kVar.mo83785d() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f246427a);
        String valueOf2 = String.valueOf(this.f246428b);
        String valueOf3 = String.valueOf(this.f246429c);
        String valueOf4 = String.valueOf(this.f246430d);
        String valueOf5 = String.valueOf(this.f246431e);
        return "GsaVeExtensions{opaExplore=" + valueOf + ", assistantAds=" + valueOf2 + ", opaCitadelData=" + valueOf3 + ", opaUpdatesCenterVeData=" + valueOf4 + ", opaOnboardingVideoData=" + valueOf5 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        ajl ajl = this.f246427a;
        int i5 = 0;
        if (ajl == null) {
            i = 0;
        } else {
            i = ajl.hashCode();
        }
        int i6 = (i ^ 1000003) * 1000003;
        C59998iv ivVar = this.f246428b;
        if (ivVar == null) {
            i2 = 0;
        } else {
            i2 = ivVar.hashCode();
        }
        int i7 = (i6 ^ i2) * 1000003;
        aiv aiv = this.f246429c;
        if (aiv == null) {
            i3 = 0;
        } else {
            i3 = aiv.hashCode();
        }
        int i8 = (i7 ^ i3) * 1000003;
        aln aln = this.f246430d;
        if (aln == null) {
            i4 = 0;
        } else {
            i4 = aln.hashCode();
        }
        int i9 = (i8 ^ i4) * 1000003;
        akb akb = this.f246431e;
        if (akb != null) {
            i5 = akb.hashCode();
        }
        return i9 ^ i5;
    }
}
