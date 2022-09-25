package com.google.android.libraries.lens.view.gleam;

import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.lens.p4699e.C62195ah;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56320r;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56323u;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56324v;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56326x;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56327y;

/* renamed from: com.google.android.libraries.lens.view.gleam.eb */
/* compiled from: PG */
public final class C26551eb {

    /* renamed from: a */
    public static final /* synthetic */ int f72373a = 0;

    /* renamed from: b */
    private static final C58495hd f72374b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C56326x.CARD, 7);
        gzVar.mo55429h(C56326x.CHIP, 6);
        gzVar.mo55429h(C56326x.CUSTOM_PROMPT, 5);
        gzVar.mo55429h(C56326x.PROMPT, 4);
        gzVar.mo55429h(C56326x.FALLBACK_PROMPT, 3);
        gzVar.mo55429h(C56326x.NONE, 2);
        gzVar.mo55429h(C56326x.UNKNOWN, 1);
        f72374b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static C25349y m49036a(C56327y yVar) {
        if (yVar.f150143f.size() == 0 && (yVar.f150138a & 32) == 0) {
            return C25349y.THINKING_GLEAM;
        }
        C56324v vVar = yVar.f150144g;
        if (vVar == null) {
            vVar = C56324v.f150122c;
        }
        C56323u a = C56323u.m87968a(vVar.f150125b);
        if (a == null) {
            a = C56323u.GLEAM;
        }
        switch (a.ordinal()) {
            case 2:
                return C25349y.NONE;
            case 3:
                return C25349y.TEXT_GLEAM;
            case 4:
                return C25349y.DOCUMENT_GLEAM;
            case 5:
                return C25349y.PLANAR_GLEAM;
            case 6:
                return C25349y.BARCODE_GLEAM;
            case 7:
                return C25349y.OUTDOOR_GLEAM;
            case 8:
                return C25349y.OBJECT_REGION_GLEAM;
            case 9:
                return C25349y.MATH_GLEAM;
            default:
                C56326x xVar = C56326x.UNKNOWN;
                int i = 1;
                for (C56320r rVar : yVar.f150143f) {
                    C58495hd hdVar = f72374b;
                    C56326x a2 = C56326x.m87970a(rVar.f150103j);
                    if (a2 == null) {
                        a2 = C56326x.UNKNOWN;
                    }
                    Integer num = (Integer) hdVar.get(a2);
                    if (num != null && num.intValue() > i) {
                        xVar = C56326x.m87970a(rVar.f150103j);
                        if (xVar == null) {
                            xVar = C56326x.UNKNOWN;
                        }
                        i = num.intValue();
                    }
                }
                if (a == C56323u.GLEAM && (xVar == C56326x.CARD || xVar == C56326x.CHIP || xVar == C56326x.CUSTOM_PROMPT)) {
                    return C25349y.GLEAM;
                }
                return C25349y.PRE_GLEAM;
        }
    }

    /* renamed from: b */
    public static boolean m49037b(C56327y yVar) {
        return C25349y.BARCODE_GLEAM.equals(m49036a(yVar));
    }

    /* renamed from: c */
    public static boolean m49038c(C56327y yVar) {
        return C25349y.DOCUMENT_GLEAM.equals(m49036a(yVar));
    }

    /* renamed from: d */
    public static boolean m49039d(C56327y yVar) {
        return C25349y.GLEAM.equals(m49036a(yVar));
    }

    /* renamed from: e */
    public static boolean m49040e(C25308ap apVar) {
        C25349y a = C25349y.m46667a(apVar.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (a != C25349y.PLANAR_GLEAM) {
            return false;
        }
        for (C62195ah ahVar : apVar.f68862w) {
            if (ahVar.f167933a == 4) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m49041f(C56327y yVar) {
        return C25349y.MATH_GLEAM.equals(m49036a(yVar));
    }

    /* renamed from: g */
    public static boolean m49042g(C56327y yVar) {
        return C25349y.OBJECT_REGION_GLEAM.equals(m49036a(yVar));
    }

    /* renamed from: h */
    public static boolean m49043h(C56327y yVar) {
        return C25349y.PLANAR_GLEAM.equals(m49036a(yVar));
    }

    /* renamed from: i */
    public static boolean m49044i(C56327y yVar) {
        return C25349y.TEXT_GLEAM.equals(m49036a(yVar));
    }
}
