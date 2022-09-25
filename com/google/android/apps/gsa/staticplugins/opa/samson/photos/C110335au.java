package com.google.android.apps.gsa.staticplugins.opa.samson.photos;

import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.photos.au */
/* compiled from: PG */
final class C110335au implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C58833ax f307537a;

    /* renamed from: b */
    final /* synthetic */ C110340az f307538b;

    /* renamed from: c */
    final /* synthetic */ C110370cb f307539c;

    public C110335au(C110340az azVar, C58833ax axVar, C110370cb cbVar) {
        this.f307538b = azVar;
        this.f307537a = axVar;
        this.f307539c = cbVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x c = C110340az.f307542a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "BDSCtrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(25856)).mo56386p("failure");
    }

    /* JADX WARNING: type inference failed for: r1v12, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r1v15, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r3v23, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0053, code lost:
        if (com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110346be.m183748a(r5, r4).resolveActivity(r5.getPackageManager()) != null) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b6  */
    /* renamed from: gm */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo17702gm(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.List r1 = (java.util.List) r1
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2 = 0
            java.lang.Object r2 = r1.get(r2)
            com.google.m.a.b.a.v r2 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r2
            r3 = 1
            java.lang.Object r1 = r1.get(r3)
            com.google.m.a.b.a.ad r1 = (com.google.p4715m.p4716a.p4720b.p4721a.C62665ad) r1
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.az r4 = r0.f307538b
            dagger.a r4 = r4.f307548g
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.search.core.google.gaia.o r4 = (com.google.android.apps.gsa.search.core.google.gaia.C86054o) r4
            java.lang.String r4 = r4.mo79659F()
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.az r5 = r0.f307538b
            dagger.a r5 = r5.f307545d
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.search.core.i.t r5 = (com.google.android.apps.gsa.search.core.p6805i.C86124t) r5
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90014bt.f247249db
            boolean r5 = r5.mo79746e(r6)
            r7 = 2
            if (r5 == 0) goto L_0x012c
            if (r4 == 0) goto L_0x0055
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.az r5 = r0.f307538b
            dagger.a r5 = r5.f307546e
            java.lang.Object r5 = r5.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.be r5 = (com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110346be) r5
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.az r5 = r0.f307538b
            android.content.Context r5 = r5.f307543b
            android.content.pm.PackageManager r8 = r5.getPackageManager()
            android.content.Intent r5 = com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110346be.m183748a(r5, r4)
            android.content.ComponentName r5 = r5.resolveActivity(r8)
            if (r5 == 0) goto L_0x012c
        L_0x0055:
            com.google.common.base.ax r5 = r0.f307537a
            boolean r8 = r5.mo56113h()
            if (r8 == 0) goto L_0x0176
            java.lang.Object r5 = r5.mo56107c()
            java.lang.String r5 = (java.lang.String) r5
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.cb r8 = r0.f307539c
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.google.protobuf.cq r10 = r2.f169263b
            java.util.Iterator r10 = r10.iterator()
            r11 = -1
            r12 = 0
            r13 = -1
        L_0x0073:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L_0x00f6
            java.lang.Object r14 = r10.next()
            com.google.m.a.b.a.f r14 = (com.google.p4715m.p4716a.p4720b.p4721a.C62678f) r14
            java.lang.String r15 = r14.f169222f
            boolean r15 = r5.equals(r15)
            if (r15 == 0) goto L_0x00e1
            com.google.protobuf.cq r12 = r1.f169192a
            int r12 = r12.size()
            if (r12 <= r3) goto L_0x00df
            com.google.protobuf.bn r12 = r14.toBuilder()
            com.google.m.a.b.a.c r12 = (com.google.p4715m.p4716a.p4720b.p4721a.C62675c) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r14 = r12.instance
            com.google.m.a.b.a.f r14 = (com.google.p4715m.p4716a.p4720b.p4721a.C62678f) r14
            r14.f169226j = r7
            int r15 = r14.f169217a
            r15 = r15 | 1024(0x400, float:1.435E-42)
            r14.f169217a = r15
            com.google.protobuf.cq r14 = r1.f169192a
            java.util.Iterator r14 = r14.iterator()
        L_0x00aa:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x00d7
            java.lang.Object r15 = r14.next()
            com.google.m.a.b.a.ac r15 = (com.google.p4715m.p4716a.p4720b.p4721a.C62664ac) r15
            java.lang.String r15 = r15.f169188a
            r12.copyOnWrite()
            com.google.protobuf.bv r6 = r12.instance
            com.google.m.a.b.a.f r6 = (com.google.p4715m.p4716a.p4720b.p4721a.C62678f) r6
            r15.getClass()
            com.google.protobuf.cq r3 = r6.f169224h
            boolean r16 = r3.mo58948c()
            if (r16 != 0) goto L_0x00d0
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)
            r6.f169224h = r3
        L_0x00d0:
            com.google.protobuf.cq r3 = r6.f169224h
            r3.add(r15)
            r3 = 1
            goto L_0x00aa
        L_0x00d7:
            com.google.protobuf.bv r3 = r12.build()
            r12 = r3
            com.google.m.a.b.a.f r12 = (com.google.p4715m.p4716a.p4720b.p4721a.C62678f) r12
            goto L_0x00f3
        L_0x00df:
            r12 = r14
            goto L_0x0073
        L_0x00e1:
            int r3 = r14.f169226j
            int r3 = com.google.p4715m.p4716a.p4720b.p4721a.C62677e.m94899a(r3)
            if (r3 != 0) goto L_0x00ea
            goto L_0x00f0
        L_0x00ea:
            if (r3 != r7) goto L_0x00f0
            int r13 = r9.size()
        L_0x00f0:
            r9.add(r14)
        L_0x00f3:
            r3 = 1
            goto L_0x0073
        L_0x00f6:
            if (r12 == 0) goto L_0x0176
            if (r13 != r11) goto L_0x00fc
            goto L_0x0176
        L_0x00fc:
            r9.set(r13, r12)
            com.google.protobuf.bn r1 = r2.toBuilder()
            com.google.m.a.b.a.u r1 = (com.google.p4715m.p4716a.p4720b.p4721a.C62693u) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.m.a.b.a.v r2 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r2
            com.google.protobuf.cq r3 = com.google.p4715m.p4716a.p4720b.p4721a.C62694v.emptyProtobufList()
            r2.f169263b = r3
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.m.a.b.a.v r2 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r2
            r2.mo58575a()
            com.google.protobuf.cq r2 = r2.f169263b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r2)
            com.google.protobuf.bv r1 = r1.build()
            r2 = r1
            com.google.m.a.b.a.v r2 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r2
            r8.mo98600a(r12)
            goto L_0x0176
        L_0x012c:
            com.google.protobuf.bn r1 = r2.toBuilder()
            com.google.m.a.b.a.u r1 = (com.google.p4715m.p4716a.p4720b.p4721a.C62693u) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.m.a.b.a.v r3 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r3
            com.google.protobuf.cq r5 = com.google.p4715m.p4716a.p4720b.p4721a.C62694v.emptyProtobufList()
            r3.f169263b = r5
            com.google.protobuf.cq r2 = r2.f169263b
            java.util.Iterator r2 = r2.iterator()
        L_0x0145:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x016f
            java.lang.Object r3 = r2.next()
            com.google.m.a.b.a.f r3 = (com.google.p4715m.p4716a.p4720b.p4721a.C62678f) r3
            int r5 = r3.f169226j
            int r5 = com.google.p4715m.p4716a.p4720b.p4721a.C62677e.m94899a(r5)
            if (r5 != 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            if (r5 == r7) goto L_0x0145
        L_0x015c:
            r1.copyOnWrite()
            com.google.protobuf.bv r5 = r1.instance
            com.google.m.a.b.a.v r5 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r5
            r3.getClass()
            r5.mo58575a()
            com.google.protobuf.cq r5 = r5.f169263b
            r5.add(r3)
            goto L_0x0145
        L_0x016f:
            com.google.protobuf.bv r1 = r1.build()
            r2 = r1
            com.google.m.a.b.a.v r2 = (com.google.p4715m.p4716a.p4720b.p4721a.C62694v) r2
        L_0x0176:
            com.google.protobuf.cq r1 = r2.f169263b
            boolean r1 = r1.isEmpty()
            r3 = 1
            r1 = r1 ^ r3
            if (r4 == 0) goto L_0x01a1
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.az r3 = r0.f307538b
            dagger.a r3 = r3.f307544c
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.bt r3 = (com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt) r3
            dagger.a r3 = r3.f307591a
            java.lang.Object r3 = r3.mo27525b()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r4 = com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt.m183756c(r4)
            android.content.SharedPreferences$Editor r1 = r3.putBoolean(r4, r1)
            r1.apply()
        L_0x01a1:
            com.google.android.apps.gsa.staticplugins.opa.samson.photos.cb r1 = r0.f307539c
            int r3 = r2.f169262a
            r4 = r3 & 2
            if (r4 == 0) goto L_0x01ac
            java.lang.String r4 = r2.f169264c
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            r1.f307612d = r4
            r3 = r3 & 4
            if (r3 == 0) goto L_0x01b6
            java.lang.String r6 = r2.f169265d
            goto L_0x01b7
        L_0x01b6:
            r6 = 0
        L_0x01b7:
            r1.f307613e = r6
            com.google.protobuf.cq r2 = r2.f169263b
            androidx.lifecycle.ag r1 = r1.f307609a
            r1.mo5708l(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110335au.mo17702gm(java.lang.Object):void");
    }
}
