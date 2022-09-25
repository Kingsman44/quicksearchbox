package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.staticplugins.nowcards.p8116f.C104898x;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32052b;
import com.google.android.libraries.p2460r.p2464b.p2466b.C32054a;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32063f;
import com.google.android.libraries.p2460r.p2469c.p2471b.C32099c;
import com.google.android.libraries.p2460r.p2469c.p2471b.C32109m;
import com.google.android.libraries.p2460r.p2469c.p2471b.C32112p;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57355ag;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57369au;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57392bq;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57399bx;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57401bz;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57448ds;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57454dy;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57456e;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57472ep;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57474er;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57501i;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.r.c.p */
/* compiled from: PG */
public abstract class C32138p {

    /* renamed from: a */
    private C32094ay f86297a;

    /* renamed from: b */
    public final Context f86298b;

    /* renamed from: c */
    public final C32127e f86299c;

    /* renamed from: d */
    public final View f86300d;

    /* renamed from: e */
    public Object f86301e;

    /* renamed from: f */
    public C57369au f86302f = C57369au.f153254l;

    /* renamed from: g */
    public C32091av f86303g;

    /* renamed from: h */
    public boolean f86304h = false;

    /* renamed from: i */
    public FrameLayout f86305i = null;

    /* renamed from: j */
    C57501i f86306j = C57501i.f153593f;

    /* renamed from: k */
    public final Set f86307k = new HashSet();

    /* renamed from: l */
    int f86308l = -3;

    /* renamed from: m */
    int f86309m = -3;

    /* renamed from: n */
    private C57418cp f86310n = null;

    /* renamed from: o */
    private boolean f86311o = false;

    public C32138p(Context context, C32127e eVar, View view) {
        this.f86298b = context;
        this.f86299c = eVar;
        this.f86300d = view;
        this.f86297a = eVar.f86277f;
    }

