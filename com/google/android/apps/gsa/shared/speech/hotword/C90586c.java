package com.google.android.apps.gsa.shared.speech.hotword;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import com.google.p395al.p408c.p414c.p415a.C8453c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.shared.speech.hotword.c */
/* compiled from: PG */
public final class C90586c {

    /* renamed from: a */
    public static final C58495hd f253257a = C58495hd.m89902p("en-*", Arrays.asList(new String[]{"en-AE", "en-AU", "en-BE", "en-BW", "en-CA", "en-DE", "en-GB", "en-GH", "en-HK", "en-ID", "en-IE", "en-IL", "en-IN", "en-KE", "en-MM", "en-MT", "en-MU", "en-MY", "en-NA", "en-NG", "en-NL", "en-NZ", "en-PG", "en-PH", "en-PK", "en-SA", "en-SE", "en-SG", "en-TH", "en-TZ", "en-UG", "en-US", "en-ZA", "en-ZM", "en-ZW", "hi-IN"}), "ar-*", Arrays.asList(new String[]{"ar-001", "ar-AE", "ar-BH", "ar-DZ", "ar-EG", "ar-IQ", "ar-JO", "ar-LB", "ar-LY", "ar-MA", "ar-MR", "ar-OM", "ar-PS", "ar-QA", "ar-SA", "ar-TN", "ar-YE"}), "es-*", Arrays.asList(new String[]{"es-ES", "es-MX", "es-AR", "es-BO", "es-CL", "es-CO", "es-CR", "es-DO", "es-EC", "es-GT", "es-HN", "es-NI", "es-PA", "es-PE", "es-PH", "es-PY", "es-PR", "es-SV", "es-UY", "es-VE", "es-US"}));

    /* renamed from: b */
    private static final C58869cf f253258b = C58869cf.m90936b(new C58903m('/')).mo56151a();

    /* renamed from: a */
    public static C58495hd m147803a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str.contains("/")) {
                for (String put : f253258b.mo56153g(str)) {
                    hashMap.put(put, (String) entry.getValue());
                }
            } else {
                hashMap.put(str, (String) entry.getValue());
            }
        }
        return C58495hd.m89898l(hashMap);
    }

    /* renamed from: b */
    public static C58495hd m147804b(C90021c cVar) {
        C58495hd a = m147803a(cVar.mo79752r(C90082eg.f250032cp));
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55433l(a);
        gzVar.mo55433l(C58662ni.m90355n(cVar.mo79752r(C90082eg.f250031co), new C90585b(a)));
        return gzVar.mo55427f(false);
    }

    /* renamed from: c */
    public static C8453c m147805c(C86124t tVar) {
        C8453c cVar;
        if (!tVar.mo79746e(C90082eg.f249876S) || (cVar = (C8453c) tVar.mo79754t(C90082eg.f249866I, C8453c.f29363b.getParserForType())) == null || cVar.equals(C8453c.f29363b)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: d */
    public static String m147806d(int i) {
        return i != 100 ? i != 101 ? "Unknown" : "X Google" : "Ok Google";
    }

    /* renamed from: e */
    public static int m147807e(String str) {
        if ("Ok Google".equals(str)) {
            return 101;
        }
        return "X Google".equals(str) ? 102 : 1;
    }
}
