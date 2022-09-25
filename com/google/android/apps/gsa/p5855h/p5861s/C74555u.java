package com.google.android.apps.gsa.p5855h.p5861s;

import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;

/* renamed from: com.google.android.apps.gsa.h.s.u */
/* compiled from: PG */
public abstract class C74555u {
    /* renamed from: i */
    public static C74554t m120572i() {
        C74549c cVar = new C74549c();
        cVar.f208696b = null;
        cVar.mo70869c(C9439b.UNKNOWN_ENTRY);
        cVar.mo70868b(s.a);
        cVar.mo70873g(C74547aj.m120536d().mo70862a());
        cVar.mo70870d(C74558y.m120591c().mo70874a());
        cVar.mo70872f(C74544ae.m120523d().mo70849a());
        cVar.mo70871e(C74542ab.m120516c().a());
        return cVar;
    }

    /* renamed from: a */
    public abstract C9439b mo70883a();

    /* renamed from: b */
    public abstract s mo70884b();

    /* renamed from: c */
    public abstract C74558y mo70885c();

    /* renamed from: d */
    public abstract C74542ab mo70886d();

    /* renamed from: e */
    public abstract C74544ae mo70887e();

    /* renamed from: f */
    public abstract C74547aj mo70888f();

    /* renamed from: g */
    public abstract C92391o mo70889g();

    /* renamed from: h */
    public abstract String mo70890h();

    /* renamed from: j */
    public final boolean mo70891j() {
        s sVar = s.a;
        int ordinal = mo70884b().ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1 || ordinal == 2) {
            return true;
        }
        throw new AssertionError();
    }

    /* renamed from: k */
    public final boolean mo70892k() {
        s sVar = s.a;
        int ordinal = mo70884b().ordinal();
        if (ordinal == 0) {
            return true;
        }
        if (ordinal == 1 || ordinal == 2) {
            return false;
        }
        throw new AssertionError();
    }

    /* renamed from: l */
    public final boolean mo70893l() {
        s sVar = s.a;
        int ordinal = mo70884b().ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        throw new AssertionError();
    }
}
