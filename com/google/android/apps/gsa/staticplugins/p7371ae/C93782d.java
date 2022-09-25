package com.google.android.apps.gsa.staticplugins.p7371ae;

import com.google.android.apps.gsa.shared.util.p7159c.C90880an;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.d */
/* compiled from: PG */
final class C93782d extends C90880an {

    /* renamed from: a */
    final /* synthetic */ boolean f261721a;

    /* renamed from: b */
    final /* synthetic */ C93786h f261722b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93782d(C93786h hVar, boolean z) {
        super("getLocationpromptBenefitsForCommittedQuery", 2, 8);
        this.f261722b = hVar;
        this.f261721a = z;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [com.google.protobuf.bv] */
    /* JADX WARNING: type inference failed for: r1v25, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005e, code lost:
        if (true != r2) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        if (r10 == 3) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0048, code lost:
        if (r2 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004d, code lost:
        r17 = 3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r18 = this;
            r0 = r18
            com.google.android.apps.gsa.staticplugins.ae.h r1 = r0.f261722b
            boolean r2 = r0.f261721a
            dagger.a r1 = r1.f261734b
            java.lang.Object r1 = r1.mo27525b()
            com.google.android.apps.gsa.staticplugins.ae.bb r1 = (com.google.android.apps.gsa.staticplugins.p7371ae.C93743bb) r1
            com.google.android.apps.gsa.search.core.google.bd r3 = r1.f261620c
            r4 = 1
            boolean r3 = r3.mo79514e(r4)
            android.content.SharedPreferences r5 = r1.f261618a
            java.lang.String r6 = "last_transition_type"
            r7 = 0
            int r5 = r5.getInt(r6, r7)
            int r5 = com.google.common.p4552o.C60575uz.m92622a(r5)
            android.content.SharedPreferences r8 = r1.f261618a
            java.lang.String r9 = "last_transition_time_millis"
            r10 = 0
            long r12 = r8.getLong(r9, r10)
            com.google.android.libraries.f.a r8 = r1.f261619b
            long r14 = r8.mo26870b()
            com.google.android.apps.gsa.search.core.google.bd r8 = r1.f261620c
            boolean r8 = r8.mo79514e(r4)
            android.content.SharedPreferences r10 = r1.f261618a
            int r10 = r10.getInt(r6, r7)
            int r10 = com.google.common.p4552o.C60575uz.m92622a(r10)
            r7 = 4
            r11 = 2
            if (r10 != r4) goto L_0x0053
            if (r8 == 0) goto L_0x0050
            if (r2 == 0) goto L_0x004d
        L_0x004a:
            r17 = 2
            goto L_0x0071
        L_0x004d:
            r17 = 3
            goto L_0x0071
        L_0x0050:
            r17 = 5
            goto L_0x0071
        L_0x0053:
            if (r8 == 0) goto L_0x0061
            if (r10 == r7) goto L_0x005e
            r8 = 5
            if (r10 != r8) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r17 = 0
            goto L_0x0071
        L_0x005e:
            if (r4 == r2) goto L_0x004a
            goto L_0x004d
        L_0x0061:
            r8 = 5
            if (r10 == r11) goto L_0x006f
            r2 = 6
            if (r10 == r2) goto L_0x006f
            r2 = 7
            if (r10 != r2) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            r2 = 3
            if (r10 != r2) goto L_0x005b
            goto L_0x0050
        L_0x006f:
            r17 = 4
        L_0x0071:
            if (r17 == 0) goto L_0x0089
            android.content.SharedPreferences r2 = r1.f261618a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            int r8 = r17 + -1
            android.content.SharedPreferences$Editor r2 = r2.putInt(r6, r8)
            android.content.SharedPreferences$Editor r2 = r2.putLong(r9, r14)
            r2.apply()
            r2 = r17
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            r6 = 0
            if (r5 != r4) goto L_0x00b2
            if (r2 == 0) goto L_0x0155
            if (r2 != r11) goto L_0x0155
            com.google.common.o.va r1 = com.google.common.p4552o.C60577va.f164319f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.common.o.ux r1 = (com.google.common.p4552o.C60573ux) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.common.o.va r2 = (com.google.common.p4552o.C60577va) r2
            int r3 = r2.f164321a
            r3 = r3 | r4
            r2.f164321a = r3
            r3 = 0
            r2.f164322b = r3
            com.google.protobuf.bv r1 = r1.build()
            r6 = r1
            com.google.common.o.va r6 = (com.google.common.p4552o.C60577va) r6
            goto L_0x0155
        L_0x00b2:
            if (r2 == 0) goto L_0x00d3
            com.google.android.libraries.f.a r1 = r1.f261619b
            long r8 = r1.mo26870b()
            long r8 = r8 - r12
            long r8 = java.lang.Math.abs(r8)
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            if (r3 == 0) goto L_0x00ce
            if (r2 != r11) goto L_0x00ce
            r8 = 0
            java.lang.Long r3 = java.lang.Long.valueOf(r8)
            goto L_0x00cf
        L_0x00ce:
            r3 = r6
        L_0x00cf:
            r16 = r2
            r5 = 0
            goto L_0x00f4
        L_0x00d3:
            if (r3 == 0) goto L_0x00ef
            if (r5 == r11) goto L_0x00de
            r2 = 7
            if (r5 == r2) goto L_0x00de
            r2 = 6
            if (r5 != r2) goto L_0x00ef
            r5 = 6
        L_0x00de:
            com.google.android.libraries.f.a r1 = r1.f261619b
            long r1 = r1.mo26870b()
            long r1 = r1 - r12
            long r1 = java.lang.Math.abs(r1)
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r1 = r6
            goto L_0x00f2
        L_0x00ef:
            r1 = r6
            r3 = r1
            r5 = 0
        L_0x00f2:
            r16 = 0
        L_0x00f4:
            if (r16 != 0) goto L_0x00f9
            if (r3 != 0) goto L_0x00f9
            goto L_0x0155
        L_0x00f9:
            com.google.common.o.va r2 = com.google.common.p4552o.C60577va.f164319f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.common.o.ux r2 = (com.google.common.p4552o.C60573ux) r2
            if (r16 == 0) goto L_0x0113
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.common.o.va r6 = (com.google.common.p4552o.C60577va) r6
            int r8 = r16 + -1
            r6.f164323c = r8
            int r8 = r6.f164321a
            r8 = r8 | r11
            r6.f164321a = r8
        L_0x0113:
            if (r1 == 0) goto L_0x0127
            long r8 = r1.longValue()
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.common.o.va r1 = (com.google.common.p4552o.C60577va) r1
            int r6 = r1.f164321a
            r6 = r6 | r7
            r1.f164321a = r6
            r1.f164324d = r8
        L_0x0127:
            if (r3 == 0) goto L_0x013b
            long r6 = r3.longValue()
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.common.o.va r1 = (com.google.common.p4552o.C60577va) r1
            int r3 = r1.f164321a
            r3 = r3 | r4
            r1.f164321a = r3
            r1.f164322b = r6
        L_0x013b:
            if (r5 == 0) goto L_0x014e
            r2.copyOnWrite()
            com.google.protobuf.bv r1 = r2.instance
            com.google.common.o.va r1 = (com.google.common.p4552o.C60577va) r1
            int r5 = r5 + -1
            r1.f164325e = r5
            int r3 = r1.f164321a
            r3 = r3 | 8
            r1.f164321a = r3
        L_0x014e:
            com.google.protobuf.bv r1 = r2.build()
            r6 = r1
            com.google.common.o.va r6 = (com.google.common.p4552o.C60577va) r6
        L_0x0155:
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90833j(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7371ae.C93782d.call():java.lang.Object");
    }
}
