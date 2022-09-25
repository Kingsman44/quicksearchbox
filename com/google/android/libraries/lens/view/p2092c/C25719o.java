package com.google.android.libraries.lens.view.p2092c;

import com.google.android.libraries.lens.view.p2067ak.C25267f;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.lens.view.c.o */
/* compiled from: PG */
public final /* synthetic */ class C25719o implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25720p f69922a;

    /* renamed from: b */
    public final /* synthetic */ C25267f f69923b;

    public /* synthetic */ C25719o(C25720p pVar, C25267f fVar) {
        this.f69922a = pVar;
        this.f69923b = fVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r0.mo30858l(r1) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d4, code lost:
        if (r7 == false) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.libraries.lens.view.c.p r0 = r6.f69922a
            com.google.android.libraries.lens.view.ak.f r1 = r6.f69923b
            com.google.android.libraries.lens.view.c.t r7 = (com.google.android.libraries.lens.view.p2092c.C25724t) r7
            com.google.android.libraries.lens.view.c.s r2 = r7.mo30835a()
            r0.f69934j = r2
            com.google.common.f.a.d r2 = com.google.android.libraries.lens.view.p2092c.C25720p.f69924a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.android.libraries.lens.view.c.s r3 = r0.f69934j
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r4 = 48999(0xbf67, float:6.8662E-41)
            java.lang.String r5 = "Lens shortcut eligibility: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r2).mo56372aa(r4)).mo56389s(r5, r3)
            com.google.android.libraries.lens.view.c.s r2 = r7.mo30835a()
            com.google.android.libraries.lens.view.c.s r3 = com.google.android.libraries.lens.view.p2092c.C25723s.ELIGIBLE
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0046
            int r7 = r7.mo30836b()
            r0.f69936l = r7
            com.google.common.f.a.d r7 = com.google.android.libraries.lens.view.p2092c.C25720p.f69924a
            com.google.common.f.x r7 = r7.mo56224b()
            int r2 = r0.f69936l
            java.lang.String r2 = com.google.android.libraries.lens.view.p2092c.C25726v.m47502a(r2)
            r3 = 49000(0xbf68, float:6.8664E-41)
            java.lang.String r4 = "Lens shortcut type: %s"
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r3)).mo56389s(r4, r2)
        L_0x0046:
            boolean r7 = r0.mo30832e()
            r2 = 0
            if (r7 != 0) goto L_0x005d
            com.google.common.f.a.d r7 = com.google.android.libraries.lens.view.p2092c.C25720p.f69924a
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r1 = "Neither type of Lens shortcut can be installed, banner disabled."
            r3 = 49010(0xbf72, float:6.8678E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r3)).mo56386p(r1)
            goto L_0x00e6
        L_0x005d:
            boolean r7 = r0.mo30859m()
            if (r7 == 0) goto L_0x0065
            goto L_0x00e6
        L_0x0065:
            int r7 = r0.mo30850g()
            com.google.lens.j.ea r3 = com.google.lens.p4707j.C62505ea.SURFACE_UNSPECIFIED
            int r7 = r7 + -1
            r3 = 5
            if (r7 == 0) goto L_0x0076
            int r7 = r1.f68738a
            if (r7 < r3) goto L_0x007c
            goto L_0x00e6
        L_0x0076:
            int r7 = r1.f68739b
            if (r7 < r3) goto L_0x007c
            goto L_0x00e6
        L_0x007c:
            com.google.android.libraries.lens.view.l.l r7 = r0.f69928d
            boolean r7 = r7.mo32691A()
            r3 = 1
            if (r7 == 0) goto L_0x008c
            boolean r7 = r0.mo30858l(r1)
            if (r7 != 0) goto L_0x00e5
            goto L_0x00e6
        L_0x008c:
            boolean r7 = r0.mo30858l(r1)
            com.google.android.libraries.lens.view.l.l r1 = r0.f69928d
            com.google.common.base.ax r1 = r1.mo32701h()
            java.lang.Object r1 = r1.mo56111f()
            java.lang.String r1 = (java.lang.String) r1
            com.google.lens.j.ea r1 = com.google.lens.p4711m.C62632i.m94816a(r1)
            int r1 = r1.ordinal()
            r4 = 7
            if (r1 == r4) goto L_0x00bb
            r4 = 8
            if (r1 == r4) goto L_0x00d7
            r4 = 11
            if (r1 == r4) goto L_0x00d7
            r4 = 12
            if (r1 == r4) goto L_0x00b8
            r7 = 20
            if (r1 == r7) goto L_0x00d7
            goto L_0x00e6
        L_0x00b8:
            if (r7 != 0) goto L_0x00d7
            goto L_0x00e6
        L_0x00bb:
            com.google.android.libraries.lens.view.l.l r1 = r0.f69928d
            int r1 = r1.mo32694a()
            com.google.lens.j.bj r4 = com.google.lens.p4707j.C62433bj.LENS_IN_SEARCH_PLATE
            int r4 = r4.f168594ao
            if (r1 == r4) goto L_0x00d4
            com.google.lens.j.bj r4 = com.google.lens.p4707j.C62433bj.LENS_IN_SEARCH_PLATE_HOMESCREEN
            int r4 = r4.f168594ao
            if (r1 != r4) goto L_0x00ce
            goto L_0x00d4
        L_0x00ce:
            com.google.android.libraries.lens.view.l.l r7 = r0.f69928d
            r7.mo32694a()
            goto L_0x00e6
        L_0x00d4:
            if (r7 != 0) goto L_0x00d7
            goto L_0x00e6
        L_0x00d7:
            com.google.common.f.a.d r7 = com.google.android.libraries.lens.view.p2092c.C25720p.f69924a
            com.google.common.f.x r7 = r7.mo56224b()
            java.lang.String r1 = "Will trigger banner once"
            r2 = 49005(0xbf6d, float:6.867E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r7).mo56372aa(r2)).mo56386p(r1)
        L_0x00e5:
            r2 = 1
        L_0x00e6:
            r0.f69932h = r2
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2092c.C25719o.apply(java.lang.Object):java.lang.Object");
    }
}
