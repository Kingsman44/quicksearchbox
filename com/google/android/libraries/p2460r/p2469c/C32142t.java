package com.google.android.libraries.p2460r.p2469c;

import android.view.ViewGroup;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57368at;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57371aw;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import java.util.List;

/* renamed from: com.google.android.libraries.r.c.t */
/* compiled from: PG */
final class C32142t extends C32140r {

    /* renamed from: o */
    private C32148z f86323o = null;

    /* renamed from: p */
    private C32148z f86324p = null;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32142t(android.content.Context r5, com.google.android.libraries.p2460r.p2469c.C32127e r6) {
        /*
            r4 = this;
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            r0.<init>(r5)
            r1 = 1
            r0.setOrientation(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            r1 = 0
            r0.setClipToPadding(r1)
            com.google.android.libraries.r.c.av r1 = com.google.android.libraries.p2460r.p2469c.C32141s.f86178a
            r4.<init>(r5, r6, r0, r1)
            r5 = 0
            r4.f86323o = r5
            r4.f86324p = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32142t.<init>(android.content.Context, com.google.android.libraries.r.c.e):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m59894t(com.google.android.libraries.p2460r.p2469c.C32138p r9) {
        /*
            r8 = this;
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 0
            r0.<init>(r1, r1)
            int r1 = r9.f86309m
            r2 = -1
            r3 = -2
            r4 = -3
            if (r1 != r4) goto L_0x000f
        L_0x000d:
            r1 = -2
            goto L_0x0022
        L_0x000f:
            if (r1 != r2) goto L_0x0022
            com.google.android.libraries.r.c.z r1 = r8.f86324p
            if (r1 != 0) goto L_0x0017
            com.google.android.libraries.r.c.z r1 = r8.f86323o
        L_0x0017:
            if (r1 == 0) goto L_0x000d
            com.google.bv.e.c.a.cb r5 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_UNSUPPORTED_FEATURE
            java.lang.String r6 = "FILL_PARENT not supported for height on ElementList contents."
            r7 = 2
            r1.mo37967i(r7, r5, r6)
            goto L_0x000d
        L_0x0022:
            int r3 = r9.f86308l
            if (r3 != r4) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            r0.width = r2
            r0.height = r1
            com.google.android.libraries.r.c.ay r1 = r9.mo37940f()
            android.content.Context r2 = r8.f86298b
            r1.mo37878h(r2, r0)
            java.lang.Object r1 = r9.f86301e
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r1 != 0) goto L_0x003d
            goto L_0x0045
        L_0x003d:
            com.google.android.libraries.r.c.ay r1 = r9.mo37940f()
            int r2 = r1.mo37870a(r2)
        L_0x0045:
            r0.gravity = r2
            r9.mo37944j(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32142t.m59894t(com.google.android.libraries.r.c.p):void");
    }

    /* renamed from: a */
    public final void mo37854a() {
        super.mo37854a();
        this.f86324p = null;
    }

    /* renamed from: i */
    public final void mo37943i() {
        super.mo37943i();
        this.f86323o = null;
    }

    /* renamed from: j */
    public final void mo37944j(ViewGroup.LayoutParams layoutParams) {
        super.mo37944j(layoutParams);
        for (C32138p t : this.f86320a) {
            m59894t(t);
        }
    }

    /* renamed from: m */
    public final /* synthetic */ void mo37855m(Object obj, C32148z zVar) {
        this.f86323o = zVar;
        super.mo37953s(((C57371aw) obj).f153270a, zVar);
    }

    /* renamed from: p */
    public final /* synthetic */ List mo37851p(Object obj) {
        return ((C57371aw) obj).f153270a;
    }

    /* renamed from: w */
    public final /* bridge */ /* synthetic */ void mo37853w(Object obj, C32148z zVar) {
        this.f86324p = zVar;
        super.mo37952r(((C57371aw) obj).f153270a, zVar);
        for (C32138p t : this.f86320a) {
            m59894t(t);
        }
    }

    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Object mo37852v(C57369au auVar) {
        if (auVar.f153257b == 6) {
            return (C57371aw) auVar.f153258c;
        }
        throw new C32083an(C57404cb.ERR_MISSING_ELEMENT_CONTENTS, String.format("Missing ElementList; has %s", new Object[]{C57368at.m88332a(C57368at.m88333b(auVar.f153257b))}));
    }
}
