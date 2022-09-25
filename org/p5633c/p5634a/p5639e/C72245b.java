package org.p5633c.p5634a.p5639e;

import java.util.Locale;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72149ag;
import org.p5633c.p5634a.C72151ai;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72299w;

/* renamed from: org.c.a.e.b */
/* compiled from: PG */
public final class C72245b {

    /* renamed from: a */
    public final C72265v f192231a;

    /* renamed from: b */
    public final C72261r f192232b;

    /* renamed from: c */
    public final Locale f192233c;

    /* renamed from: d */
    public final C72132a f192234d;

    /* renamed from: e */
    public final C72288l f192235e;

    public C72245b(C72265v vVar, C72261r rVar) {
        this.f192231a = vVar;
        this.f192232b = rVar;
        this.f192233c = null;
        this.f192234d = null;
        this.f192235e = null;
    }

    public C72245b(C72265v vVar, C72261r rVar, Locale locale, C72132a aVar, C72288l lVar) {
        this.f192231a = vVar;
        this.f192232b = rVar;
        this.f192233c = locale;
        this.f192234d = aVar;
        this.f192235e = lVar;
    }

    /* renamed from: j */
    private final C72132a m106562j(C72132a aVar) {
        C72132a c = C72285i.m106775c(aVar);
        C72132a aVar2 = this.f192234d;
        if (aVar2 != null) {
            c = aVar2;
        }
        C72288l lVar = this.f192235e;
        return lVar != null ? c.mo63348e(lVar) : c;
    }

    /* renamed from: k */
    private final C72261r m106563k() {
        C72261r rVar = this.f192232b;
        if (rVar != null) {
            return rVar;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    /* renamed from: a */
    public final long mo63595a(String str) {
        C72261r k = m106563k();
        C72264u uVar = new C72264u(m106562j(this.f192234d), this.f192233c);
        int c = k.mo63606c(uVar, str, 0);
        if (c < 0) {
            c ^= -1;
        } else if (c >= str.length()) {
            return uVar.mo63641e(str);
        }
        throw new IllegalArgumentException(C72266w.m106675c(str, c));
    }

    /* renamed from: b */
    public final String mo63596b(C72149ag agVar) {
        StringBuffer stringBuffer = new StringBuffer(mo63602h().mo63605b());
        mo63603i(stringBuffer, C72285i.m106773a(agVar), C72285i.m106776d(agVar));
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public final String mo63597c(C72151ai aiVar) {
        StringBuffer stringBuffer = new StringBuffer(mo63602h().mo63605b());
        mo63602h().mo63607d(stringBuffer, aiVar, this.f192233c);
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public final C72210d mo63598d(String str) {
        C72132a c;
        C72261r k = m106563k();
        C72132a j = m106562j((C72132a) null);
        C72264u uVar = new C72264u(j, this.f192233c);
        int c2 = k.mo63606c(uVar, str, 0);
        if (c2 < 0) {
            c2 ^= -1;
        } else if (c2 >= str.length()) {
            long e = uVar.mo63641e(str);
            C72288l lVar = uVar.f192279b;
            if (lVar != null) {
                j = j.mo63348e(lVar);
            }
            C72210d dVar = new C72210d(e, j);
            C72288l lVar2 = this.f192235e;
            if (lVar2 == null || (c = C72285i.m106775c(dVar.f191963b.mo63348e(lVar2))) == dVar.f191963b) {
                return dVar;
            }
            return new C72210d(dVar.f191962a, c);
        }
        throw new IllegalArgumentException(C72266w.m106675c(str, c2));
    }

    /* renamed from: e */
    public final C72299w mo63599e(String str) {
        C72261r k = m106563k();
        C72132a d = m106562j((C72132a) null).mo63347d();
        C72264u uVar = new C72264u(d, this.f192233c);
        int c = k.mo63606c(uVar, str, 0);
        if (c < 0) {
            c ^= -1;
        } else if (c >= str.length()) {
            long e = uVar.mo63641e(str);
            Integer num = uVar.f192280c;
            if (num != null) {
                d = d.mo63348e(C72288l.m106787n(num.intValue()));
            } else {
                C72288l lVar = uVar.f192279b;
                if (lVar != null) {
                    d = d.mo63348e(lVar);
                }
            }
            return new C72299w(e, d);
        }
        throw new IllegalArgumentException(C72266w.m106675c(str, c));
    }

    /* renamed from: f */
    public final C72245b mo63600f(C72132a aVar) {
        if (this.f192234d == aVar) {
            return this;
        }
        return new C72245b(this.f192231a, this.f192232b, this.f192233c, aVar, this.f192235e);
    }

    /* renamed from: g */
    public final C72245b mo63601g(C72288l lVar) {
        return this.f192235e == lVar ? this : new C72245b(this.f192231a, this.f192232b, this.f192233c, this.f192234d, lVar);
    }

    /* renamed from: h */
    public final C72265v mo63602h() {
        C72265v vVar = this.f192231a;
        if (vVar != null) {
            return vVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    /* renamed from: i */
    public final void mo63603i(StringBuffer stringBuffer, long j, C72132a aVar) {
        long j2 = j;
        C72265v h = mo63602h();
        C72132a j3 = m106562j(aVar);
        C72288l C = j3.mo63325C();
        int a = C.mo37823a(j2);
        long j4 = (long) a;
        long j5 = j2 + j4;
        if ((j2 ^ j5) < 0 && (j4 ^ j2) >= 0) {
            C = C72288l.f192416b;
            a = 0;
            j5 = j2;
        }
        C72265v vVar = h;
        StringBuffer stringBuffer2 = stringBuffer;
        long j6 = j5;
        vVar.mo63608e(stringBuffer2, j6, j3.mo63347d(), a, C, this.f192233c);
    }
}
