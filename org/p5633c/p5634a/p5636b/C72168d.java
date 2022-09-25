package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5638d.C72223m;

/* renamed from: org.c.a.b.d */
/* compiled from: PG */
final class C72168d extends C72223m {
    public C72168d() {
        super(C72283g.f192399o, C72170f.f192081E, C72170f.f192082F);
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return C72187w.m106169a(locale).f192151m;
    }

    /* renamed from: r */
    public final long mo63470r(long j, String str, Locale locale) {
        String[] strArr = C72187w.m106169a(locale).f192144f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new C72294r(C72283g.f192399o, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return mo63454q(j, length);
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return C72187w.m106169a(locale).f192144f[i];
    }
}
