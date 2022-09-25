package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72288l;

/* renamed from: org.c.a.e.j */
/* compiled from: PG */
final class C72253j implements C72265v, C72261r {

    /* renamed from: a */
    private final String f192250a;

    public C72253j(String str) {
        this.f192250a = str;
    }

    /* renamed from: a */
    public final int mo63604a() {
        return this.f192250a.length();
    }

    /* renamed from: b */
    public final int mo63605b() {
        return this.f192250a.length();
    }

    /* renamed from: c */
    public final int mo63606c(C72264u uVar, String str, int i) {
        String str2 = this.f192250a;
        return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.f192250a.length() : i ^ -1;
    }

    /* renamed from: d */
    public final void mo63607d(StringBuffer stringBuffer, C72151ai aiVar, Locale locale) {
        stringBuffer.append(this.f192250a);
    }

    /* renamed from: e */
    public final void mo63608e(StringBuffer stringBuffer, long j, C72132a aVar, int i, C72288l lVar, Locale locale) {
        stringBuffer.append(this.f192250a);
    }
}
