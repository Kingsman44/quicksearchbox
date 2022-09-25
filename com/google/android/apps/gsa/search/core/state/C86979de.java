package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.google.android.apps.gsa.search.core.service.p6848e.C86689k;
import com.google.android.apps.gsa.search.core.service.p6848e.p6850b.C86680a;
import com.google.android.apps.gsa.search.core.state.p6864a.C86791f;
import com.google.android.apps.gsa.search.core.state.p6864a.C86795j;
import com.google.android.apps.gsa.search.core.state.p6864a.C86803r;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88394a;
import com.google.android.apps.gsa.search.shared.service.p6936c.C88477c;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88432bc;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.state.de */
/* compiled from: PG */
public final class C86979de implements C86978dd, C86996dv {

    /* renamed from: a */
    private static final C59071e f234917a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.de");

    /* renamed from: b */
    private final C68214a f234918b;

    /* renamed from: c */
    private final C68214a f234919c;

    /* renamed from: d */
    private C86897cs f234920d;

    /* renamed from: e */
    private final C68214a f234921e;

    /* renamed from: f */
    private final C68214a f234922f;

    /* renamed from: g */
    private final C58833ax f234923g;

    /* renamed from: h */
    private final C68214a f234924h;

    /* renamed from: i */
    private final C68214a f234925i;

    /* renamed from: j */
    private final C86843bl f234926j;

    /* renamed from: k */
    private final C86689k f234927k;

    public C86979de(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C58833ax axVar, C68214a aVar5, C86689k kVar, C68214a aVar6, C86843bl blVar) {
        this.f234919c = aVar;
        this.f234921e = aVar2;
        this.f234924h = aVar3;
        this.f234922f = aVar4;
        this.f234923g = axVar;
        this.f234918b = aVar5;
        this.f234927k = kVar;
        this.f234925i = aVar6;
        this.f234926j = blVar;
    }

    /* renamed from: g */
    private final C86795j m140428g(String str) {
        return ((C86899cu) this.f234924h.mo27525b()).mo80560b(str);
    }

    /* renamed from: h */
    private final C88433bd m140429h(C88477c cVar) {
        C88432bc bcVar = (C88432bc) C88433bd.f239087e.createBuilder();
        long a = cVar.mo81991a();
        bcVar.copyOnWrite();
        C88433bd bdVar = (C88433bd) bcVar.instance;
        bdVar.f239089a |= 1;
        bdVar.f239090b = a;
        String b = cVar.mo81992b();
        bcVar.copyOnWrite();
        C88433bd bdVar2 = (C88433bd) bcVar.instance;
        b.getClass();
        bdVar2.f239089a |= 4;
        bdVar2.f239092d = b;
        int intValue = ((Integer) this.f234918b.mo27525b()).intValue();
        bcVar.copyOnWrite();
        C88433bd bdVar3 = (C88433bd) bcVar.instance;
        bdVar3.f239089a |= 2;
        bdVar3.f239091c = intValue;
        if (cVar.mo81992b().equals("search")) {
            C86897cs csVar = this.f234920d;
            csVar.getClass();
            cVar.mo81991a();
            csVar.mo80558h(bcVar);
        } else {
            cVar.mo81991a();
            ((C86897cs) this.f234919c.mo27525b()).mo80558h(bcVar);
        }
        return (C88433bd) bcVar.build();
    }

    /* renamed from: i */
    private final void m140430i() {
        C58838bb.m90884s(((C86897cs) this.f234919c.mo27525b()).mo80556f(), "Notifications for LegacyEventBus should have been suspended at this point");
    }

    /* renamed from: j */
    private final void m140431j() {
        C86897cs csVar = this.f234920d;
        if (csVar != null) {
            C58838bb.m90884s(((C87140ih) csVar).f235436f, "Notifications for SessionEventBus should have been suspended at this point");
        }
    }

    /* renamed from: k */
    private final void m140432k(Bundle bundle, String str) {
        if (str.equals("search")) {
            C86897cs csVar = this.f234920d;
            csVar.getClass();
            csVar.mo80553b(bundle);
            return;
        }
        ((C86897cs) this.f234919c.mo27525b()).mo80553b(bundle);
    }

