package org.p5633c.p5634a.p5636b;

import java.util.Locale;
import org.p5633c.p5634a.C72283g;
import org.p5633c.p5634a.C72291o;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.C72294r;
import org.p5633c.p5634a.p5638d.C72212b;
import org.p5633c.p5634a.p5638d.C72218h;
import org.p5633c.p5634a.p5638d.C72231u;

/* renamed from: org.c.a.b.k */
/* compiled from: PG */
final class C72175k extends C72212b {

    /* renamed from: a */
    private final String f192110a = "BE";

    public C72175k() {
        super(C72283g.f192387c);
    }

    /* renamed from: A */
    public final C72291o mo63464A() {
        return C72231u.m106458j(C72293q.f192436a);
    }

    /* renamed from: C */
    public final C72291o mo63466C() {
        return null;
    }

    /* renamed from: a */
    public final int mo63444a(long j) {
        return 1;
    }

    /* renamed from: c */
    public final int mo63468c(Locale locale) {
        return this.f192110a.length();
    }

    /* renamed from: d */
    public final int mo63446d() {
        return 1;
    }

    /* renamed from: h */
    public final int mo63447h() {
        return 1;
    }

    /* renamed from: o */
    public final long mo63452o(long j) {
        return Long.MAX_VALUE;
    }

    /* renamed from: p */
    public final long mo63453p(long j) {
        return Long.MIN_VALUE;
    }

    /* renamed from: q */
    public final long mo63454q(long j, int i) {
        C72218h.m106360f(this, i, 1, 1);
        return j;
    }

    /* renamed from: r */
    public final long mo63470r(long j, String str, Locale locale) {
        if (this.f192110a.equals(str) || "1".equals(str)) {
            return j;
        }
        throw new C72294r(C72283g.f192387c, str);
    }

    /* renamed from: v */
    public final String mo63487v(int i, Locale locale) {
        return this.f192110a;
    }
}
