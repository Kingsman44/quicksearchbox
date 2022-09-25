package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import com.google.p4181bi.p4182a.C55790h;

/* compiled from: PG */
public abstract class Email extends ContactMethodField implements Parcelable {

    /* renamed from: a */
    private String f110772a;

    /* compiled from: PG */
    public abstract class Certificate implements Comparable, Parcelable {

        /* compiled from: PG */
        public abstract class CertificateStatus implements Comparable, Parcelable {
            static {
                new AutoValue_Email_Certificate_CertificateStatus(C59203do.f157270a, 1);
            }

            /* renamed from: d */
            public static CertificateStatus m74344d(double d, int i) {
                return new AutoValue_Email_Certificate_CertificateStatus(d, i);
            }

            /* renamed from: a */
            public abstract double mo44991a();

            /* renamed from: b */
            public abstract int mo44992b();

            /* renamed from: c */
            public final int compareTo(CertificateStatus certificateStatus) {
                if (mo44992b() == certificateStatus.mo44992b()) {
                    return Double.compare(certificateStatus.mo44991a(), mo44991a());
                }
                int b = mo44992b();
                int i = b - 1;
                if (b != 0) {
                    int b2 = certificateStatus.mo44992b();
                    int i2 = b2 - 1;
                    if (b2 == 0) {
                        throw null;
                    } else if (i == i2) {
                        return 0;
                    } else {
                        return i >= i2 ? 1 : -1;
                    }
                } else {
                    throw null;
                }
            }
        }

        /* renamed from: a */
        public abstract CertificateStatus mo44985a();

        /* renamed from: b */
        public abstract PersonFieldMetadata mo44986b();

        /* renamed from: c */
        public abstract String mo44987c();

        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            Certificate certificate = (Certificate) obj;
            if (mo44986b().f110794k != certificate.mo44986b().f110794k) {
                return !mo44986b().f110794k ? 1 : -1;
            }
            if (mo44985a().compareTo(certificate.mo44985a()) != 0) {
                return mo44985a().compareTo(certificate.mo44985a());
            }
            return mo44987c().compareTo(certificate.mo44987c());
        }
    }

    /* compiled from: PG */
    public abstract class EmailSecurityData implements Parcelable {
        /* renamed from: a */
        public abstract boolean mo44996a();
    }

    /* compiled from: PG */
    public abstract class ExtendedData implements Parcelable {
        /* renamed from: a */
        public abstract EmailSecurityData mo45000a();

        /* renamed from: b */
        public abstract C55790h mo45001b();

        /* renamed from: c */
        public abstract boolean mo45002c();
    }

    /* renamed from: h */
    public static C42289bo m74331h() {
        C42344e eVar = new C42344e();
        eVar.mo45247c(C58485gu.m89845m());
        return eVar;
    }

    /* renamed from: a */
    public abstract ExtendedData mo44975a();

    /* renamed from: b */
    public abstract PersonFieldMetadata mo44976b();

    /* renamed from: c */
    public abstract C58833ax mo44977c();

    /* renamed from: d */
    public abstract C58833ax mo44978d();

    /* renamed from: e */
    public abstract C58833ax mo44979e();

    /* renamed from: f */
    public abstract C58485gu mo44981f();

    /* renamed from: g */
    public abstract CharSequence mo44982g();

    /* renamed from: lo */
    public final C42282bh mo45020lo() {
        return C42282bh.EMAIL;
    }

    /* renamed from: n */
    public final String mo45119n() {
        if (this.f110772a == null) {
            this.f110772a = m74310m(C42299by.EMAIL, C42290bp.m74449a(mo44982g().toString()));
        }
        return this.f110772a;
    }
}