    /* renamed from: l */
    private final void m140433l(String str) {
        if (str.equals("search")) {
            C86897cs csVar = this.f234920d;
            csVar.getClass();
            csVar.mo80554c();
            m140430i();
            return;
        }
        ((C86897cs) this.f234919c.mo27525b()).mo80554c();
        m140431j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0256 A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x025f A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x026b A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006f A[Catch:{ all -> 0x029c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0 A[SYNTHETIC, Splitter:B:34:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x021f A[Catch:{ all -> 0x029c }] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m140434m(com.google.android.apps.gsa.search.shared.service.p6936c.C88477c r20, long r21, android.os.Bundle r23, boolean r24) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r23
            java.lang.String r0 = "Reusing session "
            dagger.a r4 = r1.f234921e
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.f r4 = (com.google.android.apps.gsa.search.core.state.p6864a.C86791f) r4
            com.google.android.apps.gsa.search.shared.service.c.c r4 = r4.mo80447f()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            dagger.a r5 = r1.f234919c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.cs r5 = (com.google.android.apps.gsa.search.core.state.C86897cs) r5
            boolean r5 = r5.mo80556f()
            if (r5 != 0) goto L_0x002f
            dagger.a r5 = r1.f234919c
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.state.cs r5 = (com.google.android.apps.gsa.search.core.state.C86897cs) r5
            r5.mo80555e()
        L_0x002f:
            com.google.android.apps.gsa.search.core.state.cs r5 = r1.f234920d
            if (r5 == 0) goto L_0x003d
            r6 = r5
            com.google.android.apps.gsa.search.core.state.ih r6 = (com.google.android.apps.gsa.search.core.state.C87140ih) r6
            boolean r6 = r6.f235436f
            if (r6 != 0) goto L_0x003d
            r5.mo80555e()
        L_0x003d:
            long r5 = r4.mo81991a()     // Catch:{ all -> 0x029c }
            r8 = 0
            int r11 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0051
            int r5 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x004f
            r5 = r21
            r11 = 1
            goto L_0x0054
        L_0x004f:
            r5 = r8
            goto L_0x0053
        L_0x0051:
            r5 = r21
        L_0x0053:
            r11 = 0
        L_0x0054:
            r12 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r12 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r12     // Catch:{ all -> 0x029c }
            long r12 = r12.f239012a     // Catch:{ all -> 0x029c }
            long r14 = r4.mo81991a()     // Catch:{ all -> 0x029c }
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x006f
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 == 0) goto L_0x006d
            long r12 = r4.mo81991a()     // Catch:{ all -> 0x029c }
            int r14 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x006f
        L_0x006d:
            r12 = 1
            goto L_0x0070
        L_0x006f:
            r12 = 0
        L_0x0070:
            if (r11 != 0) goto L_0x0074
            if (r12 == 0) goto L_0x00b8
        L_0x0074:
            r13 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r13 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r13     // Catch:{ all -> 0x029c }
            java.lang.String r13 = r13.f239013b     // Catch:{ all -> 0x029c }
            java.lang.String r14 = r4.mo81992b()     // Catch:{ all -> 0x029c }
            boolean r13 = r13.equals(r14)     // Catch:{ all -> 0x029c }
            if (r13 != 0) goto L_0x00b8
            dagger.a r13 = r1.f234925i     // Catch:{ all -> 0x029c }
            java.lang.Object r13 = r13.mo27525b()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.shared.logger.f r13 = (com.google.android.apps.gsa.shared.logger.C89911f) r13     // Catch:{ all -> 0x029c }
            java.lang.RuntimeException r14 = new java.lang.RuntimeException     // Catch:{ all -> 0x029c }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x029c }
            java.lang.String r7 = r20.toString()     // Catch:{ all -> 0x029c }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x029c }
            r10.<init>(r0)     // Catch:{ all -> 0x029c }
            r10.append(r15)     // Catch:{ all -> 0x029c }
            java.lang.String r0 = " for session "
            r10.append(r0)     // Catch:{ all -> 0x029c }
            r10.append(r7)     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x029c }
            r14.<init>(r0)     // Catch:{ all -> 0x029c }
            r0 = 88807293(0x54b177d, float:9.549328E-36)
            r7 = 29
            com.google.android.apps.gsa.shared.logger.e r0 = r13.mo83755a(r14, r0, r7)     // Catch:{ all -> 0x029c }
            r0.mo83721a()     // Catch:{ all -> 0x029c }
        L_0x00b8:
            if (r12 == 0) goto L_0x00d0
            dagger.a r0 = r1.f234921e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.f r0 = (com.google.android.apps.gsa.search.core.state.p6864a.C86791f) r0
            r0.mo80444b(r2)
            if (r24 == 0) goto L_0x00cf
        L_0x00c7:
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0
            java.lang.String r0 = r0.f239013b
            r1.mo80621f(r0)
        L_0x00cf:
            return
        L_0x00d0:
            com.google.common.base.ax r0 = r1.f234923g     // Catch:{ all -> 0x029c }
            boolean r0 = r0.mo56113h()     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0276
            com.google.common.base.ax r0 = r1.f234923g     // Catch:{ all -> 0x029c }
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ all -> 0x029c }
            dagger.a r0 = (dagger.C68214a) r0     // Catch:{ all -> 0x029c }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x029c }
            r7 = r0
            com.google.android.apps.gsa.search.core.service.e.b.a r7 = (com.google.android.apps.gsa.search.core.service.p6848e.p6850b.C86680a) r7     // Catch:{ all -> 0x029c }
            long r10 = r4.mo81991a()     // Catch:{ all -> 0x029c }
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0     // Catch:{ all -> 0x029c }
            long r12 = r0.f239012a     // Catch:{ all -> 0x029c }
            java.lang.String r14 = "search"
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0164
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0164
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = r4.mo81992b()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.a.j r0 = r1.m140428g(r0)     // Catch:{ all -> 0x029c }
            boolean r0 = r0.mo80456J()     // Catch:{ all -> 0x029c }
            if (r0 != 0) goto L_0x014b
            com.google.android.apps.gsa.search.shared.service.c.b.bd r0 = r1.m140429h(r4)     // Catch:{ all -> 0x029c }
            r7.mo80286c(r0)     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r4.mo81992b()     // Catch:{ all -> 0x029c }
            r10 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r10 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r10     // Catch:{ all -> 0x029c }
            java.lang.String r10 = r10.f239013b     // Catch:{ all -> 0x029c }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x029c }
            if (r0 != 0) goto L_0x0164
            java.lang.String r0 = r4.mo81992b()     // Catch:{ all -> 0x029c }
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x029c }
            if (r0 != 0) goto L_0x0137
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r0.f239013b     // Catch:{ all -> 0x029c }
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x029c }
            if (r0 == 0) goto L_0x0164
        L_0x0137:
            java.lang.String r0 = r4.mo81992b()     // Catch:{ all -> 0x029c }
            r10 = 0
            r1.m140432k(r10, r0)     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r4.mo81992b()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.a.j r0 = r1.m140428g(r0)     // Catch:{ all -> 0x029c }
            r0.mo80463r()     // Catch:{ all -> 0x029c }
            goto L_0x0164
        L_0x014b:
            long r10 = r4.mo81991a()     // Catch:{ all -> 0x029c }
            dagger.a r0 = r1.f234921e     // Catch:{ all -> 0x029c }
            java.lang.Object r0 = r0.mo27525b()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.a.f r0 = (com.google.android.apps.gsa.search.core.state.p6864a.C86791f) r0     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.shared.service.ClientConfig r0 = r0.mo80446e()     // Catch:{ all -> 0x029c }
            boolean r0 = r0.mo81888f()     // Catch:{ all -> 0x029c }
            if (r0 != 0) goto L_0x0164
            r7.mo80285b(r10)     // Catch:{ all -> 0x029c }
        L_0x0164:
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x029c }
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0     // Catch:{ all -> 0x029c }
            long r11 = r0.f239012a     // Catch:{ all -> 0x029c }
            java.lang.String r13 = "LegacySessionManager"
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01b6
            long r17 = r4.mo81991a()     // Catch:{ all -> 0x029c }
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x017c
            r11 = r8
            r0 = 0
            goto L_0x01b7
        L_0x017c:
            r17 = 1
            int r0 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x0184
            r11 = r8
            goto L_0x01b6
        L_0x0184:
            com.google.android.apps.gsa.shared.s.a.a r0 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ all -> 0x029c }
            com.google.common.base.ax r10 = r7.mo80284a(r5)     // Catch:{ Exception -> 0x018e }
            r7.mo80285b(r5)     // Catch:{ Exception -> 0x018e }
            goto L_0x01b6
        L_0x018e:
            r0 = move-exception
            goto L_0x0192
        L_0x0190:
            r0 = move-exception
            goto L_0x01b5
        L_0x0192:
            com.google.common.f.e r4 = f234917a     // Catch:{ all -> 0x0190 }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x0190 }
            com.google.common.f.aa r15 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0190 }
            r4.mo56378ag(r15, r13)     // Catch:{ all -> 0x0190 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x0190 }
            com.google.common.f.x r0 = r4.mo56382g(r0)     // Catch:{ all -> 0x0190 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0190 }
            r4 = 8736(0x2220, float:1.2242E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r4)     // Catch:{ all -> 0x0190 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0190 }
            java.lang.String r4 = "updateSessionInEventBus: Failed to restore session[%d]"
            r0.mo56388r(r4, r5)     // Catch:{ all -> 0x0190 }
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a     // Catch:{ all -> 0x0190 }
            goto L_0x01b6
        L_0x01b5:
            throw r0     // Catch:{ all -> 0x029c }
        L_0x01b6:
            r0 = 1
        L_0x01b7:
            int r4 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x01cb
            boolean r4 = r10.mo56113h()     // Catch:{ all -> 0x029c }
            if (r4 != 0) goto L_0x01cb
            boolean r4 = r7.mo80287d(r11)     // Catch:{ all -> 0x029c }
            if (r4 == 0) goto L_0x01cb
            com.google.common.base.ax r10 = r7.mo80284a(r11)     // Catch:{ all -> 0x029c }
        L_0x01cb:
            boolean r4 = r10.mo56113h()     // Catch:{ all -> 0x029c }
            if (r4 == 0) goto L_0x0219
            r4 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r4 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r4     // Catch:{ all -> 0x029c }
            java.lang.String r4 = r4.f239013b     // Catch:{ all -> 0x029c }
            java.lang.Object r5 = r10.mo56107c()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.shared.service.c.b.bd r5 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd) r5     // Catch:{ all -> 0x029c }
            java.lang.String r5 = r5.f239092d     // Catch:{ all -> 0x029c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x029c }
            if (r4 != 0) goto L_0x0219
            com.google.common.f.e r4 = f234917a     // Catch:{ all -> 0x029c }
            com.google.common.f.x r4 = r4.mo56226d()     // Catch:{ all -> 0x029c }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x029c }
            r4.mo56378ag(r5, r13)     // Catch:{ all -> 0x029c }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x029c }
            r5 = 8733(0x221d, float:1.2238E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x029c }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x029c }
            java.lang.String r5 = "updateSessionInEventBus: session types mismatch. Expected %s but found %s for id %d"
            r6 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r6 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r6     // Catch:{ all -> 0x029c }
            java.lang.String r6 = r6.f239013b     // Catch:{ all -> 0x029c }
            java.lang.Object r7 = r10.mo56107c()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.shared.service.c.b.bd r7 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd) r7     // Catch:{ all -> 0x029c }
            java.lang.String r7 = r7.f239092d     // Catch:{ all -> 0x029c }
            java.lang.Object r8 = r10.mo56107c()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.shared.service.c.b.bd r8 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd) r8     // Catch:{ all -> 0x029c }
            long r8 = r8.f239090b     // Catch:{ all -> 0x029c }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x029c }
            r4.mo56359L(r5, r6, r7, r8)     // Catch:{ all -> 0x029c }
            com.google.common.base.b r10 = com.google.common.base.C58836b.f156633a     // Catch:{ all -> 0x029c }
        L_0x0219:
            boolean r4 = r10.mo56113h()     // Catch:{ all -> 0x029c }
            if (r4 == 0) goto L_0x026b
            java.lang.Object r0 = r10.mo56107c()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.shared.service.c.b.bd r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88433bd) r0     // Catch:{ all -> 0x029c }
            dagger.a r3 = r1.f234919c     // Catch:{ all -> 0x029c }
            java.lang.Object r3 = r3.mo27525b()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.cs r3 = (com.google.android.apps.gsa.search.core.state.C86897cs) r3     // Catch:{ all -> 0x029c }
            boolean r3 = r3.mo80556f()     // Catch:{ all -> 0x029c }
            com.google.common.base.C58838bb.m90883r(r3)     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.cs r3 = r1.f234920d     // Catch:{ all -> 0x029c }
            if (r3 == 0) goto L_0x0241
            com.google.android.apps.gsa.search.core.state.ih r3 = (com.google.android.apps.gsa.search.core.state.C87140ih) r3     // Catch:{ all -> 0x029c }
            boolean r3 = r3.f235436f     // Catch:{ all -> 0x029c }
            if (r3 == 0) goto L_0x023f
            goto L_0x0241
        L_0x023f:
            r7 = 0
            goto L_0x0242
        L_0x0241:
            r7 = 1
        L_0x0242:
            com.google.common.base.C58838bb.m90883r(r7)     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.service.e.k r3 = r1.f234927k     // Catch:{ all -> 0x029c }
            int r3 = r3.mo80301a(r0)     // Catch:{ all -> 0x029c }
            r4 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r4 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r4     // Catch:{ all -> 0x029c }
            java.lang.String r4 = r4.f239013b     // Catch:{ all -> 0x029c }
            boolean r4 = r4.equals(r14)     // Catch:{ all -> 0x029c }
            if (r4 == 0) goto L_0x025f
            com.google.android.apps.gsa.search.core.state.cs r4 = r1.f234920d     // Catch:{ all -> 0x029c }
            r4.getClass()
            r4.mo80557g(r0, r3)     // Catch:{ all -> 0x029c }
            goto L_0x0280
        L_0x025f:
            dagger.a r4 = r1.f234919c     // Catch:{ all -> 0x029c }
            java.lang.Object r4 = r4.mo27525b()     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.cs r4 = (com.google.android.apps.gsa.search.core.state.C86897cs) r4     // Catch:{ all -> 0x029c }
            r4.mo80557g(r0, r3)     // Catch:{ all -> 0x029c }
            goto L_0x0280
        L_0x026b:
            if (r0 == 0) goto L_0x0280
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r0.f239013b     // Catch:{ all -> 0x029c }
            r1.m140432k(r3, r0)     // Catch:{ all -> 0x029c }
            goto L_0x0280
        L_0x0276:
            if (r11 != 0) goto L_0x0280
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r0.f239013b     // Catch:{ all -> 0x029c }
            r1.m140432k(r3, r0)     // Catch:{ all -> 0x029c }
        L_0x0280:
            r0 = r2
            com.google.android.apps.gsa.search.shared.service.c.a r0 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r0     // Catch:{ all -> 0x029c }
            java.lang.String r0 = r0.f239013b     // Catch:{ all -> 0x029c }
            com.google.android.apps.gsa.search.core.state.a.j r0 = r1.m140428g(r0)     // Catch:{ all -> 0x029c }
            r0.mo80463r()     // Catch:{ all -> 0x029c }
            dagger.a r0 = r1.f234921e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.f r0 = (com.google.android.apps.gsa.search.core.state.p6864a.C86791f) r0
            r0.mo80444b(r2)
            if (r24 == 0) goto L_0x029b
            goto L_0x00c7
        L_0x029b:
            return
        L_0x029c:
            r0 = move-exception
            dagger.a r3 = r1.f234921e
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.search.core.state.a.f r3 = (com.google.android.apps.gsa.search.core.state.p6864a.C86791f) r3
            r3.mo80444b(r2)
            if (r24 == 0) goto L_0x02b1
            com.google.android.apps.gsa.search.shared.service.c.a r2 = (com.google.android.apps.gsa.search.shared.service.p6936c.C88394a) r2
            java.lang.String r2 = r2.f239013b
            r1.mo80621f(r2)
        L_0x02b1:
            goto L_0x02b3
        L_0x02b2:
            throw r0
        L_0x02b3:
            goto L_0x02b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.state.C86979de.m140434m(com.google.android.apps.gsa.search.shared.service.c.c, long, android.os.Bundle, boolean):void");
    }

    /* renamed from: a */
    public final void mo80616a(C86897cs csVar) {
        if (this.f234920d == null) {
            this.f234920d = csVar;
        }
    }

    /* renamed from: b */
    public final void mo80617b(long j) {
        String str = ((C86791f) this.f234921e.mo27525b()).mo80446e().f236953f;
        long a = ((C86791f) this.f234921e.mo27525b()).mo80447f().mo81991a();
        if (this.f234923g.mo56113h()) {
            C86680a aVar = (C86680a) ((C68214a) this.f234923g.mo56107c()).mo27525b();
            C58976aa aaVar = C58975e.f156826a;
            if (j == a) {
                aVar.mo80286c(m140429h(new C88394a(j, str)));
            }
        }
    }

    /* renamed from: c */
    public final void mo80618c(C88477c cVar, long j, Bundle bundle) {
        m140434m(cVar, j, bundle, false);
        m140430i();
        m140431j();
    }

    /* renamed from: d */
    public final boolean mo80619d(C88477c cVar) {
        Query i = m140428g(((C88394a) cVar).f239013b).mo80460i();
        boolean z = ((C86803r) this.f234922f.mo27525b()).mo80509n() && i.mo84466dt();
        boolean dD = i.mo84423dD();
        C58976aa aaVar = C58975e.f156826a;
        if (z || dD) {
            return false;
        }
        mo80618c(new C88394a(0, "none"), 1, (Bundle) null);
        return true;
    }

    /* renamed from: e */
    public final void mo80620e(C88477c cVar, Bundle bundle) {
        m140434m(cVar, 1, bundle, true);
    }

    /* renamed from: f */
    public final void mo80621f(String str) {
        String b = ((C86791f) this.f234921e.mo27525b()).mo80447f().mo81992b();
        m140430i();
        m140431j();
        C58838bb.m90890y(b.equals(str), "Incorrect state..SessionType global [%s], Session type in SessionManager [%s]", b, str);
        try {
            this.f234926j.mo80535a();
        } finally {
            m140433l(str);
        }
    }
}
