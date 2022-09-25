package com.google.android.apps.gsa.staticplugins.hotwordenrollment;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g.C101837e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.o */
/* compiled from: PG */
final class C101893o implements C101837e {

    /* renamed from: a */
    final /* synthetic */ Bundle f284208a;

    /* renamed from: b */
    final /* synthetic */ C101894p f284209b;

    public C101893o(C101894p pVar, Bundle bundle) {
        this.f284209b = pVar;
        this.f284208a = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0158, code lost:
        if (com.google.android.apps.gsa.p5855h.p5861s.C74548ak.m120541b(r0.f284217h.mo70888f().mo70866c()) == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x016d, code lost:
        if (r0.f284217h.mo70885c().mo70898b() != com.google.android.apps.gsa.h.s.z.c) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x017a, code lost:
        if (r0.f284217h.mo70887e().mo70857f() == false) goto L_0x017c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92613a() {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p r0 = r13.f284209b
            android.os.Bundle r1 = r13.f284208a
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101894p.f284210a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "EnrollmentRootFragm"
            r2.mo56378ag(r3, r4)
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0017
            r1 = 1
            goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6 = 20242(0x4f12, float:2.8365E-41)
            java.lang.String r7 = "#startEnrollment, has savedInstanceState: %b"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56389s(r7, r1)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.l r1 = r0.f284215f
            g.a.a r2 = r1.f284156a
            java.lang.Object r2 = r2.mo17428b()
            com.google.android.apps.gsa.h.s.u r2 = (com.google.android.apps.gsa.p5855h.p5861s.C74555u) r2
            r2.getClass()
            g.a.a r6 = r1.f284157b
            java.lang.Object r6 = r6.mo17428b()
            com.google.android.apps.gsa.shared.m.b.f r6 = (com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f) r6
            r6.getClass()
            g.a.a r7 = r1.f284158c
            java.lang.Object r7 = r7.mo17428b()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            r7.getClass()
            g.a.a r8 = r1.f284159d
            java.lang.Object r8 = r8.mo17428b()
            com.google.android.apps.gsa.assistant.shared.bm r8 = (com.google.android.apps.gsa.assistant.shared.bm) r8
            r8.getClass()
            g.a.a r9 = r1.f284160e
            java.lang.Object r9 = r9.mo17428b()
            com.google.android.apps.gsa.search.core.i.t r9 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r9
            r9.getClass()
            g.a.a r1 = r1.f284161f
            java.lang.Object r1 = r1.mo17428b()
            com.google.android.apps.gsa.shared.speech.hotword.a.f r1 = (com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f) r1
            r1.getClass()
            boolean r9 = r8.s()
            boolean r8 = r8.q()
            java.lang.String r10 = "hotwordDetector"
            boolean r7 = r7.getBoolean(r10, r5)
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r10 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d.f257600g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.a r10 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92377a) r10
            r11 = 2
            if (r5 == r9) goto L_0x0082
            r9 = 2
            goto L_0x0083
        L_0x0082:
            r9 = 3
        L_0x0083:
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r12 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d) r12
            int r9 = r9 + -1
            r12.f257603b = r9
            int r9 = r12.f257602a
            r9 = r9 | r5
            r12.f257602a = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r9 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d) r9
            int r12 = r9.f257602a
            r12 = r12 | r11
            r9.f257602a = r12
            r9.f257604c = r3
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r9 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d) r9
            int r12 = r9.f257602a
            r12 = r12 | 4
            r9.f257602a = r12
            r9.f257605d = r8
            r10.copyOnWrite()
            com.google.protobuf.bv r8 = r10.instance
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r8 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d) r8
            int r9 = r8.f257602a
            r9 = r9 | 8
            r8.f257602a = r9
            r8.f257606e = r7
            java.lang.String r7 = r6.mo83863Z()
            boolean r6 = r6.mo83833v(r1, r7)
            boolean r2 = r2.mo70891j()
            if (r2 != 0) goto L_0x00d5
            com.google.android.apps.gsa.shared.speech.hotword.a.f r2 = com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f.OK_HEY_GOOGLE
            if (r1 != r2) goto L_0x00d5
            if (r6 != 0) goto L_0x00d5
            r1 = 1
            goto L_0x00d6
        L_0x00d5:
            r1 = 0
        L_0x00d6:
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r2 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d) r2
            int r6 = r2.f257602a
            r6 = r6 | 16
            r2.f257602a = r6
            r2.f257607f = r1
            com.google.protobuf.bv r1 = r10.build()
            com.google.android.apps.gsa.speech.hotword.enrollmentutils.a.d r1 = (com.google.android.apps.gsa.speech.hotword.enrollmentutils.p7290a.C92380d) r1
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101869k.f284151a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r7 = "EnrollmentConfigProv"
            r2.mo56378ag(r6, r7)
            java.lang.StringBuilder r6 = com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n.m151742d(r1)
            r7 = 20231(0x4f07, float:2.835E-41)
            java.lang.String r8 = "Enrollment Config: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r7)).mo56389s(r8, r6)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r2 = r0.f284211b
            android.support.v4.app.am r2 = r2.getActivity()
            if (r2 == 0) goto L_0x01f7
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r2 = r0.f284211b
            android.support.v4.app.am r2 = r2.getActivity()
            boolean r2 = r2.isFinishing()
            if (r2 != 0) goto L_0x01f7
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r2 = r0.f284211b
            android.support.v4.app.am r2 = r2.getActivity()
            boolean r2 = r2.isDestroyed()
            if (r2 == 0) goto L_0x0125
            goto L_0x01f7
        L_0x0125:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r2 = r0.f284218i
            com.google.assistant.at.act r2 = r2.mo92637b()
            r6 = 0
            if (r2 == 0) goto L_0x019d
            com.google.assistant.at.ls r2 = r2.f128879F
            if (r2 != 0) goto L_0x0134
            com.google.assistant.at.ls r2 = com.google.assistant.p3861at.C50131ls.f130322b
        L_0x0134:
            boolean r2 = r2.f130324a
            if (r2 == 0) goto L_0x019d
            com.google.android.apps.gsa.h.s.s r1 = com.google.android.apps.gsa.h.s.s.a
            com.google.android.apps.gsa.h.s.u r1 = r0.f284217h
            com.google.android.apps.gsa.h.s.s r1 = r1.mo70884b()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0170
            if (r1 == r5) goto L_0x0161
            if (r1 != r11) goto L_0x015b
            com.google.android.apps.gsa.h.s.u r1 = r0.f284217h
            com.google.android.apps.gsa.h.s.aj r1 = r1.mo70888f()
            int r1 = r1.mo70866c()
            boolean r1 = com.google.android.apps.gsa.p5855h.p5861s.C74548ak.m120541b(r1)
            if (r1 != 0) goto L_0x0190
            goto L_0x017c
        L_0x015b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0161:
            com.google.android.apps.gsa.h.s.u r1 = r0.f284217h
            com.google.android.apps.gsa.h.s.y r1 = r1.mo70885c()
            com.google.android.apps.gsa.h.s.z r1 = r1.mo70898b()
            com.google.android.apps.gsa.h.s.z r2 = com.google.android.apps.gsa.h.s.z.c
            if (r1 == r2) goto L_0x0190
            goto L_0x017c
        L_0x0170:
            com.google.android.apps.gsa.h.s.u r1 = r0.f284217h
            com.google.android.apps.gsa.h.s.ae r1 = r1.mo70887e()
            boolean r1 = r1.mo70857f()
            if (r1 != 0) goto L_0x0190
        L_0x017c:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r1 = r0.f284211b
            android.content.Context r1 = r1.getContext()
            android.content.Context r1 = r1.getApplicationContext()
            r2 = 2132088077(0x7f15150d, float:1.9816427E38)
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r5)
            r1.show()
        L_0x0190:
            com.google.android.apps.gsa.shared.logger.b.i r1 = r0.f284220k
            com.google.android.apps.gsa.shared.logger.b.ae r2 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_ADMIN_DISABLED_EXIT
            r1.mo83702b(r2)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.j r0 = r0.f284216g
            r0.mo92569b(r3, r6)
            return
        L_0x019d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.n r2 = r0.f284211b
            android.support.v4.app.FragmentManager r2 = r2.getChildFragmentManager()
            if (r2 == 0) goto L_0x01e4
            android.support.v4.app.Fragment r4 = r0.mo92676a()
            if (r4 != 0) goto L_0x01e3
            com.google.apps.tiktok.tracing.bx r4 = com.google.apps.tiktok.tracing.C47831fm.m85028w()
            android.support.v4.app.a r7 = new android.support.v4.app.a     // Catch:{ all -> 0x01c7 }
            r7.<init>((android.support.p031v4.app.FragmentManager) r2)     // Catch:{ all -> 0x01c7 }
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a r0 = r0.f284221l     // Catch:{ all -> 0x01c7 }
            android.support.v4.app.Fragment r0 = r0.mo92354a(r1)     // Catch:{ all -> 0x01c7 }
            r1 = 2131430447(0x7f0b0c2f, float:1.8482595E38)
            r7.mo689v(r1, r0, r6)     // Catch:{ all -> 0x01c7 }
            r7.mo505b(r5)     // Catch:{ all -> 0x01c7 }
            r4.close()
            return
        L_0x01c7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01cc }
            goto L_0x01e2
        L_0x01cc:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x01e2 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r2[r3] = r4     // Catch:{ Exception -> 0x01e2 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r2 = r4.getDeclaredMethod(r6, r2)     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x01e2 }
            r4[r3] = r1     // Catch:{ Exception -> 0x01e2 }
            r2.invoke(r0, r4)     // Catch:{ Exception -> 0x01e2 }
        L_0x01e2:
            throw r0
        L_0x01e3:
            return
        L_0x01e4:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101894p.f284210a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "ChildFragmentManager of root fragment is null!"
            r2 = 20244(0x4f14, float:2.8368E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        L_0x01f7:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101894p.f284210a
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r1, r4)
            java.lang.String r1 = "The activity is/will be destroyed. Don't Start enrollment!"
            r2 = 20243(0x4f13, float:2.8366E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101893o.mo92613a():void");
    }

    /* renamed from: b */
    public final void mo92614b(Intent intent) {
        this.f284209b.f284216g.mo92569b(2, intent);
    }
}
