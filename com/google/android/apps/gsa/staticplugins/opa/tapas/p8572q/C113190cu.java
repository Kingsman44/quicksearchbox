package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113372dm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113404eo;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.assistant.p1594s.p1597b.C19167ba;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.assistant.p3897e.p3917i.p3918a.C51331dt;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.cu */
/* compiled from: PG */
public final class C113190cu {

    /* renamed from: a */
    private final C69464a f313521a;

    /* renamed from: b */
    private final C113372dm f313522b;

    /* renamed from: c */
    private final C21370a f313523c;

    public C113190cu(C69464a aVar, C113372dm dmVar, C21370a aVar2) {
        this.f313521a = aVar;
        this.f313522b = dmVar;
        this.f313523c = aVar2;
    }

    /* renamed from: a */
    public static long m187214a(C113405ep epVar, C21370a aVar) {
        return aVar.mo26871c() - epVar.mo100017b();
    }

    /* renamed from: c */
    public static String m187215c(String str) {
        return str.toLowerCase(Locale.getDefault()).trim();
    }

    /* renamed from: d */
    public static String m187216d(String str) {
        if (!str.isEmpty()) {
            if (!m187217e(str.charAt(0))) {
                int length = str.length();
                int i = 1;
                while (i < length - 1) {
                    if (!m187217e(str.charAt(i))) {
                        i++;
                    } else if (!m187217e(str.charAt(i + 1))) {
                        i += 2;
                    }
                }
            }
            int length2 = str.length();
            char[] charArray = str.toCharArray();
            int i2 = 0;
            boolean z = true;
            for (int i3 = 0; i3 < length2; i3++) {
                char c = charArray[i3];
                if (m187217e(c)) {
                    if (!z) {
                        charArray[i2] = ' ';
                        i2++;
                    }
                    z = true;
                } else {
                    charArray[i2] = c;
                    i2++;
                    z = false;
                }
            }
            return String.valueOf(charArray, 0, i2);
        }
        return str;
    }

    /* renamed from: e */
    private static boolean m187217e(char c) {
        return c == ' ' || c == 10 || c == 9 || c == 13 || c == 12;
    }

    /* renamed from: b */
    public final C113404eo mo99904b(String str, C19167ba baVar, C51331dt dtVar, C48674ai aiVar) {
        long a = this.f313522b.mo100146a();
        C113404eo eoVar = (C113404eo) this.f313521a.mo17428b();
        eoVar.mo100011k(a);
        eoVar.mo100008h(str);
        eoVar.mo100002b(baVar);
        eoVar.mo100013m(this.f313523c.mo26871c());
        eoVar.mo100014n(this.f313523c.mo26870b());
        eoVar.mo100015o(dtVar);
        eoVar.mo100012l(aiVar);
        return eoVar;
    }
}
