package com.google.android.libraries.social.populous.p3296e.p3298b;

import com.google.android.libraries.social.populous.core.C42282bh;
import com.google.android.libraries.social.populous.core.C42310ci;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58545j;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58671nr;
import com.google.p4181bi.C55797ag;
import com.google.p4181bi.C55828ba;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55864z;
import java.util.List;
import java.util.Set;
import p3186j$.util.Objects;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69296d;

/* renamed from: com.google.android.libraries.social.populous.e.b.al */
/* compiled from: PG */
public final class C42415al {
    /* renamed from: a */
    public static C42406ac m74698a(int i) {
        if (i == 0) {
            return C42411ah.f111235a;
        }
        if (i == 1) {
            return C69296d.m100512e() ? C42413aj.f111237a : C42411ah.f111235a;
        }
        if (i == 2) {
            return C42414ak.f111238a;
        }
        if (i != 3) {
            throw new IllegalArgumentException("Not a valid SessionContextRule: " + i);
        } else if (C69296d.m100511d()) {
            return C42412ai.f111236a;
        } else {
            return C69296d.m100512e() ? C42413aj.f111237a : C42411ah.f111235a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008b A[LOOP:1: B:23:0x0085->B:25:0x008b, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.common.p4522b.C58671nr m74699b(java.util.List r6) {
        /*
            int r0 = r6.size()
            com.google.common.b.bb r1 = new com.google.common.b.bb
            r2 = 2
            r1.<init>(r0, r2)
            java.util.Iterator r6 = r6.iterator()
        L_0x000e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r6.next()
            com.google.android.libraries.social.populous.core.ContactMethodField r0 = (com.google.android.libraries.social.populous.core.ContactMethodField) r0
            com.google.android.libraries.social.populous.core.bh r3 = com.google.android.libraries.social.populous.core.C42282bh.EMAIL
            com.google.android.libraries.social.populous.core.bh r3 = r0.mo45020lo()
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x006f
            r4 = 1
            if (r3 == r4) goto L_0x0049
            if (r3 == r2) goto L_0x0037
            r4 = 3
            if (r3 == r4) goto L_0x0037
            r4 = 4
            if (r3 == r4) goto L_0x0037
            r4 = 5
            if (r3 == r4) goto L_0x0037
            com.google.common.b.pz r3 = com.google.common.p4522b.C58733pz.f156496a
            goto L_0x0081
        L_0x0037:
            com.google.android.libraries.social.populous.core.InAppNotificationTarget r3 = r0.mo45117k()
            java.lang.CharSequence r3 = r3.mo44982g()
            java.lang.String r3 = r3.toString()
            com.google.common.b.qy r4 = new com.google.common.b.qy
            r4.<init>(r3)
            goto L_0x0080
        L_0x0049:
            com.google.android.libraries.social.populous.core.Phone r3 = r0.mo45118l()
            com.google.common.b.ih r4 = new com.google.common.b.ih
            r4.<init>()
            java.lang.CharSequence r5 = r3.mo44982g()
            java.lang.String r5 = r5.toString()
            r4.mo55373c(r5)
            java.lang.CharSequence r3 = r3.mo45043f()
            if (r3 == 0) goto L_0x006a
            java.lang.String r3 = r3.toString()
            r4.mo55373c(r3)
        L_0x006a:
            com.google.common.b.ij r3 = r4.mo55486f()
            goto L_0x0081
        L_0x006f:
            com.google.android.libraries.social.populous.core.Email r3 = r0.mo45116j()
            java.lang.CharSequence r3 = r3.mo44982g()
            java.lang.String r3 = r3.toString()
            com.google.common.b.qy r4 = new com.google.common.b.qy
            r4.<init>(r3)
        L_0x0080:
            r3 = r4
        L_0x0081:
            com.google.common.b.sl r3 = r3.iterator()
        L_0x0085:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x000e
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            com.google.android.libraries.social.populous.core.bh r5 = r0.mo45020lo()
            r1.mo54920x(r4, r5)
            goto L_0x0085
        L_0x0099:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.p3296e.p3298b.C42415al.m74699b(java.util.List):com.google.common.b.nr");
    }

    /* renamed from: c */
    static boolean m74700c(C55856r rVar, C58671nr nrVar) {
        int i = rVar.f147383b;
        if (i == 2) {
            return nrVar.mo54952E(((C55864z) rVar.f147384c).f147409b, C42282bh.EMAIL);
        }
        if (i == 3) {
            C55828ba baVar = (C55828ba) rVar.f147384c;
            return nrVar.mo54952E(baVar.f147326c, C42282bh.PHONE) || nrVar.mo54952E(baVar.f147325b, C42282bh.PHONE);
        } else if (i != 4) {
            return false;
        } else {
            C55797ag agVar = (C55797ag) rVar.f147384c;
            int i2 = agVar.f147235b;
            if (i2 == 2) {
                return m74702e(nrVar, (String) agVar.f147236c, C58528ij.m90011K(C42282bh.IN_APP_EMAIL, C42282bh.IN_APP_NOTIFICATION_TARGET));
            }
            if (i2 == 3) {
                return m74702e(nrVar, (String) agVar.f147236c, C58528ij.m90011K(C42282bh.IN_APP_PHONE, C42282bh.IN_APP_NOTIFICATION_TARGET));
            }
            if ((agVar.f147234a & 1) == 0) {
                return false;
            }
            return m74702e(nrVar, agVar.f147237d, C58528ij.m90011K(C42282bh.IN_APP_GAIA, C42282bh.IN_APP_NOTIFICATION_TARGET));
        }
    }

    /* renamed from: d */
    public static boolean m74701d(C42405ab abVar, C42549n nVar) {
        C58485gu f = abVar.mo45404f(nVar.f111609f.f110725k);
        int size = f.size();
        for (int i = 0; i < size; i++) {
            C58833ax c = abVar.mo45401c((C55856r) f.get(i));
            if (c.mo56113h() && ((C42310ci) c.mo56107c()).mo45270e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m74702e(C58671nr nrVar, String str, Set set) {
        if (!nrVar.mo54919w(str)) {
            return false;
        }
        List g = ((C58545j) nrVar).mo55277g(str);
        Objects.requireNonNull(set);
        return C58557jl.m90122c(g, new C42407ad(set)).mo56113h();
    }
}
