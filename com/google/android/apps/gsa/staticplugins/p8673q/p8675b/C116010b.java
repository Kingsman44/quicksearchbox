package com.google.android.apps.gsa.staticplugins.p8673q.p8675b;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88461k;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.q.b.b */
/* compiled from: PG */
final class C116010b implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C88461k f321682a;

    /* renamed from: b */
    final /* synthetic */ long f321683b;

    /* renamed from: c */
    final /* synthetic */ C116011c f321684c;

    public C116010b(C116011c cVar, C88461k kVar, long j) {
        this.f321684c = cVar;
        this.f321682a = kVar;
        this.f321683b = j;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C116011c.f321685a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AutobotSessionCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(14101)).mo56386p("Error preparing CCT intent");
        this.f321684c.mo102407c(this.f321682a);
        this.f321684c.mo102406a(this.f321683b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0029, code lost:
        if (com.google.android.apps.gsa.shared.util.C90773bq.m148324f(r0.f321686c.getPackageManager().getPackageInfo(r1, 0).versionName, r2.f239151d) != false) goto L_0x0049;
     */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo17702gm(java.lang.Object r5) {
        /*
            r4 = this;
            android.content.Intent r5 = (android.content.Intent) r5
            r5.getClass()
            com.google.android.apps.gsa.staticplugins.q.b.c r0 = r4.f321684c
            java.lang.String r1 = r5.getPackage()
            r1.getClass()
            com.google.android.apps.gsa.search.shared.service.c.b.k r2 = r4.f321682a
            int r3 = r2.f239148a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0049
            android.content.Context r0 = r0.f321686c     // Catch:{ NameNotFoundException -> 0x002c }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002c }
            r3 = 0
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x002c }
            java.lang.String r0 = r0.versionName     // Catch:{ NameNotFoundException -> 0x002c }
            java.lang.String r2 = r2.f239151d     // Catch:{ NameNotFoundException -> 0x002c }
            boolean r0 = com.google.android.apps.gsa.shared.util.C90773bq.m148324f(r0, r2)     // Catch:{ NameNotFoundException -> 0x002c }
            if (r0 == 0) goto L_0x0041
            goto L_0x0049
        L_0x002c:
            r5 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p8673q.p8675b.C116011c.f321685a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "AutobotSessionCtrl"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Could not find package %s"
            r3 = 14104(0x3718, float:1.9764E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r5)).mo56372aa(r3)).mo56389s(r2, r1)
        L_0x0041:
            com.google.android.apps.gsa.staticplugins.q.b.c r5 = r4.f321684c
            com.google.android.apps.gsa.search.shared.service.c.b.k r0 = r4.f321682a
            r5.mo102407c(r0)
            goto L_0x0050
        L_0x0049:
            com.google.android.apps.gsa.staticplugins.q.b.c r0 = r4.f321684c
            com.google.android.apps.gsa.shared.util.t.g r0 = r0.f321687d
            r0.mo65089a(r5)
        L_0x0050:
            com.google.android.apps.gsa.staticplugins.q.b.c r5 = r4.f321684c
            long r0 = r4.f321683b
            r5.mo102406a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p8673q.p8675b.C116010b.mo17702gm(java.lang.Object):void");
    }
}