    /* renamed from: p */
    private static void m59866p(int i, View view) {
        C57392bq bqVar = C57392bq.OVERFLOW_UNSPECIFIED;
        C57456e eVar = C57456e.ACCESSIBILITY_ROLE_UNSPECIFIED;
        int i2 = i - 1;
        if (i2 == 2) {
            view.setVisibility(4);
        } else if (i2 != 3) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo37854a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo37938d(int i) {
        if (this.f86301e == null) {
            return i;
        }
        C32094ay f = mo37940f();
        return f.mo37871b(i) | f.mo37870a(i);
    }

    /* renamed from: e */
    public final View mo37939e() {
        FrameLayout frameLayout = this.f86305i;
        return frameLayout != null ? frameLayout : this.f86300d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C32094ay mo37940f() {
        if (this.f86301e == null) {
            C32054a.m59731b(5, "ElementAdapter", (Throwable) null, "getElementStyle called when adapter is not bound", new Object[0]);
        }
        return this.f86297a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.google.bv.e.c.a.cp} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo37941g(java.lang.Object r11, com.google.p4283bv.p4354e.p4367c.p4368a.C57369au r12, com.google.android.libraries.p2460r.p2469c.C32148z r13) {
        /*
            r10 = this;
            r10.f86301e = r11
            r10.f86302f = r12
            r0 = 1
            r10.f86311o = r0
            com.google.bv.e.c.a.er r1 = r12.f153265j
            if (r1 != 0) goto L_0x000d
            com.google.bv.e.c.a.er r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57474er.f153542d
        L_0x000d:
            int r1 = r1.f153544a
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0020
            com.google.bv.e.c.a.au r1 = r10.f86302f
            com.google.bv.e.c.a.er r1 = r1.f153265j
            if (r1 != 0) goto L_0x001a
            com.google.bv.e.c.a.er r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57474er.f153542d
        L_0x001a:
            com.google.android.libraries.r.c.ay r1 = r13.mo37960b(r1)
            r10.f86297a = r1
        L_0x0020:
            int r1 = r10.mo37947n(r12, r13)
            r10.mo37948o(r1)
            r2 = 4
            if (r1 != r2) goto L_0x002b
            return
        L_0x002b:
            boolean r1 = r10.f86304h
            if (r1 != 0) goto L_0x0032
            r10.mo37942h(r11, r12, r13)
        L_0x0032:
            boolean r1 = r10.f86304h
            if (r1 == 0) goto L_0x0201
            r10.mo37853w(r11, r13)
            android.view.View r11 = r10.mo37939e()
            int r11 = r11.getVisibility()
            r1 = 8
            if (r11 == r1) goto L_0x0200
            com.google.bv.e.c.a.bq r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57392bq.OVERFLOW_UNSPECIFIED
            com.google.bv.e.c.a.e r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57456e.ACCESSIBILITY_ROLE_UNSPECIFIED
            com.google.bv.e.c.a.au r11 = r10.f86302f
            int r1 = r11.f153259d
            r2 = 15
            r3 = 14
            r4 = 0
            r5 = 2
            r6 = 3
            if (r1 == 0) goto L_0x0060
            if (r1 == r3) goto L_0x005e
            if (r1 == r2) goto L_0x005c
            r7 = 0
            goto L_0x0061
        L_0x005c:
            r7 = 2
            goto L_0x0061
        L_0x005e:
            r7 = 1
            goto L_0x0061
        L_0x0060:
            r7 = 3
        L_0x0061:
            int r8 = r7 + -1
            r9 = 0
            if (r7 == 0) goto L_0x01ff
            r7 = 25
            if (r8 == 0) goto L_0x009d
            if (r8 == r0) goto L_0x007b
            com.google.bv.e.c.a.i r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57501i.f153593f
            r10.f86306j = r11
            android.view.View r11 = r10.f86300d
            com.google.android.libraries.p2460r.p2469c.C32124bl.m59843b(r11)
            android.view.View r11 = r10.f86300d
            com.google.android.libraries.p2460r.p2469c.C32124bl.m59844c(r11)
            goto L_0x00ba
        L_0x007b:
            if (r1 != r2) goto L_0x0082
            java.lang.Object r11 = r11.f153260e
            com.google.bv.e.c.a.m r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57505m) r11
            goto L_0x0084
        L_0x0082:
            com.google.bv.e.c.a.m r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57505m.f153607b
        L_0x0084:
            com.google.bv.e.c.a.i r11 = r13.mo37961c(r11)
            r10.f86306j = r11
            android.view.View r1 = r10.f86300d
            com.google.bv.e.c.a.au r2 = r10.f86302f
            int r3 = r2.f153261f
            if (r3 != r7) goto L_0x0097
            java.lang.Object r2 = r2.f153262g
            com.google.bv.e.c.a.cp r2 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp) r2
            goto L_0x0099
        L_0x0097:
            com.google.bv.e.c.a.cp r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp.f153391a
        L_0x0099:
            com.google.android.libraries.p2460r.p2469c.C32124bl.m59846e(r11, r1, r13, r2)
            goto L_0x00ba
        L_0x009d:
            if (r1 != r3) goto L_0x00a4
            java.lang.Object r11 = r11.f153260e
            com.google.bv.e.c.a.i r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57501i) r11
            goto L_0x00a6
        L_0x00a4:
            com.google.bv.e.c.a.i r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57501i.f153593f
        L_0x00a6:
            r10.f86306j = r11
            android.view.View r1 = r10.f86300d
            com.google.bv.e.c.a.au r2 = r10.f86302f
            int r3 = r2.f153261f
            if (r3 != r7) goto L_0x00b5
            java.lang.Object r2 = r2.f153262g
            com.google.bv.e.c.a.cp r2 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp) r2
            goto L_0x00b7
        L_0x00b5:
            com.google.bv.e.c.a.cp r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp.f153391a
        L_0x00b7:
            com.google.android.libraries.p2460r.p2469c.C32124bl.m59846e(r11, r1, r13, r2)
        L_0x00ba:
            java.util.Set r11 = r10.f86307k
            r11.clear()
            java.util.Set r11 = r10.f86307k
            com.google.bv.e.c.a.i r1 = r10.f86306j
            com.google.protobuf.cq r1 = r1.f153599e
            r11.addAll(r1)
            com.google.bv.e.c.a.au r11 = r10.f86302f
            com.google.bv.e.c.a.er r11 = r11.f153265j
            if (r11 != 0) goto L_0x00d0
            com.google.bv.e.c.a.er r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57474er.f153542d
        L_0x00d0:
            int r11 = r11.f153544a
            r11 = r11 & r0
            if (r11 == 0) goto L_0x00da
            com.google.android.libraries.r.c.ay r11 = r10.f86297a
            r11.mo37877g(r10)
        L_0x00da:
            com.google.bv.e.c.a.c r11 = r12.f153263h
            if (r11 != 0) goto L_0x00e0
            com.google.bv.e.c.a.c r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57402c.f153329e
        L_0x00e0:
            com.google.protobuf.cj r1 = new com.google.protobuf.cj
            com.google.protobuf.ch r11 = r11.f153333c
            com.google.protobuf.ci r2 = com.google.p4283bv.p4354e.p4367c.p4368a.C57402c.f153328d
            r1.<init>(r11, r2)
            java.util.Iterator r11 = r1.iterator()
        L_0x00ed:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0115
            java.lang.Object r1 = r11.next()
            com.google.bv.e.c.a.e r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57456e) r1
            int r1 = r1.ordinal()
            if (r1 == r5) goto L_0x0100
            goto L_0x00ed
        L_0x0100:
            android.view.View r1 = r10.f86300d
            r1.setImportantForAccessibility(r0)
            android.view.View r1 = r10.f86300d
            r1.setFocusable(r0)
            android.view.View r1 = r10.f86300d
            com.google.android.libraries.r.c.o r2 = new com.google.android.libraries.r.c.o
            r2.<init>()
            r1.setAccessibilityDelegate(r2)
            goto L_0x00ed
        L_0x0115:
            com.google.bv.e.c.a.c r11 = r12.f153263h
            if (r11 != 0) goto L_0x011b
            com.google.bv.e.c.a.c r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57402c.f153329e
        L_0x011b:
            int r1 = r11.f153331a
            if (r1 == 0) goto L_0x0129
            if (r1 == r0) goto L_0x0127
            if (r1 == r6) goto L_0x0125
            r2 = 0
            goto L_0x012a
        L_0x0125:
            r2 = 2
            goto L_0x012a
        L_0x0127:
            r2 = 1
            goto L_0x012a
        L_0x0129:
            r2 = 3
        L_0x012a:
            int r3 = r2 + -1
            if (r2 == 0) goto L_0x01fe
            if (r3 == 0) goto L_0x0156
            if (r3 == r0) goto L_0x0133
            goto L_0x0153
        L_0x0133:
            if (r1 != r6) goto L_0x013a
            java.lang.Object r11 = r11.f153332b
            com.google.bv.e.c.a.aa r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57349aa) r11
            goto L_0x013c
        L_0x013a:
            com.google.bv.e.c.a.aa r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57349aa.f153211c
        L_0x013c:
            com.google.bv.e.c.a.ak r11 = r13.mo37964f(r11)
            int r1 = r11.f153236b
            if (r1 != r6) goto L_0x0153
            com.google.android.libraries.r.c.e r1 = r10.f86299c
            com.google.android.libraries.r.c.ac r1 = r1.f86274c
            com.google.android.libraries.r.c.a.b r1 = r1.f86117a
            java.lang.Object r11 = r11.f153237c
            com.google.bv.e.c.a.fi r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi) r11
            java.lang.CharSequence r11 = com.google.android.libraries.p2460r.p2469c.C32082am.m59774a(r1, r11)
            goto L_0x0169
        L_0x0153:
            java.lang.String r11 = ""
            goto L_0x0169
        L_0x0156:
            com.google.android.libraries.r.c.e r2 = r10.f86299c
            com.google.android.libraries.r.c.ac r2 = r2.f86274c
            com.google.android.libraries.r.c.a.b r2 = r2.f86117a
            if (r1 != r0) goto L_0x0163
            java.lang.Object r11 = r11.f153332b
            com.google.bv.e.c.a.fi r11 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi) r11
            goto L_0x0165
        L_0x0163:
            com.google.bv.e.c.a.fi r11 = com.google.p4283bv.p4354e.p4367c.p4368a.C57492fi.f153570e
        L_0x0165:
            java.lang.CharSequence r11 = com.google.android.libraries.p2460r.p2469c.C32082am.m59774a(r2, r11)
        L_0x0169:
            int r1 = r11.length()
            if (r1 <= 0) goto L_0x0175
            android.view.View r1 = r10.f86300d
            r1.setContentDescription(r11)
            goto L_0x017a
        L_0x0175:
            android.view.View r11 = r10.f86300d
            r11.setContentDescription(r9)
        L_0x017a:
            com.google.android.libraries.r.c.e r11 = r10.f86299c
            com.google.android.libraries.r.c.ac r11 = r11.f86274c
            com.google.android.apps.gsa.staticplugins.nowcards.f.x r11 = r11.f86119c
            if (r11 == 0) goto L_0x01fd
            int r1 = r12.f153261f
            r2 = 26
            if (r1 == 0) goto L_0x0191
            if (r1 == r7) goto L_0x0190
            if (r1 == r2) goto L_0x018e
            r6 = 0
            goto L_0x0191
        L_0x018e:
            r6 = 2
            goto L_0x0191
        L_0x0190:
            r6 = 1
        L_0x0191:
            int r3 = r6 + -1
            if (r6 == 0) goto L_0x01fc
            if (r3 == 0) goto L_0x01e5
            if (r3 == r0) goto L_0x019a
            goto L_0x01f0
        L_0x019a:
            if (r1 != r2) goto L_0x01a1
            java.lang.Object r12 = r12.f153262g
            com.google.bv.e.c.a.y r12 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57517y) r12
            goto L_0x01a3
        L_0x01a1:
            com.google.bv.e.c.a.y r12 = com.google.p4283bv.p4354e.p4367c.p4368a.C57517y.f153635b
        L_0x01a3:
            java.util.Map r1 = r13.f86341h
            java.lang.String r2 = r12.f153637a
            java.lang.Object r1 = r1.get(r2)
            com.google.bv.e.c.a.ak r1 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57359ak) r1
            if (r1 == 0) goto L_0x01b9
            int r2 = r1.f153235a
            r2 = r2 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x01b9
            com.google.bv.e.c.a.ak r1 = com.google.android.libraries.p2460r.p2469c.p2470a.C32063f.m59746a(r1)
        L_0x01b9:
            if (r1 != 0) goto L_0x01bc
            goto L_0x01e2
        L_0x01bc:
            int r2 = r1.f153236b
            r3 = 17
            if (r2 != r3) goto L_0x01c8
            java.lang.Object r12 = r1.f153237c
            r9 = r12
            com.google.bv.e.c.a.cp r9 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp) r9
            goto L_0x01e2
        L_0x01c8:
            com.google.bv.e.c.a.cb r1 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_BINDING_VALUE_TYPE_MISMATCH
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r12 = r12.f153637a
            r0[r4] = r12
            java.lang.String r12 = "No logData found for binding %s"
            java.lang.String r12 = java.lang.String.format(r12, r0)
            java.lang.String r12 = r13.mo37967i(r5, r1, r12)
            java.lang.Object[] r13 = new java.lang.Object[r4]
            r0 = 5
            java.lang.String r1 = "FrameContext"
            com.google.android.libraries.p2460r.p2464b.p2466b.C32054a.m59731b(r0, r1, r9, r12, r13)
        L_0x01e2:
            r10.f86310n = r9
            goto L_0x01f0
        L_0x01e5:
            if (r1 != r7) goto L_0x01ec
            java.lang.Object r12 = r12.f153262g
            com.google.bv.e.c.a.cp r12 = (com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp) r12
            goto L_0x01ee
        L_0x01ec:
            com.google.bv.e.c.a.cp r12 = com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp.f153391a
        L_0x01ee:
            r10.f86310n = r12
        L_0x01f0:
            com.google.bv.e.c.a.cp r12 = r10.f86310n
            if (r12 == 0) goto L_0x01fd
            android.view.View r13 = r10.mo37939e()
            r11.mo94386a(r12, r13)
            return
        L_0x01fc:
            throw r9
        L_0x01fd:
            return
        L_0x01fe:
            throw r9
        L_0x01ff:
            throw r9
        L_0x0200:
            return
        L_0x0201:
            com.google.android.libraries.r.c.an r11 = new com.google.android.libraries.r.c.an
            com.google.bv.e.c.a.cb r12 = com.google.p4283bv.p4354e.p4367c.p4368a.C57404cb.ERR_UNSPECIFIED
            java.lang.String r0 = "Binding uncreated adapter"
            java.lang.String r13 = r13.mo37968j(r0)
            r11.<init>(r12, r13)
            goto L_0x0210
        L_0x020f:
            throw r11
        L_0x0210:
            goto L_0x020f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p2460r.p2469c.C32138p.mo37941g(java.lang.Object, com.google.bv.e.c.a.au, com.google.android.libraries.r.c.z):void");
    }

    /* renamed from: h */
    public final void mo37942h(Object obj, C57369au auVar, C32148z zVar) {
        FrameLayout frameLayout;
        this.f86301e = obj;
        this.f86302f = auVar;
        C57474er erVar = auVar.f153265j;
        if (erVar == null) {
            erVar = C57474er.f153542d;
        }
        C32094ay b = zVar.mo37960b(erVar);
        this.f86297a = b;
        if (this.f86305i == null && (b.mo37882k() || this.f86297a.mo37880i())) {
            C32094ay ayVar = this.f86297a;
            Context context = this.f86298b;
            C32127e eVar = this.f86299c;
            C32109m mVar = eVar.f86279h;
            boolean z = eVar.f86280i;
            if (!ayVar.mo37882k()) {
                frameLayout = new FrameLayout(context);
                frameLayout.setOutlineProvider(ViewOutlineProvider.BOUNDS);
            } else {
                C57448ds dsVar = ayVar.f86174b.f153535s;
                if (dsVar == null) {
                    dsVar = C57448ds.f153453f;
                }
                int a = dsVar.f153459e ? ayVar.f86175c.mo37842a() : 0;
                C57472ep epVar = ayVar.f86174b;
                C57448ds dsVar2 = epVar.f153535s;
                if (dsVar2 == null) {
                    dsVar2 = C57448ds.f153453f;
                }
                C32052b bVar = ayVar.f86175c.f86114e;
                C57454dy dyVar = epVar.f153531o;
                if (dyVar == null) {
                    dyVar = C57454dy.f153470d;
                }
                frameLayout = new C32112p(context, dsVar2, mVar, bVar, a, dyVar, z);
            }
            frameLayout.addView(this.f86300d);
            if (!(frameLayout instanceof C32112p)) {
                C32094ay ayVar2 = this.f86297a;
                Context context2 = this.f86298b;
                if (ayVar2.mo37880i()) {
                    C57454dy dyVar2 = ayVar2.f86174b.f153531o;
                    if (dyVar2 == null) {
                        dyVar2 = C57454dy.f153470d;
                    }
                    frameLayout.setForeground(new C32099c(context2, dyVar2, C32094ay.f86173a, ayVar2.f86175c.mo37843b()));
                }
            }
            this.f86305i = frameLayout;
        }
        int n = mo37947n(auVar, zVar);
        mo37948o(n);
        if (n != 4) {
            this.f86308l = this.f86297a.mo37873d(this.f86298b);
            this.f86309m = this.f86297a.mo37872c(this.f86298b);
            mo37855m(obj, zVar);
            C57392bq bqVar = C57392bq.OVERFLOW_UNSPECIFIED;
            C57456e eVar2 = C57456e.ACCESSIBILITY_ROLE_UNSPECIFIED;
            C57392bq a2 = C57392bq.m88340a(auVar.f153264i);
            if (a2 == null) {
                a2 = C57392bq.OVERFLOW_HIDDEN;
            }
            int ordinal = a2.ordinal();
            if (!(ordinal == 0 || ordinal == 1)) {
                Object[] objArr = new Object[1];
                C57392bq a3 = C57392bq.m88340a(auVar.f153264i);
                if (a3 == null) {
                    a3 = C57392bq.OVERFLOW_HIDDEN;
                }
                objArr[0] = a3;
                C32054a.m59731b(5, "ElementAdapter", (Throwable) null, "Unsupported overflow behavior: %s", objArr);
            }
            this.f86297a.mo37877g(this);
            this.f86304h = true;
        }
    }

    /* renamed from: i */
    public void mo37943i() {
    }

    /* renamed from: j */
    public void mo37944j(ViewGroup.LayoutParams layoutParams) {
        View e = mo37939e();
        e.setLayoutParams(layoutParams);
        View view = this.f86300d;
        if (view != e) {
            int i = -1;
            int i2 = layoutParams.height == -2 ? -2 : -1;
            if (layoutParams.width == -2) {
                i = -2;
            }
            view.setLayoutParams(new FrameLayout.LayoutParams(i, i2));
        }
    }

    /* renamed from: k */
    public void mo37945k(View view, C32148z zVar) {
        C32124bl.m59845d(mo37939e(), view, this.f86306j, zVar.f86338e, zVar.f86340g, this.f86307k);
    }

    /* renamed from: l */
    public final void mo37946l() {
        C57418cp cpVar;
        if (this.f86304h) {
            mo37854a();
        }
        C104898x xVar = this.f86299c.f86274c.f86119c;
        if (!(xVar == null || (cpVar = this.f86310n) == null)) {
            xVar.mo94387b(cpVar);
            this.f86310n = null;
        }
        this.f86301e = null;
        this.f86302f = C57369au.f153254l;
        this.f86311o = false;
        C32124bl.m59844c(this.f86300d);
        C32124bl.m59843b(this.f86300d);
    }

    /* renamed from: m */
    public void mo37855m(Object obj, C32148z zVar) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final int mo37947n(C57369au auVar, C32148z zVar) {
        C57401bz bzVar = auVar.f153266k;
        if (bzVar == null) {
            bzVar = C57401bz.f153323d;
        }
        if (this.f86311o && (bzVar.f153325a & 1) != 0) {
            C57355ag agVar = bzVar.f153326b;
            if (agVar == null) {
                agVar = C57355ag.f153225b;
            }
            C57359ak akVar = (C57359ak) zVar.f86341h.get(agVar.f153227a);
            if (!(akVar == null || (akVar.f153235a & 16384) == 0)) {
                akVar = C32063f.m59746a(akVar);
            }
            int i = 0;
            if (akVar != null) {
                if (akVar.f153236b == 13) {
                    i = C57399bx.m88344a(((Integer) akVar.f153237c).intValue());
                    if (i == 0) {
                        i = 2;
                    }
                } else {
                    C32054a.m59731b(5, "FrameContext", (Throwable) null, zVar.mo37967i(2, C57404cb.ERR_BINDING_VALUE_TYPE_MISMATCH, String.format("No visibility found for binding %s", new Object[]{agVar.f153227a})), new Object[0]);
                }
            }
            if (i != 0) {
                return i;
            }
        }
        int a = C57399bx.m88344a(bzVar.f153327c);
        if (a == 0) {
            return 2;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo37948o(int i) {
        m59866p(i, mo37939e());
        View e = mo37939e();
        View view = this.f86300d;
        if (e != view) {
            m59866p(i, view);
        }
    }

    /* renamed from: v */
    public abstract Object mo37852v(C57369au auVar);

    /* renamed from: w */
    public void mo37853w(Object obj, C32148z zVar) {
        throw null;
    }
}
