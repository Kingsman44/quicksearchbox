package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: com.google.ak.b.a.ak */
/* compiled from: PG */
final class C8282ak extends C8266aa {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17029a(C8385a aVar) {
        String str = null;
        if (aVar.mo17127r() == 9) {
            aVar.mo17123n();
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(aVar.mo17117h(), "_");
        String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
        if (stringTokenizer.hasMoreElements()) {
            str = stringTokenizer.nextToken();
        }
        if (nextToken2 == null && str == null) {
            return new Locale(nextToken);
        }
        if (str == null) {
            return new Locale(nextToken, nextToken2);
        }
        return new Locale(nextToken, nextToken2, str);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo17030b(C8387c cVar, Object obj) {
        String str;
        Locale locale = (Locale) obj;
        if (locale == null) {
            str = null;
        } else {
            str = locale.toString();
        }
        cVar.mo17141k(str);
    }
}
