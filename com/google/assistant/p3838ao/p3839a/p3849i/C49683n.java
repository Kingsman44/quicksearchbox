package com.google.assistant.p3838ao.p3839a.p3849i;

import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.google.assistant.ao.a.i.n */
/* compiled from: PG */
public final class C49683n {

    /* renamed from: a */
    private static final C58528ij f128241a = C58528ij.m90015O("the", "of", "to", "in", "for", "is", "on", "that", "by", "with", "this", "be", "www", "are", "as", "i", "from", "a", "com", "an", "about", "was", "edu", "who", "what", "where", "when", "why", "how", "which", "en", "and", "it", "at", "or", "whats", "hows", C59002s.f156871a, "forecast", "will");

    /* renamed from: b */
    private static final Pattern f128242b = Pattern.compile("\\p{Punct}|\t|\n");

    /* renamed from: a */
    public static C58485gu m85674a(String str) {
        C58480gp gpVar = new C58480gp(4);
        C58869cf b = C58869cf.m90936b(new C58903m(' '));
        String trim = f128242b.matcher(str).replaceAll(" ").trim();
        for (String str2 : b.mo56155i(Normalizer.normalize(trim, Normalizer.Form.NFKC).toLowerCase(Locale.US))) {
            if (!f128241a.contains(str2) && !str2.isEmpty()) {
                gpVar.mo55395g(str2);
            }
        }
        return gpVar.mo55394f();
    }
}
