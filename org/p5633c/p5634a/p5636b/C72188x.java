package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72294r;

/* renamed from: org.c.a.b.x */
/* compiled from: PG */
final class C72188x extends C72174j {
    public C72188x(C72170f fVar) {
        super(fVar);
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return C72187w.m106169a(locale).f192150l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: mu */
    public final int mo63524mu(String str, Locale locale) {
        Integer num = (Integer) C72187w.m106169a(locale).f192147i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new C72294r(C72283g.f192393i, str);
    }

    /* renamed from: s */
    public final String mo63486s(int i, Locale locale) {
        return C72187w.m106169a(locale).f192143e[i];
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return C72187w.m106169a(locale).f192142d[i];
    }
}
