package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2617e;
import com.google.common.base.C58913w;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.media3.extractor.k.g */
/* compiled from: PG */
public final class C3554g implements C3544aq {

    /* renamed from: a */
    private final int f11176a;

    /* renamed from: b */
    private final List f11177b;

    public C3554g() {
        this((byte[]) null);
    }

    public C3554g(int i, List list) {
        this.f11176a = i;
        this.f11177b = list;
    }

    /* renamed from: b */
    private final C3535ah m10265b(C3543ap apVar) {
        return new C3535ah(m10267d(apVar));
    }

    /* renamed from: c */
    private final C3548au m10266c(C3543ap apVar) {
        return new C3548au(m10267d(apVar));
    }

    /* renamed from: d */
    private final List m10267d(C3543ap apVar) {
        String str;
        int i;
        List list;
        if (m10268e(32)) {
            return this.f11177b;
        }
        C2604ac acVar = new C2604ac(apVar.f11107d);
        List list2 = this.f11177b;
        while (acVar.f7236c - acVar.f7235b > 0) {
            int g = acVar.mo6139g();
            int g2 = acVar.f7235b + acVar.mo6139g();
            if (g == 134) {
                list2 = new ArrayList();
                int g3 = acVar.mo6139g() & 31;
                for (int i2 = 0; i2 < g3; i2++) {
                    String s = acVar.mo6151s(3, C58913w.f156754c);
                    int g4 = acVar.mo6139g();
                    boolean z = (g4 & 128) != 0;
                    if (z) {
                        i = g4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte g5 = (byte) acVar.mo6139g();
                    acVar.mo6131A(acVar.f7235b + 1);
                    if (z) {
                        byte[] bArr = C2617e.f7267a;
                        list = Collections.singletonList((g5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C2679w wVar = new C2679w();
                    wVar.f7459k = str;
                    wVar.f7451c = s;
                    wVar.f7447C = i;
                    wVar.f7461m = list;
                    list2.add(new C2680x(wVar));
                }
            }
            acVar.mo6131A(g2);
        }
        return list2;
    }

    /* renamed from: e */
    private final boolean m10268e(int i) {
        return (i & this.f11176a) != 0;
    }

    public C3554g(byte[] bArr) {
        this(0, C58485gu.m89845m());
    }

    /* renamed from: a */
    public final C3546as mo7461a(int i, C3543ap apVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C3573z(new C3570w(apVar.f11105b));
            }
            if (i == 21) {
                return new C3573z(new C3568u());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C3573z(new C3567t(m10265b(apVar)));
                }
                if (i == 89) {
                    return new C3573z(new C3556i(apVar.f11106c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new C3573z(new C3551d(apVar.f11105b));
                    }
                    if (i == 257) {
                        return new C3534ag(new C3572y("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (m10268e(2)) {
                                        return null;
                                    }
                                    return new C3573z(new C3553f(false, apVar.f11105b));
                                case 16:
                                    return new C3573z(new C3562o(m10266c(apVar)));
                                case 17:
                                    if (m10268e(2)) {
                                        return null;
                                    }
                                    return new C3573z(new C3569v(apVar.f11105b));
                                default:
                                    switch (i) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!m10268e(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new C3573z(new C3549b(apVar.f11105b));
                    } else if (m10268e(16)) {
                        return null;
                    } else {
                        return new C3534ag(new C3572y("application/x-scte35"));
                    }
                }
                return new C3573z(new C3555h(apVar.f11105b));
            } else if (m10268e(4)) {
                return null;
            } else {
                return new C3573z(new C3565r(m10265b(apVar), m10268e(1), m10268e(8)));
            }
        }
        return new C3573z(new C3559l(m10266c(apVar)));
    }
}
