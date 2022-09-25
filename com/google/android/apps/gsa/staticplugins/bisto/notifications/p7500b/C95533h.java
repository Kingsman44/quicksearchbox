package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94647k;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.C94650n;
import com.google.android.apps.gsa.staticplugins.bisto.p7457a.p7458a.C94637a;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95284n;
import com.google.android.apps.gsa.staticplugins.bisto.p7487e.C95285o;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.b.h */
/* compiled from: PG */
public final class C95533h extends C95515ae {

    /* renamed from: c */
    private static final C59071e f267346c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.b.h");

    /* renamed from: d */
    private final C94650n f267347d;

    /* renamed from: e */
    private final List f267348e;

    /* renamed from: f */
    private boolean f267349f;

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C95533h(java.util.List r10, com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j.C95706l r11, com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m r12, com.google.android.libraries.p1730f.C21370a r13) {
        /*
            r9 = this;
            r9.<init>(r12, r13, r11)
            int r0 = r10.size()
            r1 = 2
            if (r0 >= r1) goto L_0x0024
            com.google.common.f.e r0 = f267346c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "NotifBundleAncmnt"
            r0.mo56378ag(r2, r3)
            int r2 = r10.size()
            r3 = 16044(0x3eac, float:2.2482E-41)
            java.lang.String r4 = "Can only create an BundleAnnouncement with 2 or more children, you gave %d"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56387q(r4, r2)
            int r0 = com.google.android.apps.gsa.shared.util.p7158b.C90755l.f253831a
        L_0x0024:
            android.content.Context r3 = r11.f267947e
            r11 = 0
            java.lang.Object r0 = r10.get(r11)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r0 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r0
            int r2 = r10.size()
            java.lang.String r4 = ""
            r8 = 1
            if (r2 <= r1) goto L_0x00d0
            int r2 = r10.size()
            if (r2 >= r1) goto L_0x0053
            int r11 = r10.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "2+ children="
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r11)
            goto L_0x01fd
        L_0x0053:
            int r2 = r10.size()
            int r2 = r2 + -1
            r4 = 1
        L_0x005a:
            int r5 = r10.size()
            if (r4 >= r5) goto L_0x0071
            java.lang.Object r5 = r10.get(r4)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r5 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r5
            boolean r5 = r5.mo89405R()
            if (r5 != 0) goto L_0x006e
            r4 = 0
            goto L_0x0072
        L_0x006e:
            int r4 = r4 + 1
            goto L_0x005a
        L_0x0071:
            r4 = 1
        L_0x0072:
            boolean r5 = r0.mo89405R()
            if (r5 == 0) goto L_0x0098
            if (r8 == r4) goto L_0x007e
            r4 = 2132085518(0x7f150b0e, float:1.9811237E38)
            goto L_0x0081
        L_0x007e:
            r4 = 2132085519(0x7f150b0f, float:1.981124E38)
        L_0x0081:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo89403L()
            java.lang.String r0 = m158061A(r3, r0)
            r5[r11] = r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r5[r8] = r11
            java.lang.String r11 = r3.getString(r4, r5)
            goto L_0x0105
        L_0x0098:
            boolean r5 = r0.mo89400D()
            if (r5 == 0) goto L_0x00b4
            if (r8 == r4) goto L_0x00a4
            r0 = 2132085513(0x7f150b09, float:1.9811227E38)
            goto L_0x00a7
        L_0x00a4:
            r0 = 2132085514(0x7f150b0a, float:1.9811229E38)
        L_0x00a7:
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4[r11] = r2
            java.lang.String r11 = r3.getString(r0, r4)
            goto L_0x0105
        L_0x00b4:
            if (r8 == r4) goto L_0x00ba
            r4 = 2132085509(0x7f150b05, float:1.9811219E38)
            goto L_0x00bd
        L_0x00ba:
            r4 = 2132085510(0x7f150b06, float:1.981122E38)
        L_0x00bd:
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo89420x()
            r5[r11] = r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r5[r8] = r11
            java.lang.String r11 = r3.getString(r4, r5)
            goto L_0x0105
        L_0x00d0:
            int r2 = r10.size()
            if (r2 != r1) goto L_0x01e8
            java.lang.Object r2 = r10.get(r8)
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r2 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r2
            boolean r4 = r0.mo89405R()
            if (r4 == 0) goto L_0x013c
            boolean r4 = r2.mo89405R()
            if (r4 == 0) goto L_0x0108
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo89403L()
            java.lang.String r0 = m158061A(r3, r0)
            r4[r11] = r0
            java.lang.String r11 = r2.mo89403L()
            java.lang.String r11 = m158061A(r3, r11)
            r4[r8] = r11
            r11 = 2132085517(0x7f150b0d, float:1.9811235E38)
            java.lang.String r11 = r3.getString(r11, r4)
        L_0x0105:
            r6 = r11
            goto L_0x01fe
        L_0x0108:
            boolean r4 = r2.mo89400D()
            if (r4 == 0) goto L_0x0122
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r0 = r0.mo89403L()
            java.lang.String r0 = m158061A(r3, r0)
            r2[r11] = r0
            r11 = 2132085516(0x7f150b0c, float:1.9811233E38)
            java.lang.String r11 = r3.getString(r11, r2)
            goto L_0x0105
        L_0x0122:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo89403L()
            java.lang.String r0 = m158061A(r3, r0)
            r4[r11] = r0
            java.lang.String r11 = r2.mo89420x()
            r4[r8] = r11
            r11 = 2132085515(0x7f150b0b, float:1.981123E38)
            java.lang.String r11 = r3.getString(r11, r4)
            goto L_0x0105
        L_0x013c:
            boolean r4 = r0.mo89400D()
            if (r4 == 0) goto L_0x017a
            boolean r0 = r2.mo89405R()
            if (r0 == 0) goto L_0x015c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = r2.mo89403L()
            java.lang.String r2 = m158061A(r3, r2)
            r0[r11] = r2
            r11 = 2132085512(0x7f150b08, float:1.9811225E38)
            java.lang.String r11 = r3.getString(r11, r0)
            goto L_0x0105
        L_0x015c:
            boolean r0 = r2.mo89400D()
            if (r0 == 0) goto L_0x016a
            r11 = 2132085520(0x7f150b10, float:1.9811241E38)
            java.lang.String r11 = r3.getString(r11)
            goto L_0x0105
        L_0x016a:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.String r2 = r2.mo89420x()
            r0[r11] = r2
            r11 = 2132085511(0x7f150b07, float:1.9811223E38)
            java.lang.String r11 = r3.getString(r11, r0)
            goto L_0x0105
        L_0x017a:
            boolean r4 = r2.mo89405R()
            if (r4 == 0) goto L_0x019b
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo89420x()
            r4[r11] = r0
            java.lang.String r11 = r2.mo89403L()
            java.lang.String r11 = m158061A(r3, r11)
            r4[r8] = r11
            r11 = 2132085508(0x7f150b04, float:1.9811217E38)
            java.lang.String r11 = r3.getString(r11, r4)
            goto L_0x0105
        L_0x019b:
            boolean r4 = r2.mo89400D()
            if (r4 == 0) goto L_0x01b2
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r0 = r0.mo89420x()
            r2[r11] = r0
            r11 = 2132085507(0x7f150b03, float:1.9811215E38)
            java.lang.String r11 = r3.getString(r11, r2)
            goto L_0x0105
        L_0x01b2:
            java.lang.String r4 = r0.mo89420x()
            java.lang.String r5 = r2.mo89420x()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01d1
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r0 = r0.mo89420x()
            r2[r11] = r0
            r11 = 2132085506(0x7f150b02, float:1.9811213E38)
            java.lang.String r11 = r3.getString(r11, r2)
            goto L_0x0105
        L_0x01d1:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r0 = r0.mo89420x()
            r4[r11] = r0
            java.lang.String r11 = r2.mo89420x()
            r4[r8] = r11
            r11 = 2132085505(0x7f150b01, float:1.981121E38)
            java.lang.String r11 = r3.getString(r11, r4)
            goto L_0x0105
        L_0x01e8:
            int r11 = r10.size()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "children="
            r0.<init>(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            com.google.android.apps.gsa.shared.bisto.C89655j.m145957a(r11)
        L_0x01fd:
            r6 = r4
        L_0x01fe:
            com.google.android.apps.gsa.staticplugins.bisto.a.n r11 = new com.google.android.apps.gsa.staticplugins.bisto.a.n
            r7 = 0
            r2 = r11
            r4 = r12
            r5 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r9.f267347d = r11
            r9.f267348e = r10
            java.util.Iterator r11 = r10.iterator()
        L_0x020f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x022c
            java.lang.Object r12 = r11.next()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r12 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r12
            boolean r13 = r12.mo89422z()
            if (r13 == 0) goto L_0x0229
            com.google.android.apps.gsa.staticplugins.bisto.f.m r12 = r12.f264705a
            java.lang.String r13 = "Can't set bundle as child"
            r12.mo83544b(r13)
            goto L_0x020f
        L_0x0229:
            r12.f267278l = r8
            goto L_0x020f
        L_0x022c:
            com.google.common.o.lk r11 = r9.f267277k
            int r12 = r10.size()
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.common.o.lo r13 = (com.google.common.p4552o.C60241lo) r13
            com.google.common.o.lo r0 = com.google.common.p4552o.C60241lo.f162980w
            int r0 = r13.f162982a
            r0 = r0 | 32
            r13.f162982a = r0
            r13.f162986e = r12
            java.util.Iterator r10 = r10.iterator()
        L_0x0247:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x02fc
            java.lang.Object r12 = r10.next()
            com.google.android.apps.gsa.staticplugins.bisto.notifications.b.ae r12 = (com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae) r12
            com.google.common.o.lo r13 = com.google.common.p4552o.C60241lo.f162980w
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.common.o.lk r13 = (com.google.common.p4552o.C60237lk) r13
            com.google.common.o.nr r0 = com.google.common.p4552o.C60305nr.f163179e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.common.o.np r0 = (com.google.common.p4552o.C60303np) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.common.o.nr r2 = (com.google.common.p4552o.C60305nr) r2
            r2.f163182b = r1
            int r3 = r2.f163181a
            r3 = r3 | r8
            r2.f163181a = r3
            java.lang.String r2 = r12.mo89420x()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.nr r3 = (com.google.common.p4552o.C60305nr) r3
            r2.getClass()
            int r4 = r3.f163181a
            r4 = r4 | r1
            r3.f163181a = r4
            r3.f163183c = r2
            java.lang.String r2 = r12.mo89421y()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.common.o.nr r3 = (com.google.common.p4552o.C60305nr) r3
            r2.getClass()
            int r4 = r3.f163181a
            r4 = r4 | 4
            r3.f163181a = r4
            r3.f163184d = r2
            r13.copyOnWrite()
            com.google.protobuf.bv r2 = r13.instance
            com.google.common.o.lo r2 = (com.google.common.p4552o.C60241lo) r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.common.o.nr r0 = (com.google.common.p4552o.C60305nr) r0
            r0.getClass()
            r2.f162987f = r0
            int r0 = r2.f162982a
            r0 = r0 | 64
            r2.f162982a = r0
            java.util.List r0 = r12.mo89414r()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x02d7
            java.util.List r12 = r12.mo89414r()
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95515ae.m157973T(r12)
            if (r12 == 0) goto L_0x02d7
            r13.copyOnWrite()
            com.google.protobuf.bv r0 = r13.instance
            com.google.common.o.lo r0 = (com.google.common.p4552o.C60241lo) r0
            int r2 = r0.f162982a
            r2 = r2 | 128(0x80, float:1.794E-43)
            r0.f162982a = r2
            r0.f162988g = r12
        L_0x02d7:
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.common.o.lo r12 = (com.google.common.p4552o.C60241lo) r12
            com.google.protobuf.bv r13 = r13.build()
            com.google.common.o.lo r13 = (com.google.common.p4552o.C60241lo) r13
            r13.getClass()
            com.google.protobuf.cq r0 = r12.f163000s
            boolean r2 = r0.mo58948c()
            if (r2 != 0) goto L_0x02f5
            com.google.protobuf.cq r0 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r0)
            r12.f163000s = r0
        L_0x02f5:
            com.google.protobuf.cq r12 = r12.f163000s
            r12.add(r13)
            goto L_0x0247
        L_0x02fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.notifications.p7500b.C95533h.<init>(java.util.List, com.google.android.apps.gsa.staticplugins.bisto.notifications.j.l, com.google.android.apps.gsa.staticplugins.bisto.f.m, com.google.android.libraries.f.a):void");
    }

    /* renamed from: A */
    private static String m158061A(Context context, String str) {
        return new C95525ao(context, str).f267321a;
    }

    /* renamed from: j */
    public final boolean mo88576j() {
        return false;
    }

    /* renamed from: o */
    public final int mo89411o() {
        return 3;
    }

    /* renamed from: r */
    public final List mo89414r() {
        ArrayList arrayList = new ArrayList();
        for (C95515ae r : this.f267348e) {
            arrayList.addAll(r.mo89414r());
        }
        return arrayList;
    }

    /* renamed from: s */
    public final void mo89415s(C95285o oVar, C95284n nVar) {
        this.f267347d.mo88581n(oVar, nVar);
        this.f267349f = true;
    }

    /* renamed from: t */
    public final boolean mo89416t(C94647k kVar, C94637a aVar) {
        return false;
    }

    /* renamed from: u */
    public final boolean mo89417u() {
        return false;
    }

    /* renamed from: v */
    public final boolean mo89418v() {
        return this.f267349f;
    }

    /* renamed from: w */
    public final boolean mo89419w() {
        return this.f267349f;
    }

    /* renamed from: x */
    public final String mo89420x() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: y */
    public final String mo89421y() {
        return BuildConfig.FLAVOR;
    }

    /* renamed from: z */
    public final boolean mo89422z() {
        return true;
    }
}
