package com.google.android.libraries.home.coreui.devicetile;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.p099a.C1988h;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.bv */
/* compiled from: PG */
public final class C23703bv extends C2061c {

    /* renamed from: a */
    final /* synthetic */ C23707bz f64828a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23703bv(C23707bz bzVar) {
        super(C2061c.DEFAULT_DELEGATE);
        this.f64828a = bzVar;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.View r18, androidx.core.p098j.p099a.C1991k r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            java.lang.String r2 = "host"
            r3 = r18
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r2)
            super.onInitializeAccessibilityNodeInfo(r18, r19)
            com.google.android.libraries.home.coreui.devicetile.bz r2 = r0.f64828a
            android.content.Context r2 = r2.f64842h
            java.lang.String r3 = "context"
            r4 = 0
            if (r2 != 0) goto L_0x001b
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)
            r2 = r4
        L_0x001b:
            android.content.res.Resources r2 = r2.getResources()
            r5 = 2131034177(0x7f050041, float:1.7678864E38)
            boolean r2 = r2.getBoolean(r5)
            if (r2 == 0) goto L_0x0048
            androidx.core.j.a.h r2 = new androidx.core.j.a.h
            com.google.android.libraries.home.coreui.devicetile.bz r5 = r0.f64828a
            android.content.Context r5 = r5.f64842h
            if (r5 != 0) goto L_0x0034
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)
            goto L_0x0035
        L_0x0034:
            r4 = r5
        L_0x0035:
            r6 = 0
            r7 = 4
            r3 = 2132085242(0x7f1509fa, float:1.9810677E38)
            java.lang.String r8 = r4.getString(r3)
            r9 = 0
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r1.mo5153b(r2)
            return
        L_0x0048:
            com.google.android.libraries.home.coreui.devicetile.bz r2 = r0.f64828a
            boolean r5 = r2.f64843i
            if (r5 == 0) goto L_0x00a1
            r5 = 0
            float r2 = r2.mo29052d(r5)
            com.google.android.libraries.home.coreui.devicetile.bz r6 = r0.f64828a
            android.graphics.drawable.Drawable r7 = r6.f64836b
            if (r7 != 0) goto L_0x005f
            java.lang.String r7 = "clipLayer"
            p5462h.p5473f.p5475b.C69664n.m101065k(r7)
            r7 = r4
        L_0x005f:
            int r7 = r7.getLevel()
            float r6 = r6.mo29052d(r7)
            com.google.android.libraries.home.coreui.devicetile.bz r7 = r0.f64828a
            r8 = 10000(0x2710, float:1.4013E-41)
            float r7 = r7.mo29052d(r8)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 >= 0) goto L_0x0078
            androidx.core.j.a.h r8 = androidx.core.p098j.p099a.C1988h.f5907e
            r1.mo5153b(r8)
        L_0x0078:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0081
            androidx.core.j.a.h r8 = androidx.core.p098j.p099a.C1988h.f5908f
            r1.mo5153b(r8)
        L_0x0081:
            com.google.android.libraries.home.coreui.devicetile.bz r8 = r0.f64828a
            com.google.android.libraries.home.coreui.devicetile.a.h r8 = r8.f64840f
            if (r8 != 0) goto L_0x008c
            java.lang.String r8 = "rangeTemplate"
            p5462h.p5473f.p5475b.C69664n.m101065k(r8)
        L_0x008c:
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = java.lang.Math.floor(r8)
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r5 = 1
        L_0x0098:
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r5, r2, r7, r6)
            android.view.accessibility.AccessibilityNodeInfo r5 = r1.f5921a
            r5.setRangeInfo(r2)
        L_0x00a1:
            androidx.core.j.a.h r2 = androidx.core.p098j.p099a.C1988h.f5914l
            r1.mo5153b(r2)
            androidx.core.j.a.h r2 = new androidx.core.j.a.h
            com.google.android.libraries.home.coreui.devicetile.bz r5 = r0.f64828a
            android.content.Context r5 = r5.f64842h
            if (r5 != 0) goto L_0x00b2
            p5462h.p5473f.p5475b.C69664n.m101065k(r3)
            r5 = r4
        L_0x00b2:
            r6 = 0
            r7 = 32
            r3 = 2132090855(0x7f151fe7, float:1.9822062E38)
            java.lang.String r8 = r5.getString(r3)
            r9 = 0
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            r1.mo5153b(r2)
            androidx.core.j.a.h r2 = new androidx.core.j.a.h
            com.google.android.libraries.home.coreui.devicetile.bz r3 = r0.f64828a
            com.google.android.libraries.home.coreui.devicetile.a.n r3 = r3.f64841g
            if (r3 == 0) goto L_0x00cf
            java.lang.CharSequence r4 = r3.f64696c
        L_0x00cf:
            r14 = r4
            r12 = 0
            r13 = 16
            r15 = 0
            r16 = 0
            r11 = r2
            r11.<init>(r12, r13, r14, r15, r16)
            r1.mo5153b(r2)
            com.google.android.libraries.home.coreui.devicetile.bz r1 = r0.f64828a
            com.google.android.libraries.home.coreui.devicetile.ab r1 = r1.mo29054f()
            r1.mo29001a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.home.coreui.devicetile.C23703bv.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.j.a.k):void");
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C69664n.m101061g(viewGroup, "host");
        C69664n.m101061g(view, "child");
        C69664n.m101061g(accessibilityEvent, "event");
        return true;
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        C69664n.m101061g(view, "host");
        String str = null;
        if (i == 16) {
            Context context = this.f64828a.f64842h;
            if (context == null) {
                C69664n.m101065k("context");
                context = null;
            }
            if (context.getResources().getBoolean(R.bool.override_accessibility_atv)) {
                C23752n nVar = ((C23674at) this.f64828a.mo29054f()).f64756g;
                C23656ab f = this.f64828a.mo29054f();
                String str2 = this.f64828a.f64837c;
                if (str2 == null) {
                    C69664n.m101065k("templateId");
                } else {
                    str = str2;
                }
                nVar.mo29116g(f, str, this.f64828a.f64843i);
            } else {
                C23707bz bzVar = this.f64828a;
                if (bzVar.f64844j) {
                    C23752n nVar2 = ((C23674at) bzVar.mo29054f()).f64756g;
                    C23656ab f2 = this.f64828a.mo29054f();
                    String str3 = this.f64828a.f64837c;
                    if (str3 == null) {
                        C69664n.m101065k("templateId");
                    } else {
                        str = str3;
                    }
                    nVar2.mo29116g(f2, str, this.f64828a.f64843i);
                }
            }
        }
        if (i == 32) {
            ((C23674at) this.f64828a.mo29054f()).f64756g.mo29113d(this.f64828a.mo29054f());
        } else if (i == 8192) {
            this.f64828a.mo29057i(2);
        } else if (i == 4096) {
            this.f64828a.mo29057i(4);
        } else if (i == 524288) {
            ((C23674at) this.f64828a.mo29054f()).f64756g.mo29112c(this.f64828a.mo29054f(), false);
        } else if (i == 262144) {
            ((C23674at) this.f64828a.mo29054f()).f64756g.mo29112c(this.f64828a.mo29054f(), true);
        } else if (i == 4) {
            Context context2 = this.f64828a.f64842h;
            if (context2 == null) {
                C69664n.m101065k("context");
                context2 = null;
            }
            if (context2.getResources().getBoolean(R.bool.override_accessibility_atv)) {
                C23752n nVar3 = ((C23674at) this.f64828a.mo29054f()).f64756g;
                C23656ab f3 = this.f64828a.mo29054f();
                String str4 = this.f64828a.f64837c;
                if (str4 == null) {
                    C69664n.m101065k("templateId");
                } else {
                    str = str4;
                }
                nVar3.mo29116g(f3, str, this.f64828a.f64843i);
            }
        } else if (i == C1988h.f5914l.mo5148a() && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
            int e = this.f64828a.mo29053e(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            C23707bz bzVar2 = this.f64828a;
            bzVar2.mo29056h(e, bzVar2.f64843i, true);
            this.f64828a.mo29055g();
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
