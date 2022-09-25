package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oe */
/* compiled from: PG */
public final class C7168oe implements C7206pp {

    /* renamed from: a */
    private final int f23225a;

    /* renamed from: b */
    private final List f23226b;

    public C7168oe() {
        this((byte[]) null);
    }

    public C7168oe(int i, List list) {
        this.f23225a = i;
        this.f23226b = list;
    }

    /* renamed from: c */
    private final C7196pf m21334c(C7205po poVar) {
        return new C7196pf(m21336e(poVar));
    }

    /* renamed from: d */
    private final C7209ps m21335d(C7205po poVar) {
        return new C7209ps(m21336e(poVar));
    }

    /* renamed from: e */
    private final List m21336e(C7205po poVar) {
        String str;
        int i;
        List list;
        if (m21337f(32)) {
            return this.f23226b;
        }
        aee aee = new aee(poVar.f23517d);
        List list2 = this.f23226b;
        while (aee.mo14550d() > 0) {
            int n = aee.mo14560n();
            int g = aee.mo14553g() + aee.mo14560n();
            if (n == 134) {
                list2 = new ArrayList();
                int n2 = aee.mo14560n() & 31;
                for (int i2 = 0; i2 < n2; i2++) {
                    String E = aee.mo14541E(3);
                    int n3 = aee.mo14560n();
                    int i3 = n3 & 128;
                    if (i3 != 0) {
                        i = n3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte n4 = (byte) aee.mo14560n();
                    aee.mo14557k(1);
                    if (i3 != 0) {
                        int i4 = adl.f20371a;
                        list = Collections.singletonList((n4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C6863cx cxVar = new C6863cx();
                    cxVar.mo15630ae(str);
                    cxVar.mo15620V(E);
                    cxVar.mo15604F(i);
                    cxVar.mo15618T(list);
                    list2.add(cxVar.mo15625a());
                }
            }
            aee.mo14554h(g);
        }
        return list2;
    }

    /* renamed from: f */
    private final boolean m21337f(int i) {
        return (i & this.f23225a) != 0;
    }

    /* renamed from: a */
    public final SparseArray mo16223a() {
        return new SparseArray();
    }

    public C7168oe(byte[] bArr) {
        this(0, arn.m19402i());
    }

    /* renamed from: b */
    public final C7208pr mo16224b(int i, C7205po poVar) {
        if (i == 2) {
            return new C7187ox(new C7173oj(m21335d(poVar)));
        }
        if (i == 3 || i == 4) {
            return new C7187ox(new C7184ou(poVar.f23515b));
        }
        if (i == 21) {
            return new C7187ox(new C7182os());
        }
        if (i != 27) {
            if (i == 36) {
                return new C7187ox(new C7181or(m21334c(poVar)));
            }
            if (i == 89) {
                return new C7187ox(new C7170og(poVar.f23516c));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C7187ox(new C7164oa(poVar.f23515b));
                }
                if (i == 257) {
                    return new C7195pe(new C7186ow("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (m21337f(2)) {
                                            return null;
                                        }
                                        return new C7187ox(new C7167od(false, poVar.f23515b));
                                    case 16:
                                        return new C7187ox(new C7176om(m21335d(poVar)));
                                    case 17:
                                        if (m21337f(2)) {
                                            return null;
                                        }
                                        return new C7187ox(new C7183ot(poVar.f23515b));
                                    default:
                                        return null;
                                }
                            }
                        } else if (m21337f(16)) {
                            return null;
                        } else {
                            return new C7195pe(new C7186ow("application/x-scte35"));
                        }
                    } else if (!m21337f(64)) {
                        return null;
                    }
                }
                return new C7187ox(new C7160nx(poVar.f23515b));
            }
            return new C7187ox(new C7169of(poVar.f23515b));
        } else if (m21337f(4)) {
            return null;
        } else {
            return new C7187ox(new C7179op(m21334c(poVar), m21337f(1), m21337f(8)));
        }
    }
}
