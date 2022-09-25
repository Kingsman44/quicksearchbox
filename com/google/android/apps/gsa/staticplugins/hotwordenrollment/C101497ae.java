package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92390n;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92391o;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92371d;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101860a;
import com.google.assistant.p3861at.C50207on;
import com.google.assistant.p3861at.C50376uu;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae */
/* compiled from: PG */
public final class C101497ae {

    /* renamed from: a */
    public final C101860a f283244a;

    /* renamed from: b */
    public final C92371d f283245b;

    /* renamed from: c */
    private final C74555u f283246c;

    public C101497ae(C74555u uVar, C101860a aVar, C92371d dVar) {
        this.f283246c = uVar;
        this.f283244a = aVar;
        this.f283245b = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.gsa.opaonboarding.p6462d.C83935v mo92328a() {
        /*
            r10 = this;
            com.google.android.apps.gsa.h.s.u r0 = r10.f283246c
            com.google.android.apps.gsa.h.s.ae r0 = r0.mo70887e()
            com.google.android.apps.gsa.h.s.ah r0 = r0.mo70855c()
            com.google.android.apps.gsa.opaonboarding.d.v r0 = r0.mo70860b()
            if (r0 == 0) goto L_0x0011
            return r0
        L_0x0011:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r0 = r10.f283244a
            com.google.assistant.at.act r0 = r0.mo92636a()
            if (r0 == 0) goto L_0x009b
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r0 = r10.f283244a
            com.google.assistant.at.act r0 = r0.mo92636a()
            com.google.assistant.at.uu r0 = r0.f128912s
            if (r0 != 0) goto L_0x0025
            com.google.assistant.at.uu r0 = com.google.assistant.p3861at.C50376uu.f131134d
        L_0x0025:
            java.lang.String r1 = r0.f131138c
            int r2 = r1.hashCode()
            r3 = -1278174388(0xffffffffb3d09b4c, float:-9.714003E-8)
            r4 = -1
            r5 = 1
            if (r2 == r3) goto L_0x0042
            r3 = 3343885(0x33060d, float:4.685781E-39)
            if (r2 == r3) goto L_0x0038
            goto L_0x004c
        L_0x0038:
            java.lang.String r2 = "male"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004c
            r1 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r2 = "female"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = -1
        L_0x004d:
            r2 = 4
            r3 = 2
            if (r1 == 0) goto L_0x0057
            if (r1 == r5) goto L_0x0055
            r1 = 4
            goto L_0x0058
        L_0x0055:
            r1 = 3
            goto L_0x0058
        L_0x0057:
            r1 = 2
        L_0x0058:
            com.google.android.apps.gsa.opaonboarding.d.v r6 = com.google.android.apps.gsa.opaonboarding.p6462d.C83935v.f228590f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.android.apps.gsa.opaonboarding.d.u r6 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83934u) r6
            boolean r7 = r10.mo92337j()
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.android.apps.gsa.opaonboarding.d.v r8 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83935v) r8
            int r9 = r8.f228592a
            r5 = r5 | r9
            r8.f228592a = r5
            r8.f228593b = r7
            java.lang.String r0 = r0.f131137b
            r6.copyOnWrite()
            com.google.protobuf.bv r5 = r6.instance
            com.google.android.apps.gsa.opaonboarding.d.v r5 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83935v) r5
            r0.getClass()
            int r7 = r5.f228592a
            r3 = r3 | r7
            r5.f228592a = r3
            r5.f228594c = r0
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.android.apps.gsa.opaonboarding.d.v r0 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83935v) r0
            int r1 = r1 + r4
            r0.f228595d = r1
            int r1 = r0.f228592a
            r1 = r1 | r2
            r0.f228592a = r1
            com.google.protobuf.bv r0 = r6.build()
            com.google.android.apps.gsa.opaonboarding.d.v r0 = (com.google.android.apps.gsa.opaonboarding.p6462d.C83935v) r0
            return r0
        L_0x009b:
            com.google.android.apps.gsa.opaonboarding.d.v r0 = com.google.android.apps.gsa.opaonboarding.p6462d.C83935v.f228590f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae.mo92328a():com.google.android.apps.gsa.opaonboarding.d.v");
    }

    /* renamed from: b */
    public final String mo92329b() {
        if (mo92328a().f228593b) {
            return mo92328a().f228594c;
        }
        if (this.f283244a.mo92636a() != null) {
            C50376uu uuVar = this.f283244a.mo92636a().f128912s;
            if (uuVar == null) {
                uuVar = C50376uu.f131134d;
            }
            if (!uuVar.f131137b.isEmpty()) {
                return uuVar.f131137b;
            }
        }
        return this.f283245b.mo87022c();
    }

    /* renamed from: c */
    public final String mo92330c() {
        if (mo92328a().f228593b) {
            int a = C50207on.m85790a(mo92328a().f228595d);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i != 1) {
                return i != 2 ? "other" : "female";
            }
            return "male";
        }
        if (this.f283244a.mo92636a() != null) {
            C50376uu uuVar = this.f283244a.mo92636a().f128912s;
            if (uuVar == null) {
                uuVar = C50376uu.f131134d;
            }
            if (!uuVar.f131138c.isEmpty()) {
                return uuVar.f131138c;
            }
        }
        return this.f283245b.mo87023d();
    }

    /* renamed from: d */
    public final boolean mo92331d() {
        return this.f283245b.f257558c.mo56113h();
    }

    /* renamed from: e */
    public final boolean mo92332e() {
        return this.f283244a.f284137d.get() && this.f283246c.mo70887e().mo70857f();
    }

    /* renamed from: f */
    public final boolean mo92333f() {
        C92391o oVar = (C92391o) this.f283245b.f257558c.mo56109e(C92391o.f257641i);
        if ((oVar.f257643a & 32) == 0) {
            return false;
        }
        int a = C92390n.m151715a(oVar.f257649g);
        if (a == 0) {
            a = 1;
        }
        return a == 2 || a == 3 || a == 4;
    }

    /* renamed from: g */
    public final boolean mo92334g() {
        return this.f283244a.f284137d.get() || mo92331d();
    }

    /* renamed from: h */
    public final boolean mo92335h() {
        return this.f283246c.mo70891j() && mo92331d();
    }

    /* renamed from: i */
    public final boolean mo92336i() {
        return this.f283244a.f284137d.get() && this.f283246c.mo70891j();
    }

    /* renamed from: j */
    public final boolean mo92337j() {
        return this.f283244a.f284137d.get() && this.f283246c.mo70892k();
    }

    /* renamed from: k */
    public final boolean mo92338k() {
        return mo92336i() || mo92335h();
    }
}
