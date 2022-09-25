package com.google.android.libraries.searchbox.shared.suggestion;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.android.libraries.searchbox.shared.suggestion.aj */
/* compiled from: PG */
public final class C41670aj {
    /* renamed from: a */
    public static int m73068a(Suggestion suggestion) {
        C41663ac acVar = suggestion.f108907B.f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        if (acVar.f108937b == 4) {
            return ((Integer) acVar.f108938c).intValue();
        }
        return 0;
    }

    /* renamed from: b */
    public static long m73069b(Suggestion suggestion) {
        C41695u uVar = suggestion.f108907B.f109011e;
        if (uVar == null) {
            uVar = C41695u.f109062e;
        }
        return uVar.f109066c;
    }

    /* renamed from: c */
    public static long m73070c(Suggestion suggestion) {
        C41695u uVar = suggestion.f108907B.f109011e;
        if (uVar == null) {
            uVar = C41695u.f109062e;
        }
        return uVar.f109065b;
    }

    /* renamed from: d */
    public static String m73071d(Suggestion suggestion) {
        C41689o oVar = suggestion.f108907B.f109010d;
        if (oVar == null) {
            oVar = C41689o.f109041e;
        }
        return oVar.f109045c;
    }

    /* renamed from: e */
    public static String m73072e(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 2) != 0) {
            C41663ac acVar = eVar.f109008b;
            if (acVar == null) {
                acVar = C41663ac.f108934g;
            }
            if (acVar.f108937b == 3) {
                return (String) acVar.f108938c;
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: f */
    public static String m73073f(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        return sVar.f109056b;
    }

    /* renamed from: g */
    public static String m73074g(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        return sVar.f109057c;
    }

    /* renamed from: h */
    public static String m73075h(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        return sVar.f109058d;
    }

    /* renamed from: i */
    public static String m73076i(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        return sVar.f109059e;
    }

    /* renamed from: j */
    public static String m73077j(Suggestion suggestion) {
        C41693s sVar = suggestion.f108907B.f109009c;
        if (sVar == null) {
            sVar = C41693s.f109053h;
        }
        return sVar.f109061g;
    }

    /* renamed from: k */
    public static String m73078k(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 2) == 0) {
            return BuildConfig.FLAVOR;
        }
        C41663ac acVar = eVar.f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        return acVar.f108939d;
    }

    /* renamed from: l */
    public static String m73079l(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 2) == 0) {
            return BuildConfig.FLAVOR;
        }
        C41663ac acVar = eVar.f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        return acVar.f108940e;
    }

    /* renamed from: m */
    public static String m73080m(Suggestion suggestion) {
        C41667ag agVar = suggestion.f108907B.f109016j;
        if (agVar == null) {
            agVar = C41667ag.f108943h;
        }
        return agVar.f108946b;
    }

    /* renamed from: n */
    public static String m73081n(Suggestion suggestion) {
        C41691q qVar = suggestion.f108907B.f109012f;
        if (qVar == null) {
            qVar = C41691q.f109047e;
        }
        return qVar.f109050b;
    }

    /* renamed from: o */
    public static String m73082o(Suggestion suggestion) {
        C41691q qVar = suggestion.f108907B.f109012f;
        if (qVar == null) {
            qVar = C41691q.f109047e;
        }
        return qVar.f109051c;
    }

    /* renamed from: p */
    public static boolean m73083p(Suggestion suggestion) {
        C41667ag agVar = suggestion.f108907B.f109016j;
        if (agVar == null) {
            agVar = C41667ag.f108943h;
        }
        return agVar.f108948d;
    }

    /* renamed from: q */
    public static boolean m73084q(Suggestion suggestion) {
        C41667ag agVar = suggestion.f108907B.f109016j;
        if (agVar == null) {
            agVar = C41667ag.f108943h;
        }
        return agVar.f108951g;
    }

    /* renamed from: r */
    public static boolean m73085r(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 256) == 0) {
            return false;
        }
        C41687m mVar = eVar.f109015i;
        if (mVar == null) {
            mVar = C41687m.f109037b;
        }
        return mVar.f109039a;
    }

    /* renamed from: s */
    public static boolean m73086s(Suggestion suggestion) {
        C41663ac acVar = suggestion.f108907B.f109008b;
        if (acVar == null) {
            acVar = C41663ac.f108934g;
        }
        return acVar.f108937b == 4;
    }

    /* renamed from: t */
    public static boolean m73087t(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 2) != 0) {
            C41663ac acVar = eVar.f109008b;
            if (acVar == null) {
                acVar = C41663ac.f108934g;
            }
            if ((acVar.f108936a & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m73088u(Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 2) != 0) {
            C41663ac acVar = eVar.f109008b;
            if (acVar == null) {
                acVar = C41663ac.f108934g;
            }
            if ((acVar.f108936a & 2) != 0) {
                return true;
            }
        }
        return false;
    }
}
